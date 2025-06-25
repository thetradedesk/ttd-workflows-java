# AdGroup
(*adGroup()*)

## Overview

### Available Operations

* [postAdgroup](#postadgroup) - Create a new ad group with required fields
* [patchAdgroup](#patchadgroup) - Update an ad group with specified fields
* [postAdgroupArchive](#postadgrouparchive) - Archive multiple ad groups
* [postTypebasedjobAdgroupBulk](#posttypebasedjobadgroupbulk) - Create multiple new ad groups with required fields
* [patchTypebasedjobAdgroupBulk](#patchtypebasedjobadgroupbulk) - Update multiple ad groups with specified fields

## postAdgroup

Create a new ad group with required fields

### Example Usage

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

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [AdGroupCreateWorkflowInputWithValidation](../../models/shared/AdGroupCreateWorkflowInputWithValidation.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[PostAdgroupResponse](../../models/operations/PostAdgroupResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/ProblemDetailsException | 400, 403                              | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |

## patchAdgroup

Only the fields provided in the request payload will be updated.

### Example Usage

```java
package hello.world;

import com.thetradedesk.workflows.TtdWorkflows;
import com.thetradedesk.workflows.models.components.*;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.PatchAdgroupResponse;
import java.lang.Exception;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        TtdWorkflows sdk = TtdWorkflows.builder()
                .ttdAuth("<YOUR_API_KEY_HERE>")
            .build();

        AdGroupUpdateWorkflowInputWithValidation req = AdGroupUpdateWorkflowInputWithValidation.builder()
                .id("<id>")
                .primaryInput(AdGroupUpdateWorkflowPrimaryInput.builder()
                    .isEnabled(false)
                    .description("divert table calmly cricket synergy")
                    .budget(AdGroupWorkflowBudgetInput.builder()
                        .allocationType(AllocationType.MAXIMUM)
                        .budgetInAdvertiserCurrency(723.82)
                        .budgetInImpressions(JsonNullable.of(null))
                        .dailyTargetInAdvertiserCurrency(6794.07)
                        .dailyTargetInImpressions(256560L)
                        .build())
                    .baseBidCPMInAdvertiserCurrency(3517.38)
                    .maxBidCPMInAdvertiserCurrency(9021.16)
                    .audienceTargeting(AdGroupWorkflowAudienceTargetingInput.builder()
                        .audienceId("<id>")
                        .audienceAcceleratorExclusionsEnabled(JsonNullable.of(null))
                        .audienceBoosterEnabled(true)
                        .audienceExcluderEnabled(false)
                        .audiencePredictorEnabled(false)
                        .crossDeviceVendorListForAudience(List.of(
                            545377,
                            215434,
                            491616))
                        .recencyExclusionWindowInMinutes(787588)
                        .targetTrackableUsersEnabled(true)
                        .useMcIdAsPrimary(false)
                        .build())
                    .roiGoal(AdGroupWorkflowROIGoalInput.builder()
                        .maximizeReach(true)
                        .maximizeLtvIncrementalReach(false)
                        .cpcInAdvertiserCurrency(896.12)
                        .ctrInPercent(4096.16)
                        .nielsenOTPInPercent(JsonNullable.of(null))
                        .cpaInAdvertiserCurrency(2158.47)
                        .returnOnAdSpendPercent(9383.83)
                        .vcrInPercent(834.54)
                        .viewabilityInPercent(1944.46)
                        .vcpmInAdvertiserCurrency(2355.56)
                        .cpcvInAdvertiserCurrency(5207.25)
                        .miaozhenOTPInPercent(JsonNullable.of(null))
                        .build())
                    .creativeIds(List.of(
                        "<value 1>",
                        "<value 2>"))
                    .associatedBidLists(List.of(
                        AdGroupWorkflowAssociateBidListInput.builder()
                            .bidListId("<id>")
                            .isEnabled(true)
                            .isDefaultForDimension(JsonNullable.of(null))
                            .build(),
                        AdGroupWorkflowAssociateBidListInput.builder()
                            .bidListId("<id>")
                            .isEnabled(true)
                            .isDefaultForDimension(JsonNullable.of(null))
                            .build(),
                        AdGroupWorkflowAssociateBidListInput.builder()
                            .bidListId("<id>")
                            .isEnabled(true)
                            .isDefaultForDimension(JsonNullable.of(null))
                            .build()))
                    .name("<value>")
                    .channel(AdGroupChannel.OTHER)
                    .funnelLocation(AdGroupFunnelLocation.CONVERSION)
                    .build())
                .advancedInput(AdGroupWorkflowAdvancedInput.builder()
                    .koaOptimizationSettings(AdGroupWorkflowKoaOptimizationSettingsInput.builder()
                        .areFutureKoaFeaturesEnabled(true)
                        .predictiveClearingEnabled(true)
                        .build())
                    .comscoreSettings(AdGroupWorkflowComscoreSettingsInput.builder()
                        .isEnabled(false)
                        .populationId(670287)
                        .demographicMemberIds(List.of(
                            737332,
                            903279,
                            167414))
                        .mobileDemographicMemberIds(JsonNullable.of(null))
                        .build())
                    .contractTargeting(AdGroupWorkflowContractTargetingInput.builder()
                        .allowOpenMarketBiddingWhenTargetingContracts(true)
                        .build())
                    .dimensionalBiddingAutoOptimizationSettings(List.of(
                        List.of(
                            DimensionalBiddingDimensions.HAS_GEO_SEGMENT_ID,
                            DimensionalBiddingDimensions.HAS_ATMOSPHERIC_CONDITION,
                            DimensionalBiddingDimensions.HAS_ADVERTISER_TARGETING_DATA_ID)))
                    .isUseClicksAsConversionsEnabled(false)
                    .isUseSecondaryConversionsEnabled(true)
                    .nielsenTrackingAttributes(AdGroupWorkflowNielsenTrackingAttributesInput.builder()
                        .gender(TargetingGender.BOTH)
                        .startAge(TargetingStartAge.TWENTY_FIVE)
                        .endAge(TargetingEndAge.FIFTY_FOUR)
                        .countries(List.of(
                            "<value 1>",
                            "<value 2>"))
                        .enhancedReportingOption(EnhancedNielsenReportingOptions.SITE)
                        .build())
                    .newFrequencyConfigs(List.of(
                        AdGroupWorkflowNewFrequencyConfigInput.builder()
                            .counterName("<value>")
                            .frequencyCap(JsonNullable.of(null))
                            .frequencyGoal(JsonNullable.of(null))
                            .resetIntervalInMinutes(647827)
                            .build(),
                        AdGroupWorkflowNewFrequencyConfigInput.builder()
                            .counterName("<value>")
                            .frequencyCap(JsonNullable.of(null))
                            .frequencyGoal(JsonNullable.of(null))
                            .resetIntervalInMinutes(647827)
                            .build()))
                    .flights(List.of(
                        AdGroupWorkflowFlightInput.builder()
                            .campaignFlightId(193214L)
                            .allocationType(AllocationType.MAXIMUM)
                            .budgetInAdvertiserCurrency(2492.2)
                            .budgetInImpressions(190554L)
                            .dailyTargetInAdvertiserCurrency(9098.82)
                            .dailyTargetInImpressions(764002L)
                            .build()))
                    .build())
                .validateInputOnly(JsonNullable.of(null))
                .build();

        PatchAdgroupResponse res = sdk.adGroup().patchAdgroup()
                .request(req)
                .call();

        if (res.adGroupPayload().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [AdGroupUpdateWorkflowInputWithValidation](../../models/shared/AdGroupUpdateWorkflowInputWithValidation.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[PatchAdgroupResponse](../../models/operations/PatchAdgroupResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/ProblemDetailsException | 400, 403                              | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |

## postAdgroupArchive

**NOTE**: Once archived, ad groups cannot be un-archived.

### Example Usage

```java
package hello.world;

import com.thetradedesk.workflows.TtdWorkflows;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.PostAdgroupArchiveResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        TtdWorkflows sdk = TtdWorkflows.builder()
                .ttdAuth("<YOUR_API_KEY_HERE>")
            .build();

        PostAdgroupArchiveResponse res = sdk.adGroup().postAdgroupArchive()
                .forceArchive(false)
                .requestBody(List.of(
                    "<value 1>",
                    "<value 2>",
                    "<value 3>"))
                .call();

        if (res.strings().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter            | Type                 | Required             | Description          |
| -------------------- | -------------------- | -------------------- | -------------------- |
| `forceArchive`       | *Optional\<Boolean>* | :heavy_minus_sign:   | N/A                  |
| `requestBody`        | List\<*String*>      | :heavy_minus_sign:   | N/A                  |

### Response

**[PostAdgroupArchiveResponse](../../models/operations/PostAdgroupArchiveResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/ProblemDetailsException | 400, 403                              | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |

## postTypebasedjobAdgroupBulk

Create multiple new ad groups with required fields

### Example Usage

```java
package hello.world;

import com.thetradedesk.workflows.TtdWorkflows;
import com.thetradedesk.workflows.models.components.AdGroupBulkCreateWorkflowInputWithValidation;
import com.thetradedesk.workflows.models.components.WorkflowCallbackInput;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.PostTypebasedjobAdgroupBulkResponse;
import java.lang.Exception;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        TtdWorkflows sdk = TtdWorkflows.builder()
                .ttdAuth("<YOUR_API_KEY_HERE>")
            .build();

        AdGroupBulkCreateWorkflowInputWithValidation req = AdGroupBulkCreateWorkflowInputWithValidation.builder()
                .input(List.of())
                .validateInputOnly(true)
                .callbackInput(WorkflowCallbackInput.builder()
                    .callbackUrl("https://unhealthy-toothbrush.biz/")
                    .callbackHeaders(Map.ofEntries(
                        Map.entry("key", "<value>"),
                        Map.entry("key1", "<value>"),
                        Map.entry("key2", "<value>")))
                    .build())
                .build();

        PostTypebasedjobAdgroupBulkResponse res = sdk.adGroup().postTypebasedjobAdgroupBulk()
                .request(req)
                .call();

        if (res.typeBasedJobSubmitResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [AdGroupBulkCreateWorkflowInputWithValidation](../../models/shared/AdGroupBulkCreateWorkflowInputWithValidation.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |

### Response

**[PostTypebasedjobAdgroupBulkResponse](../../models/operations/PostTypebasedjobAdgroupBulkResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/ProblemDetailsException | 400, 403                              | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |

## patchTypebasedjobAdgroupBulk

Only the fields provided in the request payload for each specific ad group will be updated.

### Example Usage

```java
package hello.world;

import com.thetradedesk.workflows.TtdWorkflows;
import com.thetradedesk.workflows.models.components.*;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.PatchTypebasedjobAdgroupBulkResponse;
import java.lang.Exception;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        TtdWorkflows sdk = TtdWorkflows.builder()
                .ttdAuth("<YOUR_API_KEY_HERE>")
            .build();

        AdGroupBulkUpdateWorkflowInputWithValidation req = AdGroupBulkUpdateWorkflowInputWithValidation.builder()
                .input(List.of(
                    AdGroupUpdateWorkflowInput.builder()
                        .id("<id>")
                        .primaryInput(AdGroupUpdateWorkflowPrimaryInput.builder()
                            .isEnabled(true)
                            .description(JsonNullable.of(null))
                            .budget(AdGroupWorkflowBudgetInput.builder()
                                .allocationType(AllocationType.MINIMUM)
                                .budgetInAdvertiserCurrency(4365.6)
                                .budgetInImpressions(797262L)
                                .dailyTargetInAdvertiserCurrency(2847.63)
                                .dailyTargetInImpressions(JsonNullable.of(null))
                                .build())
                            .baseBidCPMInAdvertiserCurrency(1985.29)
                            .maxBidCPMInAdvertiserCurrency(4757.87)
                            .audienceTargeting(AdGroupWorkflowAudienceTargetingInput.builder()
                                .audienceId("<id>")
                                .audienceAcceleratorExclusionsEnabled(false)
                                .audienceBoosterEnabled(false)
                                .audienceExcluderEnabled(false)
                                .audiencePredictorEnabled(false)
                                .crossDeviceVendorListForAudience(List.of(
                                    66244,
                                    540186,
                                    225330))
                                .recencyExclusionWindowInMinutes(524436)
                                .targetTrackableUsersEnabled(false)
                                .useMcIdAsPrimary(false)
                                .build())
                            .roiGoal(AdGroupWorkflowROIGoalInput.builder()
                                .maximizeReach(true)
                                .maximizeLtvIncrementalReach(true)
                                .cpcInAdvertiserCurrency(4773.66)
                                .ctrInPercent(8842.31)
                                .nielsenOTPInPercent(JsonNullable.of(null))
                                .cpaInAdvertiserCurrency(1316.63)
                                .returnOnAdSpendPercent(3656.49)
                                .vcrInPercent(8557.42)
                                .viewabilityInPercent(7299.96)
                                .vcpmInAdvertiserCurrency(7239.85)
                                .cpcvInAdvertiserCurrency(JsonNullable.of(null))
                                .miaozhenOTPInPercent(2809.53)
                                .build())
                            .creativeIds(JsonNullable.of(null))
                            .associatedBidLists(List.of(
                                AdGroupWorkflowAssociateBidListInput.builder()
                                    .bidListId("<id>")
                                    .isEnabled(true)
                                    .isDefaultForDimension(true)
                                    .build()))
                            .name("<value>")
                            .channel(AdGroupChannel.NATIVE_DISPLAY)
                            .funnelLocation(AdGroupFunnelLocation.NONE)
                            .build())
                        .advancedInput(AdGroupWorkflowAdvancedInput.builder()
                            .koaOptimizationSettings(AdGroupWorkflowKoaOptimizationSettingsInput.builder()
                                .areFutureKoaFeaturesEnabled(true)
                                .predictiveClearingEnabled(true)
                                .build())
                            .comscoreSettings(AdGroupWorkflowComscoreSettingsInput.builder()
                                .isEnabled(false)
                                .populationId(809148)
                                .demographicMemberIds(List.of(
                                    532747,
                                    484388))
                                .mobileDemographicMemberIds(List.of(
                                    529979,
                                    812676))
                                .build())
                            .contractTargeting(AdGroupWorkflowContractTargetingInput.builder()
                                .allowOpenMarketBiddingWhenTargetingContracts(true)
                                .build())
                            .dimensionalBiddingAutoOptimizationSettings(List.of(
                                List.of(
                                    DimensionalBiddingDimensions.HAS_VIDEO_MUTED_STATE_ID),
                                List.of()))
                            .isUseClicksAsConversionsEnabled(true)
                            .isUseSecondaryConversionsEnabled(false)
                            .nielsenTrackingAttributes(AdGroupWorkflowNielsenTrackingAttributesInput.builder()
                                .gender(TargetingGender.BOTH)
                                .startAge(TargetingStartAge.SIXTY_FIVE)
                                .endAge(TargetingEndAge.TWENTY)
                                .countries(List.of(
                                    "<value 1>"))
                                .enhancedReportingOption(EnhancedNielsenReportingOptions.NONE)
                                .build())
                            .newFrequencyConfigs(JsonNullable.of(null))
                            .flights(List.of(
                                AdGroupWorkflowFlightInput.builder()
                                    .campaignFlightId(284595L)
                                    .allocationType(AllocationType.MINIMUM)
                                    .budgetInAdvertiserCurrency(3571.65)
                                    .budgetInImpressions(JsonNullable.of(null))
                                    .dailyTargetInAdvertiserCurrency(9076.57)
                                    .dailyTargetInImpressions(864528L)
                                    .build()))
                            .build())
                        .build()))
                .validateInputOnly(false)
                .callbackInput(WorkflowCallbackInput.builder()
                    .callbackUrl("https://funny-prohibition.org/")
                    .callbackHeaders(Map.ofEntries(
                        Map.entry("key", "<value>")))
                    .build())
                .build();

        PatchTypebasedjobAdgroupBulkResponse res = sdk.adGroup().patchTypebasedjobAdgroupBulk()
                .request(req)
                .call();

        if (res.typeBasedJobSubmitResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [AdGroupBulkUpdateWorkflowInputWithValidation](../../models/shared/AdGroupBulkUpdateWorkflowInputWithValidation.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |

### Response

**[PatchTypebasedjobAdgroupBulkResponse](../../models/operations/PatchTypebasedjobAdgroupBulkResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/ProblemDetailsException | 400, 403                              | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |