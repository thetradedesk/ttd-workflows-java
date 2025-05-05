# Campaign
(*campaign()*)

## Overview

### Available Operations

* [create](#create) - Create a new campaign with required fields
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
                .campaignCreateWorkflowPrimaryInput(CampaignCreateWorkflowPrimaryInput.builder()
                    .advertiserId("<id>")
                    .name("<value>")
                    .primaryChannel(CampaignChannelType.AUDIO)
                    .primaryGoal(CampaignCreateROIGoalWorkflow.builder()
                        .maximizeReach(false)
                        .maximizeLtvIncrementalReach(true)
                        .cpcInAdvertiserCurrency(1296.63)
                        .ctrInPercent(2881.04)
                        .nielsenOTPInPercent(5833.53)
                        .cpaInAdvertiserCurrency(5193.59)
                        .returnOnAdSpendPercent(3259.9)
                        .vcrInPercent(4078.33)
                        .viewabilityInPercent(1012.51)
                        .vcpmInAdvertiserCurrency(1884.35)
                        .cpcvInAdvertiserCurrency(8133.97)
                        .miaozhenOTPInPercent(8891.64)
                        .build())
                    .description("yuck vice between gee ugh ha")
                    .timeZone("Pacific/Chuuk")
                    .customCPAClickWeight(7804.86)
                    .customCPAViewthroughWeight(7602.59)
                    .customCPAType(CustomCPAType.DISABLED)
                    .impressionsOnlyBudgetingCpm(4492.21)
                    .budget(BudgetWorkflow.builder()
                        .pacingMode(CampaignPacingMode.PACE_TO_DAILY_CAP)
                        .budgetInAdvertiserCurrency(934.7)
                        .budgetInImpressions(491427L)
                        .dailyTargetInAdvertiserCurrency(4904.2)
                        .dailyTargetInImpressions(325463L)
                        .build())
                    .startDateInUtc(OffsetDateTime.parse("2023-01-06T22:59:38.009Z"))
                    .endDateInUtc(OffsetDateTime.parse("2025-09-26T06:26:29.839Z"))
                    .seedId("<id>")
                    .campaignConversionReportingColumns(List.of(
                        CampaignConversionReportingColumnWorkflow.builder()
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
                            .build(),
                        CampaignConversionReportingColumnWorkflow.builder()
                            .trackingTagId("<id>")
                            .includeInCustomCPA(true)
                            .reportingColumnId(860420)
                            .roasConfig(CustomROASConfig.builder()
                                .includeInCustomROAS(false)
                                .customROASWeight(5665.12)
                                .customROASClickWeight(2955.58)
                                .customROASViewthroughWeight(2032.57)
                                .build())
                            .weight(4332.24)
                            .crossDeviceAttributionModelId("<id>")
                            .build(),
                        CampaignConversionReportingColumnWorkflow.builder()
                            .trackingTagId("<id>")
                            .includeInCustomCPA(false)
                            .reportingColumnId(995852)
                            .roasConfig(CustomROASConfig.builder()
                                .includeInCustomROAS(false)
                                .customROASWeight(2127.75)
                                .customROASClickWeight(6207.47)
                                .customROASViewthroughWeight(2841.2)
                                .build())
                            .weight(6083.84)
                            .crossDeviceAttributionModelId("<id>")
                            .build()))
                    .build())
                .campaignCreateAdvancedInput(CampaignCreateWorkflowAdvancedInput.builder()
                    .flights(List.of(
                        CampaignFlightWorkflowInput.builder()
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
                    CampaignCreateAdGroupInput.builder()
                        .name("<value>")
                        .channel(AdGroupChannel.NATIVE_VIDEO)
                        .funnelLocation(AdGroupFunnelLocation.NONE)
                        .isEnabled(false)
                        .description("simple ouch when pfft ah")
                        .programmaticGuaranteedPrivateContractId("<id>")
                        .budget(AdGroupBudgetInput.builder()
                            .allocationType(AllocationType.MAXIMUM)
                            .budgetInAdvertiserCurrency(6290.63)
                            .budgetInImpressions(784768L)
                            .dailyTargetInAdvertiserCurrency(3385.24)
                            .dailyTargetInImpressions(913221L)
                            .build())
                        .baseBidCPMInAdvertiserCurrency(1541.5)
                        .maxBidCPMInAdvertiserCurrency(7218.8)
                        .audienceTargeting(AdGroupAudienceTargetingInput.builder()
                            .audienceId("<id>")
                            .audienceAcceleratorExclusionsEnabled(false)
                            .audienceBoosterEnabled(false)
                            .audienceExcluderEnabled(true)
                            .audiencePredictorEnabled(false)
                            .crossDeviceVendorListForAudience(List.of(
                                257762))
                            .recencyExclusionWindowInMinutes(982866)
                            .targetTrackableUsersEnabled(true)
                            .useMcIdAsPrimary(true)
                            .build())
                        .roiGoal(AdGroupRoiGoalInput.builder()
                            .maximizeReach(false)
                            .maximizeLtvIncrementalReach(true)
                            .cpcInAdvertiserCurrency(3831.56)
                            .ctrInPercent(5720.12)
                            .nielsenOTPInPercent(9789.08)
                            .cpaInAdvertiserCurrency(1850.76)
                            .returnOnAdSpendPercent(6168.92)
                            .vcrInPercent(9775.91)
                            .viewabilityInPercent(1909.73)
                            .vcpmInAdvertiserCurrency(3141.79)
                            .cpcvInAdvertiserCurrency(8272.61)
                            .miaozhenOTPInPercent(7609.47)
                            .build())
                        .creativeIds(List.of(
                            "<value>",
                            "<value>"))
                        .associatedBidLists(List.of(
                            AdGroupAssociateBidListInput.builder()
                                .bidListId("<id>")
                                .isEnabled(false)
                                .isDefaultForDimension(false)
                                .build()))
                        .advancedSettings(CampaignCreateAdGroupAdvancedSettingsInput.builder()
                            .koaOptimizationSettings(AdGroupKoaOptimizationSettingsInput.builder()
                                .areFutureKoaFeaturesEnabled(false)
                                .predictiveClearingEnabled(true)
                                .build())
                            .comscoreSettings(AdGroupComscoreSettingsInput.builder()
                                .isEnabled(true)
                                .populationId(838181)
                                .demographicMemberIds(List.of(
                                    188907,
                                    713191,
                                    883321))
                                .mobileDemographicMemberIds(List.of(
                                    199311,
                                    564854,
                                    665035))
                                .build())
                            .contractTargeting(AdGroupContractTargetingInput.builder()
                                .allowOpenMarketBiddingWhenTargetingContracts(false)
                                .build())
                            .dimensionalBiddingAutoOptimizationSettings(List.of(
                                List.of(
                                )))
                            .isUseClicksAsConversionsEnabled(false)
                            .isUseSecondaryConversionsEnabled(false)
                            .nielsenTrackingAttributes(AdGroupNielsenTrackingAttributesInput.builder()
                                .gender(TargetingGender.FEMALE)
                                .startAge(TargetingStartAge.FORTY_FIVE)
                                .endAge(TargetingEndAge.TWENTY_NINE)
                                .countries(List.of(
                                    "<value>"))
                                .enhancedReportingOption(EnhancedNielsenReportingOptions.SITE)
                                .build())
                            .newFrequencyConfigs(List.of(
                                AdGroupNewFrequencyConfigInput.builder()
                                    .counterName("<value>")
                                    .frequencyCap(400422)
                                    .frequencyGoal(257433)
                                    .resetIntervalInMinutes(229175)
                                    .build(),
                                AdGroupNewFrequencyConfigInput.builder()
                                    .counterName("<value>")
                                    .frequencyCap(453975)
                                    .frequencyGoal(149413)
                                    .resetIntervalInMinutes(409874)
                                    .build()))
                            .flights(List.of(
                                CampaignCreateAdGroupFlightInput.builder()
                                    .allocationType(AllocationType.FIXED)
                                    .budgetInAdvertiserCurrency(323.3)
                                    .budgetInImpressions(514645L)
                                    .dailyTargetInAdvertiserCurrency(8844.14)
                                    .dailyTargetInImpressions(339267L)
                                    .build(),
                                CampaignCreateAdGroupFlightInput.builder()
                                    .allocationType(AllocationType.MINIMUM)
                                    .budgetInAdvertiserCurrency(8854.11)
                                    .budgetInImpressions(903800L)
                                    .dailyTargetInAdvertiserCurrency(5579.25)
                                    .dailyTargetInImpressions(643654L)
                                    .build()))
                            .build())
                        .build(),
                    CampaignCreateAdGroupInput.builder()
                        .name("<value>")
                        .channel(AdGroupChannel.AUDIO)
                        .funnelLocation(AdGroupFunnelLocation.AWARENESS)
                        .isEnabled(false)
                        .description("given satisfy majority pace however crocodile yowza knowingly abaft")
                        .programmaticGuaranteedPrivateContractId("<id>")
                        .budget(AdGroupBudgetInput.builder()
                            .allocationType(AllocationType.MAXIMUM)
                            .budgetInAdvertiserCurrency(7806.19)
                            .budgetInImpressions(738493L)
                            .dailyTargetInAdvertiserCurrency(1585.7)
                            .dailyTargetInImpressions(473588L)
                            .build())
                        .baseBidCPMInAdvertiserCurrency(9915.94)
                        .maxBidCPMInAdvertiserCurrency(4475.13)
                        .audienceTargeting(AdGroupAudienceTargetingInput.builder()
                            .audienceId("<id>")
                            .audienceAcceleratorExclusionsEnabled(false)
                            .audienceBoosterEnabled(false)
                            .audienceExcluderEnabled(false)
                            .audiencePredictorEnabled(false)
                            .crossDeviceVendorListForAudience(List.of(
                                681367,
                                962535,
                                128582))
                            .recencyExclusionWindowInMinutes(288002)
                            .targetTrackableUsersEnabled(false)
                            .useMcIdAsPrimary(true)
                            .build())
                        .roiGoal(AdGroupRoiGoalInput.builder()
                            .maximizeReach(false)
                            .maximizeLtvIncrementalReach(false)
                            .cpcInAdvertiserCurrency(87.86)
                            .ctrInPercent(9921.62)
                            .nielsenOTPInPercent(6912.82)
                            .cpaInAdvertiserCurrency(8566.65)
                            .returnOnAdSpendPercent(4228.11)
                            .vcrInPercent(2102.57)
                            .viewabilityInPercent(7843.09)
                            .vcpmInAdvertiserCurrency(9390.93)
                            .cpcvInAdvertiserCurrency(7040.61)
                            .miaozhenOTPInPercent(3743.92)
                            .build())
                        .creativeIds(List.of(
                            "<value>",
                            "<value>"))
                        .associatedBidLists(List.of(
                            AdGroupAssociateBidListInput.builder()
                                .bidListId("<id>")
                                .isEnabled(true)
                                .isDefaultForDimension(true)
                                .build(),
                            AdGroupAssociateBidListInput.builder()
                                .bidListId("<id>")
                                .isEnabled(false)
                                .isDefaultForDimension(true)
                                .build()))
                        .advancedSettings(CampaignCreateAdGroupAdvancedSettingsInput.builder()
                            .koaOptimizationSettings(AdGroupKoaOptimizationSettingsInput.builder()
                                .areFutureKoaFeaturesEnabled(true)
                                .predictiveClearingEnabled(false)
                                .build())
                            .comscoreSettings(AdGroupComscoreSettingsInput.builder()
                                .isEnabled(true)
                                .populationId(909366)
                                .demographicMemberIds(List.of(
                                    702911))
                                .mobileDemographicMemberIds(List.of(
                                    778851,
                                    468734))
                                .build())
                            .contractTargeting(AdGroupContractTargetingInput.builder()
                                .allowOpenMarketBiddingWhenTargetingContracts(true)
                                .build())
                            .dimensionalBiddingAutoOptimizationSettings(List.of(
                                List.of(
                                    DimensionalBiddingDimensions.HAS_INTEGRAL_VIDEO_BRAND_SAFETY_CATEGORY_ID)))
                            .isUseClicksAsConversionsEnabled(true)
                            .isUseSecondaryConversionsEnabled(true)
                            .nielsenTrackingAttributes(AdGroupNielsenTrackingAttributesInput.builder()
                                .gender(TargetingGender.MALE)
                                .startAge(TargetingStartAge.EIGHTEEN)
                                .endAge(TargetingEndAge.FORTY_FOUR)
                                .countries(List.of(
                                    "<value>"))
                                .enhancedReportingOption(EnhancedNielsenReportingOptions.SITE)
                                .build())
                            .newFrequencyConfigs(List.of(
                                AdGroupNewFrequencyConfigInput.builder()
                                    .counterName("<value>")
                                    .frequencyCap(637441)
                                    .frequencyGoal(855423)
                                    .resetIntervalInMinutes(967917)
                                    .build()))
                            .flights(List.of(
                                CampaignCreateAdGroupFlightInput.builder()
                                    .allocationType(AllocationType.MAXIMUM)
                                    .budgetInAdvertiserCurrency(5801.25)
                                    .budgetInImpressions(28608L)
                                    .dailyTargetInAdvertiserCurrency(3169.07)
                                    .dailyTargetInImpressions(48554L)
                                    .build(),
                                CampaignCreateAdGroupFlightInput.builder()
                                    .allocationType(AllocationType.MINIMUM)
                                    .budgetInAdvertiserCurrency(7325.7)
                                    .budgetInImpressions(478027L)
                                    .dailyTargetInAdvertiserCurrency(9133.85)
                                    .dailyTargetInImpressions(65097L)
                                    .build()))
                            .build())
                        .build()))
                .validationOnly(false)
                .build();

        PostCampaignResponse res = sdk.campaign().create()
                .request(req)
                .call();

        if (res.campaignSinglePayload().isPresent()) {
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
                    .campaignCreateWorkflowPrimaryInput(CampaignCreateWorkflowPrimaryInput.builder()
                        .advertiserId("<id>")
                        .name("<value>")
                        .primaryChannel(CampaignChannelType.VIDEO)
                        .primaryGoal(CampaignCreateROIGoalWorkflow.builder()
                            .maximizeReach(true)
                            .maximizeLtvIncrementalReach(true)
                            .cpcInAdvertiserCurrency(5100.58)
                            .ctrInPercent(2014.11)
                            .nielsenOTPInPercent(1962.45)
                            .cpaInAdvertiserCurrency(3162.7)
                            .returnOnAdSpendPercent(4033.15)
                            .vcrInPercent(576.36)
                            .viewabilityInPercent(6937.09)
                            .vcpmInAdvertiserCurrency(4907.71)
                            .cpcvInAdvertiserCurrency(1087.92)
                            .miaozhenOTPInPercent(7857.51)
                            .build())
                        .description("quarrelsome nimble fuss greedily slime dramatic")
                        .timeZone("America/Belize")
                        .customCPAClickWeight(4282.39)
                        .customCPAViewthroughWeight(4447.49)
                        .customCPAType(CustomCPAType.DISABLED)
                        .impressionsOnlyBudgetingCpm(223.53)
                        .budget(BudgetWorkflow.builder()
                            .pacingMode(CampaignPacingMode.PACE_TO_DAILY_CAP)
                            .budgetInAdvertiserCurrency(4761.15)
                            .budgetInImpressions(237841L)
                            .dailyTargetInAdvertiserCurrency(9085.58)
                            .dailyTargetInImpressions(305719L)
                            .build())
                        .startDateInUtc(OffsetDateTime.parse("2024-05-18T01:36:37.822Z"))
                        .endDateInUtc(OffsetDateTime.parse("2023-12-13T06:09:37.218Z"))
                        .seedId("<id>")
                        .campaignConversionReportingColumns(List.of(
                            CampaignConversionReportingColumnWorkflow.builder()
                                .trackingTagId("<id>")
                                .includeInCustomCPA(true)
                                .reportingColumnId(928266)
                                .roasConfig(CustomROASConfig.builder()
                                    .includeInCustomROAS(false)
                                    .customROASWeight(3132.81)
                                    .customROASClickWeight(8003.45)
                                    .customROASViewthroughWeight(1193.63)
                                    .build())
                                .weight(4966.24)
                                .crossDeviceAttributionModelId("<id>")
                                .build(),
                            CampaignConversionReportingColumnWorkflow.builder()
                                .trackingTagId("<id>")
                                .includeInCustomCPA(true)
                                .reportingColumnId(791395)
                                .roasConfig(CustomROASConfig.builder()
                                    .includeInCustomROAS(false)
                                    .customROASWeight(4225.21)
                                    .customROASClickWeight(2874.97)
                                    .customROASViewthroughWeight(8684.93)
                                    .build())
                                .weight(2544.89)
                                .crossDeviceAttributionModelId("<id>")
                                .build()))
                        .build())
                    .campaignCreateAdvancedInput(CampaignCreateWorkflowAdvancedInput.builder()
                        .flights(List.of(
                            CampaignFlightWorkflowInput.builder()
                                .startDateInclusiveUTC(OffsetDateTime.parse("2024-12-08T10:20:56.542Z"))
                                .budgetInAdvertiserCurrency(8083.81)
                                .endDateExclusiveUTC(OffsetDateTime.parse("2024-08-25T03:13:30.407Z"))
                                .budgetInImpressions(291618L)
                                .dailyTargetInAdvertiserCurrency(4734.03)
                                .dailyTargetInImpressions(661092L)
                                .build(),
                            CampaignFlightWorkflowInput.builder()
                                .startDateInclusiveUTC(OffsetDateTime.parse("2023-08-15T10:26:52.566Z"))
                                .budgetInAdvertiserCurrency(407.04)
                                .endDateExclusiveUTC(OffsetDateTime.parse("2024-09-05T22:25:31.049Z"))
                                .budgetInImpressions(995084L)
                                .dailyTargetInAdvertiserCurrency(7866.35)
                                .dailyTargetInImpressions(714765L)
                                .build()))
                        .purchaseOrderNumber("<value>")
                        .build())
                    .adGroups(List.of(
                        CampaignCreateAdGroupInput.builder()
                            .name("<value>")
                            .channel(AdGroupChannel.VIDEO)
                            .funnelLocation(AdGroupFunnelLocation.AWARENESS)
                            .isEnabled(false)
                            .description("mmm validity times pro")
                            .programmaticGuaranteedPrivateContractId("<id>")
                            .budget(AdGroupBudgetInput.builder()
                                .allocationType(AllocationType.MINIMUM)
                                .budgetInAdvertiserCurrency(1349.27)
                                .budgetInImpressions(76524L)
                                .dailyTargetInAdvertiserCurrency(6197.34)
                                .dailyTargetInImpressions(40746L)
                                .build())
                            .baseBidCPMInAdvertiserCurrency(5534.59)
                            .maxBidCPMInAdvertiserCurrency(6326.42)
                            .audienceTargeting(AdGroupAudienceTargetingInput.builder()
                                .audienceId("<id>")
                                .audienceAcceleratorExclusionsEnabled(true)
                                .audienceBoosterEnabled(false)
                                .audienceExcluderEnabled(true)
                                .audiencePredictorEnabled(true)
                                .crossDeviceVendorListForAudience(List.of(
                                    465521,
                                    178176,
                                    260829))
                                .recencyExclusionWindowInMinutes(409655)
                                .targetTrackableUsersEnabled(false)
                                .useMcIdAsPrimary(true)
                                .build())
                            .roiGoal(AdGroupRoiGoalInput.builder()
                                .maximizeReach(false)
                                .maximizeLtvIncrementalReach(false)
                                .cpcInAdvertiserCurrency(3707.15)
                                .ctrInPercent(6647.35)
                                .nielsenOTPInPercent(1717.08)
                                .cpaInAdvertiserCurrency(2519.4)
                                .returnOnAdSpendPercent(7775.47)
                                .vcrInPercent(4502.74)
                                .viewabilityInPercent(5060.79)
                                .vcpmInAdvertiserCurrency(5526.97)
                                .cpcvInAdvertiserCurrency(4219.33)
                                .miaozhenOTPInPercent(1381.33)
                                .build())
                            .creativeIds(List.of(
                                "<value>",
                                "<value>"))
                            .associatedBidLists(List.of(
                                AdGroupAssociateBidListInput.builder()
                                    .bidListId("<id>")
                                    .isEnabled(true)
                                    .isDefaultForDimension(true)
                                    .build()))
                            .advancedSettings(CampaignCreateAdGroupAdvancedSettingsInput.builder()
                                .koaOptimizationSettings(AdGroupKoaOptimizationSettingsInput.builder()
                                    .areFutureKoaFeaturesEnabled(true)
                                    .predictiveClearingEnabled(true)
                                    .build())
                                .comscoreSettings(AdGroupComscoreSettingsInput.builder()
                                    .isEnabled(false)
                                    .populationId(635802)
                                    .demographicMemberIds(List.of(
                                        311869,
                                        935884,
                                        848378))
                                    .mobileDemographicMemberIds(List.of(
                                        882921,
                                        57167,
                                        167548))
                                    .build())
                                .contractTargeting(AdGroupContractTargetingInput.builder()
                                    .allowOpenMarketBiddingWhenTargetingContracts(false)
                                    .build())
                                .dimensionalBiddingAutoOptimizationSettings(List.of(
                                    List.of(
                                        DimensionalBiddingDimensions.HAS_DOMAIN_FRAGMENT_ID,
                                        DimensionalBiddingDimensions.HAS_INTEGRAL_BRAND_SAFETY_CATEGORY_ID),
                                    List.of(
                                        DimensionalBiddingDimensions.HAS_PRE_BID_CONTEXTUAL_CATEGORY_ID,
                                        DimensionalBiddingDimensions.HAS_DOMAIN_FRAGMENT_ID)))
                                .isUseClicksAsConversionsEnabled(true)
                                .isUseSecondaryConversionsEnabled(false)
                                .nielsenTrackingAttributes(AdGroupNielsenTrackingAttributesInput.builder()
                                    .gender(TargetingGender.MALE)
                                    .startAge(TargetingStartAge.FORTY_FIVE)
                                    .endAge(TargetingEndAge.SIXTY_FOUR)
                                    .countries(List.of(
                                    ))
                                    .enhancedReportingOption(EnhancedNielsenReportingOptions.NONE)
                                    .build())
                                .newFrequencyConfigs(List.of(
                                    AdGroupNewFrequencyConfigInput.builder()
                                        .counterName("<value>")
                                        .frequencyCap(737539)
                                        .frequencyGoal(689506)
                                        .resetIntervalInMinutes(184701)
                                        .build(),
                                    AdGroupNewFrequencyConfigInput.builder()
                                        .counterName("<value>")
                                        .frequencyCap(475654)
                                        .frequencyGoal(245053)
                                        .resetIntervalInMinutes(883515)
                                        .build(),
                                    AdGroupNewFrequencyConfigInput.builder()
                                        .counterName("<value>")
                                        .frequencyCap(937775)
                                        .frequencyGoal(952357)
                                        .resetIntervalInMinutes(231887)
                                        .build()))
                                .flights(List.of(
                                    CampaignCreateAdGroupFlightInput.builder()
                                        .allocationType(AllocationType.FIXED)
                                        .budgetInAdvertiserCurrency(2396.94)
                                        .budgetInImpressions(350703L)
                                        .dailyTargetInAdvertiserCurrency(5408.32)
                                        .dailyTargetInImpressions(557155L)
                                        .build()))
                                .build())
                            .build(),
                        CampaignCreateAdGroupInput.builder()
                            .name("<value>")
                            .channel(AdGroupChannel.NATIVE_DISPLAY)
                            .funnelLocation(AdGroupFunnelLocation.AWARENESS)
                            .isEnabled(false)
                            .description("pfft when lest impostor unlike gullible positively apropos")
                            .programmaticGuaranteedPrivateContractId("<id>")
                            .budget(AdGroupBudgetInput.builder()
                                .allocationType(AllocationType.FIXED)
                                .budgetInAdvertiserCurrency(4958.77)
                                .budgetInImpressions(227566L)
                                .dailyTargetInAdvertiserCurrency(8027.92)
                                .dailyTargetInImpressions(822238L)
                                .build())
                            .baseBidCPMInAdvertiserCurrency(5780.33)
                            .maxBidCPMInAdvertiserCurrency(9478.31)
                            .audienceTargeting(AdGroupAudienceTargetingInput.builder()
                                .audienceId("<id>")
                                .audienceAcceleratorExclusionsEnabled(false)
                                .audienceBoosterEnabled(true)
                                .audienceExcluderEnabled(false)
                                .audiencePredictorEnabled(false)
                                .crossDeviceVendorListForAudience(List.of(
                                    223445,
                                    163326))
                                .recencyExclusionWindowInMinutes(456881)
                                .targetTrackableUsersEnabled(true)
                                .useMcIdAsPrimary(false)
                                .build())
                            .roiGoal(AdGroupRoiGoalInput.builder()
                                .maximizeReach(false)
                                .maximizeLtvIncrementalReach(false)
                                .cpcInAdvertiserCurrency(4945.34)
                                .ctrInPercent(6751.71)
                                .nielsenOTPInPercent(1639.17)
                                .cpaInAdvertiserCurrency(4289.72)
                                .returnOnAdSpendPercent(1190.66)
                                .vcrInPercent(7326.88)
                                .viewabilityInPercent(5613.5)
                                .vcpmInAdvertiserCurrency(9770.39)
                                .cpcvInAdvertiserCurrency(1158.44)
                                .miaozhenOTPInPercent(7855.77)
                                .build())
                            .creativeIds(List.of(
                                "<value>",
                                "<value>"))
                            .associatedBidLists(List.of(
                                AdGroupAssociateBidListInput.builder()
                                    .bidListId("<id>")
                                    .isEnabled(false)
                                    .isDefaultForDimension(false)
                                    .build()))
                            .advancedSettings(CampaignCreateAdGroupAdvancedSettingsInput.builder()
                                .koaOptimizationSettings(AdGroupKoaOptimizationSettingsInput.builder()
                                    .areFutureKoaFeaturesEnabled(true)
                                    .predictiveClearingEnabled(true)
                                    .build())
                                .comscoreSettings(AdGroupComscoreSettingsInput.builder()
                                    .isEnabled(false)
                                    .populationId(738768)
                                    .demographicMemberIds(List.of(
                                        388441,
                                        627813,
                                        783982))
                                    .mobileDemographicMemberIds(List.of(
                                        779956))
                                    .build())
                                .contractTargeting(AdGroupContractTargetingInput.builder()
                                    .allowOpenMarketBiddingWhenTargetingContracts(true)
                                    .build())
                                .dimensionalBiddingAutoOptimizationSettings(List.of(
                                    List.of(
                                    ),
                                    List.of(
                                        DimensionalBiddingDimensions.HAS_VIDEO_COMPLETION_RATE_SCORE_RANGE)))
                                .isUseClicksAsConversionsEnabled(false)
                                .isUseSecondaryConversionsEnabled(false)
                                .nielsenTrackingAttributes(AdGroupNielsenTrackingAttributesInput.builder()
                                    .gender(TargetingGender.FEMALE)
                                    .startAge(TargetingStartAge.FIFTY)
                                    .endAge(TargetingEndAge.FORTY_NINE)
                                    .countries(List.of(
                                        "<value>",
                                        "<value>"))
                                    .enhancedReportingOption(EnhancedNielsenReportingOptions.NONE)
                                    .build())
                                .newFrequencyConfigs(List.of(
                                    AdGroupNewFrequencyConfigInput.builder()
                                        .counterName("<value>")
                                        .frequencyCap(755784)
                                        .frequencyGoal(267592)
                                        .resetIntervalInMinutes(899601)
                                        .build(),
                                    AdGroupNewFrequencyConfigInput.builder()
                                        .counterName("<value>")
                                        .frequencyCap(353367)
                                        .frequencyGoal(567650)
                                        .resetIntervalInMinutes(615697)
                                        .build()))
                                .flights(List.of(
                                    CampaignCreateAdGroupFlightInput.builder()
                                        .allocationType(AllocationType.FIXED)
                                        .budgetInAdvertiserCurrency(2974.84)
                                        .budgetInImpressions(444326L)
                                        .dailyTargetInAdvertiserCurrency(4669.04)
                                        .dailyTargetInImpressions(214928L)
                                        .build(),
                                    CampaignCreateAdGroupFlightInput.builder()
                                        .allocationType(AllocationType.MAXIMUM)
                                        .budgetInAdvertiserCurrency(3510.79)
                                        .budgetInImpressions(556228L)
                                        .dailyTargetInAdvertiserCurrency(9808.78)
                                        .dailyTargetInImpressions(857179L)
                                        .build()))
                                .build())
                            .build(),
                        CampaignCreateAdGroupInput.builder()
                            .name("<value>")
                            .channel(AdGroupChannel.TV)
                            .funnelLocation(AdGroupFunnelLocation.AWARENESS)
                            .isEnabled(true)
                            .description("including frantically headline provided married mysteriously duh till below")
                            .programmaticGuaranteedPrivateContractId("<id>")
                            .budget(AdGroupBudgetInput.builder()
                                .allocationType(AllocationType.MINIMUM)
                                .budgetInAdvertiserCurrency(2107.95)
                                .budgetInImpressions(930184L)
                                .dailyTargetInAdvertiserCurrency(2903.93)
                                .dailyTargetInImpressions(69813L)
                                .build())
                            .baseBidCPMInAdvertiserCurrency(699.88)
                            .maxBidCPMInAdvertiserCurrency(9099.31)
                            .audienceTargeting(AdGroupAudienceTargetingInput.builder()
                                .audienceId("<id>")
                                .audienceAcceleratorExclusionsEnabled(true)
                                .audienceBoosterEnabled(false)
                                .audienceExcluderEnabled(false)
                                .audiencePredictorEnabled(false)
                                .crossDeviceVendorListForAudience(List.of(
                                    383986,
                                    248051,
                                    525721))
                                .recencyExclusionWindowInMinutes(754684)
                                .targetTrackableUsersEnabled(true)
                                .useMcIdAsPrimary(false)
                                .build())
                            .roiGoal(AdGroupRoiGoalInput.builder()
                                .maximizeReach(true)
                                .maximizeLtvIncrementalReach(false)
                                .cpcInAdvertiserCurrency(4470.71)
                                .ctrInPercent(9684.09)
                                .nielsenOTPInPercent(3892.18)
                                .cpaInAdvertiserCurrency(6963.26)
                                .returnOnAdSpendPercent(127.71)
                                .vcrInPercent(6159.66)
                                .viewabilityInPercent(4657.92)
                                .vcpmInAdvertiserCurrency(4031.87)
                                .cpcvInAdvertiserCurrency(5994.27)
                                .miaozhenOTPInPercent(9214.14)
                                .build())
                            .creativeIds(List.of(
                                "<value>"))
                            .associatedBidLists(List.of(
                                AdGroupAssociateBidListInput.builder()
                                    .bidListId("<id>")
                                    .isEnabled(true)
                                    .isDefaultForDimension(true)
                                    .build()))
                            .advancedSettings(CampaignCreateAdGroupAdvancedSettingsInput.builder()
                                .koaOptimizationSettings(AdGroupKoaOptimizationSettingsInput.builder()
                                    .areFutureKoaFeaturesEnabled(true)
                                    .predictiveClearingEnabled(false)
                                    .build())
                                .comscoreSettings(AdGroupComscoreSettingsInput.builder()
                                    .isEnabled(true)
                                    .populationId(191774)
                                    .demographicMemberIds(List.of(
                                        353963,
                                        196269))
                                    .mobileDemographicMemberIds(List.of(
                                        899174))
                                    .build())
                                .contractTargeting(AdGroupContractTargetingInput.builder()
                                    .allowOpenMarketBiddingWhenTargetingContracts(true)
                                    .build())
                                .dimensionalBiddingAutoOptimizationSettings(List.of(
                                    List.of(
                                        DimensionalBiddingDimensions.HAS_DISPLAY_VIEWABILITY_SCORE_RANGE,
                                        DimensionalBiddingDimensions.HAS_RTB_ASIA_VIDEO_PAGE_QUALITY_CATEGORY_ID,
                                        DimensionalBiddingDimensions.HAS_DEVICE_TYPE_ID),
                                    List.of(
                                        DimensionalBiddingDimensions.HAS_RENDERING_CONTEXT_ID,
                                        DimensionalBiddingDimensions.HAS_PEER39_LANGUAGE_ID)))
                                .isUseClicksAsConversionsEnabled(false)
                                .isUseSecondaryConversionsEnabled(false)
                                .nielsenTrackingAttributes(AdGroupNielsenTrackingAttributesInput.builder()
                                    .gender(TargetingGender.BOTH)
                                    .startAge(TargetingStartAge.THIRTEEN)
                                    .endAge(TargetingEndAge.TWENTY_NINE)
                                    .countries(List.of(
                                    ))
                                    .enhancedReportingOption(EnhancedNielsenReportingOptions.NONE)
                                    .build())
                                .newFrequencyConfigs(List.of(
                                    AdGroupNewFrequencyConfigInput.builder()
                                        .counterName("<value>")
                                        .frequencyCap(618219)
                                        .frequencyGoal(584980)
                                        .resetIntervalInMinutes(188756)
                                        .build(),
                                    AdGroupNewFrequencyConfigInput.builder()
                                        .counterName("<value>")
                                        .frequencyCap(356009)
                                        .frequencyGoal(559681)
                                        .resetIntervalInMinutes(786602)
                                        .build(),
                                    AdGroupNewFrequencyConfigInput.builder()
                                        .counterName("<value>")
                                        .frequencyCap(161840)
                                        .frequencyGoal(959863)
                                        .resetIntervalInMinutes(656522)
                                        .build()))
                                .flights(List.of(
                                    CampaignCreateAdGroupFlightInput.builder()
                                        .allocationType(AllocationType.MINIMUM)
                                        .budgetInAdvertiserCurrency(4978.52)
                                        .budgetInImpressions(426448L)
                                        .dailyTargetInAdvertiserCurrency(348.27)
                                        .dailyTargetInImpressions(177582L)
                                        .build()))
                                .build())
                            .build()))
                    .validationOnly(false)
                    .build());

        PostCampaignBulkResponse res = sdk.campaign().postCampaignBulk()
                .request(req)
                .call();

        if (res.campaignBulkPayloads().isPresent()) {
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
| models/errors/ProblemDetailsException | 400                                   | application/json                      |
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
| models/errors/ProblemDetailsException | 400                                   | application/json                      |
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