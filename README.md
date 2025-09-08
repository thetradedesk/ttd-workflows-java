# ttd-workflows

Developer-friendly & type-safe Java SDK specifically catered to facilitate common workflows on The Trade Desk's platform.

<div align="left">
    <a href="https://www.speakeasy.com/?utm_source=openapi&utm_campaign=java"><img src="https://custom-icon-badges.demolab.com/badge/-Built%20By%20Speakeasy-212015?style=for-the-badge&logoColor=FBE331&logo=speakeasy&labelColor=545454" /></a>
    <a href="https://mit-license.org/">
        <img src="https://img.shields.io/badge/License-MIT-blue.svg" style="width: 100px; height: 28px;" />
    </a>
</div>

<!-- Start Summary [summary] -->
## Summary

Workflows Service: 
This service provides operations for commonly used workflows on The Trade Desk's platform.
In addition, this service provides generic operations for submitting:

- GraphQL API requests
- REST API requests

For further explanation on the entities encountered in this documentation (e.g.,
[campaigns](https://partner.thetradedesk.com/v3/portal/api/doc/Campaigns) and
[ad groups](https://partner.thetradedesk.com/v3/portal/api/doc/AdGroup)), visit the
[Partner Portal](https://partner.thetradedesk.com/v3/portal/api/doc/ApiUseCases).
<!-- End Summary [summary] -->

<!-- Start Table of Contents [toc] -->
## Table of Contents
<!-- $toc-max-depth=2 -->
* [ttd-workflows](#ttd-workflows)
  * [SDK Installation](#sdk-installation)
  * [SDK Example Usage](#sdk-example-usage)
  * [Asynchronous Support](#asynchronous-support)
  * [Authentication](#authentication)
  * [Available Resources and Operations](#available-resources-and-operations)
  * [Retries](#retries)
  * [Error Handling](#error-handling)
  * [Server Selection](#server-selection)
  * [Debugging](#debugging)
* [Development](#development)
  * [Maturity](#maturity)
  * [Contributions](#contributions)

<!-- End Table of Contents [toc] -->

<!-- Start SDK Installation [installation] -->
## SDK Installation

### Getting started

JDK 11 or later is required.

The samples below show how a published SDK artifact is used:

Gradle:
```groovy
implementation 'com.thetradedesk:workflows:0.10.0'
```

Maven:
```xml
<dependency>
    <groupId>com.thetradedesk</groupId>
    <artifactId>workflows</artifactId>
    <version>0.10.0</version>
</dependency>
```

### How to build
After cloning the git repository to your file system you can build the SDK artifact from source to the `build` directory by running `./gradlew build` on *nix systems or `gradlew.bat` on Windows systems.

If you wish to build from source and publish the SDK artifact to your local Maven repository (on your filesystem) then use the following command (after cloning the git repo locally):

On *nix:
```bash
./gradlew publishToMavenLocal -Pskip.signing
```
On Windows:
```bash
gradlew.bat publishToMavenLocal -Pskip.signing
```
<!-- End SDK Installation [installation] -->

## SDK Example Usage

### Example: Submit job to retrieve third-party data

```java
package hello.world;

import com.thetradedesk.workflows.Workflows;
import com.thetradedesk.workflows.models.components.ThirdPartyDataInput;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.GetThirdPartyDataJobResponse;

public class Main {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        Workflows sdk = Workflows.builder()
                .server(Workflows.AvailableServers.SANDBOX)
                .ttdAuth(System.getenv().getOrDefault("WORKFLOWS_TTD_AUTH", ""))
                .build();

        ThirdPartyDataInput req = ThirdPartyDataInput.builder()
                .partnerId("<id>")
                .queryShape("nodes {id name}")
                .build();

        GetThirdPartyDataJobResponse res = sdk.dmp().getThirdPartyDataJob()
                .request(req)
                .call();

        if (res.standardJobSubmitResponse().isPresent()) {
            System.out.println(res.standardJobSubmitResponse().get());
        }
    }
}
```

([Reference](https://ttd-workflows.apidocumentation.com/reference#tag/dmp/post/standardjob/thirdpartydata))

### Example: Check status for third-party data retrieval job using job ID returned from submit job

```java
package hello.world;

import com.thetradedesk.workflows.Workflows;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.GetJobStatusResponse;

public class Main {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        Workflows sdk = Workflows.builder()
                .server(Workflows.AvailableServers.SANDBOX)
                .ttdAuth(System.getenv().getOrDefault("WORKFLOWS_TTD_AUTH", ""))
                .build();

        GetJobStatusResponse res = sdk.jobStatus().getJobStatus()
                .id(<id>)
                .call();

        if (res.standardJobStatusResponse().isPresent()) {
            System.out.println(res.standardJobStatusResponse().get());
        }
    }
}
```

([Reference](https://ttd-workflows.apidocumentation.com/reference#tag/job-status/get/standardjob/{id}/status))

### Example: Create campaign with minimal configuration

```java
package hello.world;

import java.time.OffsetDateTime;
import com.thetradedesk.workflows.Workflows;
import com.thetradedesk.workflows.models.components.*;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.CreateCampaignResponse;

public class Main {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        Workflows sdk = Workflows.builder()
                .server(Workflows.AvailableServers.SANDBOX)
                .ttdAuth(System.getenv().getOrDefault("WORKFLOWS_TTD_AUTH", ""))
                .build();

        CampaignCreateWorkflowInputWithValidation req = CampaignCreateWorkflowInputWithValidation
                .builder()
                .primaryInput(CampaignCreateWorkflowPrimaryInput.builder()
                    .name("<value>")
                    .advertiserId("<id>")
                    .seedId("<id>") // required, unless the advertiser has a default seed defined
                    .startDateInUtc(OffsetDateTime.parse("2026-07-08T10:52:56.944Z"))
                    .primaryChannel(CampaignChannelType.DOOH)
                    .primaryGoal(CampaignWorkflowROIGoalInput.builder()
                        .maximizeReach(true)
                        .build())
                    .build())
                .build();

        CreateCampaignResponse res = sdk.campaign().create()
                .request(req)
                .call();

        if (res.campaignPayload().isPresent()) {
            System.out.println(res.campaignPayload().get());
        }
    }
}
```

([Reference](https://ttd-workflows.apidocumentation.com/reference#tag/campaign/post/campaign))

### Example: Submit GraphQL request

```java
package hello.world;

import java.lang.Exception;
import java.util.Map;
import com.thetradedesk.workflows.Workflows;
import com.thetradedesk.workflows.models.components.GraphQLRequestInput;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.SubmitGraphQlRequestResponse;

public class Main {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        Workflows sdk = Workflows.builder()
                .server(Workflows.AvailableServers.SANDBOX)
                .ttdAuth(System.getenv().getOrDefault("WORKFLOWS_TTD_AUTH", ""))
                .build();

        String query = """
query Advertiser($id: ID!) {
    advertiser(id: $id) {
        name
        totalCampaignChannelCount
        totalFunnelLocationCount
        useImpressionsOnlyBudgeting
        vettingStatus
        suggestedMeasurementProviderCategories
    }
}
""";

        GraphQLRequestInput req = GraphQLRequestInput.builder()
                .request(query)
                .variables(Map.ofEntries(
                        Map.entry("id", "<id>")
                        ))
                .build();

        SubmitGraphQlRequestResponse res = sdk.graphQLRequest().submitGraphQlRequest()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            System.out.println(res.object().get());
        }
    }
}
```

([Reference](https://ttd-workflows.apidocumentation.com/reference#tag/graphql-request/post/graphqlrequest))

### Example: Submit bulk GraphQL query job

Note: If you submit a GraphQL bulk query job (instead of a standard GraphQL request as shown above), any paginated and nested data is fully iterated and returned in a single output file.

```java
package hello.world;

import java.lang.Exception;
import com.thetradedesk.workflows.Workflows;
import com.thetradedesk.workflows.models.components.GraphQlQueryJobInput;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.SubmitGraphQlQueryJobResponse;

public class Main {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        Workflows sdk = Workflows.builder()
                .server(Workflows.AvailableServers.SANDBOX)
                .ttdAuth(System.getenv().getOrDefault("WORKFLOWS_TTD_AUTH", ""))
                .build();

        String query = """
query AudiencesAcrossAdvertisers {
  partner(id: "<id>") {
    id
    name
    advertisers {
      nodes {
        id
        name
        adGroups {
          nodes {
            id
            name
            audience {
              id
              name
              activeUniques {
                householdCount
                idsConnectedTvCount
                idsCount
                idsInAppCount
                idsWebCount
                lastUpdated
                personsCount
              }
            }
          }
        }
      }
    }
  }
}
""";

        GraphQlQueryJobInput req = GraphQlQueryJobInput.builder()
                .query(query)
                .build();

        SubmitGraphQlQueryJobResponse res = sdk.graphQLRequest().submitGraphQlQueryJob()
                .request(req)
                .call();

        if (res.graphQlQueryJobResponse().isPresent()) {
            System.out.println(res.graphQlQueryJobResponse().get());
        }
    }
}
```

([Reference](https://ttd-workflows.apidocumentation.com/reference#tag/graphql-request/post/graphqlqueryjob))

### Example: Check status for bulk GraphQL query job

```java
package hello.world;

import java.lang.Exception;
import com.thetradedesk.workflows.Workflows;
import com.thetradedesk.workflows.models.operations.GetGraphQlQueryJobStatusResponse;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;

public class Main {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        Workflows sdk = Workflows.builder()
                .server(Workflows.AvailableServers.SANDBOX)
                .ttdAuth(System.getenv().getOrDefault("WORKFLOWS_TTD_AUTH", ""))
                .build();

        GetGraphQlQueryJobStatusResponse res = sdk.jobStatus().getGraphQlQueryJobStatus()
                .id("<id>")
                .call();

        if (res.graphQLQueryJobRetrievalResponse().isPresent()) {
            System.out.println(res.graphQLQueryJobRetrievalResponse().get());
        }
    }
}
```

([Reference](https://ttd-workflows.apidocumentation.com/reference#tag/job-status/get/graphqlqueryjob/{id}))

<!-- No SDK Example Usage [usage] -->

<!-- Start Asynchronous Support [async-support] -->
## Asynchronous Support

The SDK provides comprehensive asynchronous support using Java's [`CompletableFuture<T>`][comp-fut] and [Reactive Streams `Publisher<T>`][reactive-streams] APIs. This design makes no assumptions about your choice of reactive toolkit, allowing seamless integration with any reactive library.

<details>
<summary>Why Use Async?</summary>

Asynchronous operations provide several key benefits:

- **Non-blocking I/O**: Your threads stay free for other work while operations are in flight
- **Better resource utilization**: Handle more concurrent operations with fewer threads
- **Improved scalability**: Build highly responsive applications that can handle thousands of concurrent requests
- **Reactive integration**: Works seamlessly with reactive streams and backpressure handling

</details>

<details>
<summary>Reactive Library Integration</summary>

The SDK returns [Reactive Streams `Publisher<T>`][reactive-streams] instances for operations dealing with streams involving multiple I/O interactions. We use Reactive Streams instead of JDK Flow API to provide broader compatibility with the reactive ecosystem, as most reactive libraries natively support Reactive Streams.

**Why Reactive Streams over JDK Flow?**
- **Broader ecosystem compatibility**: Most reactive libraries (Project Reactor, RxJava, Akka Streams, etc.) natively support Reactive Streams
- **Industry standard**: Reactive Streams is the de facto standard for reactive programming in Java
- **Better interoperability**: Seamless integration without additional adapters for most use cases

**Integration with Popular Libraries:**
- **Project Reactor**: Use `Flux.from(publisher)` to convert to Reactor types
- **RxJava**: Use `Flowable.fromPublisher(publisher)` for RxJava integration
- **Akka Streams**: Use `Source.fromPublisher(publisher)` for Akka Streams integration
- **Vert.x**: Use `ReadStream.fromPublisher(vertx, publisher)` for Vert.x reactive streams
- **Mutiny**: Use `Multi.createFrom().publisher(publisher)` for Quarkus Mutiny integration

**For JDK Flow API Integration:**
If you need JDK Flow API compatibility (e.g., for Quarkus/Mutiny 2), you can use adapters:
```java
// Convert Reactive Streams Publisher to Flow Publisher
Flow.Publisher<T> flowPublisher = FlowAdapters.toFlowPublisher(reactiveStreamsPublisher);

// Convert Flow Publisher to Reactive Streams Publisher
Publisher<T> reactiveStreamsPublisher = FlowAdapters.toPublisher(flowPublisher);
```

For standard single-response operations, the SDK returns `CompletableFuture<T>` for straightforward async execution.

</details>

<details>
<summary>Supported Operations</summary>

Async support is available for:

- **[Server-sent Events](#server-sent-event-streaming)**: Stream real-time events with Reactive Streams `Publisher<T>`
- **[JSONL Streaming](#jsonl-streaming)**: Process streaming JSON lines asynchronously
- **[Pagination](#pagination)**: Iterate through paginated results using `callAsPublisher()` and `callAsPublisherUnwrapped()`
- **[File Uploads](#file-uploads)**: Upload files asynchronously with progress tracking
- **[File Downloads](#file-downloads)**: Download files asynchronously with streaming support
- **[Standard Operations](#example)**: All regular API calls return `CompletableFuture<T>` for async execution

</details>

[comp-fut]: https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html
[reactive-streams]: https://www.reactive-streams.org/
<!-- End Asynchronous Support [async-support] -->

<!-- Start Authentication [security] -->
## Authentication

### Per-Client Security Schemes

This SDK supports the following security scheme globally:

| Name      | Type   | Scheme  | Environment Variable |
| --------- | ------ | ------- | -------------------- |
| `ttdAuth` | apiKey | API key | `WORKFLOWS_TTD_AUTH` |

To authenticate with the API the `ttdAuth` parameter must be set when initializing the SDK client instance. For example:
```java
package hello.world;

import com.thetradedesk.workflows.Workflows;
import com.thetradedesk.workflows.models.components.*;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.CreateAdGroupResponse;
import java.lang.Exception;
import java.util.List;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        Workflows sdk = Workflows.builder()
                .ttdAuth(System.getenv().getOrDefault("WORKFLOWS_TTD_AUTH", ""))
            .build();

        AdGroupCreateWorkflowInputWithValidation req = AdGroupCreateWorkflowInputWithValidation.builder()
                .primaryInput(AdGroupCreateWorkflowPrimaryInput.builder()
                    .name("<value>")
                    .channel(AdGroupChannel.DISPLAY)
                    .funnelLocation(AdGroupFunnelLocation.CONSIDERATION)
                    .isEnabled(false)
                    .description("twine from gosh poor safely editor astride vice lost and")
                    .budget(AdGroupWorkflowBudgetInput.builder()
                        .allocationType(AllocationType.MAXIMUM)
                        .budgetInAdvertiserCurrency(3786.02)
                        .budgetInImpressions(783190L)
                        .dailyTargetInAdvertiserCurrency(9747.02)
                        .dailyTargetInImpressions(985999L)
                        .build())
                    .baseBidCPMInAdvertiserCurrency(3785.04)
                    .maxBidCPMInAdvertiserCurrency(7447.3)
                    .audienceTargeting(AdGroupWorkflowAudienceTargetingInput.builder()
                        .audienceId("<id>")
                        .audienceAcceleratorExclusionsEnabled(true)
                        .audienceBoosterEnabled(true)
                        .audienceExcluderEnabled(true)
                        .audiencePredictorEnabled(false)
                        .crossDeviceVendorListForAudience(List.of(
                            107263))
                        .recencyExclusionWindowInMinutes(90062)
                        .targetTrackableUsersEnabled(true)
                        .useMcIdAsPrimary(true)
                        .build())
                    .roiGoal(AdGroupWorkflowROIGoalInput.builder()
                        .maximizeReach(true)
                        .maximizeLtvIncrementalReach(false)
                        .cpcInAdvertiserCurrency(2280.31)
                        .ctrInPercent(JsonNullable.of(null))
                        .nielsenOTPInPercent(5175.21)
                        .cpaInAdvertiserCurrency(2544.37)
                        .returnOnAdSpendPercent(8201.47)
                        .vcrInPercent(4846.08)
                        .viewabilityInPercent(JsonNullable.of(null))
                        .vcpmInAdvertiserCurrency(4649.53)
                        .cpcvInAdvertiserCurrency(313.95)
                        .miaozhenOTPInPercent(4704.1)
                        .build())
                    .creativeIds(JsonNullable.of(null))
                    .associatedBidLists(List.of(
                        AdGroupWorkflowAssociateBidListInput.builder()
                            .bidListId("<id>")
                            .isEnabled(false)
                            .isDefaultForDimension(true)
                            .build()))
                    .programmaticGuaranteedPrivateContractId("<id>")
                    .build())
                .campaignId("<id>")
                .advancedInput(AdGroupWorkflowAdvancedInput.builder()
                    .koaOptimizationSettings(AdGroupWorkflowKoaOptimizationSettingsInput.builder()
                        .areFutureKoaFeaturesEnabled(false)
                        .predictiveClearingEnabled(false)
                        .build())
                    .comscoreSettings(AdGroupWorkflowComscoreSettingsInput.builder()
                        .isEnabled(false)
                        .populationId(JsonNullable.of(null))
                        .demographicMemberIds(List.of(
                            959580,
                            236376))
                        .mobileDemographicMemberIds(List.of(
                            664689,
                            827980,
                            21321))
                        .build())
                    .contractTargeting(AdGroupWorkflowContractTargetingInput.builder()
                        .allowOpenMarketBiddingWhenTargetingContracts(true)
                        .build())
                    .dimensionalBiddingAutoOptimizationSettings(List.of(
                        List.of(),
                        List.of()))
                    .isUseClicksAsConversionsEnabled(false)
                    .isUseSecondaryConversionsEnabled(false)
                    .nielsenTrackingAttributes(AdGroupWorkflowNielsenTrackingAttributesInput.builder()
                        .gender(TargetingGender.MALE)
                        .startAge(TargetingStartAge.TWENTY_FIVE)
                        .endAge(TargetingEndAge.SEVENTEEN)
                        .countries(List.of(
                            "<value 1>",
                            "<value 2>",
                            "<value 3>"))
                        .enhancedReportingOption(EnhancedNielsenReportingOptions.SITE)
                        .build())
                    .newFrequencyConfigs(List.of(
                        AdGroupWorkflowNewFrequencyConfigInput.builder()
                            .counterName(Optional.empty())
                            .frequencyCap(375286)
                            .frequencyGoal(534735)
                            .resetIntervalInMinutes(788122)
                            .build()))
                    .flights(List.of(
                        AdGroupWorkflowFlightInput.builder()
                            .campaignFlightId(874887L)
                            .allocationType(AllocationType.MAXIMUM)
                            .budgetInAdvertiserCurrency(4070.96)
                            .budgetInImpressions(901477L)
                            .dailyTargetInAdvertiserCurrency(5847.35)
                            .dailyTargetInImpressions(257517L)
                            .build()))
                    .build())
                .validateInputOnly(true)
                .build();

        CreateAdGroupResponse res = sdk.adGroup().createAdGroup()
                .request(req)
                .call();

        if (res.adGroupPayload().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End Authentication [security] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

<details open>
<summary>Available methods</summary>

### [adGroup()](docs/sdks/adgroup/README.md)

* [createAdGroup](docs/sdks/adgroup/README.md#createadgroup) - Create a new ad group with required fields
* [updateAdGroup](docs/sdks/adgroup/README.md#updateadgroup) - Update an ad group with specified fields
* [archiveAdGroups](docs/sdks/adgroup/README.md#archiveadgroups) - Archive multiple ad groups
* [createAdGroupsJob](docs/sdks/adgroup/README.md#createadgroupsjob) - Create multiple new ad groups with required fields
* [updateAdGroupsJob](docs/sdks/adgroup/README.md#updateadgroupsjob) - Update multiple ad groups with specified fields

### [campaign()](docs/sdks/campaign/README.md)

* [create](docs/sdks/campaign/README.md#create) - Create a new campaign with required fields
* [updateCampaign](docs/sdks/campaign/README.md#updatecampaign) - Update a campaign with specified fields
* [createCampaignsJob](docs/sdks/campaign/README.md#createcampaignsjob) - Create multiple new campaigns with required fields
* [updateCampaignsJob](docs/sdks/campaign/README.md#updatecampaignsjob) - Update multiple campaigns with specified fields
* [archiveCampaigns](docs/sdks/campaign/README.md#archivecampaigns) - Archive multiple campaigns
* [getVersion](docs/sdks/campaign/README.md#getversion) - Get a campaign's version

### [dmp()](docs/sdks/dmp/README.md)

* [getFirstPartyDataJob](docs/sdks/dmp/README.md#getfirstpartydatajob) - Submit a job for first-party data retrieval for an advertiser
* [getThirdPartyDataJob](docs/sdks/dmp/README.md#getthirdpartydatajob) - Submit a job for third-party data retrieval for a partner

### [graphQLRequest()](docs/sdks/graphqlrequest/README.md)

* [submitGraphQlRequest](docs/sdks/graphqlrequest/README.md#submitgraphqlrequest) - Submit a valid GraphQL query or mutation
* [submitGraphQlQueryJob](docs/sdks/graphqlrequest/README.md#submitgraphqlqueryjob) - Submit a valid bulk GraphQL query

### [jobStatus()](docs/sdks/jobstatus/README.md)

* [getGraphQlQueryJobStatus](docs/sdks/jobstatus/README.md#getgraphqlqueryjobstatus) - Get the status of a previously submitted GraphQL query job
* [getJobStatus](docs/sdks/jobstatus/README.md#getjobstatus) - Get the status of a previously submitted job

### [restRequest()](docs/sdks/restrequest/README.md)

* [submitRestRequest](docs/sdks/restrequest/README.md#submitrestrequest) - Submit a valid REST request


</details>
<!-- End Available Resources and Operations [operations] -->

<!-- Start Retries [retries] -->
## Retries

Some of the endpoints in this SDK support retries. If you use the SDK without any configuration, it will fall back to the default retry strategy provided by the API. However, the default retry strategy can be overridden on a per-operation basis, or across the entire SDK.

To change the default retry strategy for a single API call, you can provide a `RetryConfig` object through the `retryConfig` builder method:
```java
package hello.world;

import com.thetradedesk.workflows.Workflows;
import com.thetradedesk.workflows.models.components.*;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.CreateAdGroupResponse;
import com.thetradedesk.workflows.utils.BackoffStrategy;
import com.thetradedesk.workflows.utils.RetryConfig;
import java.lang.Exception;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        Workflows sdk = Workflows.builder()
                .ttdAuth(System.getenv().getOrDefault("WORKFLOWS_TTD_AUTH", ""))
            .build();

        AdGroupCreateWorkflowInputWithValidation req = AdGroupCreateWorkflowInputWithValidation.builder()
                .primaryInput(AdGroupCreateWorkflowPrimaryInput.builder()
                    .name("<value>")
                    .channel(AdGroupChannel.DISPLAY)
                    .funnelLocation(AdGroupFunnelLocation.CONSIDERATION)
                    .isEnabled(false)
                    .description("twine from gosh poor safely editor astride vice lost and")
                    .budget(AdGroupWorkflowBudgetInput.builder()
                        .allocationType(AllocationType.MAXIMUM)
                        .budgetInAdvertiserCurrency(3786.02)
                        .budgetInImpressions(783190L)
                        .dailyTargetInAdvertiserCurrency(9747.02)
                        .dailyTargetInImpressions(985999L)
                        .build())
                    .baseBidCPMInAdvertiserCurrency(3785.04)
                    .maxBidCPMInAdvertiserCurrency(7447.3)
                    .audienceTargeting(AdGroupWorkflowAudienceTargetingInput.builder()
                        .audienceId("<id>")
                        .audienceAcceleratorExclusionsEnabled(true)
                        .audienceBoosterEnabled(true)
                        .audienceExcluderEnabled(true)
                        .audiencePredictorEnabled(false)
                        .crossDeviceVendorListForAudience(List.of(
                            107263))
                        .recencyExclusionWindowInMinutes(90062)
                        .targetTrackableUsersEnabled(true)
                        .useMcIdAsPrimary(true)
                        .build())
                    .roiGoal(AdGroupWorkflowROIGoalInput.builder()
                        .maximizeReach(true)
                        .maximizeLtvIncrementalReach(false)
                        .cpcInAdvertiserCurrency(2280.31)
                        .ctrInPercent(JsonNullable.of(null))
                        .nielsenOTPInPercent(5175.21)
                        .cpaInAdvertiserCurrency(2544.37)
                        .returnOnAdSpendPercent(8201.47)
                        .vcrInPercent(4846.08)
                        .viewabilityInPercent(JsonNullable.of(null))
                        .vcpmInAdvertiserCurrency(4649.53)
                        .cpcvInAdvertiserCurrency(313.95)
                        .miaozhenOTPInPercent(4704.1)
                        .build())
                    .creativeIds(JsonNullable.of(null))
                    .associatedBidLists(List.of(
                        AdGroupWorkflowAssociateBidListInput.builder()
                            .bidListId("<id>")
                            .isEnabled(false)
                            .isDefaultForDimension(true)
                            .build()))
                    .programmaticGuaranteedPrivateContractId("<id>")
                    .build())
                .campaignId("<id>")
                .advancedInput(AdGroupWorkflowAdvancedInput.builder()
                    .koaOptimizationSettings(AdGroupWorkflowKoaOptimizationSettingsInput.builder()
                        .areFutureKoaFeaturesEnabled(false)
                        .predictiveClearingEnabled(false)
                        .build())
                    .comscoreSettings(AdGroupWorkflowComscoreSettingsInput.builder()
                        .isEnabled(false)
                        .populationId(JsonNullable.of(null))
                        .demographicMemberIds(List.of(
                            959580,
                            236376))
                        .mobileDemographicMemberIds(List.of(
                            664689,
                            827980,
                            21321))
                        .build())
                    .contractTargeting(AdGroupWorkflowContractTargetingInput.builder()
                        .allowOpenMarketBiddingWhenTargetingContracts(true)
                        .build())
                    .dimensionalBiddingAutoOptimizationSettings(List.of(
                        List.of(),
                        List.of()))
                    .isUseClicksAsConversionsEnabled(false)
                    .isUseSecondaryConversionsEnabled(false)
                    .nielsenTrackingAttributes(AdGroupWorkflowNielsenTrackingAttributesInput.builder()
                        .gender(TargetingGender.MALE)
                        .startAge(TargetingStartAge.TWENTY_FIVE)
                        .endAge(TargetingEndAge.SEVENTEEN)
                        .countries(List.of(
                            "<value 1>",
                            "<value 2>",
                            "<value 3>"))
                        .enhancedReportingOption(EnhancedNielsenReportingOptions.SITE)
                        .build())
                    .newFrequencyConfigs(List.of(
                        AdGroupWorkflowNewFrequencyConfigInput.builder()
                            .counterName(Optional.empty())
                            .frequencyCap(375286)
                            .frequencyGoal(534735)
                            .resetIntervalInMinutes(788122)
                            .build()))
                    .flights(List.of(
                        AdGroupWorkflowFlightInput.builder()
                            .campaignFlightId(874887L)
                            .allocationType(AllocationType.MAXIMUM)
                            .budgetInAdvertiserCurrency(4070.96)
                            .budgetInImpressions(901477L)
                            .dailyTargetInAdvertiserCurrency(5847.35)
                            .dailyTargetInImpressions(257517L)
                            .build()))
                    .build())
                .validateInputOnly(true)
                .build();

        CreateAdGroupResponse res = sdk.adGroup().createAdGroup()
                .request(req)
                .retryConfig(RetryConfig.builder()
                    .backoff(BackoffStrategy.builder()
                        .initialInterval(1L, TimeUnit.MILLISECONDS)
                        .maxInterval(50L, TimeUnit.MILLISECONDS)
                        .maxElapsedTime(1000L, TimeUnit.MILLISECONDS)
                        .baseFactor(1.1)
                        .jitterFactor(0.15)
                        .retryConnectError(false)
                        .build())
                    .build())
                .call();

        if (res.adGroupPayload().isPresent()) {
            // handle response
        }
    }
}
```

If you'd like to override the default retry strategy for all operations that support retries, you can provide a configuration at SDK initialization:
```java
package hello.world;

import com.thetradedesk.workflows.Workflows;
import com.thetradedesk.workflows.models.components.*;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.CreateAdGroupResponse;
import com.thetradedesk.workflows.utils.BackoffStrategy;
import com.thetradedesk.workflows.utils.RetryConfig;
import java.lang.Exception;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        Workflows sdk = Workflows.builder()
                .retryConfig(RetryConfig.builder()
                    .backoff(BackoffStrategy.builder()
                        .initialInterval(1L, TimeUnit.MILLISECONDS)
                        .maxInterval(50L, TimeUnit.MILLISECONDS)
                        .maxElapsedTime(1000L, TimeUnit.MILLISECONDS)
                        .baseFactor(1.1)
                        .jitterFactor(0.15)
                        .retryConnectError(false)
                        .build())
                    .build())
                .ttdAuth(System.getenv().getOrDefault("WORKFLOWS_TTD_AUTH", ""))
            .build();

        AdGroupCreateWorkflowInputWithValidation req = AdGroupCreateWorkflowInputWithValidation.builder()
                .primaryInput(AdGroupCreateWorkflowPrimaryInput.builder()
                    .name("<value>")
                    .channel(AdGroupChannel.DISPLAY)
                    .funnelLocation(AdGroupFunnelLocation.CONSIDERATION)
                    .isEnabled(false)
                    .description("twine from gosh poor safely editor astride vice lost and")
                    .budget(AdGroupWorkflowBudgetInput.builder()
                        .allocationType(AllocationType.MAXIMUM)
                        .budgetInAdvertiserCurrency(3786.02)
                        .budgetInImpressions(783190L)
                        .dailyTargetInAdvertiserCurrency(9747.02)
                        .dailyTargetInImpressions(985999L)
                        .build())
                    .baseBidCPMInAdvertiserCurrency(3785.04)
                    .maxBidCPMInAdvertiserCurrency(7447.3)
                    .audienceTargeting(AdGroupWorkflowAudienceTargetingInput.builder()
                        .audienceId("<id>")
                        .audienceAcceleratorExclusionsEnabled(true)
                        .audienceBoosterEnabled(true)
                        .audienceExcluderEnabled(true)
                        .audiencePredictorEnabled(false)
                        .crossDeviceVendorListForAudience(List.of(
                            107263))
                        .recencyExclusionWindowInMinutes(90062)
                        .targetTrackableUsersEnabled(true)
                        .useMcIdAsPrimary(true)
                        .build())
                    .roiGoal(AdGroupWorkflowROIGoalInput.builder()
                        .maximizeReach(true)
                        .maximizeLtvIncrementalReach(false)
                        .cpcInAdvertiserCurrency(2280.31)
                        .ctrInPercent(JsonNullable.of(null))
                        .nielsenOTPInPercent(5175.21)
                        .cpaInAdvertiserCurrency(2544.37)
                        .returnOnAdSpendPercent(8201.47)
                        .vcrInPercent(4846.08)
                        .viewabilityInPercent(JsonNullable.of(null))
                        .vcpmInAdvertiserCurrency(4649.53)
                        .cpcvInAdvertiserCurrency(313.95)
                        .miaozhenOTPInPercent(4704.1)
                        .build())
                    .creativeIds(JsonNullable.of(null))
                    .associatedBidLists(List.of(
                        AdGroupWorkflowAssociateBidListInput.builder()
                            .bidListId("<id>")
                            .isEnabled(false)
                            .isDefaultForDimension(true)
                            .build()))
                    .programmaticGuaranteedPrivateContractId("<id>")
                    .build())
                .campaignId("<id>")
                .advancedInput(AdGroupWorkflowAdvancedInput.builder()
                    .koaOptimizationSettings(AdGroupWorkflowKoaOptimizationSettingsInput.builder()
                        .areFutureKoaFeaturesEnabled(false)
                        .predictiveClearingEnabled(false)
                        .build())
                    .comscoreSettings(AdGroupWorkflowComscoreSettingsInput.builder()
                        .isEnabled(false)
                        .populationId(JsonNullable.of(null))
                        .demographicMemberIds(List.of(
                            959580,
                            236376))
                        .mobileDemographicMemberIds(List.of(
                            664689,
                            827980,
                            21321))
                        .build())
                    .contractTargeting(AdGroupWorkflowContractTargetingInput.builder()
                        .allowOpenMarketBiddingWhenTargetingContracts(true)
                        .build())
                    .dimensionalBiddingAutoOptimizationSettings(List.of(
                        List.of(),
                        List.of()))
                    .isUseClicksAsConversionsEnabled(false)
                    .isUseSecondaryConversionsEnabled(false)
                    .nielsenTrackingAttributes(AdGroupWorkflowNielsenTrackingAttributesInput.builder()
                        .gender(TargetingGender.MALE)
                        .startAge(TargetingStartAge.TWENTY_FIVE)
                        .endAge(TargetingEndAge.SEVENTEEN)
                        .countries(List.of(
                            "<value 1>",
                            "<value 2>",
                            "<value 3>"))
                        .enhancedReportingOption(EnhancedNielsenReportingOptions.SITE)
                        .build())
                    .newFrequencyConfigs(List.of(
                        AdGroupWorkflowNewFrequencyConfigInput.builder()
                            .counterName(Optional.empty())
                            .frequencyCap(375286)
                            .frequencyGoal(534735)
                            .resetIntervalInMinutes(788122)
                            .build()))
                    .flights(List.of(
                        AdGroupWorkflowFlightInput.builder()
                            .campaignFlightId(874887L)
                            .allocationType(AllocationType.MAXIMUM)
                            .budgetInAdvertiserCurrency(4070.96)
                            .budgetInImpressions(901477L)
                            .dailyTargetInAdvertiserCurrency(5847.35)
                            .dailyTargetInImpressions(257517L)
                            .build()))
                    .build())
                .validateInputOnly(true)
                .build();

        CreateAdGroupResponse res = sdk.adGroup().createAdGroup()
                .request(req)
                .call();

        if (res.adGroupPayload().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End Retries [retries] -->

<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations. All operations return a response object or raise an exception.

By default, an API error will throw a `models/errors/APIException` exception. When custom error responses are specified for an operation, the SDK may also throw their associated exception. You can refer to respective *Errors* tables in SDK docs for more details on possible exception types for each operation. For example, the `createAdGroup` method throws the following exceptions:

| Error Type                            | Status Code | Content Type     |
| ------------------------------------- | ----------- | ---------------- |
| models/errors/ProblemDetailsException | 400, 403    | application/json |
| models/errors/APIException            | 4XX, 5XX    | \*/\*            |

### Example

```java
package hello.world;

import com.thetradedesk.workflows.Workflows;
import com.thetradedesk.workflows.models.components.*;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.CreateAdGroupResponse;
import java.lang.Exception;
import java.util.List;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        Workflows sdk = Workflows.builder()
                .ttdAuth(System.getenv().getOrDefault("WORKFLOWS_TTD_AUTH", ""))
            .build();

        AdGroupCreateWorkflowInputWithValidation req = AdGroupCreateWorkflowInputWithValidation.builder()
                .primaryInput(AdGroupCreateWorkflowPrimaryInput.builder()
                    .name("<value>")
                    .channel(AdGroupChannel.DISPLAY)
                    .funnelLocation(AdGroupFunnelLocation.CONSIDERATION)
                    .isEnabled(false)
                    .description("twine from gosh poor safely editor astride vice lost and")
                    .budget(AdGroupWorkflowBudgetInput.builder()
                        .allocationType(AllocationType.MAXIMUM)
                        .budgetInAdvertiserCurrency(3786.02)
                        .budgetInImpressions(783190L)
                        .dailyTargetInAdvertiserCurrency(9747.02)
                        .dailyTargetInImpressions(985999L)
                        .build())
                    .baseBidCPMInAdvertiserCurrency(3785.04)
                    .maxBidCPMInAdvertiserCurrency(7447.3)
                    .audienceTargeting(AdGroupWorkflowAudienceTargetingInput.builder()
                        .audienceId("<id>")
                        .audienceAcceleratorExclusionsEnabled(true)
                        .audienceBoosterEnabled(true)
                        .audienceExcluderEnabled(true)
                        .audiencePredictorEnabled(false)
                        .crossDeviceVendorListForAudience(List.of(
                            107263))
                        .recencyExclusionWindowInMinutes(90062)
                        .targetTrackableUsersEnabled(true)
                        .useMcIdAsPrimary(true)
                        .build())
                    .roiGoal(AdGroupWorkflowROIGoalInput.builder()
                        .maximizeReach(true)
                        .maximizeLtvIncrementalReach(false)
                        .cpcInAdvertiserCurrency(2280.31)
                        .ctrInPercent(JsonNullable.of(null))
                        .nielsenOTPInPercent(5175.21)
                        .cpaInAdvertiserCurrency(2544.37)
                        .returnOnAdSpendPercent(8201.47)
                        .vcrInPercent(4846.08)
                        .viewabilityInPercent(JsonNullable.of(null))
                        .vcpmInAdvertiserCurrency(4649.53)
                        .cpcvInAdvertiserCurrency(313.95)
                        .miaozhenOTPInPercent(4704.1)
                        .build())
                    .creativeIds(JsonNullable.of(null))
                    .associatedBidLists(List.of(
                        AdGroupWorkflowAssociateBidListInput.builder()
                            .bidListId("<id>")
                            .isEnabled(false)
                            .isDefaultForDimension(true)
                            .build()))
                    .programmaticGuaranteedPrivateContractId("<id>")
                    .build())
                .campaignId("<id>")
                .advancedInput(AdGroupWorkflowAdvancedInput.builder()
                    .koaOptimizationSettings(AdGroupWorkflowKoaOptimizationSettingsInput.builder()
                        .areFutureKoaFeaturesEnabled(false)
                        .predictiveClearingEnabled(false)
                        .build())
                    .comscoreSettings(AdGroupWorkflowComscoreSettingsInput.builder()
                        .isEnabled(false)
                        .populationId(JsonNullable.of(null))
                        .demographicMemberIds(List.of(
                            959580,
                            236376))
                        .mobileDemographicMemberIds(List.of(
                            664689,
                            827980,
                            21321))
                        .build())
                    .contractTargeting(AdGroupWorkflowContractTargetingInput.builder()
                        .allowOpenMarketBiddingWhenTargetingContracts(true)
                        .build())
                    .dimensionalBiddingAutoOptimizationSettings(List.of(
                        List.of(),
                        List.of()))
                    .isUseClicksAsConversionsEnabled(false)
                    .isUseSecondaryConversionsEnabled(false)
                    .nielsenTrackingAttributes(AdGroupWorkflowNielsenTrackingAttributesInput.builder()
                        .gender(TargetingGender.MALE)
                        .startAge(TargetingStartAge.TWENTY_FIVE)
                        .endAge(TargetingEndAge.SEVENTEEN)
                        .countries(List.of(
                            "<value 1>",
                            "<value 2>",
                            "<value 3>"))
                        .enhancedReportingOption(EnhancedNielsenReportingOptions.SITE)
                        .build())
                    .newFrequencyConfigs(List.of(
                        AdGroupWorkflowNewFrequencyConfigInput.builder()
                            .counterName(Optional.empty())
                            .frequencyCap(375286)
                            .frequencyGoal(534735)
                            .resetIntervalInMinutes(788122)
                            .build()))
                    .flights(List.of(
                        AdGroupWorkflowFlightInput.builder()
                            .campaignFlightId(874887L)
                            .allocationType(AllocationType.MAXIMUM)
                            .budgetInAdvertiserCurrency(4070.96)
                            .budgetInImpressions(901477L)
                            .dailyTargetInAdvertiserCurrency(5847.35)
                            .dailyTargetInImpressions(257517L)
                            .build()))
                    .build())
                .validateInputOnly(true)
                .build();

        CreateAdGroupResponse res = sdk.adGroup().createAdGroup()
                .request(req)
                .call();

        if (res.adGroupPayload().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End Error Handling [errors] -->

<!-- Start Server Selection [server] -->
## Server Selection

### Select Server by Name

You can override the default server globally using the `.server(AvailableServers server)` builder method when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the names associated with the available servers:

| Name      | Server                                          | Description                          |
| --------- | ----------------------------------------------- | ------------------------------------ |
| `prod`    | `https://api.thetradedesk.com/workflows`        | The production environment.          |
| `sandbox` | `https://ext-api.sb.thetradedesk.com/workflows` | The sandbox environment for testing. |

#### Example

```java
package hello.world;

import com.thetradedesk.workflows.Workflows;
import com.thetradedesk.workflows.models.components.*;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.CreateAdGroupResponse;
import java.lang.Exception;
import java.util.List;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        Workflows sdk = Workflows.builder()
                .server(Workflows.AvailableServers.SANDBOX)
                .ttdAuth(System.getenv().getOrDefault("WORKFLOWS_TTD_AUTH", ""))
            .build();

        AdGroupCreateWorkflowInputWithValidation req = AdGroupCreateWorkflowInputWithValidation.builder()
                .primaryInput(AdGroupCreateWorkflowPrimaryInput.builder()
                    .name("<value>")
                    .channel(AdGroupChannel.DISPLAY)
                    .funnelLocation(AdGroupFunnelLocation.CONSIDERATION)
                    .isEnabled(false)
                    .description("twine from gosh poor safely editor astride vice lost and")
                    .budget(AdGroupWorkflowBudgetInput.builder()
                        .allocationType(AllocationType.MAXIMUM)
                        .budgetInAdvertiserCurrency(3786.02)
                        .budgetInImpressions(783190L)
                        .dailyTargetInAdvertiserCurrency(9747.02)
                        .dailyTargetInImpressions(985999L)
                        .build())
                    .baseBidCPMInAdvertiserCurrency(3785.04)
                    .maxBidCPMInAdvertiserCurrency(7447.3)
                    .audienceTargeting(AdGroupWorkflowAudienceTargetingInput.builder()
                        .audienceId("<id>")
                        .audienceAcceleratorExclusionsEnabled(true)
                        .audienceBoosterEnabled(true)
                        .audienceExcluderEnabled(true)
                        .audiencePredictorEnabled(false)
                        .crossDeviceVendorListForAudience(List.of(
                            107263))
                        .recencyExclusionWindowInMinutes(90062)
                        .targetTrackableUsersEnabled(true)
                        .useMcIdAsPrimary(true)
                        .build())
                    .roiGoal(AdGroupWorkflowROIGoalInput.builder()
                        .maximizeReach(true)
                        .maximizeLtvIncrementalReach(false)
                        .cpcInAdvertiserCurrency(2280.31)
                        .ctrInPercent(JsonNullable.of(null))
                        .nielsenOTPInPercent(5175.21)
                        .cpaInAdvertiserCurrency(2544.37)
                        .returnOnAdSpendPercent(8201.47)
                        .vcrInPercent(4846.08)
                        .viewabilityInPercent(JsonNullable.of(null))
                        .vcpmInAdvertiserCurrency(4649.53)
                        .cpcvInAdvertiserCurrency(313.95)
                        .miaozhenOTPInPercent(4704.1)
                        .build())
                    .creativeIds(JsonNullable.of(null))
                    .associatedBidLists(List.of(
                        AdGroupWorkflowAssociateBidListInput.builder()
                            .bidListId("<id>")
                            .isEnabled(false)
                            .isDefaultForDimension(true)
                            .build()))
                    .programmaticGuaranteedPrivateContractId("<id>")
                    .build())
                .campaignId("<id>")
                .advancedInput(AdGroupWorkflowAdvancedInput.builder()
                    .koaOptimizationSettings(AdGroupWorkflowKoaOptimizationSettingsInput.builder()
                        .areFutureKoaFeaturesEnabled(false)
                        .predictiveClearingEnabled(false)
                        .build())
                    .comscoreSettings(AdGroupWorkflowComscoreSettingsInput.builder()
                        .isEnabled(false)
                        .populationId(JsonNullable.of(null))
                        .demographicMemberIds(List.of(
                            959580,
                            236376))
                        .mobileDemographicMemberIds(List.of(
                            664689,
                            827980,
                            21321))
                        .build())
                    .contractTargeting(AdGroupWorkflowContractTargetingInput.builder()
                        .allowOpenMarketBiddingWhenTargetingContracts(true)
                        .build())
                    .dimensionalBiddingAutoOptimizationSettings(List.of(
                        List.of(),
                        List.of()))
                    .isUseClicksAsConversionsEnabled(false)
                    .isUseSecondaryConversionsEnabled(false)
                    .nielsenTrackingAttributes(AdGroupWorkflowNielsenTrackingAttributesInput.builder()
                        .gender(TargetingGender.MALE)
                        .startAge(TargetingStartAge.TWENTY_FIVE)
                        .endAge(TargetingEndAge.SEVENTEEN)
                        .countries(List.of(
                            "<value 1>",
                            "<value 2>",
                            "<value 3>"))
                        .enhancedReportingOption(EnhancedNielsenReportingOptions.SITE)
                        .build())
                    .newFrequencyConfigs(List.of(
                        AdGroupWorkflowNewFrequencyConfigInput.builder()
                            .counterName(Optional.empty())
                            .frequencyCap(375286)
                            .frequencyGoal(534735)
                            .resetIntervalInMinutes(788122)
                            .build()))
                    .flights(List.of(
                        AdGroupWorkflowFlightInput.builder()
                            .campaignFlightId(874887L)
                            .allocationType(AllocationType.MAXIMUM)
                            .budgetInAdvertiserCurrency(4070.96)
                            .budgetInImpressions(901477L)
                            .dailyTargetInAdvertiserCurrency(5847.35)
                            .dailyTargetInImpressions(257517L)
                            .build()))
                    .build())
                .validateInputOnly(true)
                .build();

        CreateAdGroupResponse res = sdk.adGroup().createAdGroup()
                .request(req)
                .call();

        if (res.adGroupPayload().isPresent()) {
            // handle response
        }
    }
}
```

### Override Server URL Per-Client

The default server can also be overridden globally using the `.serverURL(String serverUrl)` builder method when initializing the SDK client instance. For example:
```java
package hello.world;

import com.thetradedesk.workflows.Workflows;
import com.thetradedesk.workflows.models.components.*;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.CreateAdGroupResponse;
import java.lang.Exception;
import java.util.List;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        Workflows sdk = Workflows.builder()
                .serverURL("https://api.thetradedesk.com/workflows")
                .ttdAuth(System.getenv().getOrDefault("WORKFLOWS_TTD_AUTH", ""))
            .build();

        AdGroupCreateWorkflowInputWithValidation req = AdGroupCreateWorkflowInputWithValidation.builder()
                .primaryInput(AdGroupCreateWorkflowPrimaryInput.builder()
                    .name("<value>")
                    .channel(AdGroupChannel.DISPLAY)
                    .funnelLocation(AdGroupFunnelLocation.CONSIDERATION)
                    .isEnabled(false)
                    .description("twine from gosh poor safely editor astride vice lost and")
                    .budget(AdGroupWorkflowBudgetInput.builder()
                        .allocationType(AllocationType.MAXIMUM)
                        .budgetInAdvertiserCurrency(3786.02)
                        .budgetInImpressions(783190L)
                        .dailyTargetInAdvertiserCurrency(9747.02)
                        .dailyTargetInImpressions(985999L)
                        .build())
                    .baseBidCPMInAdvertiserCurrency(3785.04)
                    .maxBidCPMInAdvertiserCurrency(7447.3)
                    .audienceTargeting(AdGroupWorkflowAudienceTargetingInput.builder()
                        .audienceId("<id>")
                        .audienceAcceleratorExclusionsEnabled(true)
                        .audienceBoosterEnabled(true)
                        .audienceExcluderEnabled(true)
                        .audiencePredictorEnabled(false)
                        .crossDeviceVendorListForAudience(List.of(
                            107263))
                        .recencyExclusionWindowInMinutes(90062)
                        .targetTrackableUsersEnabled(true)
                        .useMcIdAsPrimary(true)
                        .build())
                    .roiGoal(AdGroupWorkflowROIGoalInput.builder()
                        .maximizeReach(true)
                        .maximizeLtvIncrementalReach(false)
                        .cpcInAdvertiserCurrency(2280.31)
                        .ctrInPercent(JsonNullable.of(null))
                        .nielsenOTPInPercent(5175.21)
                        .cpaInAdvertiserCurrency(2544.37)
                        .returnOnAdSpendPercent(8201.47)
                        .vcrInPercent(4846.08)
                        .viewabilityInPercent(JsonNullable.of(null))
                        .vcpmInAdvertiserCurrency(4649.53)
                        .cpcvInAdvertiserCurrency(313.95)
                        .miaozhenOTPInPercent(4704.1)
                        .build())
                    .creativeIds(JsonNullable.of(null))
                    .associatedBidLists(List.of(
                        AdGroupWorkflowAssociateBidListInput.builder()
                            .bidListId("<id>")
                            .isEnabled(false)
                            .isDefaultForDimension(true)
                            .build()))
                    .programmaticGuaranteedPrivateContractId("<id>")
                    .build())
                .campaignId("<id>")
                .advancedInput(AdGroupWorkflowAdvancedInput.builder()
                    .koaOptimizationSettings(AdGroupWorkflowKoaOptimizationSettingsInput.builder()
                        .areFutureKoaFeaturesEnabled(false)
                        .predictiveClearingEnabled(false)
                        .build())
                    .comscoreSettings(AdGroupWorkflowComscoreSettingsInput.builder()
                        .isEnabled(false)
                        .populationId(JsonNullable.of(null))
                        .demographicMemberIds(List.of(
                            959580,
                            236376))
                        .mobileDemographicMemberIds(List.of(
                            664689,
                            827980,
                            21321))
                        .build())
                    .contractTargeting(AdGroupWorkflowContractTargetingInput.builder()
                        .allowOpenMarketBiddingWhenTargetingContracts(true)
                        .build())
                    .dimensionalBiddingAutoOptimizationSettings(List.of(
                        List.of(),
                        List.of()))
                    .isUseClicksAsConversionsEnabled(false)
                    .isUseSecondaryConversionsEnabled(false)
                    .nielsenTrackingAttributes(AdGroupWorkflowNielsenTrackingAttributesInput.builder()
                        .gender(TargetingGender.MALE)
                        .startAge(TargetingStartAge.TWENTY_FIVE)
                        .endAge(TargetingEndAge.SEVENTEEN)
                        .countries(List.of(
                            "<value 1>",
                            "<value 2>",
                            "<value 3>"))
                        .enhancedReportingOption(EnhancedNielsenReportingOptions.SITE)
                        .build())
                    .newFrequencyConfigs(List.of(
                        AdGroupWorkflowNewFrequencyConfigInput.builder()
                            .counterName(Optional.empty())
                            .frequencyCap(375286)
                            .frequencyGoal(534735)
                            .resetIntervalInMinutes(788122)
                            .build()))
                    .flights(List.of(
                        AdGroupWorkflowFlightInput.builder()
                            .campaignFlightId(874887L)
                            .allocationType(AllocationType.MAXIMUM)
                            .budgetInAdvertiserCurrency(4070.96)
                            .budgetInImpressions(901477L)
                            .dailyTargetInAdvertiserCurrency(5847.35)
                            .dailyTargetInImpressions(257517L)
                            .build()))
                    .build())
                .validateInputOnly(true)
                .build();

        CreateAdGroupResponse res = sdk.adGroup().createAdGroup()
                .request(req)
                .call();

        if (res.adGroupPayload().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End Server Selection [server] -->

<!-- Start Debugging [debug] -->
## Debugging

### Debug
You can setup your SDK to emit debug logs for SDK requests and responses.

For request and response logging (especially json bodies), call `enableHTTPDebugLogging(boolean)` on the SDK builder like so:
```java
SDK.builder()
    .enableHTTPDebugLogging(true)
    .build();
```
Example output:
```
Sending request: http://localhost:35123/bearer#global GET
Request headers: {Accept=[application/json], Authorization=[******], Client-Level-Header=[added by client], Idempotency-Key=[some-key], x-speakeasy-user-agent=[speakeasy-sdk/java 0.0.1 internal 0.1.0 org.openapis.openapi]}
Received response: (GET http://localhost:35123/bearer#global) 200
Response headers: {access-control-allow-credentials=[true], access-control-allow-origin=[*], connection=[keep-alive], content-length=[50], content-type=[application/json], date=[Wed, 09 Apr 2025 01:43:29 GMT], server=[gunicorn/19.9.0]}
Response body:
{
  "authenticated": true, 
  "token": "global"
}
```
__WARNING__: This should only used for temporary debugging purposes. Leaving this option on in a production system could expose credentials/secrets in logs. <i>Authorization</i> headers are redacted by default and there is the ability to specify redacted header names via `SpeakeasyHTTPClient.setRedactedHeaders`.

__NOTE__: This is a convenience method that calls `HTTPClient.enableDebugLogging()`. The `SpeakeasyHTTPClient` honors this setting. If you are using a custom HTTP client, it is up to the custom client to honor this setting.

Another option is to set the System property `-Djdk.httpclient.HttpClient.log=all`. However, this second option does not log bodies.
<!-- End Debugging [debug] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->

# Development

## Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

## Contributions

While we value open-source contributions to this SDK, this library is generated programmatically. Any manual changes added to internal files will be overwritten on the next generation. 
We look forward to hearing your feedback. Feel free to open a PR or an issue with a proof of concept and we'll do our best to include it in a future release. 

### SDK Created by [Speakeasy](https://www.speakeasy.com/?utm_source=openapi&utm_campaign=java)
