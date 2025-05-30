# AdGroup
(*adGroup()*)

## Overview

### Available Operations

* [postAdgroup](#postadgroup)
* [patchAdgroup](#patchadgroup)
* [postAdgroupArchive](#postadgrouparchive) - Archive a list of ad groups
* [postAdgroupBulk](#postadgroupbulk) - Create a list of ad groups with required fields.
* [patchAdgroupBulk](#patchadgroupbulk) - Create a list of ad groups with required fields. `ValidateInputOnly` value should be the same for all ad groups.

## postAdgroup

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

Archive a list of ad groups

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

## postAdgroupBulk

Create a list of ad groups with required fields.

### Example Usage

```java
package hello.world;

import com.thetradedesk.workflows.TtdWorkflows;
import com.thetradedesk.workflows.models.components.*;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.PostAdgroupBulkResponse;
import java.lang.Exception;
import java.util.List;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        TtdWorkflows sdk = TtdWorkflows.builder()
                .ttdAuth("<YOUR_API_KEY_HERE>")
            .build();

        AdGroupBulkCreateWorkflowInputWithValidation req = AdGroupBulkCreateWorkflowInputWithValidation.builder()
                .input(List.of(
                    AdGroupCreateWorkflowInput.builder()
                        .primaryInput(AdGroupCreateWorkflowPrimaryInput.builder()
                            .name("<value>")
                            .channel(AdGroupChannel.NATIVE_DISPLAY)
                            .funnelLocation(AdGroupFunnelLocation.CONVERSION)
                            .isEnabled(false)
                            .description("each whisper underneath punctual")
                            .budget(AdGroupWorkflowBudgetInput.builder()
                                .allocationType(AllocationType.MAXIMUM)
                                .budgetInAdvertiserCurrency(1402.84)
                                .budgetInImpressions(907222L)
                                .dailyTargetInAdvertiserCurrency(698.1)
                                .dailyTargetInImpressions(309659L)
                                .build())
                            .baseBidCPMInAdvertiserCurrency(4368.57)
                            .maxBidCPMInAdvertiserCurrency(22.55)
                            .audienceTargeting(AdGroupWorkflowAudienceTargetingInput.builder()
                                .audienceId("<id>")
                                .audienceAcceleratorExclusionsEnabled(true)
                                .audienceBoosterEnabled(JsonNullable.of(null))
                                .audienceExcluderEnabled(true)
                                .audiencePredictorEnabled(JsonNullable.of(null))
                                .crossDeviceVendorListForAudience(List.of(
                                    240282))
                                .recencyExclusionWindowInMinutes(793238)
                                .targetTrackableUsersEnabled(JsonNullable.of(null))
                                .useMcIdAsPrimary(false)
                                .build())
                            .roiGoal(AdGroupWorkflowROIGoalInput.builder()
                                .maximizeReach(false)
                                .maximizeLtvIncrementalReach(false)
                                .cpcInAdvertiserCurrency(4337.84)
                                .ctrInPercent(4378.53)
                                .nielsenOTPInPercent(111.69)
                                .cpaInAdvertiserCurrency(6053.81)
                                .returnOnAdSpendPercent(423.65)
                                .vcrInPercent(5305.45)
                                .viewabilityInPercent(JsonNullable.of(null))
                                .vcpmInAdvertiserCurrency(9818.14)
                                .cpcvInAdvertiserCurrency(5994.66)
                                .miaozhenOTPInPercent(9542.27)
                                .build())
                            .creativeIds(List.of(
                                "<value 1>",
                                "<value 2>",
                                "<value 3>"))
                            .associatedBidLists(List.of(
                                AdGroupWorkflowAssociateBidListInput.builder()
                                    .bidListId("<id>")
                                    .isEnabled(true)
                                    .isDefaultForDimension(JsonNullable.of(null))
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
                                .populationId(178739)
                                .demographicMemberIds(List.of(
                                    874487,
                                    269307))
                                .mobileDemographicMemberIds(List.of(
                                    624634))
                                .build())
                            .contractTargeting(AdGroupWorkflowContractTargetingInput.builder()
                                .allowOpenMarketBiddingWhenTargetingContracts(true)
                                .build())
                            .dimensionalBiddingAutoOptimizationSettings(List.of(
                                List.of(
                                    DimensionalBiddingDimensions.HAS_RTB_ASIA_PAGE_QUALITY_CATEGORY_ID,
                                    DimensionalBiddingDimensions.HAS_AD_BUG_PAGE_QUALITY_CATEGORY_ID),
                                List.of()))
                            .isUseClicksAsConversionsEnabled(false)
                            .isUseSecondaryConversionsEnabled(JsonNullable.of(null))
                            .nielsenTrackingAttributes(AdGroupWorkflowNielsenTrackingAttributesInput.builder()
                                .gender(TargetingGender.MALE)
                                .startAge(TargetingStartAge.SIXTY_FIVE)
                                .endAge(TargetingEndAge.FORTY_NINE)
                                .countries(List.of(
                                    "<value 1>",
                                    "<value 2>",
                                    "<value 3>"))
                                .enhancedReportingOption(EnhancedNielsenReportingOptions.AUDIENCE)
                                .build())
                            .newFrequencyConfigs(List.of(
                                AdGroupWorkflowNewFrequencyConfigInput.builder()
                                    .counterName(Optional.empty())
                                    .frequencyCap(949995)
                                    .frequencyGoal(450427)
                                    .resetIntervalInMinutes(924899)
                                    .build(),
                                AdGroupWorkflowNewFrequencyConfigInput.builder()
                                    .counterName(Optional.empty())
                                    .frequencyCap(949995)
                                    .frequencyGoal(450427)
                                    .resetIntervalInMinutes(924899)
                                    .build()))
                            .flights(List.of(
                                AdGroupWorkflowFlightInput.builder()
                                    .campaignFlightId(88349L)
                                    .allocationType(AllocationType.MINIMUM)
                                    .budgetInAdvertiserCurrency(9742.38)
                                    .budgetInImpressions(77001L)
                                    .dailyTargetInAdvertiserCurrency(335.72)
                                    .dailyTargetInImpressions(860500L)
                                    .build(),
                                AdGroupWorkflowFlightInput.builder()
                                    .campaignFlightId(88349L)
                                    .allocationType(AllocationType.MINIMUM)
                                    .budgetInAdvertiserCurrency(9742.38)
                                    .budgetInImpressions(77001L)
                                    .dailyTargetInAdvertiserCurrency(335.72)
                                    .dailyTargetInImpressions(860500L)
                                    .build(),
                                AdGroupWorkflowFlightInput.builder()
                                    .campaignFlightId(88349L)
                                    .allocationType(AllocationType.MINIMUM)
                                    .budgetInAdvertiserCurrency(9742.38)
                                    .budgetInImpressions(77001L)
                                    .dailyTargetInAdvertiserCurrency(335.72)
                                    .dailyTargetInImpressions(860500L)
                                    .build()))
                            .build())
                        .build(),
                    AdGroupCreateWorkflowInput.builder()
                        .primaryInput(AdGroupCreateWorkflowPrimaryInput.builder()
                            .name("<value>")
                            .channel(AdGroupChannel.NATIVE_DISPLAY)
                            .funnelLocation(AdGroupFunnelLocation.CONVERSION)
                            .isEnabled(false)
                            .description("each whisper underneath punctual")
                            .budget(AdGroupWorkflowBudgetInput.builder()
                                .allocationType(AllocationType.MAXIMUM)
                                .budgetInAdvertiserCurrency(1402.84)
                                .budgetInImpressions(907222L)
                                .dailyTargetInAdvertiserCurrency(698.1)
                                .dailyTargetInImpressions(309659L)
                                .build())
                            .baseBidCPMInAdvertiserCurrency(4368.57)
                            .maxBidCPMInAdvertiserCurrency(22.55)
                            .audienceTargeting(AdGroupWorkflowAudienceTargetingInput.builder()
                                .audienceId("<id>")
                                .audienceAcceleratorExclusionsEnabled(true)
                                .audienceBoosterEnabled(JsonNullable.of(null))
                                .audienceExcluderEnabled(true)
                                .audiencePredictorEnabled(JsonNullable.of(null))
                                .crossDeviceVendorListForAudience(List.of(
                                    240282))
                                .recencyExclusionWindowInMinutes(793238)
                                .targetTrackableUsersEnabled(JsonNullable.of(null))
                                .useMcIdAsPrimary(false)
                                .build())
                            .roiGoal(AdGroupWorkflowROIGoalInput.builder()
                                .maximizeReach(false)
                                .maximizeLtvIncrementalReach(false)
                                .cpcInAdvertiserCurrency(4337.84)
                                .ctrInPercent(4378.53)
                                .nielsenOTPInPercent(111.69)
                                .cpaInAdvertiserCurrency(6053.81)
                                .returnOnAdSpendPercent(423.65)
                                .vcrInPercent(5305.45)
                                .viewabilityInPercent(JsonNullable.of(null))
                                .vcpmInAdvertiserCurrency(9818.14)
                                .cpcvInAdvertiserCurrency(5994.66)
                                .miaozhenOTPInPercent(9542.27)
                                .build())
                            .creativeIds(List.of(
                                "<value 1>",
                                "<value 2>",
                                "<value 3>"))
                            .associatedBidLists(List.of(
                                AdGroupWorkflowAssociateBidListInput.builder()
                                    .bidListId("<id>")
                                    .isEnabled(true)
                                    .isDefaultForDimension(JsonNullable.of(null))
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
                                .populationId(178739)
                                .demographicMemberIds(List.of(
                                    874487,
                                    269307))
                                .mobileDemographicMemberIds(List.of(
                                    624634))
                                .build())
                            .contractTargeting(AdGroupWorkflowContractTargetingInput.builder()
                                .allowOpenMarketBiddingWhenTargetingContracts(true)
                                .build())
                            .dimensionalBiddingAutoOptimizationSettings(List.of(
                                List.of(
                                    DimensionalBiddingDimensions.HAS_RTB_ASIA_PAGE_QUALITY_CATEGORY_ID,
                                    DimensionalBiddingDimensions.HAS_AD_BUG_PAGE_QUALITY_CATEGORY_ID),
                                List.of()))
                            .isUseClicksAsConversionsEnabled(false)
                            .isUseSecondaryConversionsEnabled(JsonNullable.of(null))
                            .nielsenTrackingAttributes(AdGroupWorkflowNielsenTrackingAttributesInput.builder()
                                .gender(TargetingGender.MALE)
                                .startAge(TargetingStartAge.SIXTY_FIVE)
                                .endAge(TargetingEndAge.FORTY_NINE)
                                .countries(List.of(
                                    "<value 1>",
                                    "<value 2>",
                                    "<value 3>"))
                                .enhancedReportingOption(EnhancedNielsenReportingOptions.AUDIENCE)
                                .build())
                            .newFrequencyConfigs(List.of(
                                AdGroupWorkflowNewFrequencyConfigInput.builder()
                                    .counterName(Optional.empty())
                                    .frequencyCap(949995)
                                    .frequencyGoal(450427)
                                    .resetIntervalInMinutes(924899)
                                    .build(),
                                AdGroupWorkflowNewFrequencyConfigInput.builder()
                                    .counterName(Optional.empty())
                                    .frequencyCap(949995)
                                    .frequencyGoal(450427)
                                    .resetIntervalInMinutes(924899)
                                    .build()))
                            .flights(List.of(
                                AdGroupWorkflowFlightInput.builder()
                                    .campaignFlightId(88349L)
                                    .allocationType(AllocationType.MINIMUM)
                                    .budgetInAdvertiserCurrency(9742.38)
                                    .budgetInImpressions(77001L)
                                    .dailyTargetInAdvertiserCurrency(335.72)
                                    .dailyTargetInImpressions(860500L)
                                    .build(),
                                AdGroupWorkflowFlightInput.builder()
                                    .campaignFlightId(88349L)
                                    .allocationType(AllocationType.MINIMUM)
                                    .budgetInAdvertiserCurrency(9742.38)
                                    .budgetInImpressions(77001L)
                                    .dailyTargetInAdvertiserCurrency(335.72)
                                    .dailyTargetInImpressions(860500L)
                                    .build(),
                                AdGroupWorkflowFlightInput.builder()
                                    .campaignFlightId(88349L)
                                    .allocationType(AllocationType.MINIMUM)
                                    .budgetInAdvertiserCurrency(9742.38)
                                    .budgetInImpressions(77001L)
                                    .dailyTargetInAdvertiserCurrency(335.72)
                                    .dailyTargetInImpressions(860500L)
                                    .build()))
                            .build())
                        .build(),
                    AdGroupCreateWorkflowInput.builder()
                        .primaryInput(AdGroupCreateWorkflowPrimaryInput.builder()
                            .name("<value>")
                            .channel(AdGroupChannel.NATIVE_DISPLAY)
                            .funnelLocation(AdGroupFunnelLocation.CONVERSION)
                            .isEnabled(false)
                            .description("each whisper underneath punctual")
                            .budget(AdGroupWorkflowBudgetInput.builder()
                                .allocationType(AllocationType.MAXIMUM)
                                .budgetInAdvertiserCurrency(1402.84)
                                .budgetInImpressions(907222L)
                                .dailyTargetInAdvertiserCurrency(698.1)
                                .dailyTargetInImpressions(309659L)
                                .build())
                            .baseBidCPMInAdvertiserCurrency(4368.57)
                            .maxBidCPMInAdvertiserCurrency(22.55)
                            .audienceTargeting(AdGroupWorkflowAudienceTargetingInput.builder()
                                .audienceId("<id>")
                                .audienceAcceleratorExclusionsEnabled(true)
                                .audienceBoosterEnabled(JsonNullable.of(null))
                                .audienceExcluderEnabled(true)
                                .audiencePredictorEnabled(JsonNullable.of(null))
                                .crossDeviceVendorListForAudience(List.of(
                                    240282))
                                .recencyExclusionWindowInMinutes(793238)
                                .targetTrackableUsersEnabled(JsonNullable.of(null))
                                .useMcIdAsPrimary(false)
                                .build())
                            .roiGoal(AdGroupWorkflowROIGoalInput.builder()
                                .maximizeReach(false)
                                .maximizeLtvIncrementalReach(false)
                                .cpcInAdvertiserCurrency(4337.84)
                                .ctrInPercent(4378.53)
                                .nielsenOTPInPercent(111.69)
                                .cpaInAdvertiserCurrency(6053.81)
                                .returnOnAdSpendPercent(423.65)
                                .vcrInPercent(5305.45)
                                .viewabilityInPercent(JsonNullable.of(null))
                                .vcpmInAdvertiserCurrency(9818.14)
                                .cpcvInAdvertiserCurrency(5994.66)
                                .miaozhenOTPInPercent(9542.27)
                                .build())
                            .creativeIds(List.of(
                                "<value 1>",
                                "<value 2>",
                                "<value 3>"))
                            .associatedBidLists(List.of(
                                AdGroupWorkflowAssociateBidListInput.builder()
                                    .bidListId("<id>")
                                    .isEnabled(true)
                                    .isDefaultForDimension(JsonNullable.of(null))
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
                                .populationId(178739)
                                .demographicMemberIds(List.of(
                                    874487,
                                    269307))
                                .mobileDemographicMemberIds(List.of(
                                    624634))
                                .build())
                            .contractTargeting(AdGroupWorkflowContractTargetingInput.builder()
                                .allowOpenMarketBiddingWhenTargetingContracts(true)
                                .build())
                            .dimensionalBiddingAutoOptimizationSettings(List.of(
                                List.of(
                                    DimensionalBiddingDimensions.HAS_RTB_ASIA_PAGE_QUALITY_CATEGORY_ID,
                                    DimensionalBiddingDimensions.HAS_AD_BUG_PAGE_QUALITY_CATEGORY_ID),
                                List.of()))
                            .isUseClicksAsConversionsEnabled(false)
                            .isUseSecondaryConversionsEnabled(JsonNullable.of(null))
                            .nielsenTrackingAttributes(AdGroupWorkflowNielsenTrackingAttributesInput.builder()
                                .gender(TargetingGender.MALE)
                                .startAge(TargetingStartAge.SIXTY_FIVE)
                                .endAge(TargetingEndAge.FORTY_NINE)
                                .countries(List.of(
                                    "<value 1>",
                                    "<value 2>",
                                    "<value 3>"))
                                .enhancedReportingOption(EnhancedNielsenReportingOptions.AUDIENCE)
                                .build())
                            .newFrequencyConfigs(List.of(
                                AdGroupWorkflowNewFrequencyConfigInput.builder()
                                    .counterName(Optional.empty())
                                    .frequencyCap(949995)
                                    .frequencyGoal(450427)
                                    .resetIntervalInMinutes(924899)
                                    .build(),
                                AdGroupWorkflowNewFrequencyConfigInput.builder()
                                    .counterName(Optional.empty())
                                    .frequencyCap(949995)
                                    .frequencyGoal(450427)
                                    .resetIntervalInMinutes(924899)
                                    .build()))
                            .flights(List.of(
                                AdGroupWorkflowFlightInput.builder()
                                    .campaignFlightId(88349L)
                                    .allocationType(AllocationType.MINIMUM)
                                    .budgetInAdvertiserCurrency(9742.38)
                                    .budgetInImpressions(77001L)
                                    .dailyTargetInAdvertiserCurrency(335.72)
                                    .dailyTargetInImpressions(860500L)
                                    .build(),
                                AdGroupWorkflowFlightInput.builder()
                                    .campaignFlightId(88349L)
                                    .allocationType(AllocationType.MINIMUM)
                                    .budgetInAdvertiserCurrency(9742.38)
                                    .budgetInImpressions(77001L)
                                    .dailyTargetInAdvertiserCurrency(335.72)
                                    .dailyTargetInImpressions(860500L)
                                    .build(),
                                AdGroupWorkflowFlightInput.builder()
                                    .campaignFlightId(88349L)
                                    .allocationType(AllocationType.MINIMUM)
                                    .budgetInAdvertiserCurrency(9742.38)
                                    .budgetInImpressions(77001L)
                                    .dailyTargetInAdvertiserCurrency(335.72)
                                    .dailyTargetInImpressions(860500L)
                                    .build()))
                            .build())
                        .build()))
                .validateInputOnly(true)
                .build();

        PostAdgroupBulkResponse res = sdk.adGroup().postAdgroupBulk()
                .request(req)
                .call();

        if (res.bulkJobSubmitResponse().isPresent()) {
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

**[PostAdgroupBulkResponse](../../models/operations/PostAdgroupBulkResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/ProblemDetailsException | 400, 403                              | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |

## patchAdgroupBulk

Create a list of ad groups with required fields. `ValidateInputOnly` value should be the same for all ad groups.

### Example Usage

```java
package hello.world;

import com.thetradedesk.workflows.TtdWorkflows;
import com.thetradedesk.workflows.models.components.*;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.PatchAdgroupBulkResponse;
import java.lang.Exception;
import java.util.List;
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
                            .description("hence disbar within weatherize bah amused")
                            .budget(AdGroupWorkflowBudgetInput.builder()
                                .allocationType(AllocationType.MAXIMUM)
                                .budgetInAdvertiserCurrency(3268.79)
                                .budgetInImpressions(185004L)
                                .dailyTargetInAdvertiserCurrency(304.35)
                                .dailyTargetInImpressions(547566L)
                                .build())
                            .baseBidCPMInAdvertiserCurrency(9092.47)
                            .maxBidCPMInAdvertiserCurrency(3654.86)
                            .audienceTargeting(AdGroupWorkflowAudienceTargetingInput.builder()
                                .audienceId("<id>")
                                .audienceAcceleratorExclusionsEnabled(true)
                                .audienceBoosterEnabled(true)
                                .audienceExcluderEnabled(false)
                                .audiencePredictorEnabled(true)
                                .crossDeviceVendorListForAudience(List.of(
                                    218209,
                                    103038))
                                .recencyExclusionWindowInMinutes(917898)
                                .targetTrackableUsersEnabled(JsonNullable.of(null))
                                .useMcIdAsPrimary(true)
                                .build())
                            .roiGoal(AdGroupWorkflowROIGoalInput.builder()
                                .maximizeReach(JsonNullable.of(null))
                                .maximizeLtvIncrementalReach(false)
                                .cpcInAdvertiserCurrency(JsonNullable.of(null))
                                .ctrInPercent(806.78)
                                .nielsenOTPInPercent(6345.56)
                                .cpaInAdvertiserCurrency(920.88)
                                .returnOnAdSpendPercent(7121.59)
                                .vcrInPercent(986.04)
                                .viewabilityInPercent(8457.51)
                                .vcpmInAdvertiserCurrency(JsonNullable.of(null))
                                .cpcvInAdvertiserCurrency(5308.5)
                                .miaozhenOTPInPercent(7264.42)
                                .build())
                            .creativeIds(List.of(
                                "<value 1>",
                                "<value 2>"))
                            .associatedBidLists(List.of(
                                AdGroupWorkflowAssociateBidListInput.builder()
                                    .bidListId("<id>")
                                    .isEnabled(true)
                                    .isDefaultForDimension(false)
                                    .build(),
                                AdGroupWorkflowAssociateBidListInput.builder()
                                    .bidListId("<id>")
                                    .isEnabled(true)
                                    .isDefaultForDimension(false)
                                    .build(),
                                AdGroupWorkflowAssociateBidListInput.builder()
                                    .bidListId("<id>")
                                    .isEnabled(true)
                                    .isDefaultForDimension(false)
                                    .build()))
                            .name("<value>")
                            .channel(AdGroupChannel.AUDIO)
                            .funnelLocation(AdGroupFunnelLocation.CONVERSION)
                            .build())
                        .advancedInput(AdGroupWorkflowAdvancedInput.builder()
                            .koaOptimizationSettings(AdGroupWorkflowKoaOptimizationSettingsInput.builder()
                                .areFutureKoaFeaturesEnabled(true)
                                .predictiveClearingEnabled(JsonNullable.of(null))
                                .build())
                            .comscoreSettings(AdGroupWorkflowComscoreSettingsInput.builder()
                                .isEnabled(false)
                                .populationId(456020)
                                .demographicMemberIds(List.of(
                                    278818,
                                    634558,
                                    707304))
                                .mobileDemographicMemberIds(List.of(
                                    548034,
                                    335760))
                                .build())
                            .contractTargeting(AdGroupWorkflowContractTargetingInput.builder()
                                .allowOpenMarketBiddingWhenTargetingContracts(false)
                                .build())
                            .dimensionalBiddingAutoOptimizationSettings(List.of(
                                List.of()))
                            .isUseClicksAsConversionsEnabled(true)
                            .isUseSecondaryConversionsEnabled(false)
                            .nielsenTrackingAttributes(AdGroupWorkflowNielsenTrackingAttributesInput.builder()
                                .gender(TargetingGender.FEMALE)
                                .startAge(TargetingStartAge.FIFTY)
                                .endAge(TargetingEndAge.THIRTY_NINE)
                                .countries(List.of())
                                .enhancedReportingOption(EnhancedNielsenReportingOptions.SITE)
                                .build())
                            .newFrequencyConfigs(List.of(
                                AdGroupWorkflowNewFrequencyConfigInput.builder()
                                    .counterName("<value>")
                                    .frequencyCap(568469)
                                    .frequencyGoal(860019)
                                    .resetIntervalInMinutes(280265)
                                    .build()))
                            .flights(List.of(
                                AdGroupWorkflowFlightInput.builder()
                                    .campaignFlightId(382445L)
                                    .allocationType(AllocationType.FIXED)
                                    .budgetInAdvertiserCurrency(4586.15)
                                    .budgetInImpressions(381675L)
                                    .dailyTargetInAdvertiserCurrency(5045.51)
                                    .dailyTargetInImpressions(JsonNullable.of(null))
                                    .build()))
                            .build())
                        .build(),
                    AdGroupUpdateWorkflowInput.builder()
                        .id("<id>")
                        .primaryInput(AdGroupUpdateWorkflowPrimaryInput.builder()
                            .isEnabled(true)
                            .description("hence disbar within weatherize bah amused")
                            .budget(AdGroupWorkflowBudgetInput.builder()
                                .allocationType(AllocationType.MAXIMUM)
                                .budgetInAdvertiserCurrency(3268.79)
                                .budgetInImpressions(185004L)
                                .dailyTargetInAdvertiserCurrency(304.35)
                                .dailyTargetInImpressions(547566L)
                                .build())
                            .baseBidCPMInAdvertiserCurrency(9092.47)
                            .maxBidCPMInAdvertiserCurrency(3654.86)
                            .audienceTargeting(AdGroupWorkflowAudienceTargetingInput.builder()
                                .audienceId("<id>")
                                .audienceAcceleratorExclusionsEnabled(true)
                                .audienceBoosterEnabled(true)
                                .audienceExcluderEnabled(false)
                                .audiencePredictorEnabled(true)
                                .crossDeviceVendorListForAudience(List.of(
                                    218209,
                                    103038))
                                .recencyExclusionWindowInMinutes(917898)
                                .targetTrackableUsersEnabled(JsonNullable.of(null))
                                .useMcIdAsPrimary(true)
                                .build())
                            .roiGoal(AdGroupWorkflowROIGoalInput.builder()
                                .maximizeReach(JsonNullable.of(null))
                                .maximizeLtvIncrementalReach(false)
                                .cpcInAdvertiserCurrency(JsonNullable.of(null))
                                .ctrInPercent(806.78)
                                .nielsenOTPInPercent(6345.56)
                                .cpaInAdvertiserCurrency(920.88)
                                .returnOnAdSpendPercent(7121.59)
                                .vcrInPercent(986.04)
                                .viewabilityInPercent(8457.51)
                                .vcpmInAdvertiserCurrency(JsonNullable.of(null))
                                .cpcvInAdvertiserCurrency(5308.5)
                                .miaozhenOTPInPercent(7264.42)
                                .build())
                            .creativeIds(List.of(
                                "<value 1>",
                                "<value 2>"))
                            .associatedBidLists(List.of(
                                AdGroupWorkflowAssociateBidListInput.builder()
                                    .bidListId("<id>")
                                    .isEnabled(true)
                                    .isDefaultForDimension(false)
                                    .build(),
                                AdGroupWorkflowAssociateBidListInput.builder()
                                    .bidListId("<id>")
                                    .isEnabled(true)
                                    .isDefaultForDimension(false)
                                    .build(),
                                AdGroupWorkflowAssociateBidListInput.builder()
                                    .bidListId("<id>")
                                    .isEnabled(true)
                                    .isDefaultForDimension(false)
                                    .build()))
                            .name("<value>")
                            .channel(AdGroupChannel.AUDIO)
                            .funnelLocation(AdGroupFunnelLocation.CONVERSION)
                            .build())
                        .advancedInput(AdGroupWorkflowAdvancedInput.builder()
                            .koaOptimizationSettings(AdGroupWorkflowKoaOptimizationSettingsInput.builder()
                                .areFutureKoaFeaturesEnabled(true)
                                .predictiveClearingEnabled(JsonNullable.of(null))
                                .build())
                            .comscoreSettings(AdGroupWorkflowComscoreSettingsInput.builder()
                                .isEnabled(false)
                                .populationId(456020)
                                .demographicMemberIds(List.of(
                                    278818,
                                    634558,
                                    707304))
                                .mobileDemographicMemberIds(List.of(
                                    548034,
                                    335760))
                                .build())
                            .contractTargeting(AdGroupWorkflowContractTargetingInput.builder()
                                .allowOpenMarketBiddingWhenTargetingContracts(false)
                                .build())
                            .dimensionalBiddingAutoOptimizationSettings(List.of(
                                List.of()))
                            .isUseClicksAsConversionsEnabled(true)
                            .isUseSecondaryConversionsEnabled(false)
                            .nielsenTrackingAttributes(AdGroupWorkflowNielsenTrackingAttributesInput.builder()
                                .gender(TargetingGender.FEMALE)
                                .startAge(TargetingStartAge.FIFTY)
                                .endAge(TargetingEndAge.THIRTY_NINE)
                                .countries(List.of())
                                .enhancedReportingOption(EnhancedNielsenReportingOptions.SITE)
                                .build())
                            .newFrequencyConfigs(List.of(
                                AdGroupWorkflowNewFrequencyConfigInput.builder()
                                    .counterName("<value>")
                                    .frequencyCap(568469)
                                    .frequencyGoal(860019)
                                    .resetIntervalInMinutes(280265)
                                    .build()))
                            .flights(List.of(
                                AdGroupWorkflowFlightInput.builder()
                                    .campaignFlightId(382445L)
                                    .allocationType(AllocationType.FIXED)
                                    .budgetInAdvertiserCurrency(4586.15)
                                    .budgetInImpressions(381675L)
                                    .dailyTargetInAdvertiserCurrency(5045.51)
                                    .dailyTargetInImpressions(JsonNullable.of(null))
                                    .build()))
                            .build())
                        .build()))
                .validateInputOnly(true)
                .build();

        PatchAdgroupBulkResponse res = sdk.adGroup().patchAdgroupBulk()
                .request(req)
                .call();

        if (res.bulkJobSubmitResponse().isPresent()) {
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

**[PatchAdgroupBulkResponse](../../models/operations/PatchAdgroupBulkResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/ProblemDetailsException | 400, 403                              | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |