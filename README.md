# openapi

Developer-friendly & type-safe Java SDK specifically catered to leverage *openapi* API.

<div align="left">
    <a href="https://www.speakeasy.com/?utm_source=openapi&utm_campaign=java"><img src="https://custom-icon-badges.demolab.com/badge/-Built%20By%20Speakeasy-212015?style=for-the-badge&logoColor=FBE331&logo=speakeasy&labelColor=545454" /></a>
    <a href="https://mit-license.org/">
        <img src="https://img.shields.io/badge/License-MIT-blue.svg" style="width: 100px; height: 28px;" />
    </a>
</div>


<br /><br />
> [!IMPORTANT]
> This SDK is not yet ready for production use. To complete setup please follow the steps outlined in your [workspace](https://app.speakeasy.com/org/thetradedesk/workflows). Delete this section before > publishing to a package manager.

<!-- Start Summary [summary] -->
## Summary

Workflows Service: ## Operations for commonly used workflows.
This service provides operations for commonly used workflows on The Trade Desk's platform.
In addition, this service provides generic operations for submitting:

- GraphQL API requests
- REST API requests

To interface with this service, we provide SDKs in multiple languages.
For each available language, there is a code sample displayed to the right of each operation.

To get started with the SDK in your language of choice, see the associated guide:

- Java - coming soon
- [Python](https://pypi.org/project/ttd-workflows/)

For further explanation on the entities encountered in this documentation (e.g.,
[campaigns](https://partner.thetradedesk.com/v3/portal/api/doc/Campaigns) and
[ad groups](https://partner.thetradedesk.com/v3/portal/api/doc/AdGroup)), visit the
[Partner Portal](https://partner.thetradedesk.com/v3/portal/api/doc/ApiUseCases).
<!-- End Summary [summary] -->

<!-- Start Table of Contents [toc] -->
## Table of Contents
<!-- $toc-max-depth=2 -->
* [openapi](#openapi)
  * [SDK Installation](#sdk-installation)
  * [SDK Example Usage](#sdk-example-usage)
  * [Authentication](#authentication)
  * [Available Resources and Operations](#available-resources-and-operations)
  * [Retries](#retries)
  * [Error Handling](#error-handling)
  * [Server Selection](#server-selection)
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
implementation 'com.thetradedesk:workflows:0.6.1'
```

Maven:
```xml
<dependency>
    <groupId>com.thetradedesk</groupId>
    <artifactId>workflows</artifactId>
    <version>0.6.1</version>
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

### Logging
A logging framework/facade has not yet been adopted but is under consideration.

For request and response logging (especially json bodies) use:
```java
SpeakeasyHTTPClient.setDebugLogging(true); // experimental API only (may change without warning)
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
WARNING: This should only used for temporary debugging purposes. Leaving this option on in a production system could expose credentials/secrets in logs. <i>Authorization</i> headers are redacted by default and there is the ability to specify redacted header names via `SpeakeasyHTTPClient.setRedactedHeaders`.

Another option is to set the System property `-Djdk.httpclient.HttpClient.log=all`. However, this second option does not log bodies.
<!-- End SDK Installation [installation] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example

```java
package hello.world;

import com.thetradedesk.workflows.TtdWorkflows;
import com.thetradedesk.workflows.models.components.*;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.PostAdgroupResponse;
import java.lang.Exception;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        TtdWorkflows sdk = TtdWorkflows.builder()
                .ttdAuth("<YOUR_API_KEY_HERE>")
            .build();

        AdGroupCreateWorkflowInputWithValidation req = AdGroupCreateWorkflowInputWithValidation.builder()
                .primaryInput(AdGroupCreateWorkflowPrimaryInput.builder()
                    .name("<value>")
                    .channel(AdGroupChannel.NATIVE_DISPLAY)
                    .funnelLocation(AdGroupFunnelLocation.AWARENESS)
                    .isEnabled(true)
                    .description("after wrongly laughter rare")
                    .budget(AdGroupWorkflowBudgetInput.builder()
                        .allocationType(AllocationType.MINIMUM)
                        .budgetInAdvertiserCurrency(5906.7)
                        .budgetInImpressions(606146L)
                        .dailyTargetInAdvertiserCurrency(3786.12)
                        .dailyTargetInImpressions(568427L)
                        .build())
                    .baseBidCPMInAdvertiserCurrency(939.59)
                    .maxBidCPMInAdvertiserCurrency(6554.77)
                    .audienceTargeting(AdGroupWorkflowAudienceTargetingInput.builder()
                        .audienceId("<id>")
                        .audienceAcceleratorExclusionsEnabled(false)
                        .audienceBoosterEnabled(false)
                        .audienceExcluderEnabled(true)
                        .audiencePredictorEnabled(false)
                        .crossDeviceVendorListForAudience(List.of(
                            77740,
                            699788))
                        .recencyExclusionWindowInMinutes(675119)
                        .targetTrackableUsersEnabled(false)
                        .useMcIdAsPrimary(true)
                        .build())
                    .roiGoal(AdGroupWorkflowROIGoalInput.builder()
                        .maximizeReach(false)
                        .maximizeLtvIncrementalReach(JsonNullable.of(null))
                        .cpcInAdvertiserCurrency(2128.6)
                        .ctrInPercent(2164.49)
                        .nielsenOTPInPercent(8642.95)
                        .cpaInAdvertiserCurrency(9706.01)
                        .returnOnAdSpendPercent(259.31)
                        .vcrInPercent(9665.19)
                        .viewabilityInPercent(2917.69)
                        .vcpmInAdvertiserCurrency(9415.05)
                        .cpcvInAdvertiserCurrency(5100.12)
                        .miaozhenOTPInPercent(JsonNullable.of(null))
                        .build())
                    .creativeIds(List.of(
                        "<value 1>",
                        "<value 2>"))
                    .associatedBidLists(List.of(
                        AdGroupWorkflowAssociateBidListInput.builder()
                            .bidListId("<id>")
                            .isEnabled(false)
                            .isDefaultForDimension(false)
                            .build()))
                    .programmaticGuaranteedPrivateContractId("<id>")
                    .build())
                .campaignId("<id>")
                .advancedInput(AdGroupWorkflowAdvancedInput.builder()
                    .koaOptimizationSettings(AdGroupWorkflowKoaOptimizationSettingsInput.builder()
                        .areFutureKoaFeaturesEnabled(true)
                        .predictiveClearingEnabled(JsonNullable.of(null))
                        .build())
                    .comscoreSettings(AdGroupWorkflowComscoreSettingsInput.builder()
                        .isEnabled(true)
                        .populationId(937153)
                        .demographicMemberIds(JsonNullable.of(null))
                        .mobileDemographicMemberIds(List.of(
                            948705,
                            285090))
                        .build())
                    .contractTargeting(AdGroupWorkflowContractTargetingInput.builder()
                        .allowOpenMarketBiddingWhenTargetingContracts(true)
                        .build())
                    .dimensionalBiddingAutoOptimizationSettings(List.of(
                        List.of()))
                    .isUseClicksAsConversionsEnabled(true)
                    .isUseSecondaryConversionsEnabled(true)
                    .nielsenTrackingAttributes(AdGroupWorkflowNielsenTrackingAttributesInput.builder()
                        .gender(TargetingGender.FEMALE)
                        .startAge(TargetingStartAge.THIRTEEN)
                        .endAge(TargetingEndAge.TWENTY_FOUR)
                        .countries(List.of(
                            "<value 1>"))
                        .enhancedReportingOption(EnhancedNielsenReportingOptions.SITE)
                        .build())
                    .newFrequencyConfigs(List.of(
                        AdGroupWorkflowNewFrequencyConfigInput.builder()
                            .counterName("<value>")
                            .frequencyCap(440820)
                            .frequencyGoal(576339)
                            .resetIntervalInMinutes(309043)
                            .build()))
                    .flights(List.of(
                        AdGroupWorkflowFlightInput.builder()
                            .campaignFlightId(170903L)
                            .allocationType(AllocationType.MINIMUM)
                            .budgetInAdvertiserCurrency(3143.19)
                            .budgetInImpressions(647708L)
                            .dailyTargetInAdvertiserCurrency(JsonNullable.of(null))
                            .dailyTargetInImpressions(746586L)
                            .build(),
                        AdGroupWorkflowFlightInput.builder()
                            .campaignFlightId(170903L)
                            .allocationType(AllocationType.MINIMUM)
                            .budgetInAdvertiserCurrency(3143.19)
                            .budgetInImpressions(647708L)
                            .dailyTargetInAdvertiserCurrency(JsonNullable.of(null))
                            .dailyTargetInImpressions(746586L)
                            .build()))
                    .build())
                .validateInputOnly(JsonNullable.of(null))
                .build();

        PostAdgroupResponse res = sdk.adGroup().postAdgroup()
                .request(req)
                .call();

        if (res.adGroupPayload().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->

<!-- Start Authentication [security] -->
## Authentication

### Per-Client Security Schemes

This SDK supports the following security scheme globally:

| Name      | Type   | Scheme  |
| --------- | ------ | ------- |
| `ttdAuth` | apiKey | API key |

To authenticate with the API the `ttdAuth` parameter must be set when initializing the SDK client instance. For example:
```java
package hello.world;

import com.thetradedesk.workflows.TtdWorkflows;
import com.thetradedesk.workflows.models.components.*;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.PostAdgroupResponse;
import java.lang.Exception;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        TtdWorkflows sdk = TtdWorkflows.builder()
                .ttdAuth("<YOUR_API_KEY_HERE>")
            .build();

        AdGroupCreateWorkflowInputWithValidation req = AdGroupCreateWorkflowInputWithValidation.builder()
                .primaryInput(AdGroupCreateWorkflowPrimaryInput.builder()
                    .name("<value>")
                    .channel(AdGroupChannel.NATIVE_DISPLAY)
                    .funnelLocation(AdGroupFunnelLocation.AWARENESS)
                    .isEnabled(true)
                    .description("after wrongly laughter rare")
                    .budget(AdGroupWorkflowBudgetInput.builder()
                        .allocationType(AllocationType.MINIMUM)
                        .budgetInAdvertiserCurrency(5906.7)
                        .budgetInImpressions(606146L)
                        .dailyTargetInAdvertiserCurrency(3786.12)
                        .dailyTargetInImpressions(568427L)
                        .build())
                    .baseBidCPMInAdvertiserCurrency(939.59)
                    .maxBidCPMInAdvertiserCurrency(6554.77)
                    .audienceTargeting(AdGroupWorkflowAudienceTargetingInput.builder()
                        .audienceId("<id>")
                        .audienceAcceleratorExclusionsEnabled(false)
                        .audienceBoosterEnabled(false)
                        .audienceExcluderEnabled(true)
                        .audiencePredictorEnabled(false)
                        .crossDeviceVendorListForAudience(List.of(
                            77740,
                            699788))
                        .recencyExclusionWindowInMinutes(675119)
                        .targetTrackableUsersEnabled(false)
                        .useMcIdAsPrimary(true)
                        .build())
                    .roiGoal(AdGroupWorkflowROIGoalInput.builder()
                        .maximizeReach(false)
                        .maximizeLtvIncrementalReach(JsonNullable.of(null))
                        .cpcInAdvertiserCurrency(2128.6)
                        .ctrInPercent(2164.49)
                        .nielsenOTPInPercent(8642.95)
                        .cpaInAdvertiserCurrency(9706.01)
                        .returnOnAdSpendPercent(259.31)
                        .vcrInPercent(9665.19)
                        .viewabilityInPercent(2917.69)
                        .vcpmInAdvertiserCurrency(9415.05)
                        .cpcvInAdvertiserCurrency(5100.12)
                        .miaozhenOTPInPercent(JsonNullable.of(null))
                        .build())
                    .creativeIds(List.of(
                        "<value 1>",
                        "<value 2>"))
                    .associatedBidLists(List.of(
                        AdGroupWorkflowAssociateBidListInput.builder()
                            .bidListId("<id>")
                            .isEnabled(false)
                            .isDefaultForDimension(false)
                            .build()))
                    .programmaticGuaranteedPrivateContractId("<id>")
                    .build())
                .campaignId("<id>")
                .advancedInput(AdGroupWorkflowAdvancedInput.builder()
                    .koaOptimizationSettings(AdGroupWorkflowKoaOptimizationSettingsInput.builder()
                        .areFutureKoaFeaturesEnabled(true)
                        .predictiveClearingEnabled(JsonNullable.of(null))
                        .build())
                    .comscoreSettings(AdGroupWorkflowComscoreSettingsInput.builder()
                        .isEnabled(true)
                        .populationId(937153)
                        .demographicMemberIds(JsonNullable.of(null))
                        .mobileDemographicMemberIds(List.of(
                            948705,
                            285090))
                        .build())
                    .contractTargeting(AdGroupWorkflowContractTargetingInput.builder()
                        .allowOpenMarketBiddingWhenTargetingContracts(true)
                        .build())
                    .dimensionalBiddingAutoOptimizationSettings(List.of(
                        List.of()))
                    .isUseClicksAsConversionsEnabled(true)
                    .isUseSecondaryConversionsEnabled(true)
                    .nielsenTrackingAttributes(AdGroupWorkflowNielsenTrackingAttributesInput.builder()
                        .gender(TargetingGender.FEMALE)
                        .startAge(TargetingStartAge.THIRTEEN)
                        .endAge(TargetingEndAge.TWENTY_FOUR)
                        .countries(List.of(
                            "<value 1>"))
                        .enhancedReportingOption(EnhancedNielsenReportingOptions.SITE)
                        .build())
                    .newFrequencyConfigs(List.of(
                        AdGroupWorkflowNewFrequencyConfigInput.builder()
                            .counterName("<value>")
                            .frequencyCap(440820)
                            .frequencyGoal(576339)
                            .resetIntervalInMinutes(309043)
                            .build()))
                    .flights(List.of(
                        AdGroupWorkflowFlightInput.builder()
                            .campaignFlightId(170903L)
                            .allocationType(AllocationType.MINIMUM)
                            .budgetInAdvertiserCurrency(3143.19)
                            .budgetInImpressions(647708L)
                            .dailyTargetInAdvertiserCurrency(JsonNullable.of(null))
                            .dailyTargetInImpressions(746586L)
                            .build(),
                        AdGroupWorkflowFlightInput.builder()
                            .campaignFlightId(170903L)
                            .allocationType(AllocationType.MINIMUM)
                            .budgetInAdvertiserCurrency(3143.19)
                            .budgetInImpressions(647708L)
                            .dailyTargetInAdvertiserCurrency(JsonNullable.of(null))
                            .dailyTargetInImpressions(746586L)
                            .build()))
                    .build())
                .validateInputOnly(JsonNullable.of(null))
                .build();

        PostAdgroupResponse res = sdk.adGroup().postAdgroup()
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

* [postAdgroup](docs/sdks/adgroup/README.md#postadgroup) - Create a new ad group with required fields
* [patchAdgroup](docs/sdks/adgroup/README.md#patchadgroup) - Update an ad group with specified fields
* [postAdgroupArchive](docs/sdks/adgroup/README.md#postadgrouparchive) - Archive multiple ad groups
* [postTypebasedjobAdgroupBulk](docs/sdks/adgroup/README.md#posttypebasedjobadgroupbulk) - Create multiple new ad groups with required fields
* [patchTypebasedjobAdgroupBulk](docs/sdks/adgroup/README.md#patchtypebasedjobadgroupbulk) - Update multiple ad groups with specified fields

### [campaign()](docs/sdks/campaign/README.md)

* [create](docs/sdks/campaign/README.md#create) - Create a new campaign with required fields
* [patchCampaign](docs/sdks/campaign/README.md#patchcampaign) - Update a campaign with specified fields
* [postTypebasedjobCampaignBulk](docs/sdks/campaign/README.md#posttypebasedjobcampaignbulk) - Create multiple new campaigns with required fields
* [patchTypebasedjobCampaignBulk](docs/sdks/campaign/README.md#patchtypebasedjobcampaignbulk) - Update multiple campaigns with specified fields
* [postCampaignArchive](docs/sdks/campaign/README.md#postcampaignarchive) - Archive multiple campaigns
* [getVersion](docs/sdks/campaign/README.md#getversion) - Get a campaign's version

### [firstPartyData()](docs/sdks/firstpartydata/README.md)

* [postTypebasedjobFirstpartydata](docs/sdks/firstpartydata/README.md#posttypebasedjobfirstpartydata) - Submit a type-based job for first-party data retrieval for an advertiser

### [graphQLRequest()](docs/sdks/graphqlrequest/README.md)

* [postGraphqlrequest](docs/sdks/graphqlrequest/README.md#postgraphqlrequest) - Submit a valid GraphQL query or mutation

### [jobStatus()](docs/sdks/jobstatus/README.md)

* [getTypebasedjobIdStatus](docs/sdks/jobstatus/README.md#gettypebasedjobidstatus) - Get the status of a previously submitted type-based job

### [restRequest()](docs/sdks/restrequest/README.md)

* [postRestrequest](docs/sdks/restrequest/README.md#postrestrequest) - Submit a valid REST request

### [thirdPartyData()](docs/sdks/thirdpartydata/README.md)

* [postTypebasedjobThirdpartydata](docs/sdks/thirdpartydata/README.md#posttypebasedjobthirdpartydata) - Submit a type-based job for third-party data retrieval for an advertiser


</details>
<!-- End Available Resources and Operations [operations] -->

<!-- Start Retries [retries] -->
## Retries

Some of the endpoints in this SDK support retries. If you use the SDK without any configuration, it will fall back to the default retry strategy provided by the API. However, the default retry strategy can be overridden on a per-operation basis, or across the entire SDK.

To change the default retry strategy for a single API call, you can provide a `RetryConfig` object through the `retryConfig` builder method:
```java
package hello.world;

import com.thetradedesk.workflows.TtdWorkflows;
import com.thetradedesk.workflows.models.components.*;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.PostAdgroupResponse;
import com.thetradedesk.workflows.utils.BackoffStrategy;
import com.thetradedesk.workflows.utils.RetryConfig;
import java.lang.Exception;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        TtdWorkflows sdk = TtdWorkflows.builder()
                .ttdAuth("<YOUR_API_KEY_HERE>")
            .build();

        AdGroupCreateWorkflowInputWithValidation req = AdGroupCreateWorkflowInputWithValidation.builder()
                .primaryInput(AdGroupCreateWorkflowPrimaryInput.builder()
                    .name("<value>")
                    .channel(AdGroupChannel.NATIVE_DISPLAY)
                    .funnelLocation(AdGroupFunnelLocation.AWARENESS)
                    .isEnabled(true)
                    .description("after wrongly laughter rare")
                    .budget(AdGroupWorkflowBudgetInput.builder()
                        .allocationType(AllocationType.MINIMUM)
                        .budgetInAdvertiserCurrency(5906.7)
                        .budgetInImpressions(606146L)
                        .dailyTargetInAdvertiserCurrency(3786.12)
                        .dailyTargetInImpressions(568427L)
                        .build())
                    .baseBidCPMInAdvertiserCurrency(939.59)
                    .maxBidCPMInAdvertiserCurrency(6554.77)
                    .audienceTargeting(AdGroupWorkflowAudienceTargetingInput.builder()
                        .audienceId("<id>")
                        .audienceAcceleratorExclusionsEnabled(false)
                        .audienceBoosterEnabled(false)
                        .audienceExcluderEnabled(true)
                        .audiencePredictorEnabled(false)
                        .crossDeviceVendorListForAudience(List.of(
                            77740,
                            699788))
                        .recencyExclusionWindowInMinutes(675119)
                        .targetTrackableUsersEnabled(false)
                        .useMcIdAsPrimary(true)
                        .build())
                    .roiGoal(AdGroupWorkflowROIGoalInput.builder()
                        .maximizeReach(false)
                        .maximizeLtvIncrementalReach(JsonNullable.of(null))
                        .cpcInAdvertiserCurrency(2128.6)
                        .ctrInPercent(2164.49)
                        .nielsenOTPInPercent(8642.95)
                        .cpaInAdvertiserCurrency(9706.01)
                        .returnOnAdSpendPercent(259.31)
                        .vcrInPercent(9665.19)
                        .viewabilityInPercent(2917.69)
                        .vcpmInAdvertiserCurrency(9415.05)
                        .cpcvInAdvertiserCurrency(5100.12)
                        .miaozhenOTPInPercent(JsonNullable.of(null))
                        .build())
                    .creativeIds(List.of(
                        "<value 1>",
                        "<value 2>"))
                    .associatedBidLists(List.of(
                        AdGroupWorkflowAssociateBidListInput.builder()
                            .bidListId("<id>")
                            .isEnabled(false)
                            .isDefaultForDimension(false)
                            .build()))
                    .programmaticGuaranteedPrivateContractId("<id>")
                    .build())
                .campaignId("<id>")
                .advancedInput(AdGroupWorkflowAdvancedInput.builder()
                    .koaOptimizationSettings(AdGroupWorkflowKoaOptimizationSettingsInput.builder()
                        .areFutureKoaFeaturesEnabled(true)
                        .predictiveClearingEnabled(JsonNullable.of(null))
                        .build())
                    .comscoreSettings(AdGroupWorkflowComscoreSettingsInput.builder()
                        .isEnabled(true)
                        .populationId(937153)
                        .demographicMemberIds(JsonNullable.of(null))
                        .mobileDemographicMemberIds(List.of(
                            948705,
                            285090))
                        .build())
                    .contractTargeting(AdGroupWorkflowContractTargetingInput.builder()
                        .allowOpenMarketBiddingWhenTargetingContracts(true)
                        .build())
                    .dimensionalBiddingAutoOptimizationSettings(List.of(
                        List.of()))
                    .isUseClicksAsConversionsEnabled(true)
                    .isUseSecondaryConversionsEnabled(true)
                    .nielsenTrackingAttributes(AdGroupWorkflowNielsenTrackingAttributesInput.builder()
                        .gender(TargetingGender.FEMALE)
                        .startAge(TargetingStartAge.THIRTEEN)
                        .endAge(TargetingEndAge.TWENTY_FOUR)
                        .countries(List.of(
                            "<value 1>"))
                        .enhancedReportingOption(EnhancedNielsenReportingOptions.SITE)
                        .build())
                    .newFrequencyConfigs(List.of(
                        AdGroupWorkflowNewFrequencyConfigInput.builder()
                            .counterName("<value>")
                            .frequencyCap(440820)
                            .frequencyGoal(576339)
                            .resetIntervalInMinutes(309043)
                            .build()))
                    .flights(List.of(
                        AdGroupWorkflowFlightInput.builder()
                            .campaignFlightId(170903L)
                            .allocationType(AllocationType.MINIMUM)
                            .budgetInAdvertiserCurrency(3143.19)
                            .budgetInImpressions(647708L)
                            .dailyTargetInAdvertiserCurrency(JsonNullable.of(null))
                            .dailyTargetInImpressions(746586L)
                            .build(),
                        AdGroupWorkflowFlightInput.builder()
                            .campaignFlightId(170903L)
                            .allocationType(AllocationType.MINIMUM)
                            .budgetInAdvertiserCurrency(3143.19)
                            .budgetInImpressions(647708L)
                            .dailyTargetInAdvertiserCurrency(JsonNullable.of(null))
                            .dailyTargetInImpressions(746586L)
                            .build()))
                    .build())
                .validateInputOnly(JsonNullable.of(null))
                .build();

        PostAdgroupResponse res = sdk.adGroup().postAdgroup()
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

import com.thetradedesk.workflows.TtdWorkflows;
import com.thetradedesk.workflows.models.components.*;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.PostAdgroupResponse;
import com.thetradedesk.workflows.utils.BackoffStrategy;
import com.thetradedesk.workflows.utils.RetryConfig;
import java.lang.Exception;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        TtdWorkflows sdk = TtdWorkflows.builder()
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
                .ttdAuth("<YOUR_API_KEY_HERE>")
            .build();

        AdGroupCreateWorkflowInputWithValidation req = AdGroupCreateWorkflowInputWithValidation.builder()
                .primaryInput(AdGroupCreateWorkflowPrimaryInput.builder()
                    .name("<value>")
                    .channel(AdGroupChannel.NATIVE_DISPLAY)
                    .funnelLocation(AdGroupFunnelLocation.AWARENESS)
                    .isEnabled(true)
                    .description("after wrongly laughter rare")
                    .budget(AdGroupWorkflowBudgetInput.builder()
                        .allocationType(AllocationType.MINIMUM)
                        .budgetInAdvertiserCurrency(5906.7)
                        .budgetInImpressions(606146L)
                        .dailyTargetInAdvertiserCurrency(3786.12)
                        .dailyTargetInImpressions(568427L)
                        .build())
                    .baseBidCPMInAdvertiserCurrency(939.59)
                    .maxBidCPMInAdvertiserCurrency(6554.77)
                    .audienceTargeting(AdGroupWorkflowAudienceTargetingInput.builder()
                        .audienceId("<id>")
                        .audienceAcceleratorExclusionsEnabled(false)
                        .audienceBoosterEnabled(false)
                        .audienceExcluderEnabled(true)
                        .audiencePredictorEnabled(false)
                        .crossDeviceVendorListForAudience(List.of(
                            77740,
                            699788))
                        .recencyExclusionWindowInMinutes(675119)
                        .targetTrackableUsersEnabled(false)
                        .useMcIdAsPrimary(true)
                        .build())
                    .roiGoal(AdGroupWorkflowROIGoalInput.builder()
                        .maximizeReach(false)
                        .maximizeLtvIncrementalReach(JsonNullable.of(null))
                        .cpcInAdvertiserCurrency(2128.6)
                        .ctrInPercent(2164.49)
                        .nielsenOTPInPercent(8642.95)
                        .cpaInAdvertiserCurrency(9706.01)
                        .returnOnAdSpendPercent(259.31)
                        .vcrInPercent(9665.19)
                        .viewabilityInPercent(2917.69)
                        .vcpmInAdvertiserCurrency(9415.05)
                        .cpcvInAdvertiserCurrency(5100.12)
                        .miaozhenOTPInPercent(JsonNullable.of(null))
                        .build())
                    .creativeIds(List.of(
                        "<value 1>",
                        "<value 2>"))
                    .associatedBidLists(List.of(
                        AdGroupWorkflowAssociateBidListInput.builder()
                            .bidListId("<id>")
                            .isEnabled(false)
                            .isDefaultForDimension(false)
                            .build()))
                    .programmaticGuaranteedPrivateContractId("<id>")
                    .build())
                .campaignId("<id>")
                .advancedInput(AdGroupWorkflowAdvancedInput.builder()
                    .koaOptimizationSettings(AdGroupWorkflowKoaOptimizationSettingsInput.builder()
                        .areFutureKoaFeaturesEnabled(true)
                        .predictiveClearingEnabled(JsonNullable.of(null))
                        .build())
                    .comscoreSettings(AdGroupWorkflowComscoreSettingsInput.builder()
                        .isEnabled(true)
                        .populationId(937153)
                        .demographicMemberIds(JsonNullable.of(null))
                        .mobileDemographicMemberIds(List.of(
                            948705,
                            285090))
                        .build())
                    .contractTargeting(AdGroupWorkflowContractTargetingInput.builder()
                        .allowOpenMarketBiddingWhenTargetingContracts(true)
                        .build())
                    .dimensionalBiddingAutoOptimizationSettings(List.of(
                        List.of()))
                    .isUseClicksAsConversionsEnabled(true)
                    .isUseSecondaryConversionsEnabled(true)
                    .nielsenTrackingAttributes(AdGroupWorkflowNielsenTrackingAttributesInput.builder()
                        .gender(TargetingGender.FEMALE)
                        .startAge(TargetingStartAge.THIRTEEN)
                        .endAge(TargetingEndAge.TWENTY_FOUR)
                        .countries(List.of(
                            "<value 1>"))
                        .enhancedReportingOption(EnhancedNielsenReportingOptions.SITE)
                        .build())
                    .newFrequencyConfigs(List.of(
                        AdGroupWorkflowNewFrequencyConfigInput.builder()
                            .counterName("<value>")
                            .frequencyCap(440820)
                            .frequencyGoal(576339)
                            .resetIntervalInMinutes(309043)
                            .build()))
                    .flights(List.of(
                        AdGroupWorkflowFlightInput.builder()
                            .campaignFlightId(170903L)
                            .allocationType(AllocationType.MINIMUM)
                            .budgetInAdvertiserCurrency(3143.19)
                            .budgetInImpressions(647708L)
                            .dailyTargetInAdvertiserCurrency(JsonNullable.of(null))
                            .dailyTargetInImpressions(746586L)
                            .build(),
                        AdGroupWorkflowFlightInput.builder()
                            .campaignFlightId(170903L)
                            .allocationType(AllocationType.MINIMUM)
                            .budgetInAdvertiserCurrency(3143.19)
                            .budgetInImpressions(647708L)
                            .dailyTargetInAdvertiserCurrency(JsonNullable.of(null))
                            .dailyTargetInImpressions(746586L)
                            .build()))
                    .build())
                .validateInputOnly(JsonNullable.of(null))
                .build();

        PostAdgroupResponse res = sdk.adGroup().postAdgroup()
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

By default, an API error will throw a `models/errors/APIException` exception. When custom error responses are specified for an operation, the SDK may also throw their associated exception. You can refer to respective *Errors* tables in SDK docs for more details on possible exception types for each operation. For example, the `postAdgroup` method throws the following exceptions:

| Error Type                            | Status Code | Content Type     |
| ------------------------------------- | ----------- | ---------------- |
| models/errors/ProblemDetailsException | 400, 403    | application/json |
| models/errors/APIException            | 4XX, 5XX    | \*/\*            |

### Example

```java
package hello.world;

import com.thetradedesk.workflows.TtdWorkflows;
import com.thetradedesk.workflows.models.components.*;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.PostAdgroupResponse;
import java.lang.Exception;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        TtdWorkflows sdk = TtdWorkflows.builder()
                .ttdAuth("<YOUR_API_KEY_HERE>")
            .build();

        AdGroupCreateWorkflowInputWithValidation req = AdGroupCreateWorkflowInputWithValidation.builder()
                .primaryInput(AdGroupCreateWorkflowPrimaryInput.builder()
                    .name("<value>")
                    .channel(AdGroupChannel.NATIVE_DISPLAY)
                    .funnelLocation(AdGroupFunnelLocation.AWARENESS)
                    .isEnabled(true)
                    .description("after wrongly laughter rare")
                    .budget(AdGroupWorkflowBudgetInput.builder()
                        .allocationType(AllocationType.MINIMUM)
                        .budgetInAdvertiserCurrency(5906.7)
                        .budgetInImpressions(606146L)
                        .dailyTargetInAdvertiserCurrency(3786.12)
                        .dailyTargetInImpressions(568427L)
                        .build())
                    .baseBidCPMInAdvertiserCurrency(939.59)
                    .maxBidCPMInAdvertiserCurrency(6554.77)
                    .audienceTargeting(AdGroupWorkflowAudienceTargetingInput.builder()
                        .audienceId("<id>")
                        .audienceAcceleratorExclusionsEnabled(false)
                        .audienceBoosterEnabled(false)
                        .audienceExcluderEnabled(true)
                        .audiencePredictorEnabled(false)
                        .crossDeviceVendorListForAudience(List.of(
                            77740,
                            699788))
                        .recencyExclusionWindowInMinutes(675119)
                        .targetTrackableUsersEnabled(false)
                        .useMcIdAsPrimary(true)
                        .build())
                    .roiGoal(AdGroupWorkflowROIGoalInput.builder()
                        .maximizeReach(false)
                        .maximizeLtvIncrementalReach(JsonNullable.of(null))
                        .cpcInAdvertiserCurrency(2128.6)
                        .ctrInPercent(2164.49)
                        .nielsenOTPInPercent(8642.95)
                        .cpaInAdvertiserCurrency(9706.01)
                        .returnOnAdSpendPercent(259.31)
                        .vcrInPercent(9665.19)
                        .viewabilityInPercent(2917.69)
                        .vcpmInAdvertiserCurrency(9415.05)
                        .cpcvInAdvertiserCurrency(5100.12)
                        .miaozhenOTPInPercent(JsonNullable.of(null))
                        .build())
                    .creativeIds(List.of(
                        "<value 1>",
                        "<value 2>"))
                    .associatedBidLists(List.of(
                        AdGroupWorkflowAssociateBidListInput.builder()
                            .bidListId("<id>")
                            .isEnabled(false)
                            .isDefaultForDimension(false)
                            .build()))
                    .programmaticGuaranteedPrivateContractId("<id>")
                    .build())
                .campaignId("<id>")
                .advancedInput(AdGroupWorkflowAdvancedInput.builder()
                    .koaOptimizationSettings(AdGroupWorkflowKoaOptimizationSettingsInput.builder()
                        .areFutureKoaFeaturesEnabled(true)
                        .predictiveClearingEnabled(JsonNullable.of(null))
                        .build())
                    .comscoreSettings(AdGroupWorkflowComscoreSettingsInput.builder()
                        .isEnabled(true)
                        .populationId(937153)
                        .demographicMemberIds(JsonNullable.of(null))
                        .mobileDemographicMemberIds(List.of(
                            948705,
                            285090))
                        .build())
                    .contractTargeting(AdGroupWorkflowContractTargetingInput.builder()
                        .allowOpenMarketBiddingWhenTargetingContracts(true)
                        .build())
                    .dimensionalBiddingAutoOptimizationSettings(List.of(
                        List.of()))
                    .isUseClicksAsConversionsEnabled(true)
                    .isUseSecondaryConversionsEnabled(true)
                    .nielsenTrackingAttributes(AdGroupWorkflowNielsenTrackingAttributesInput.builder()
                        .gender(TargetingGender.FEMALE)
                        .startAge(TargetingStartAge.THIRTEEN)
                        .endAge(TargetingEndAge.TWENTY_FOUR)
                        .countries(List.of(
                            "<value 1>"))
                        .enhancedReportingOption(EnhancedNielsenReportingOptions.SITE)
                        .build())
                    .newFrequencyConfigs(List.of(
                        AdGroupWorkflowNewFrequencyConfigInput.builder()
                            .counterName("<value>")
                            .frequencyCap(440820)
                            .frequencyGoal(576339)
                            .resetIntervalInMinutes(309043)
                            .build()))
                    .flights(List.of(
                        AdGroupWorkflowFlightInput.builder()
                            .campaignFlightId(170903L)
                            .allocationType(AllocationType.MINIMUM)
                            .budgetInAdvertiserCurrency(3143.19)
                            .budgetInImpressions(647708L)
                            .dailyTargetInAdvertiserCurrency(JsonNullable.of(null))
                            .dailyTargetInImpressions(746586L)
                            .build(),
                        AdGroupWorkflowFlightInput.builder()
                            .campaignFlightId(170903L)
                            .allocationType(AllocationType.MINIMUM)
                            .budgetInAdvertiserCurrency(3143.19)
                            .budgetInImpressions(647708L)
                            .dailyTargetInAdvertiserCurrency(JsonNullable.of(null))
                            .dailyTargetInImpressions(746586L)
                            .build()))
                    .build())
                .validateInputOnly(JsonNullable.of(null))
                .build();

        PostAdgroupResponse res = sdk.adGroup().postAdgroup()
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

import com.thetradedesk.workflows.TtdWorkflows;
import com.thetradedesk.workflows.models.components.*;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.PostAdgroupResponse;
import java.lang.Exception;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        TtdWorkflows sdk = TtdWorkflows.builder()
                .server(TtdWorkflows.AvailableServers.SANDBOX)
                .ttdAuth("<YOUR_API_KEY_HERE>")
            .build();

        AdGroupCreateWorkflowInputWithValidation req = AdGroupCreateWorkflowInputWithValidation.builder()
                .primaryInput(AdGroupCreateWorkflowPrimaryInput.builder()
                    .name("<value>")
                    .channel(AdGroupChannel.NATIVE_DISPLAY)
                    .funnelLocation(AdGroupFunnelLocation.AWARENESS)
                    .isEnabled(true)
                    .description("after wrongly laughter rare")
                    .budget(AdGroupWorkflowBudgetInput.builder()
                        .allocationType(AllocationType.MINIMUM)
                        .budgetInAdvertiserCurrency(5906.7)
                        .budgetInImpressions(606146L)
                        .dailyTargetInAdvertiserCurrency(3786.12)
                        .dailyTargetInImpressions(568427L)
                        .build())
                    .baseBidCPMInAdvertiserCurrency(939.59)
                    .maxBidCPMInAdvertiserCurrency(6554.77)
                    .audienceTargeting(AdGroupWorkflowAudienceTargetingInput.builder()
                        .audienceId("<id>")
                        .audienceAcceleratorExclusionsEnabled(false)
                        .audienceBoosterEnabled(false)
                        .audienceExcluderEnabled(true)
                        .audiencePredictorEnabled(false)
                        .crossDeviceVendorListForAudience(List.of(
                            77740,
                            699788))
                        .recencyExclusionWindowInMinutes(675119)
                        .targetTrackableUsersEnabled(false)
                        .useMcIdAsPrimary(true)
                        .build())
                    .roiGoal(AdGroupWorkflowROIGoalInput.builder()
                        .maximizeReach(false)
                        .maximizeLtvIncrementalReach(JsonNullable.of(null))
                        .cpcInAdvertiserCurrency(2128.6)
                        .ctrInPercent(2164.49)
                        .nielsenOTPInPercent(8642.95)
                        .cpaInAdvertiserCurrency(9706.01)
                        .returnOnAdSpendPercent(259.31)
                        .vcrInPercent(9665.19)
                        .viewabilityInPercent(2917.69)
                        .vcpmInAdvertiserCurrency(9415.05)
                        .cpcvInAdvertiserCurrency(5100.12)
                        .miaozhenOTPInPercent(JsonNullable.of(null))
                        .build())
                    .creativeIds(List.of(
                        "<value 1>",
                        "<value 2>"))
                    .associatedBidLists(List.of(
                        AdGroupWorkflowAssociateBidListInput.builder()
                            .bidListId("<id>")
                            .isEnabled(false)
                            .isDefaultForDimension(false)
                            .build()))
                    .programmaticGuaranteedPrivateContractId("<id>")
                    .build())
                .campaignId("<id>")
                .advancedInput(AdGroupWorkflowAdvancedInput.builder()
                    .koaOptimizationSettings(AdGroupWorkflowKoaOptimizationSettingsInput.builder()
                        .areFutureKoaFeaturesEnabled(true)
                        .predictiveClearingEnabled(JsonNullable.of(null))
                        .build())
                    .comscoreSettings(AdGroupWorkflowComscoreSettingsInput.builder()
                        .isEnabled(true)
                        .populationId(937153)
                        .demographicMemberIds(JsonNullable.of(null))
                        .mobileDemographicMemberIds(List.of(
                            948705,
                            285090))
                        .build())
                    .contractTargeting(AdGroupWorkflowContractTargetingInput.builder()
                        .allowOpenMarketBiddingWhenTargetingContracts(true)
                        .build())
                    .dimensionalBiddingAutoOptimizationSettings(List.of(
                        List.of()))
                    .isUseClicksAsConversionsEnabled(true)
                    .isUseSecondaryConversionsEnabled(true)
                    .nielsenTrackingAttributes(AdGroupWorkflowNielsenTrackingAttributesInput.builder()
                        .gender(TargetingGender.FEMALE)
                        .startAge(TargetingStartAge.THIRTEEN)
                        .endAge(TargetingEndAge.TWENTY_FOUR)
                        .countries(List.of(
                            "<value 1>"))
                        .enhancedReportingOption(EnhancedNielsenReportingOptions.SITE)
                        .build())
                    .newFrequencyConfigs(List.of(
                        AdGroupWorkflowNewFrequencyConfigInput.builder()
                            .counterName("<value>")
                            .frequencyCap(440820)
                            .frequencyGoal(576339)
                            .resetIntervalInMinutes(309043)
                            .build()))
                    .flights(List.of(
                        AdGroupWorkflowFlightInput.builder()
                            .campaignFlightId(170903L)
                            .allocationType(AllocationType.MINIMUM)
                            .budgetInAdvertiserCurrency(3143.19)
                            .budgetInImpressions(647708L)
                            .dailyTargetInAdvertiserCurrency(JsonNullable.of(null))
                            .dailyTargetInImpressions(746586L)
                            .build(),
                        AdGroupWorkflowFlightInput.builder()
                            .campaignFlightId(170903L)
                            .allocationType(AllocationType.MINIMUM)
                            .budgetInAdvertiserCurrency(3143.19)
                            .budgetInImpressions(647708L)
                            .dailyTargetInAdvertiserCurrency(JsonNullable.of(null))
                            .dailyTargetInImpressions(746586L)
                            .build()))
                    .build())
                .validateInputOnly(JsonNullable.of(null))
                .build();

        PostAdgroupResponse res = sdk.adGroup().postAdgroup()
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

import com.thetradedesk.workflows.TtdWorkflows;
import com.thetradedesk.workflows.models.components.*;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.PostAdgroupResponse;
import java.lang.Exception;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        TtdWorkflows sdk = TtdWorkflows.builder()
                .serverURL("https://api.thetradedesk.com/workflows")
                .ttdAuth("<YOUR_API_KEY_HERE>")
            .build();

        AdGroupCreateWorkflowInputWithValidation req = AdGroupCreateWorkflowInputWithValidation.builder()
                .primaryInput(AdGroupCreateWorkflowPrimaryInput.builder()
                    .name("<value>")
                    .channel(AdGroupChannel.NATIVE_DISPLAY)
                    .funnelLocation(AdGroupFunnelLocation.AWARENESS)
                    .isEnabled(true)
                    .description("after wrongly laughter rare")
                    .budget(AdGroupWorkflowBudgetInput.builder()
                        .allocationType(AllocationType.MINIMUM)
                        .budgetInAdvertiserCurrency(5906.7)
                        .budgetInImpressions(606146L)
                        .dailyTargetInAdvertiserCurrency(3786.12)
                        .dailyTargetInImpressions(568427L)
                        .build())
                    .baseBidCPMInAdvertiserCurrency(939.59)
                    .maxBidCPMInAdvertiserCurrency(6554.77)
                    .audienceTargeting(AdGroupWorkflowAudienceTargetingInput.builder()
                        .audienceId("<id>")
                        .audienceAcceleratorExclusionsEnabled(false)
                        .audienceBoosterEnabled(false)
                        .audienceExcluderEnabled(true)
                        .audiencePredictorEnabled(false)
                        .crossDeviceVendorListForAudience(List.of(
                            77740,
                            699788))
                        .recencyExclusionWindowInMinutes(675119)
                        .targetTrackableUsersEnabled(false)
                        .useMcIdAsPrimary(true)
                        .build())
                    .roiGoal(AdGroupWorkflowROIGoalInput.builder()
                        .maximizeReach(false)
                        .maximizeLtvIncrementalReach(JsonNullable.of(null))
                        .cpcInAdvertiserCurrency(2128.6)
                        .ctrInPercent(2164.49)
                        .nielsenOTPInPercent(8642.95)
                        .cpaInAdvertiserCurrency(9706.01)
                        .returnOnAdSpendPercent(259.31)
                        .vcrInPercent(9665.19)
                        .viewabilityInPercent(2917.69)
                        .vcpmInAdvertiserCurrency(9415.05)
                        .cpcvInAdvertiserCurrency(5100.12)
                        .miaozhenOTPInPercent(JsonNullable.of(null))
                        .build())
                    .creativeIds(List.of(
                        "<value 1>",
                        "<value 2>"))
                    .associatedBidLists(List.of(
                        AdGroupWorkflowAssociateBidListInput.builder()
                            .bidListId("<id>")
                            .isEnabled(false)
                            .isDefaultForDimension(false)
                            .build()))
                    .programmaticGuaranteedPrivateContractId("<id>")
                    .build())
                .campaignId("<id>")
                .advancedInput(AdGroupWorkflowAdvancedInput.builder()
                    .koaOptimizationSettings(AdGroupWorkflowKoaOptimizationSettingsInput.builder()
                        .areFutureKoaFeaturesEnabled(true)
                        .predictiveClearingEnabled(JsonNullable.of(null))
                        .build())
                    .comscoreSettings(AdGroupWorkflowComscoreSettingsInput.builder()
                        .isEnabled(true)
                        .populationId(937153)
                        .demographicMemberIds(JsonNullable.of(null))
                        .mobileDemographicMemberIds(List.of(
                            948705,
                            285090))
                        .build())
                    .contractTargeting(AdGroupWorkflowContractTargetingInput.builder()
                        .allowOpenMarketBiddingWhenTargetingContracts(true)
                        .build())
                    .dimensionalBiddingAutoOptimizationSettings(List.of(
                        List.of()))
                    .isUseClicksAsConversionsEnabled(true)
                    .isUseSecondaryConversionsEnabled(true)
                    .nielsenTrackingAttributes(AdGroupWorkflowNielsenTrackingAttributesInput.builder()
                        .gender(TargetingGender.FEMALE)
                        .startAge(TargetingStartAge.THIRTEEN)
                        .endAge(TargetingEndAge.TWENTY_FOUR)
                        .countries(List.of(
                            "<value 1>"))
                        .enhancedReportingOption(EnhancedNielsenReportingOptions.SITE)
                        .build())
                    .newFrequencyConfigs(List.of(
                        AdGroupWorkflowNewFrequencyConfigInput.builder()
                            .counterName("<value>")
                            .frequencyCap(440820)
                            .frequencyGoal(576339)
                            .resetIntervalInMinutes(309043)
                            .build()))
                    .flights(List.of(
                        AdGroupWorkflowFlightInput.builder()
                            .campaignFlightId(170903L)
                            .allocationType(AllocationType.MINIMUM)
                            .budgetInAdvertiserCurrency(3143.19)
                            .budgetInImpressions(647708L)
                            .dailyTargetInAdvertiserCurrency(JsonNullable.of(null))
                            .dailyTargetInImpressions(746586L)
                            .build(),
                        AdGroupWorkflowFlightInput.builder()
                            .campaignFlightId(170903L)
                            .allocationType(AllocationType.MINIMUM)
                            .budgetInAdvertiserCurrency(3143.19)
                            .budgetInImpressions(647708L)
                            .dailyTargetInAdvertiserCurrency(JsonNullable.of(null))
                            .dailyTargetInImpressions(746586L)
                            .build()))
                    .build())
                .validateInputOnly(JsonNullable.of(null))
                .build();

        PostAdgroupResponse res = sdk.adGroup().postAdgroup()
                .request(req)
                .call();

        if (res.adGroupPayload().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End Server Selection [server] -->

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
