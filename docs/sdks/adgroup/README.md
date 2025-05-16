# AdGroup
(*adGroup()*)

## Overview

### Available Operations

* [postAdgroup](#postadgroup)
* [patchAdgroup](#patchadgroup)
* [postAdgroupArchive](#postadgrouparchive) - Archive a list of ad groups

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

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        TtdWorkflows sdk = TtdWorkflows.builder()
                .ttdAuth("<YOUR_API_KEY_HERE>")
            .build();

        AdGroupCreateWorkflowInput req = AdGroupCreateWorkflowInput.builder()
                .primaryInput(AdGroupCreateWorkflowPrimaryInput.builder()
                    .name("<value>")
                    .channel(AdGroupChannel.NATIVE)
                    .funnelLocation(AdGroupFunnelLocation.NONE)
                    .isEnabled(true)
                    .description("whose countess instead helplessly honestly unblinking hence opposite")
                    .budget(AdGroupWorkflowBudgetInput.builder()
                        .allocationType(AllocationType.FIXED)
                        .budgetInAdvertiserCurrency(1255.27)
                        .budgetInImpressions(469226L)
                        .dailyTargetInAdvertiserCurrency(7461.36)
                        .dailyTargetInImpressions(790907L)
                        .build())
                    .baseBidCPMInAdvertiserCurrency(310.16)
                    .maxBidCPMInAdvertiserCurrency(2360.6)
                    .audienceTargeting(AdGroupWorkflowAudienceTargetingInput.builder()
                        .audienceId("<id>")
                        .audienceAcceleratorExclusionsEnabled(false)
                        .audienceBoosterEnabled(false)
                        .audienceExcluderEnabled(true)
                        .audiencePredictorEnabled(false)
                        .crossDeviceVendorListForAudience(List.of(
                            614673,
                            684382))
                        .recencyExclusionWindowInMinutes(262820)
                        .targetTrackableUsersEnabled(true)
                        .useMcIdAsPrimary(true)
                        .build())
                    .roiGoal(AdGroupWorkflowROIGoalInput.builder()
                        .maximizeReach(false)
                        .maximizeLtvIncrementalReach(false)
                        .cpcInAdvertiserCurrency(3537.6)
                        .ctrInPercent(6333.79)
                        .nielsenOTPInPercent(8443.6)
                        .cpaInAdvertiserCurrency(8183.4)
                        .returnOnAdSpendPercent(9749.47)
                        .vcrInPercent(5244.57)
                        .viewabilityInPercent(1797.09)
                        .vcpmInAdvertiserCurrency(9777.89)
                        .cpcvInAdvertiserCurrency(4506.52)
                        .miaozhenOTPInPercent(5639.62)
                        .build())
                    .creativeIds(List.of(
                        "<value>"))
                    .associatedBidLists(List.of(
                        AdGroupWorkflowAssociateBidListInput.builder()
                            .bidListId("<id>")
                            .isEnabled(false)
                            .isDefaultForDimension(true)
                            .build(),
                        AdGroupWorkflowAssociateBidListInput.builder()
                            .bidListId("<id>")
                            .isEnabled(true)
                            .isDefaultForDimension(false)
                            .build(),
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
                        .areFutureKoaFeaturesEnabled(true)
                        .predictiveClearingEnabled(true)
                        .build())
                    .comscoreSettings(AdGroupWorkflowComscoreSettingsInput.builder()
                        .isEnabled(true)
                        .populationId(133150)
                        .demographicMemberIds(List.of(
                            199046))
                        .mobileDemographicMemberIds(List.of(
                            964861,
                            667844))
                        .build())
                    .contractTargeting(AdGroupWorkflowContractTargetingInput.builder()
                        .allowOpenMarketBiddingWhenTargetingContracts(true)
                        .build())
                    .dimensionalBiddingAutoOptimizationSettings(List.of(
                        List.of(
                            DimensionalBiddingDimensions.HAS_VIDEO_COMPLETION_RATE_SCORE_RANGE,
                            DimensionalBiddingDimensions.HAS_FULL_REFERRER_URL),
                        List.of(
                        ),
                        List.of(
                            DimensionalBiddingDimensions.HAS_SELLER_ID)))
                    .isUseClicksAsConversionsEnabled(true)
                    .isUseSecondaryConversionsEnabled(true)
                    .nielsenTrackingAttributes(AdGroupWorkflowNielsenTrackingAttributesInput.builder()
                        .gender(TargetingGender.FEMALE)
                        .startAge(TargetingStartAge.SIXTY_FIVE)
                        .endAge(TargetingEndAge.TWENTY_NINE)
                        .countries(List.of(
                            "<value>"))
                        .enhancedReportingOption(EnhancedNielsenReportingOptions.NONE)
                        .build())
                    .newFrequencyConfigs(List.of(
                        AdGroupWorkflowNewFrequencyConfigInput.builder()
                            .counterName("<value>")
                            .frequencyCap(746348)
                            .frequencyGoal(510683)
                            .resetIntervalInMinutes(129092)
                            .build(),
                        AdGroupWorkflowNewFrequencyConfigInput.builder()
                            .counterName("<value>")
                            .frequencyCap(755997)
                            .frequencyGoal(198769)
                            .resetIntervalInMinutes(168827)
                            .build()))
                    .flights(List.of(
                        AdGroupWorkflowFlightInput.builder()
                            .campaignFlightId(136905L)
                            .allocationType(AllocationType.FIXED)
                            .budgetInAdvertiserCurrency(1595.69)
                            .budgetInImpressions(474397L)
                            .dailyTargetInAdvertiserCurrency(7814.66)
                            .dailyTargetInImpressions(542673L)
                            .build(),
                        AdGroupWorkflowFlightInput.builder()
                            .campaignFlightId(186465L)
                            .allocationType(AllocationType.FIXED)
                            .budgetInAdvertiserCurrency(3145.56)
                            .budgetInImpressions(465009L)
                            .dailyTargetInAdvertiserCurrency(8108.2)
                            .dailyTargetInImpressions(109630L)
                            .build(),
                        AdGroupWorkflowFlightInput.builder()
                            .campaignFlightId(597076L)
                            .allocationType(AllocationType.FIXED)
                            .budgetInAdvertiserCurrency(2666.4)
                            .budgetInImpressions(593663L)
                            .dailyTargetInAdvertiserCurrency(2585.24)
                            .dailyTargetInImpressions(42750L)
                            .build()))
                    .build())
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

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [AdGroupCreateWorkflowInput](../../models/shared/AdGroupCreateWorkflowInput.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

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

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        TtdWorkflows sdk = TtdWorkflows.builder()
                .ttdAuth("<YOUR_API_KEY_HERE>")
            .build();

        AdGroupUpdateWorkflowInput req = AdGroupUpdateWorkflowInput.builder()
                .id("<id>")
                .primaryInput(AdGroupUpdateWorkflowPrimaryInput.builder()
                    .name("<value>")
                    .channel(AdGroupChannel.VIDEO)
                    .funnelLocation(AdGroupFunnelLocation.CONSIDERATION)
                    .isEnabled(true)
                    .description("insecure geez nor")
                    .budget(AdGroupWorkflowBudgetInput.builder()
                        .allocationType(AllocationType.MINIMUM)
                        .budgetInAdvertiserCurrency(6266.65)
                        .budgetInImpressions(138352L)
                        .dailyTargetInAdvertiserCurrency(1751.56)
                        .dailyTargetInImpressions(89555L)
                        .build())
                    .baseBidCPMInAdvertiserCurrency(1405.86)
                    .maxBidCPMInAdvertiserCurrency(5614.26)
                    .audienceTargeting(AdGroupWorkflowAudienceTargetingInput.builder()
                        .audienceId("<id>")
                        .audienceAcceleratorExclusionsEnabled(false)
                        .audienceBoosterEnabled(true)
                        .audienceExcluderEnabled(true)
                        .audiencePredictorEnabled(false)
                        .crossDeviceVendorListForAudience(List.of(
                            884208,
                            437227,
                            46344))
                        .recencyExclusionWindowInMinutes(728415)
                        .targetTrackableUsersEnabled(true)
                        .useMcIdAsPrimary(false)
                        .build())
                    .roiGoal(AdGroupWorkflowROIGoalInput.builder()
                        .maximizeReach(true)
                        .maximizeLtvIncrementalReach(true)
                        .cpcInAdvertiserCurrency(6845.97)
                        .ctrInPercent(2015.13)
                        .nielsenOTPInPercent(4336.16)
                        .cpaInAdvertiserCurrency(6948.4)
                        .returnOnAdSpendPercent(7542.56)
                        .vcrInPercent(1098.42)
                        .viewabilityInPercent(9831.49)
                        .vcpmInAdvertiserCurrency(7499.92)
                        .cpcvInAdvertiserCurrency(2240.31)
                        .miaozhenOTPInPercent(2080.35)
                        .build())
                    .creativeIds(List.of(
                        "<value>",
                        "<value>"))
                    .associatedBidLists(List.of(
                        AdGroupWorkflowAssociateBidListInput.builder()
                            .bidListId("<id>")
                            .isEnabled(true)
                            .isDefaultForDimension(true)
                            .build(),
                        AdGroupWorkflowAssociateBidListInput.builder()
                            .bidListId("<id>")
                            .isEnabled(true)
                            .isDefaultForDimension(false)
                            .build(),
                        AdGroupWorkflowAssociateBidListInput.builder()
                            .bidListId("<id>")
                            .isEnabled(false)
                            .isDefaultForDimension(false)
                            .build()))
                    .build())
                .advancedInput(AdGroupWorkflowAdvancedInput.builder()
                    .koaOptimizationSettings(AdGroupWorkflowKoaOptimizationSettingsInput.builder()
                        .areFutureKoaFeaturesEnabled(false)
                        .predictiveClearingEnabled(true)
                        .build())
                    .comscoreSettings(AdGroupWorkflowComscoreSettingsInput.builder()
                        .isEnabled(false)
                        .populationId(76485)
                        .demographicMemberIds(List.of(
                            793004,
                            525759,
                            730808))
                        .mobileDemographicMemberIds(List.of(
                            178280))
                        .build())
                    .contractTargeting(AdGroupWorkflowContractTargetingInput.builder()
                        .allowOpenMarketBiddingWhenTargetingContracts(false)
                        .build())
                    .dimensionalBiddingAutoOptimizationSettings(List.of(
                        List.of(
                            DimensionalBiddingDimensions.HAS_FREQUENCY_ADJUSTMENT_ID)))
                    .isUseClicksAsConversionsEnabled(false)
                    .isUseSecondaryConversionsEnabled(true)
                    .nielsenTrackingAttributes(AdGroupWorkflowNielsenTrackingAttributesInput.builder()
                        .gender(TargetingGender.BOTH)
                        .startAge(TargetingStartAge.FORTY)
                        .endAge(TargetingEndAge.TWENTY)
                        .countries(List.of(
                            "<value>"))
                        .enhancedReportingOption(EnhancedNielsenReportingOptions.SITE)
                        .build())
                    .newFrequencyConfigs(List.of(
                        AdGroupWorkflowNewFrequencyConfigInput.builder()
                            .counterName("<value>")
                            .frequencyCap(134682)
                            .frequencyGoal(686039)
                            .resetIntervalInMinutes(361524)
                            .build(),
                        AdGroupWorkflowNewFrequencyConfigInput.builder()
                            .counterName("<value>")
                            .frequencyCap(608575)
                            .frequencyGoal(188983)
                            .resetIntervalInMinutes(279270)
                            .build(),
                        AdGroupWorkflowNewFrequencyConfigInput.builder()
                            .counterName("<value>")
                            .frequencyCap(349625)
                            .frequencyGoal(471189)
                            .resetIntervalInMinutes(543852)
                            .build()))
                    .flights(List.of(
                        AdGroupWorkflowFlightInput.builder()
                            .campaignFlightId(76498L)
                            .allocationType(AllocationType.FIXED)
                            .budgetInAdvertiserCurrency(5406.82)
                            .budgetInImpressions(670564L)
                            .dailyTargetInAdvertiserCurrency(8550.79)
                            .dailyTargetInImpressions(183553L)
                            .build()))
                    .build())
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

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [AdGroupUpdateWorkflowInput](../../models/shared/AdGroupUpdateWorkflowInput.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

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
                    "<value>"))
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