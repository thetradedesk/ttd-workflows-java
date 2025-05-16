# Campaign
(*campaign()*)

## Overview

### Available Operations

* [create](#create) - Create a new campaign with required fields
* [patchCampaign](#patchcampaign) - Update an existing campaign with specified fields
* [postCampaignBulk](#postcampaignbulk) - Create a list of campaigns with required fields. `ValidationOnly` value should be the same for all campaigns.
* [postCampaignArchive](#postcampaignarchive) - Archive a list of campaigns
* [getVersion](#getversion) - GET a campaign's version

## create

Create a new campaign with required fields

### Example Usage

```java
package hello.world;

import com.thetradedesk.workflows.TtdWorkflows;
import com.thetradedesk.workflows.models.components.*;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.PostCampaignResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        TtdWorkflows sdk = TtdWorkflows.builder()
                .ttdAuth("<YOUR_API_KEY_HERE>")
            .build();

        CampaignCreateWorkflowInput req = CampaignCreateWorkflowInput.builder()
                .primaryInput(CampaignCreateWorkflowPrimaryInput.builder()
                    .advertiserId("<id>")
                    .name("<value>")
                    .primaryChannel(CampaignChannelType.NONE)
                    .primaryGoal(CampaignWorkflowROIGoalInput.builder()
                        .maximizeReach(false)
                        .maximizeLtvIncrementalReach(false)
                        .cpcInAdvertiserCurrency(5665.12)
                        .ctrInPercent(2955.58)
                        .nielsenOTPInPercent(2032.57)
                        .cpaInAdvertiserCurrency(4332.24)
                        .returnOnAdSpendPercent(7122.14)
                        .vcrInPercent(9958.52)
                        .viewabilityInPercent(8236.83)
                        .vcpmInAdvertiserCurrency(2127.75)
                        .cpcvInAdvertiserCurrency(6207.47)
                        .miaozhenOTPInPercent(2841.2)
                        .build())
                    .description("yuck vice between gee ugh ha")
                    .timeZone("Pacific/Chuuk")
                    .customCPAClickWeight(7804.86)
                    .customCPAViewthroughWeight(7602.59)
                    .customCPAType(CustomCPAType.DISABLED)
                    .impressionsOnlyBudgetingCpm(4492.21)
                    .budget(CampaignWorkflowBudgetInput.builder()
                        .pacingMode(CampaignPacingMode.PACE_EVENLY)
                        .budgetInAdvertiserCurrency(5884.97)
                        .budgetInImpressions(93470L)
                        .dailyTargetInAdvertiserCurrency(4914.27)
                        .dailyTargetInImpressions(490420L)
                        .build())
                    .endDateInUtc(OffsetDateTime.parse("2023-12-23T16:58:53.860Z"))
                    .seedId("<id>")
                    .campaignConversionReportingColumns(List.of(
                        CampaignWorkflowConversionReportingColumnInput.builder()
                            .trackingTagId("<id>")
                            .includeInCustomCPA(true)
                            .reportingColumnId(129663)
                            .roasConfig(CustomROASConfig.builder()
                                .includeInCustomROAS(true)
                                .customROASWeight(5833.53)
                                .customROASClickWeight(5193.59)
                                .customROASViewthroughWeight(3259.9)
                                .build())
                            .weight(4078.33)
                            .crossDeviceAttributionModelId("<id>")
                            .build(),
                        CampaignWorkflowConversionReportingColumnInput.builder()
                            .trackingTagId("<id>")
                            .includeInCustomCPA(true)
                            .reportingColumnId(188435)
                            .roasConfig(CustomROASConfig.builder()
                                .includeInCustomROAS(false)
                                .customROASWeight(8891.64)
                                .customROASClickWeight(54.36)
                                .customROASViewthroughWeight(9117.42)
                                .build())
                            .weight(8988.41)
                            .crossDeviceAttributionModelId("<id>")
                            .build(),
                        CampaignWorkflowConversionReportingColumnInput.builder()
                            .trackingTagId("<id>")
                            .includeInCustomCPA(false)
                            .reportingColumnId(17207)
                            .roasConfig(CustomROASConfig.builder()
                                .includeInCustomROAS(true)
                                .customROASWeight(8441.62)
                                .customROASClickWeight(3535.31)
                                .customROASViewthroughWeight(4287.45)
                                .build())
                            .weight(6798.85)
                            .crossDeviceAttributionModelId("<id>")
                            .build()))
                    .startDateInUtc(OffsetDateTime.parse("2024-10-28T18:55:39.709Z"))
                    .build())
                .advancedInput(CampaignWorkflowAdvancedInput.builder()
                    .flights(List.of(
                        CampaignWorkflowFlightInput.builder()
                            .startDateInclusiveUTC(OffsetDateTime.parse("2024-06-28T18:56:13.043Z"))
                            .budgetInAdvertiserCurrency(5200.49)
                            .endDateExclusiveUTC(OffsetDateTime.parse("2024-10-30T06:59:44.964Z"))
                            .budgetInImpressions(728836L)
                            .dailyTargetInAdvertiserCurrency(8007.59)
                            .dailyTargetInImpressions(117747L)
                            .build()))
                    .purchaseOrderNumber("<value>")
                    .build())
                .adGroups(List.of(
                    CampaignCreateWorkflowAdGroupInput.builder()
                        .primaryInput(AdGroupCreateWorkflowPrimaryInput.builder()
                            .name("<value>")
                            .channel(AdGroupChannel.VIDEO)
                            .funnelLocation(AdGroupFunnelLocation.CONVERSION)
                            .isEnabled(false)
                            .description("yippee where until waver colorless beyond victoriously consequently apud")
                            .budget(AdGroupWorkflowBudgetInput.builder()
                                .allocationType(AllocationType.FIXED)
                                .budgetInAdvertiserCurrency(5906.34)
                                .budgetInImpressions(223877L)
                                .dailyTargetInAdvertiserCurrency(7543.1)
                                .dailyTargetInImpressions(850693L)
                                .build())
                            .baseBidCPMInAdvertiserCurrency(8664.87)
                            .maxBidCPMInAdvertiserCurrency(2000.77)
                            .audienceTargeting(AdGroupWorkflowAudienceTargetingInput.builder()
                                .audienceId("<id>")
                                .audienceAcceleratorExclusionsEnabled(true)
                                .audienceBoosterEnabled(false)
                                .audienceExcluderEnabled(false)
                                .audiencePredictorEnabled(true)
                                .crossDeviceVendorListForAudience(List.of(
                                    883321,
                                    892770,
                                    199311))
                                .recencyExclusionWindowInMinutes(564854)
                                .targetTrackableUsersEnabled(false)
                                .useMcIdAsPrimary(false)
                                .build())
                            .roiGoal(AdGroupWorkflowROIGoalInput.builder()
                                .maximizeReach(true)
                                .maximizeLtvIncrementalReach(true)
                                .cpcInAdvertiserCurrency(5474.83)
                                .ctrInPercent(9609.09)
                                .nielsenOTPInPercent(9138.67)
                                .cpaInAdvertiserCurrency(4757.86)
                                .returnOnAdSpendPercent(6954.13)
                                .vcrInPercent(3246.89)
                                .viewabilityInPercent(2617.57)
                                .vcpmInAdvertiserCurrency(6084.35)
                                .cpcvInAdvertiserCurrency(4004.22)
                                .miaozhenOTPInPercent(2574.33)
                                .build())
                            .creativeIds(List.of(
                                "<value>"))
                            .associatedBidLists(List.of(
                                AdGroupWorkflowAssociateBidListInput.builder()
                                    .bidListId("<id>")
                                    .isEnabled(true)
                                    .isDefaultForDimension(true)
                                    .build(),
                                AdGroupWorkflowAssociateBidListInput.builder()
                                    .bidListId("<id>")
                                    .isEnabled(false)
                                    .isDefaultForDimension(false)
                                    .build()))
                            .programmaticGuaranteedPrivateContractId("<id>")
                            .build())
                        .advancedInput(CampaignCreateWorkflowAdGroupAdvancedInput.builder()
                            .koaOptimizationSettings(AdGroupWorkflowKoaOptimizationSettingsInput.builder()
                                .areFutureKoaFeaturesEnabled(true)
                                .predictiveClearingEnabled(false)
                                .build())
                            .comscoreSettings(AdGroupWorkflowComscoreSettingsInput.builder()
                                .isEnabled(false)
                                .populationId(339267)
                                .demographicMemberIds(List.of(
                                    885411))
                                .mobileDemographicMemberIds(List.of(
                                    557925,
                                    643654,
                                    700013))
                                .build())
                            .contractTargeting(AdGroupWorkflowContractTargetingInput.builder()
                                .allowOpenMarketBiddingWhenTargetingContracts(false)
                                .build())
                            .dimensionalBiddingAutoOptimizationSettings(List.of(
                                List.of(
                                    DimensionalBiddingDimensions.HAS_AD_BUG_VIDEO_PAGE_QUALITY_CATEGORY_ID,
                                    DimensionalBiddingDimensions.HAS_DOUBLE_VERIFY_VIDEO_VIEWABILITY_CATEGORY_ID),
                                List.of(
                                    DimensionalBiddingDimensions.HAS_RENDERING_CONTEXT_ID,
                                    DimensionalBiddingDimensions.HAS_CONTEXTUAL_APP_CATEGORY_ID)))
                            .isUseClicksAsConversionsEnabled(true)
                            .isUseSecondaryConversionsEnabled(true)
                            .nielsenTrackingAttributes(AdGroupWorkflowNielsenTrackingAttributesInput.builder()
                                .gender(TargetingGender.MALE)
                                .startAge(TargetingStartAge.FIFTY_FIVE)
                                .endAge(TargetingEndAge.FIFTY_FOUR)
                                .countries(List.of(
                                    "<value>",
                                    "<value>",
                                    "<value>"))
                                .enhancedReportingOption(EnhancedNielsenReportingOptions.AUDIENCE)
                                .build())
                            .newFrequencyConfigs(List.of(
                                AdGroupWorkflowNewFrequencyConfigInput.builder()
                                    .counterName("<value>")
                                    .frequencyCap(661881)
                                    .frequencyGoal(79826)
                                    .resetIntervalInMinutes(564782)
                                    .build(),
                                AdGroupWorkflowNewFrequencyConfigInput.builder()
                                    .counterName("<value>")
                                    .frequencyCap(496696)
                                    .frequencyGoal(622836)
                                    .resetIntervalInMinutes(542231)
                                    .build(),
                                AdGroupWorkflowNewFrequencyConfigInput.builder()
                                    .counterName("<value>")
                                    .frequencyCap(339193)
                                    .frequencyGoal(320521)
                                    .resetIntervalInMinutes(708684)
                                    .build()))
                            .flights(List.of(
                                CampaignCreateWorkflowAdGroupFlightInput.builder()
                                    .allocationType(AllocationType.FIXED)
                                    .budgetInAdvertiserCurrency(2460.82)
                                    .budgetInImpressions(689435L)
                                    .dailyTargetInAdvertiserCurrency(5733.26)
                                    .dailyTargetInImpressions(522908L)
                                    .build(),
                                CampaignCreateWorkflowAdGroupFlightInput.builder()
                                    .allocationType(AllocationType.MINIMUM)
                                    .budgetInAdvertiserCurrency(3302.92)
                                    .budgetInImpressions(257617L)
                                    .dailyTargetInAdvertiserCurrency(9488.67)
                                    .dailyTargetInImpressions(286214L)
                                    .build()))
                            .build())
                        .build(),
                    CampaignCreateWorkflowAdGroupInput.builder()
                        .primaryInput(AdGroupCreateWorkflowPrimaryInput.builder()
                            .name("<value>")
                            .channel(AdGroupChannel.VIDEO)
                            .funnelLocation(AdGroupFunnelLocation.CONVERSION)
                            .isEnabled(true)
                            .description("browse colorfully blank")
                            .budget(AdGroupWorkflowBudgetInput.builder()
                                .allocationType(AllocationType.FIXED)
                                .budgetInAdvertiserCurrency(5085.11)
                                .budgetInImpressions(12544L)
                                .dailyTargetInAdvertiserCurrency(4263.75)
                                .dailyTargetInImpressions(306126L)
                                .build())
                            .baseBidCPMInAdvertiserCurrency(6393.88)
                            .maxBidCPMInAdvertiserCurrency(7806.19)
                            .audienceTargeting(AdGroupWorkflowAudienceTargetingInput.builder()
                                .audienceId("<id>")
                                .audienceAcceleratorExclusionsEnabled(false)
                                .audienceBoosterEnabled(true)
                                .audienceExcluderEnabled(true)
                                .audiencePredictorEnabled(false)
                                .crossDeviceVendorListForAudience(List.of(
                                    515066,
                                    724887))
                                .recencyExclusionWindowInMinutes(997242)
                                .targetTrackableUsersEnabled(false)
                                .useMcIdAsPrimary(false)
                                .build())
                            .roiGoal(AdGroupWorkflowROIGoalInput.builder()
                                .maximizeReach(false)
                                .maximizeLtvIncrementalReach(false)
                                .cpcInAdvertiserCurrency(1285.82)
                                .ctrInPercent(2880.02)
                                .nielsenOTPInPercent(6752.2)
                                .cpaInAdvertiserCurrency(4797.25)
                                .returnOnAdSpendPercent(6967.11)
                                .vcrInPercent(8422.44)
                                .viewabilityInPercent(87.86)
                                .vcpmInAdvertiserCurrency(9921.62)
                                .cpcvInAdvertiserCurrency(6912.82)
                                .miaozhenOTPInPercent(8566.65)
                                .build())
                            .creativeIds(List.of(
                                "<value>",
                                "<value>"))
                            .associatedBidLists(List.of(
                                AdGroupWorkflowAssociateBidListInput.builder()
                                    .bidListId("<id>")
                                    .isEnabled(false)
                                    .isDefaultForDimension(false)
                                    .build()))
                            .programmaticGuaranteedPrivateContractId("<id>")
                            .build())
                        .advancedInput(CampaignCreateWorkflowAdGroupAdvancedInput.builder()
                            .koaOptimizationSettings(AdGroupWorkflowKoaOptimizationSettingsInput.builder()
                                .areFutureKoaFeaturesEnabled(false)
                                .predictiveClearingEnabled(true)
                                .build())
                            .comscoreSettings(AdGroupWorkflowComscoreSettingsInput.builder()
                                .isEnabled(false)
                                .populationId(511670)
                                .demographicMemberIds(List.of(
                                    275977,
                                    930307))
                                .mobileDemographicMemberIds(List.of(
                                    29308))
                                .build())
                            .contractTargeting(AdGroupWorkflowContractTargetingInput.builder()
                                .allowOpenMarketBiddingWhenTargetingContracts(false)
                                .build())
                            .dimensionalBiddingAutoOptimizationSettings(List.of(
                                List.of(
                                    DimensionalBiddingDimensions.HAS_SUPPLY_VENDOR_ID,
                                    DimensionalBiddingDimensions.HAS_WEATHER_CONDITION_ID,
                                    DimensionalBiddingDimensions.HAS_CONTEXTUAL_APP_CATEGORY_ID),
                                List.of(
                                    DimensionalBiddingDimensions.HAS_PEER39_PAGE_QUALITY_CATEGORY_ID,
                                    DimensionalBiddingDimensions.HAS_FACTUAL_PROXIMITY_DATA_ID,
                                    DimensionalBiddingDimensions.HAS_PLACEMENT_POSITION_RELATIVE_TO_FOLD_ID)))
                            .isUseClicksAsConversionsEnabled(true)
                            .isUseSecondaryConversionsEnabled(true)
                            .nielsenTrackingAttributes(AdGroupWorkflowNielsenTrackingAttributesInput.builder()
                                .gender(TargetingGender.MALE)
                                .startAge(TargetingStartAge.FORTY_FIVE)
                                .endAge(TargetingEndAge.TWENTY_NINE)
                                .countries(List.of(
                                ))
                                .enhancedReportingOption(EnhancedNielsenReportingOptions.AUDIENCE)
                                .build())
                            .newFrequencyConfigs(List.of(
                                AdGroupWorkflowNewFrequencyConfigInput.builder()
                                    .counterName("<value>")
                                    .frequencyCap(293620)
                                    .frequencyGoal(333281)
                                    .resetIntervalInMinutes(637441)
                                    .build(),
                                AdGroupWorkflowNewFrequencyConfigInput.builder()
                                    .counterName("<value>")
                                    .frequencyCap(855423)
                                    .frequencyGoal(967917)
                                    .resetIntervalInMinutes(649685)
                                    .build()))
                            .flights(List.of(
                                CampaignCreateWorkflowAdGroupFlightInput.builder()
                                    .allocationType(AllocationType.MAXIMUM)
                                    .budgetInAdvertiserCurrency(286.08)
                                    .budgetInImpressions(316907L)
                                    .dailyTargetInAdvertiserCurrency(485.54)
                                    .dailyTargetInImpressions(257790L)
                                    .build(),
                                CampaignCreateWorkflowAdGroupFlightInput.builder()
                                    .allocationType(AllocationType.FIXED)
                                    .budgetInAdvertiserCurrency(4780.27)
                                    .budgetInImpressions(913385L)
                                    .dailyTargetInAdvertiserCurrency(650.97)
                                    .dailyTargetInImpressions(624357L)
                                    .build()))
                            .build())
                        .build()))
                .validationOnly(false)
                .build();

        PostCampaignResponse res = sdk.campaign().create()
                .request(req)
                .call();

        if (res.campaignPayload().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CampaignCreateWorkflowInput](../../models/shared/CampaignCreateWorkflowInput.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PostCampaignResponse](../../models/operations/PostCampaignResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/ProblemDetailsException | 400, 403                              | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |

## patchCampaign

Update an existing campaign with specified fields

### Example Usage

```java
package hello.world;

import com.thetradedesk.workflows.TtdWorkflows;
import com.thetradedesk.workflows.models.components.*;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.PatchCampaignResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        TtdWorkflows sdk = TtdWorkflows.builder()
                .ttdAuth("<YOUR_API_KEY_HERE>")
            .build();

        CampaignUpdateWorkflowInput req = CampaignUpdateWorkflowInput.builder()
                .primaryInput(CampaignUpdateWorkflowPrimaryInput.builder()
                    .id("<id>")
                    .description("onto frail incline watery besmirch wallaby ew")
                    .timeZone("Europe/Tirane")
                    .customCPAClickWeight(2654.86)
                    .customCPAViewthroughWeight(2212.44)
                    .customCPAType(CustomCPAType.CLICK_VIEWTHROUGH_WEIGHTING)
                    .impressionsOnlyBudgetingCpm(4161.04)
                    .budget(CampaignWorkflowBudgetInput.builder()
                        .pacingMode(CampaignPacingMode.PACE_AS_SOON_AS_POSSIBLE)
                        .budgetInAdvertiserCurrency(9734.67)
                        .budgetInImpressions(144079L)
                        .dailyTargetInAdvertiserCurrency(796.2)
                        .dailyTargetInImpressions(927058L)
                        .build())
                    .endDateInUtc(OffsetDateTime.parse("2023-10-30T21:03:42.194Z"))
                    .seedId("<id>")
                    .campaignConversionReportingColumns(List.of(
                        CampaignWorkflowConversionReportingColumnInput.builder()
                            .trackingTagId("<id>")
                            .includeInCustomCPA(true)
                            .reportingColumnId(612696)
                            .roasConfig(CustomROASConfig.builder()
                                .includeInCustomROAS(true)
                                .customROASWeight(8227.87)
                                .customROASClickWeight(948.27)
                                .customROASViewthroughWeight(260.92)
                                .build())
                            .weight(7435.48)
                            .crossDeviceAttributionModelId("<id>")
                            .build(),
                        CampaignWorkflowConversionReportingColumnInput.builder()
                            .trackingTagId("<id>")
                            .includeInCustomCPA(false)
                            .reportingColumnId(224688)
                            .roasConfig(CustomROASConfig.builder()
                                .includeInCustomROAS(true)
                                .customROASWeight(4746.2)
                                .customROASClickWeight(9836.19)
                                .customROASViewthroughWeight(1435.91)
                                .build())
                            .weight(7084.86)
                            .crossDeviceAttributionModelId("<id>")
                            .build()))
                    .name("<value>")
                    .primaryChannel(CampaignChannelType.NATIVE_VIDEO)
                    .primaryGoal(CampaignWorkflowROIGoalInput.builder()
                        .maximizeReach(false)
                        .maximizeLtvIncrementalReach(true)
                        .cpcInAdvertiserCurrency(212.16)
                        .ctrInPercent(6382.42)
                        .nielsenOTPInPercent(9528.23)
                        .cpaInAdvertiserCurrency(3018.04)
                        .returnOnAdSpendPercent(8304.12)
                        .vcrInPercent(4110.43)
                        .viewabilityInPercent(8517.26)
                        .vcpmInAdvertiserCurrency(5362.46)
                        .cpcvInAdvertiserCurrency(2648.21)
                        .miaozhenOTPInPercent(2901.77)
                        .build())
                    .startDateInUtc(OffsetDateTime.parse("2024-03-11T02:18:44.439Z"))
                    .build())
                .advancedInput(CampaignWorkflowAdvancedInput.builder()
                    .flights(List.of(
                        CampaignWorkflowFlightInput.builder()
                            .startDateInclusiveUTC(OffsetDateTime.parse("2024-01-25T23:11:41.832Z"))
                            .budgetInAdvertiserCurrency(333.49)
                            .endDateExclusiveUTC(OffsetDateTime.parse("2024-08-28T04:40:52.034Z"))
                            .budgetInImpressions(475492L)
                            .dailyTargetInAdvertiserCurrency(4540.7)
                            .dailyTargetInImpressions(777398L)
                            .build()))
                    .purchaseOrderNumber("<value>")
                    .build())
                .validationOnly(false)
                .build();

        PatchCampaignResponse res = sdk.campaign().patchCampaign()
                .request(req)
                .call();

        if (res.campaignPayload().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CampaignUpdateWorkflowInput](../../models/shared/CampaignUpdateWorkflowInput.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PatchCampaignResponse](../../models/operations/PatchCampaignResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/ProblemDetailsException | 400                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |

## postCampaignBulk

Create a list of campaigns with required fields. `ValidationOnly` value should be the same for all campaigns.

### Example Usage

```java
package hello.world;

import com.thetradedesk.workflows.TtdWorkflows;
import com.thetradedesk.workflows.models.components.*;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.PostCampaignBulkResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        TtdWorkflows sdk = TtdWorkflows.builder()
                .ttdAuth("<YOUR_API_KEY_HERE>")
            .build();

        List<CampaignCreateWorkflowInput> req = List.of(
                CampaignCreateWorkflowInput.builder()
                    .primaryInput(CampaignCreateWorkflowPrimaryInput.builder()
                        .advertiserId("<id>")
                        .name("<value>")
                        .primaryChannel(CampaignChannelType.NONE)
                        .primaryGoal(CampaignWorkflowROIGoalInput.builder()
                            .maximizeReach(false)
                            .maximizeLtvIncrementalReach(true)
                            .cpcInAdvertiserCurrency(1087.92)
                            .ctrInPercent(7857.51)
                            .nielsenOTPInPercent(4590.03)
                            .cpaInAdvertiserCurrency(3159.27)
                            .returnOnAdSpendPercent(6083.48)
                            .vcrInPercent(3419.3)
                            .viewabilityInPercent(9282.66)
                            .vcpmInAdvertiserCurrency(8871.73)
                            .cpcvInAdvertiserCurrency(3132.81)
                            .miaozhenOTPInPercent(8003.45)
                            .build())
                        .description("smart worldly onto woot")
                        .timeZone("America/Kralendijk")
                        .customCPAClickWeight(2762.27)
                        .customCPAViewthroughWeight(5943.3)
                        .customCPAType(CustomCPAType.DISABLED)
                        .impressionsOnlyBudgetingCpm(2758.05)
                        .budget(CampaignWorkflowBudgetInput.builder()
                            .pacingMode(CampaignPacingMode.PACE_TO_DAILY_CAP)
                            .budgetInAdvertiserCurrency(5417.34)
                            .budgetInImpressions(821964L)
                            .dailyTargetInAdvertiserCurrency(1697.17)
                            .dailyTargetInImpressions(398351L)
                            .build())
                        .endDateInUtc(OffsetDateTime.parse("2023-08-24T08:55:11.132Z"))
                        .seedId("<id>")
                        .campaignConversionReportingColumns(List.of(
                            CampaignWorkflowConversionReportingColumnInput.builder()
                                .trackingTagId("<id>")
                                .includeInCustomCPA(true)
                                .reportingColumnId(703028)
                                .roasConfig(CustomROASConfig.builder()
                                    .includeInCustomROAS(true)
                                    .customROASWeight(1814.65)
                                    .customROASClickWeight(4282.39)
                                    .customROASViewthroughWeight(4447.49)
                                    .build())
                                .weight(3151.21)
                                .crossDeviceAttributionModelId("<id>")
                                .build(),
                            CampaignWorkflowConversionReportingColumnInput.builder()
                                .trackingTagId("<id>")
                                .includeInCustomCPA(true)
                                .reportingColumnId(331553)
                                .roasConfig(CustomROASConfig.builder()
                                    .includeInCustomROAS(false)
                                    .customROASWeight(4761.15)
                                    .customROASClickWeight(2378.41)
                                    .customROASViewthroughWeight(9085.58)
                                    .build())
                                .weight(3057.19)
                                .crossDeviceAttributionModelId("<id>")
                                .build(),
                            CampaignWorkflowConversionReportingColumnInput.builder()
                                .trackingTagId("<id>")
                                .includeInCustomCPA(true)
                                .reportingColumnId(443742)
                                .roasConfig(CustomROASConfig.builder()
                                    .includeInCustomROAS(false)
                                    .customROASWeight(2014.11)
                                    .customROASClickWeight(1962.45)
                                    .customROASViewthroughWeight(3162.7)
                                    .build())
                                .weight(4033.15)
                                .crossDeviceAttributionModelId("<id>")
                                .build()))
                        .startDateInUtc(OffsetDateTime.parse("2023-05-11T19:43:54.351Z"))
                        .build())
                    .advancedInput(CampaignWorkflowAdvancedInput.builder()
                        .flights(List.of(
                            CampaignWorkflowFlightInput.builder()
                                .startDateInclusiveUTC(OffsetDateTime.parse("2024-04-25T15:59:05.641Z"))
                                .budgetInAdvertiserCurrency(5539.65)
                                .endDateExclusiveUTC(OffsetDateTime.parse("2025-05-17T08:50:28.237Z"))
                                .budgetInImpressions(422521L)
                                .dailyTargetInAdvertiserCurrency(2874.97)
                                .dailyTargetInImpressions(868493L)
                                .build(),
                            CampaignWorkflowFlightInput.builder()
                                .startDateInclusiveUTC(OffsetDateTime.parse("2023-10-06T22:04:36.901Z"))
                                .budgetInAdvertiserCurrency(6454.67)
                                .endDateExclusiveUTC(OffsetDateTime.parse("2024-04-18T20:10:37.392Z"))
                                .budgetInImpressions(549393L)
                                .dailyTargetInAdvertiserCurrency(8083.81)
                                .dailyTargetInImpressions(291618L)
                                .build()))
                        .purchaseOrderNumber("<value>")
                        .build())
                    .adGroups(List.of(
                        CampaignCreateWorkflowAdGroupInput.builder()
                            .primaryInput(AdGroupCreateWorkflowPrimaryInput.builder()
                                .name("<value>")
                                .channel(AdGroupChannel.AUDIO)
                                .funnelLocation(AdGroupFunnelLocation.CONVERSION)
                                .isEnabled(true)
                                .description("sediment nerve duh equally lend blah aha reluctantly")
                                .budget(AdGroupWorkflowBudgetInput.builder()
                                    .allocationType(AllocationType.MAXIMUM)
                                    .budgetInAdvertiserCurrency(3707.15)
                                    .budgetInImpressions(664735L)
                                    .dailyTargetInAdvertiserCurrency(1717.08)
                                    .dailyTargetInImpressions(251940L)
                                    .build())
                                .baseBidCPMInAdvertiserCurrency(7775.47)
                                .maxBidCPMInAdvertiserCurrency(4502.74)
                                .audienceTargeting(AdGroupWorkflowAudienceTargetingInput.builder()
                                    .audienceId("<id>")
                                    .audienceAcceleratorExclusionsEnabled(false)
                                    .audienceBoosterEnabled(false)
                                    .audienceExcluderEnabled(true)
                                    .audiencePredictorEnabled(true)
                                    .crossDeviceVendorListForAudience(List.of(
                                        261292,
                                        89377))
                                    .recencyExclusionWindowInMinutes(23536)
                                    .targetTrackableUsersEnabled(true)
                                    .useMcIdAsPrimary(true)
                                    .build())
                                .roiGoal(AdGroupWorkflowROIGoalInput.builder()
                                    .maximizeReach(false)
                                    .maximizeLtvIncrementalReach(false)
                                    .cpcInAdvertiserCurrency(9399.82)
                                    .ctrInPercent(3118.69)
                                    .nielsenOTPInPercent(9358.84)
                                    .cpaInAdvertiserCurrency(8483.78)
                                    .returnOnAdSpendPercent(8626.31)
                                    .vcrInPercent(8829.21)
                                    .viewabilityInPercent(571.67)
                                    .vcpmInAdvertiserCurrency(1675.48)
                                    .cpcvInAdvertiserCurrency(9423.3)
                                    .miaozhenOTPInPercent(4806.49)
                                    .build())
                                .creativeIds(List.of(
                                    "<value>",
                                    "<value>",
                                    "<value>"))
                                .associatedBidLists(List.of(
                                    AdGroupWorkflowAssociateBidListInput.builder()
                                        .bidListId("<id>")
                                        .isEnabled(true)
                                        .isDefaultForDimension(false)
                                        .build()))
                                .programmaticGuaranteedPrivateContractId("<id>")
                                .build())
                            .advancedInput(CampaignCreateWorkflowAdGroupAdvancedInput.builder()
                                .koaOptimizationSettings(AdGroupWorkflowKoaOptimizationSettingsInput.builder()
                                    .areFutureKoaFeaturesEnabled(false)
                                    .predictiveClearingEnabled(true)
                                    .build())
                                .comscoreSettings(AdGroupWorkflowComscoreSettingsInput.builder()
                                    .isEnabled(true)
                                    .populationId(549853)
                                    .demographicMemberIds(List.of(
                                        75953))
                                    .mobileDemographicMemberIds(List.of(
                                        869836,
                                        192225,
                                        899573))
                                    .build())
                                .contractTargeting(AdGroupWorkflowContractTargetingInput.builder()
                                    .allowOpenMarketBiddingWhenTargetingContracts(false)
                                    .build())
                                .dimensionalBiddingAutoOptimizationSettings(List.of(
                                    List.of(
                                    ),
                                    List.of(
                                        DimensionalBiddingDimensions.HAS_VIDEO_MUTED_STATE_ID),
                                    List.of(
                                        DimensionalBiddingDimensions.HAS_AUDIENCE_REACH_PERCENTAGE_TIER_ID,
                                        DimensionalBiddingDimensions.HAS_AD_LOAD_CATEGORY,
                                        DimensionalBiddingDimensions.HAS_THIRD_PARTY_DATA)))
                                .isUseClicksAsConversionsEnabled(true)
                                .isUseSecondaryConversionsEnabled(false)
                                .nielsenTrackingAttributes(AdGroupWorkflowNielsenTrackingAttributesInput.builder()
                                    .gender(TargetingGender.FEMALE)
                                    .startAge(TargetingStartAge.THIRTY_FIVE)
                                    .endAge(TargetingEndAge.FORTY_FOUR)
                                    .countries(List.of(
                                        "<value>",
                                        "<value>"))
                                    .enhancedReportingOption(EnhancedNielsenReportingOptions.NONE)
                                    .build())
                                .newFrequencyConfigs(List.of(
                                    AdGroupWorkflowNewFrequencyConfigInput.builder()
                                        .counterName("<value>")
                                        .frequencyCap(360043)
                                        .frequencyGoal(965696)
                                        .resetIntervalInMinutes(860037)
                                        .build(),
                                    AdGroupWorkflowNewFrequencyConfigInput.builder()
                                        .counterName("<value>")
                                        .frequencyCap(344075)
                                        .frequencyGoal(136066)
                                        .resetIntervalInMinutes(373611)
                                        .build(),
                                    AdGroupWorkflowNewFrequencyConfigInput.builder()
                                        .counterName("<value>")
                                        .frequencyCap(258101)
                                        .frequencyGoal(118163)
                                        .resetIntervalInMinutes(721137)
                                        .build()))
                                .flights(List.of(
                                    CampaignCreateWorkflowAdGroupFlightInput.builder()
                                        .allocationType(AllocationType.MINIMUM)
                                        .budgetInAdvertiserCurrency(2624.72)
                                        .budgetInImpressions(976218L)
                                        .dailyTargetInAdvertiserCurrency(7465.95)
                                        .dailyTargetInImpressions(995275L)
                                        .build(),
                                    CampaignCreateWorkflowAdGroupFlightInput.builder()
                                        .allocationType(AllocationType.MINIMUM)
                                        .budgetInAdvertiserCurrency(7520.92)
                                        .budgetInImpressions(901010L)
                                        .dailyTargetInAdvertiserCurrency(1232.28)
                                        .dailyTargetInImpressions(740317L)
                                        .build(),
                                    CampaignCreateWorkflowAdGroupFlightInput.builder()
                                        .allocationType(AllocationType.MAXIMUM)
                                        .budgetInAdvertiserCurrency(8257.73)
                                        .budgetInImpressions(85457L)
                                        .dailyTargetInAdvertiserCurrency(7173.67)
                                        .dailyTargetInImpressions(81726L)
                                        .build()))
                                .build())
                            .build(),
                        CampaignCreateWorkflowAdGroupInput.builder()
                            .primaryInput(AdGroupCreateWorkflowPrimaryInput.builder()
                                .name("<value>")
                                .channel(AdGroupChannel.TV)
                                .funnelLocation(AdGroupFunnelLocation.AWARENESS)
                                .isEnabled(true)
                                .description("absent valuable gruesome shyly where till subsidy")
                                .budget(AdGroupWorkflowBudgetInput.builder()
                                    .allocationType(AllocationType.FIXED)
                                    .budgetInAdvertiserCurrency(1639.17)
                                    .budgetInImpressions(428972L)
                                    .dailyTargetInAdvertiserCurrency(1190.66)
                                    .dailyTargetInImpressions(732688L)
                                    .build())
                                .baseBidCPMInAdvertiserCurrency(5613.5)
                                .maxBidCPMInAdvertiserCurrency(9770.39)
                                .audienceTargeting(AdGroupWorkflowAudienceTargetingInput.builder()
                                    .audienceId("<id>")
                                    .audienceAcceleratorExclusionsEnabled(true)
                                    .audienceBoosterEnabled(false)
                                    .audienceExcluderEnabled(true)
                                    .audiencePredictorEnabled(true)
                                    .crossDeviceVendorListForAudience(List.of(
                                        606453,
                                        44469,
                                        455948))
                                    .recencyExclusionWindowInMinutes(949741)
                                    .targetTrackableUsersEnabled(false)
                                    .useMcIdAsPrimary(false)
                                    .build())
                                .roiGoal(AdGroupWorkflowROIGoalInput.builder()
                                    .maximizeReach(true)
                                    .maximizeLtvIncrementalReach(false)
                                    .cpcInAdvertiserCurrency(7839.82)
                                    .ctrInPercent(3117.69)
                                    .nielsenOTPInPercent(7799.56)
                                    .cpaInAdvertiserCurrency(3711.12)
                                    .returnOnAdSpendPercent(5368.14)
                                    .vcrInPercent(1599.94)
                                    .viewabilityInPercent(4701.02)
                                    .vcpmInAdvertiserCurrency(5819.43)
                                    .cpcvInAdvertiserCurrency(5672.37)
                                    .miaozhenOTPInPercent(9104.31)
                                    .build())
                                .creativeIds(List.of(
                                    "<value>"))
                                .associatedBidLists(List.of(
                                    AdGroupWorkflowAssociateBidListInput.builder()
                                        .bidListId("<id>")
                                        .isEnabled(false)
                                        .isDefaultForDimension(false)
                                        .build(),
                                    AdGroupWorkflowAssociateBidListInput.builder()
                                        .bidListId("<id>")
                                        .isEnabled(false)
                                        .isDefaultForDimension(false)
                                        .build()))
                                .programmaticGuaranteedPrivateContractId("<id>")
                                .build())
                            .advancedInput(CampaignCreateWorkflowAdGroupAdvancedInput.builder()
                                .koaOptimizationSettings(AdGroupWorkflowKoaOptimizationSettingsInput.builder()
                                    .areFutureKoaFeaturesEnabled(false)
                                    .predictiveClearingEnabled(true)
                                    .build())
                                .comscoreSettings(AdGroupWorkflowComscoreSettingsInput.builder()
                                    .isEnabled(false)
                                    .populationId(353367)
                                    .demographicMemberIds(List.of(
                                        615697,
                                        643154))
                                    .mobileDemographicMemberIds(List.of(
                                        297484,
                                        444326,
                                        466904))
                                    .build())
                                .contractTargeting(AdGroupWorkflowContractTargetingInput.builder()
                                    .allowOpenMarketBiddingWhenTargetingContracts(true)
                                    .build())
                                .dimensionalBiddingAutoOptimizationSettings(List.of(
                                    List.of(
                                        DimensionalBiddingDimensions.HAS_FREQUENCY_ADJUSTMENT_ID),
                                    List.of(
                                        DimensionalBiddingDimensions.HAS_CONTENT_LIVESTREAM,
                                        DimensionalBiddingDimensions.HAS_RENDERING_CONTEXT_ID,
                                        DimensionalBiddingDimensions.HAS_DOMAIN_CLASS_ID)))
                                .isUseClicksAsConversionsEnabled(true)
                                .isUseSecondaryConversionsEnabled(false)
                                .nielsenTrackingAttributes(AdGroupWorkflowNielsenTrackingAttributesInput.builder()
                                    .gender(TargetingGender.MALE)
                                    .startAge(TargetingStartAge.TWENTY_FIVE)
                                    .endAge(TargetingEndAge.SIXTY_FOUR)
                                    .countries(List.of(
                                        "<value>",
                                        "<value>"))
                                    .enhancedReportingOption(EnhancedNielsenReportingOptions.NONE)
                                    .build())
                                .newFrequencyConfigs(List.of(
                                    AdGroupWorkflowNewFrequencyConfigInput.builder()
                                        .counterName("<value>")
                                        .frequencyCap(582809)
                                        .frequencyGoal(714168)
                                        .resetIntervalInMinutes(788864)
                                        .build()))
                                .flights(List.of(
                                    CampaignCreateWorkflowAdGroupFlightInput.builder()
                                        .allocationType(AllocationType.MAXIMUM)
                                        .budgetInAdvertiserCurrency(2670.46)
                                        .budgetInImpressions(464053L)
                                        .dailyTargetInAdvertiserCurrency(2346.64)
                                        .dailyTargetInImpressions(168258L)
                                        .build(),
                                    CampaignCreateWorkflowAdGroupFlightInput.builder()
                                        .allocationType(AllocationType.MINIMUM)
                                        .budgetInAdvertiserCurrency(8824.72)
                                        .budgetInImpressions(517318L)
                                        .dailyTargetInAdvertiserCurrency(3976.56)
                                        .dailyTargetInImpressions(85485L)
                                        .build(),
                                    CampaignCreateWorkflowAdGroupFlightInput.builder()
                                        .allocationType(AllocationType.MINIMUM)
                                        .budgetInAdvertiserCurrency(3119.46)
                                        .budgetInImpressions(425344L)
                                        .dailyTargetInAdvertiserCurrency(3450.15)
                                        .dailyTargetInImpressions(280049L)
                                        .build()))
                                .build())
                            .build(),
                        CampaignCreateWorkflowAdGroupInput.builder()
                            .primaryInput(AdGroupCreateWorkflowPrimaryInput.builder()
                                .name("<value>")
                                .channel(AdGroupChannel.NATIVE_VIDEO)
                                .funnelLocation(AdGroupFunnelLocation.NONE)
                                .isEnabled(false)
                                .description("archive amid typewriter careless")
                                .budget(AdGroupWorkflowBudgetInput.builder()
                                    .allocationType(AllocationType.MINIMUM)
                                    .budgetInAdvertiserCurrency(7501.99)
                                    .budgetInImpressions(614609L)
                                    .dailyTargetInAdvertiserCurrency(2906.22)
                                    .dailyTargetInImpressions(801561L)
                                    .build())
                                .baseBidCPMInAdvertiserCurrency(3102.42)
                                .maxBidCPMInAdvertiserCurrency(1452.26)
                                .audienceTargeting(AdGroupWorkflowAudienceTargetingInput.builder()
                                    .audienceId("<id>")
                                    .audienceAcceleratorExclusionsEnabled(true)
                                    .audienceBoosterEnabled(false)
                                    .audienceExcluderEnabled(true)
                                    .audiencePredictorEnabled(true)
                                    .crossDeviceVendorListForAudience(List.of(
                                        909931))
                                    .recencyExclusionWindowInMinutes(91561)
                                    .targetTrackableUsersEnabled(false)
                                    .useMcIdAsPrimary(false)
                                    .build())
                                .roiGoal(AdGroupWorkflowROIGoalInput.builder()
                                    .maximizeReach(false)
                                    .maximizeLtvIncrementalReach(false)
                                    .cpcInAdvertiserCurrency(3839.86)
                                    .ctrInPercent(2480.51)
                                    .nielsenOTPInPercent(5257.21)
                                    .cpaInAdvertiserCurrency(7546.84)
                                    .returnOnAdSpendPercent(737.38)
                                    .vcrInPercent(9027.15)
                                    .viewabilityInPercent(606.63)
                                    .vcpmInAdvertiserCurrency(7254.65)
                                    .cpcvInAdvertiserCurrency(4470.71)
                                    .miaozhenOTPInPercent(9684.09)
                                    .build())
                                .creativeIds(List.of(
                                    "<value>",
                                    "<value>"))
                                .associatedBidLists(List.of(
                                    AdGroupWorkflowAssociateBidListInput.builder()
                                        .bidListId("<id>")
                                        .isEnabled(true)
                                        .isDefaultForDimension(false)
                                        .build(),
                                    AdGroupWorkflowAssociateBidListInput.builder()
                                        .bidListId("<id>")
                                        .isEnabled(true)
                                        .isDefaultForDimension(true)
                                        .build(),
                                    AdGroupWorkflowAssociateBidListInput.builder()
                                        .bidListId("<id>")
                                        .isEnabled(false)
                                        .isDefaultForDimension(false)
                                        .build()))
                                .programmaticGuaranteedPrivateContractId("<id>")
                                .build())
                            .advancedInput(CampaignCreateWorkflowAdGroupAdvancedInput.builder()
                                .koaOptimizationSettings(AdGroupWorkflowKoaOptimizationSettingsInput.builder()
                                    .areFutureKoaFeaturesEnabled(true)
                                    .predictiveClearingEnabled(true)
                                    .build())
                                .comscoreSettings(AdGroupWorkflowComscoreSettingsInput.builder()
                                    .isEnabled(true)
                                    .populationId(478825)
                                    .demographicMemberIds(List.of(
                                        811346,
                                        376746))
                                    .mobileDemographicMemberIds(List.of(
                                        430775))
                                    .build())
                                .contractTargeting(AdGroupWorkflowContractTargetingInput.builder()
                                    .allowOpenMarketBiddingWhenTargetingContracts(true)
                                    .build())
                                .dimensionalBiddingAutoOptimizationSettings(List.of(
                                    List.of(
                                    )))
                                .isUseClicksAsConversionsEnabled(false)
                                .isUseSecondaryConversionsEnabled(true)
                                .nielsenTrackingAttributes(AdGroupWorkflowNielsenTrackingAttributesInput.builder()
                                    .gender(TargetingGender.BOTH)
                                    .startAge(TargetingStartAge.TWENTY_FIVE)
                                    .endAge(TargetingEndAge.FORTY_FOUR)
                                    .countries(List.of(
                                    ))
                                    .enhancedReportingOption(EnhancedNielsenReportingOptions.AUDIENCE)
                                    .build())
                                .newFrequencyConfigs(List.of(
                                    AdGroupWorkflowNewFrequencyConfigInput.builder()
                                        .counterName("<value>")
                                        .frequencyCap(178224)
                                        .frequencyGoal(365705)
                                        .resetIntervalInMinutes(509377)
                                        .build(),
                                    AdGroupWorkflowNewFrequencyConfigInput.builder()
                                        .counterName("<value>")
                                        .frequencyCap(933396)
                                        .frequencyGoal(270385)
                                        .resetIntervalInMinutes(991790)
                                        .build()))
                                .flights(List.of(
                                    CampaignCreateWorkflowAdGroupFlightInput.builder()
                                        .allocationType(AllocationType.MINIMUM)
                                        .budgetInAdvertiserCurrency(1291.85)
                                        .budgetInImpressions(732169L)
                                        .dailyTargetInAdvertiserCurrency(6182.19)
                                        .dailyTargetInImpressions(584980L)
                                        .build()))
                                .build())
                            .build()))
                    .validationOnly(false)
                    .build());

        PostCampaignBulkResponse res = sdk.campaign().postCampaignBulk()
                .request(req)
                .call();

        if (res.bulkJobSubmitResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                              | Type                                                   | Required                                               | Description                                            |
| ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ |
| `request`                                              | [List<CampaignCreateWorkflowInput>](../../models//.md) | :heavy_check_mark:                                     | The request object to use for the request.             |

### Response

**[PostCampaignBulkResponse](../../models/operations/PostCampaignBulkResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/ProblemDetailsException | 400, 403                              | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |

## postCampaignArchive

Archive a list of campaigns

### Example Usage

```java
package hello.world;

import com.thetradedesk.workflows.TtdWorkflows;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.PostCampaignArchiveResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        TtdWorkflows sdk = TtdWorkflows.builder()
                .ttdAuth("<YOUR_API_KEY_HERE>")
            .build();

        PostCampaignArchiveResponse res = sdk.campaign().postCampaignArchive()
                .requestBody(List.of(
                    "<value>",
                    "<value>",
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

**[PostCampaignArchiveResponse](../../models/operations/PostCampaignArchiveResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/ProblemDetailsException | 400, 403                              | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |

## getVersion

GET a campaign's version

### Example Usage

```java
package hello.world;

import com.thetradedesk.workflows.TtdWorkflows;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.GetCampaignIdVersionResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        TtdWorkflows sdk = TtdWorkflows.builder()
                .ttdAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetCampaignIdVersionResponse res = sdk.campaign().getVersion()
                .id("<id>")
                .call();

        if (res.campaignVersionWorkflow().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `id`               | *String*           | :heavy_check_mark: | N/A                |

### Response

**[GetCampaignIdVersionResponse](../../models/operations/GetCampaignIdVersionResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/ProblemDetailsException | 400, 401, 403, 404                    | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |