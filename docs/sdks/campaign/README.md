# Campaign

## Overview

### Available Operations

* [create](#create) - Create a new campaign
* [updateCampaign](#updatecampaign) - Update a campaign
* [createCampaignsJob](#createcampaignsjob) - Submit a job to create multiple new campaigns
* [updateCampaignsJob](#updatecampaignsjob) - Submit a job to update multiple campaigns
* [archiveCampaigns](#archivecampaigns) - Archive multiple campaigns
* [getVersion](#getversion) - Get a campaign's version

## create

Create a new campaign

### Example Usage

<!-- UsageSnippet language="java" operationID="createCampaign" method="post" path="/campaign" -->
```java
package hello.world;

import com.thetradedesk.workflows.Workflows;
import com.thetradedesk.workflows.models.components.*;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.CreateCampaignResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        Workflows sdk = Workflows.builder()
                .ttdAuth(System.getenv().getOrDefault("WORKFLOWS_TTD_AUTH", ""))
            .build();

        CampaignCreateWorkflowInputWithValidation req = CampaignCreateWorkflowInputWithValidation.builder()
                .primaryInput(CampaignCreateWorkflowPrimaryInput.builder()
                    .advertiserId("<id>")
                    .name("<value>")
                    .primaryChannel(CampaignChannelType.DOOH)
                    .primaryGoal(CampaignWorkflowROIGoalInput.builder()
                        .maximizeReach(false)
                        .maximizeLtvIncrementalReach(JsonNullable.of(null))
                        .cpcInAdvertiserCurrency(6678.34)
                        .ctrInPercent(5357.4)
                        .nielsenOTPInPercent(2741.6)
                        .cpaInAdvertiserCurrency(4220.63)
                        .returnOnAdSpendPercent(8572.83)
                        .vcrInPercent(8294.92)
                        .viewabilityInPercent(8592.21)
                        .vcpmInAdvertiserCurrency(8388.8)
                        .cpcvInAdvertiserCurrency(JsonNullable.of(null))
                        .miaozhenOTPInPercent(3033.14)
                        .iqviaAudienceQualityIndex(false)
                        .crossixAudienceQualityIndex(true)
                        .iqviaAudienceQualityIndexAndCostPerTarget(true)
                        .crossixCostPerTarget(false)
                        .pharmaOptimization(true)
                        .newBuyerTargetValue(743337)
                        .build())
                    .description("woot furthermore mentor")
                    .campaignGroupId(86586L)
                    .timeZone("Europe/Ulyanovsk")
                    .customCPAClickWeight(2561.01)
                    .customCPAViewthroughWeight(5604.35)
                    .customCPAType(CustomCPAType.CLICK_VIEWTHROUGH_WEIGHTING)
                    .customRoasType(CustomROASType.DISABLED)
                    .impressionsOnlyBudgetingCpm(1502.33)
                    .endDateInUtc(JsonNullable.of(null))
                    .seedId(JsonNullable.of(null))
                    .campaignConversionReportingColumns(List.of(
                        CampaignWorkflowCampaignConversionReportingColumnInput.builder()
                            .trackingTagId("<id>")
                            .includeInCustomCPA(false)
                            .reportingColumnId(888649)
                            .roasConfig(CustomROASConfig.builder()
                                .includeInCustomROAS(false)
                                .customROASWeight(4766.9)
                                .customROASClickWeight(3310.24)
                                .customROASViewthroughWeight(2919.37)
                                .build())
                            .productListReportingType(ProductListReportingTypeInput.FEATURED)
                            .weight(5369.43)
                            .crossDeviceAttributionModelId("<id>")
                            .build()))
                    .isManagedByTTD(JsonNullable.of(null))
                    .secondaryGoal(CampaignWorkflowROIGoalInput.builder()
                        .maximizeReach(false)
                        .maximizeLtvIncrementalReach(false)
                        .cpcInAdvertiserCurrency(4128.35)
                        .ctrInPercent(4434.91)
                        .nielsenOTPInPercent(7433.37)
                        .cpaInAdvertiserCurrency(JsonNullable.of(null))
                        .returnOnAdSpendPercent(2367.04)
                        .vcrInPercent(2333.15)
                        .viewabilityInPercent(5018.08)
                        .vcpmInAdvertiserCurrency(6070.6)
                        .cpcvInAdvertiserCurrency(JsonNullable.of(null))
                        .miaozhenOTPInPercent(4324.01)
                        .iqviaAudienceQualityIndex(true)
                        .crossixAudienceQualityIndex(true)
                        .iqviaAudienceQualityIndexAndCostPerTarget(false)
                        .crossixCostPerTarget(true)
                        .pharmaOptimization(true)
                        .newBuyerTargetValue(960101)
                        .build())
                    .tertiaryGoal(CampaignWorkflowROIGoalInput.builder()
                        .maximizeReach(false)
                        .maximizeLtvIncrementalReach(false)
                        .cpcInAdvertiserCurrency(7814.79)
                        .ctrInPercent(7849.85)
                        .nielsenOTPInPercent(JsonNullable.of(null))
                        .cpaInAdvertiserCurrency(JsonNullable.of(null))
                        .returnOnAdSpendPercent(9519.81)
                        .vcrInPercent(6125.66)
                        .viewabilityInPercent(4766.9)
                        .vcpmInAdvertiserCurrency(3310.24)
                        .cpcvInAdvertiserCurrency(2919.37)
                        .miaozhenOTPInPercent(5369.43)
                        .iqviaAudienceQualityIndex(false)
                        .crossixAudienceQualityIndex(false)
                        .iqviaAudienceQualityIndexAndCostPerTarget(JsonNullable.of(null))
                        .crossixCostPerTarget(false)
                        .pharmaOptimization(false)
                        .newBuyerTargetValue(412835)
                        .build())
                    .customLabelNames(List.of(
                        "<value 1>",
                        "<value 2>"))
                    .startDateInUtc(JsonNullable.of(null))
                    .budget(CampaignCreateWorkflowBudgetInput.builder()
                        .pacingMode(CampaignPacingMode.PACE_AS_SOON_AS_POSSIBLE)
                        .budgetInAdvertiserCurrency(6363.35)
                        .budgetInImpressions(836518L)
                        .dailyTargetInAdvertiserCurrency(7814.79)
                        .dailyTargetInImpressions(784985L)
                        .build())
                    .campaignIncrementalReachSetting(CampaignCreateWorkflowIncrementalReachCampaignSetting.builder()
                        .iSpotReachSetting(IncrementalReachBrandInput.builder()
                            .id(787894)
                            .name("<value>")
                            .isActive(false)
                            .build())
                        .realyticsReachSetting(RealyticsReachSettingInput.builder()
                            .id(859221)
                            .name("<value>")
                            .isActive(false)
                            .products(JsonNullable.of(null))
                            .realyticsEntertainmentInput(RealyticsEntertainmentType.TVS)
                            .build())
                        .tvSquaredReachSetting(IncrementalReachBrandInput.builder()
                            .id(303314)
                            .name(JsonNullable.of(null))
                            .isActive(false)
                            .build())
                        .sambaAuReachSetting(IncrementalReachBrandInput.builder()
                            .id(505888)
                            .name("<value>")
                            .isActive(true)
                            .build())
                        .build())
                    .pharmaOptimizationGoalSettings(JsonNullable.of(null))
                    .campaignRetailBrandSettings(KokaiCampaignRetailBrandSettingsInput.builder()
                        .brandIds(List.of(
                            218958L))
                        .optInRetailSeedRecommendation(BooleanNullableOptionalInput.builder()
                            .value(true)
                            .build())
                        .otherBrandNames(List.of(
                            "<value 1>"))
                        .build())
                    .build())
                .advancedInput(CampaignCreateWorkflowAdvancedInput.builder()
                    .purchaseOrderNumber(JsonNullable.of(null))
                    .flights(List.of(
                        CampaignWorkflowFlightInput.builder()
                            .startDateInclusiveUTC(OffsetDateTime.parse("2024-07-08T10:52:56.944Z"))
                            .budgetInAdvertiserCurrency(5904.11)
                            .endDateExclusiveUTC(OffsetDateTime.parse("2023-05-12T16:41:56.386Z"))
                            .budgetInImpressions(JsonNullable.of(null))
                            .dailyTargetInAdvertiserCurrency(6112.24)
                            .dailyTargetInImpressions(333131L)
                            .build()))
                    .includeDefaultsFromAdvertiser(false)
                    .associatedBidLists(List.of(
                        CampaignWorkflowAssociateBidListInput.builder()
                            .bidListId("<id>")
                            .isEnabled(JsonNullable.of(null))
                            .isCampaignDefault(true)
                            .build()))
                    .passThroughFeeCard(CampaignCreateWorkflowPassThroughFeeCardInput.builder()
                        .passThroughFees(List.of(
                            CampaignCreatePassThroughFeesInput.builder()
                                .type(PassThroughFeeType.FEE_CPM)
                                .description("fairly gah mortally freight since")
                                .amount(2122.11)
                                .build()))
                        .startDateUtc(OffsetDateTime.parse("2023-03-18T04:39:08.387Z"))
                        .build())
                    .callerSource("<value>")
                    .frequencyConfigs(List.of(
                        FrequencyConfig.builder()
                            .counterName("<value>")
                            .frequencyCap(743337)
                            .frequencyGoal(JsonNullable.of(null))
                            .resetIntervalInMinutes(520097)
                            .build()))
                    .build())
                .adGroups(List.of(
                    CampaignCreateWorkflowAdGroupInput.builder()
                        .primaryInput(AdGroupCreateWorkflowPrimaryInput.builder()
                            .name("<value>")
                            .channel(AdGroupChannel.NATIVE_VIDEO)
                            .funnelLocation(AdGroupFunnelLocation.NONE)
                            .isEnabled(false)
                            .description("quash lightly rot bashfully slope")
                            .budget(AdGroupWorkflowBudgetInput.builder()
                                .allocationType(AllocationType.MINIMUM)
                                .budgetInAdvertiserCurrency(4043.98)
                                .budgetInImpressions(907414L)
                                .dailyTargetInAdvertiserCurrency(49.95)
                                .dailyTargetInImpressions(62363L)
                                .build())
                            .baseBidCPMInAdvertiserCurrency(1136.89)
                            .maxBidCPMInAdvertiserCurrency(6950.27)
                            .audienceTargeting(AdGroupWorkflowAudienceTargetingInput.builder()
                                .audienceId(StringWorkflowsOptional.builder()
                                    .value("<value>")
                                    .build())
                                .audienceAcceleratorExclusionsEnabled(false)
                                .audienceBoosterEnabled(true)
                                .audienceExcluderEnabled(false)
                                .audiencePredictorEnabled(true)
                                .crossDeviceVendorListForAudience(List.of(
                                    458524,
                                    284141))
                                .recencyExclusionWindowInMinutes(982426)
                                .targetTrackableUsersEnabled(false)
                                .useMcIdAsPrimary(true)
                                .build())
                            .roiGoal(AdGroupWorkflowROIGoalInput.builder()
                                .maximizeReach(JsonNullable.of(null))
                                .maximizeLtvIncrementalReach(true)
                                .cpcInAdvertiserCurrency(8782.74)
                                .ctrInPercent(JsonNullable.of(null))
                                .nielsenOTPInPercent(7930.85)
                                .cpaInAdvertiserCurrency(4606.89)
                                .returnOnAdSpendPercent(2522.83)
                                .vcrInPercent(5828.49)
                                .viewabilityInPercent(6824.44)
                                .vcpmInAdvertiserCurrency(7123.95)
                                .cpcvInAdvertiserCurrency(6233.72)
                                .miaozhenOTPInPercent(8437.22)
                                .newBuyerTargetValue(256101)
                                .build())
                            .associatedBidLists(List.of(
                                AdGroupWorkflowAssociateBidListInput.builder()
                                    .bidListId("<id>")
                                    .isEnabled(true)
                                    .isDefaultForDimension(false)
                                    .build()))
                            .creativeIds(List.of(
                                "<value 1>"))
                            .ownedBidLists(List.of(
                                AdGroupCreateWorkflowOwnedBidListInput.builder()
                                    .name("<value>")
                                    .adjustmentType(BidListAdjustmentType.FRACTIONAL_EXCLUSION)
                                    .resolutionType(MultipleMatchResolutionType.APPLY_MINIMUM_ADJUSTMENT)
                                    .dimensions(List.of(
                                        BidListDimension.HAS_QUALITY_SCORE_RANGE))
                                    .bidLines(List.of(
                                        BidLineCreateInput.builder()
                                            .adFormatId("<id>")
                                            .domainFragment("<value>")
                                            .universalCategoryTaxonomyId("<id>")
                                            .browser(Browser.EDGE)
                                            .browserId(BrowserInput.INTERNET_EXPLORER7)
                                            .carrierId("<id>")
                                            .deviceModelId(JsonNullable.of(null))
                                            .deviceType(DeviceType.UNKNOWN)
                                            .geoSegmentId("<id>")
                                            .hourOfWeek(888649)
                                            .languageId("<id>")
                                            .osName("<value>")
                                            .privateContractId("<id>")
                                            .recencyWindowInMinutes(Int32Range.builder()
                                                .min(331024)
                                                .max(291937)
                                                .build())
                                            .renderingContext(RenderingContext.MOBILE_OPTIMIZED_WEB)
                                            .supplyVendorId("<id>")
                                            .temperatureBucketInCelsius(DecimalRange.builder()
                                                .min(9198.5)
                                                .max(7365.62)
                                                .build())
                                            .adsTxtSellerType(AdsTxtSellerType.UNKNOWN)
                                            .videoMutedState(VideoMutedState.ALWAYS_AUTO_MUTED)
                                            .videoPlaybackType(VideoPlaybackType.INTERSTITIAL_SLIDER_FLOATING)
                                            .videoPlayerSize(VideoPlayerSize.SMALL)
                                            .videoQuality(VideoQuality.PROSUMER)
                                            .videoSkippability(VideoSkippability.NOT_SKIPPABLE)
                                            .factualProximityTarget(FactualProximityTargetInput.builder()
                                                .targetingCodeId(367680)
                                                .designId(681946)
                                                .build())
                                            .impressionPlacementValue("<value>")
                                            .videoTruthScoreRange(DecimalRange.builder()
                                                .min(8294.92)
                                                .max(8592.21)
                                                .build())
                                            .videoViewabilityScoreRange(DecimalRange.builder()
                                                .min(8388.8)
                                                .max(JsonNullable.of(null))
                                                .build())
                                            .displayViewabilityScoreRange(DecimalRange.builder()
                                                .min(3033.14)
                                                .max(JsonNullable.of(null))
                                                .build())
                                            .peer39LanguageId("<id>")
                                            .doubleVerifyBotAvoidanceCategory(DoubleVerifyBotAvoidance.FRAUD_NO_ADS)
                                            .contextualAppCategoryId("<id>")
                                            .publisherId("<id>")
                                            .integralViewabilityCategoryId("<id>")
                                            .integralViewabilityCategory(IntegralViewabilityInput.IN_VIEW40)
                                            .integralVideoViewabilityCategoryId("<id>")
                                            .integralVideoViewabilityCategory(IntegralVideoViewabilityInput.IN_VIEW60)
                                            .doubleVerifyViewabilityCategory(DoubleVerifyDisplayViewability.TOP75)
                                            .doubleVerifyVideoViewabilityCategory(DoubleVerifyVideoViewability.DURATION35)
                                            .peer39ViewabilityCategoryId(JsonNullable.of(null))
                                            .peer39ViewabilityCategory(Peer39ViewabilityInput.TOP80)
                                            .videoCompletionRateScoreRange(DecimalRange.builder()
                                                .min(5595.67)
                                                .max(3708.83)
                                                .build())
                                            .internetConnectionInput(InternetConnectionTypeInput.ETHERNET)
                                            .internetConnectionTypeId(InternetConnectionTypeInput.CELLULAR_NETWORK4_G)
                                            .internetConnection(InternetConnectionType.CELLULAR_NETWORK3_G)
                                            .rtbAsiaPageQualityCategory(RTBAsiaViewability.BLOCK_HIGH_RISK)
                                            .rtbAsiaVideoPageQualityCategory(RTBAsiaViewability.BLOCK_HIGH_RISK)
                                            .supplyPathOptimizationListId(659089)
                                            .marketType(MarketTypeBidList.PMP_NOT_SPECIFIED)
                                            .weatherCondition(WeatherCondition.SQUALL)
                                            .frequencyAdjustment(FrequencyAdjustmentInput.builder()
                                                .counterId("<id>")
                                                .timesShown(Int32Range.builder()
                                                    .min(165439)
                                                    .max(439802)
                                                    .build())
                                                .build())
                                            .sellerDomain("<value>")
                                            .digitalOutOfHomeVenueTypeId("<id>")
                                            .nativePlacementType(NativePlacementType.UNKNOWN)
                                            .nativeContextType(NativeContextType.ARTICLE)
                                            .idiosyncraticSegment(IdiosyncraticSegment.NONE)
                                            .tencentPageQualityCategory(TencentPageQualityInput.BLOCK_HIGH_RISK)
                                            .domainClassId(364638)
                                            .geofenceThirdPartyDataAndBrand(GeofenceThirdPartyDataAndBrandInput.builder()
                                                .dataId(899160L)
                                                .brandId("<id>")
                                                .build())
                                            .genreId("<id>")
                                            .livestream(Livestream.NOT_LIVE)
                                            .productionQuality(ProductionQuality.PROFESSIONAL)
                                            .productionQualityId(ProductionQualityInput.UNKNOWN)
                                            .contentRatingId("<id>")
                                            .contentDuration(ContentDuration.BETWEEN15_AND30_MINUTES)
                                            .qualityScoreRange(DecimalRange.builder()
                                                .min(144.21)
                                                .max(6819.33)
                                                .build())
                                            .atmosphericCondition(AtmosphericCondition.HIGH_FORECAST)
                                            .marketplaceId("<id>")
                                            .audienceReachPercentageTier(AudienceReachPercentageTier.TIER2)
                                            .contentTransparency(ContentTransparency.NON_TRANSPARENT)
                                            .fullReferrerUrl(FullReferrerUrl.FULL_URL)
                                            .likelyRefreshRate(LikelyRefreshRate.DEPRECATED)
                                            .rewarded(Rewarded.IS_REWARDED)
                                            .feedId(JsonNullable.of(null))
                                            .liveEventId("<id>")
                                            .liveEventTypeId(JsonNullable.of(null))
                                            .extendedZipCodeGroupSegmentThirdPartyDataId(113689L)
                                            .contentLanguageId("<id>")
                                            .adToContentRatioRange(DecimalRange.builder()
                                                .min(7013.46)
                                                .max(5511.8)
                                                .build())
                                            .adsInViewRange(DecimalRange.builder()
                                                .min(238.26)
                                                .max(5461.3)
                                                .build())
                                            .bidAdjustment(3383.5)
                                            .volumeControlPriority(VolumeControlPriority.ONE)
                                            .maxBid(5473.9)
                                            .build()))
                                    .source(BidListSource.FREQUENCY_MIGRATION)
                                    .associateBehavior(BidListAssociateBehavior.DO_NOT_ASSOCIATE)
                                    .dimensionConfig(BidListDimensionOptionsInput.builder()
                                        .geo(GeoBidListOptionsInput.builder()
                                            .locationContextType(LocationContextTypeInput.REALTIME)
                                            .build())
                                        .build())
                                    .isDefaultForDimension(false)
                                    .build()))
                            .marketType(MarketTypeInput.OPEN_MARKET)
                            .programmaticGuaranteedPrivateContractId("<id>")
                            .includeDefaultsFromCampaign(true)
                            .build())
                        .advancedInput(CampaignCreateWorkflowAdGroupAdvancedInput.builder()
                            .koaOptimizationSettings(AdGroupWorkflowKoaOptimizationSettingsInput.builder()
                                .areFutureKoaFeaturesEnabled(true)
                                .predictiveClearingEnabled(true)
                                .build())
                            .comscoreSettings(AdGroupWorkflowComscoreSettingsInput.builder()
                                .isEnabled(false)
                                .populationId(523753)
                                .demographicMemberIds(JsonNullable.of(null))
                                .mobileDemographicMemberIds(JsonNullable.of(null))
                                .build())
                            .contractTargeting(AdGroupWorkflowContractTargetingInput.builder()
                                .allowOpenMarketBiddingWhenTargetingContracts(true)
                                .build())
                            .dimensionalBiddingAutoOptimizationSettings(List.of(
                                List.of(
                                    DimensionalBiddingDimensions.HAS_FULL_REFERRER_URL),
                                List.of(
                                    DimensionalBiddingDimensions.HAS_PUBLISHER_ID)))
                            .isUseClicksAsConversionsEnabled(JsonNullable.of(null))
                            .isUseSecondaryConversionsEnabled(true)
                            .nielsenTrackingAttributes(AdGroupWorkflowNielsenTrackingAttributesInput.builder()
                                .gender(TargetingGenderInput.FEMALE)
                                .startAge(TargetingStartAgeInput.THIRTY_FIVE)
                                .endAge(TargetingEndAgeInput.FORTY_NINE)
                                .countries(List.of())
                                .enhancedReportingOption(EnhancedNielsenReportingOptionsInput.SITE)
                                .build())
                            .newFrequencyConfigs(List.of(
                                AdGroupWorkflowNewFrequencyConfigInput.builder()
                                    .counterName("<value>")
                                    .frequencyCap(391231)
                                    .frequencyGoal(499235)
                                    .resetIntervalInMinutes(587736)
                                    .build()))
                            .inventoryTargeting(AdGroupWorkflowInventoryTargetingInput.builder()
                                .dealGroupIdsToInclude(List.of(
                                    "<value 1>"))
                                .dealGroupIdsToExclude(List.of(
                                    "<value 1>",
                                    "<value 2>"))
                                .dealIdsToExclude(List.of(
                                    607060L))
                                .dealIdsToInclude(JsonNullable.of(null))
                                .includeDefaultOnDeals(true)
                                .build())
                            .isNonDecisioned(true)
                            .includeDefaultsFromCampaign(false)
                            .flights(List.of(
                                CampaignCreateWorkflowAdGroupFlightInput.builder()
                                    .allocationType(AllocationType.FIXED)
                                    .budgetInAdvertiserCurrency(5340.32)
                                    .budgetInImpressions(492382L)
                                    .dailyTargetInAdvertiserCurrency(5622.5)
                                    .dailyTargetInImpressions(398919L)
                                    .build()))
                            .build())
                        .build()))
                .validateInputOnly(false)
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

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [CampaignCreateWorkflowInputWithValidation](../../models/shared/CampaignCreateWorkflowInputWithValidation.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |

### Response

**[CreateCampaignResponse](../../models/operations/CreateCampaignResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/ProblemDetailsException | 400, 403                              | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |

## updateCampaign

Only the fields provided in the request payload will be updated.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCampaign" method="patch" path="/campaign" -->
```java
package hello.world;

import com.thetradedesk.workflows.Workflows;
import com.thetradedesk.workflows.models.components.*;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.UpdateCampaignResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        Workflows sdk = Workflows.builder()
                .ttdAuth(System.getenv().getOrDefault("WORKFLOWS_TTD_AUTH", ""))
            .build();

        CampaignUpdateWorkflowInputWithValidation req = CampaignUpdateWorkflowInputWithValidation.builder()
                .id("<id>")
                .primaryInput(CampaignUpdateWorkflowPrimaryInput.builder()
                    .description("yahoo whether frail but into form sway neck notwithstanding")
                    .campaignGroupId(760468L)
                    .timeZone("Asia/Amman")
                    .customCPAClickWeight(1380.93)
                    .customCPAViewthroughWeight(3991.98)
                    .customCPAType(CustomCPAType.CLICK_VIEWTHROUGH_WEIGHTING)
                    .customRoasType(CustomROASType.DISABLED)
                    .impressionsOnlyBudgetingCpm(126.57)
                    .endDateInUtc(OffsetDateTime.parse("2024-07-09T17:14:23.542Z"))
                    .seedId("<id>")
                    .campaignConversionReportingColumns(List.of(
                        CampaignWorkflowCampaignConversionReportingColumnInput.builder()
                            .trackingTagId("<id>")
                            .includeInCustomCPA(false)
                            .reportingColumnId(716444)
                            .roasConfig(CustomROASConfig.builder()
                                .includeInCustomROAS(true)
                                .customROASWeight(8307.9)
                                .customROASClickWeight(129.65)
                                .customROASViewthroughWeight(2890.82)
                                .build())
                            .productListReportingType(ProductListReportingTypeInput.FEATURED)
                            .weight(5187.48)
                            .crossDeviceAttributionModelId(JsonNullable.of(null))
                            .build()))
                    .isManagedByTTD(false)
                    .secondaryGoal(CampaignWorkflowROIGoalInput.builder()
                        .maximizeReach(true)
                        .maximizeLtvIncrementalReach(false)
                        .cpcInAdvertiserCurrency(1165.14)
                        .ctrInPercent(5157.73)
                        .nielsenOTPInPercent(3855.93)
                        .cpaInAdvertiserCurrency(5164.28)
                        .returnOnAdSpendPercent(8554.35)
                        .vcrInPercent(9569.97)
                        .viewabilityInPercent(9650.33)
                        .vcpmInAdvertiserCurrency(5268.69)
                        .cpcvInAdvertiserCurrency(7216.52)
                        .miaozhenOTPInPercent(6966.26)
                        .iqviaAudienceQualityIndex(true)
                        .crossixAudienceQualityIndex(true)
                        .iqviaAudienceQualityIndexAndCostPerTarget(true)
                        .crossixCostPerTarget(true)
                        .pharmaOptimization(false)
                        .newBuyerTargetValue(287698)
                        .build())
                    .tertiaryGoal(CampaignWorkflowROIGoalInput.builder()
                        .maximizeReach(true)
                        .maximizeLtvIncrementalReach(true)
                        .cpcInAdvertiserCurrency(5149.5)
                        .ctrInPercent(5602.97)
                        .nielsenOTPInPercent(3514.56)
                        .cpaInAdvertiserCurrency(1.97)
                        .returnOnAdSpendPercent(3177.79)
                        .vcrInPercent(5564.63)
                        .viewabilityInPercent(472.11)
                        .vcpmInAdvertiserCurrency(4614.14)
                        .cpcvInAdvertiserCurrency(8553.51)
                        .miaozhenOTPInPercent(5511.72)
                        .iqviaAudienceQualityIndex(false)
                        .crossixAudienceQualityIndex(false)
                        .iqviaAudienceQualityIndexAndCostPerTarget(JsonNullable.of(null))
                        .crossixCostPerTarget(false)
                        .pharmaOptimization(true)
                        .newBuyerTargetValue(651746)
                        .build())
                    .name("<value>")
                    .primaryChannel(CampaignChannelType.DISPLAY)
                    .primaryGoal(CampaignWorkflowROIGoalInput.builder()
                        .maximizeReach(false)
                        .maximizeLtvIncrementalReach(true)
                        .cpcInAdvertiserCurrency(8835.54)
                        .ctrInPercent(4975.78)
                        .nielsenOTPInPercent(6033.78)
                        .cpaInAdvertiserCurrency(JsonNullable.of(null))
                        .returnOnAdSpendPercent(5696.08)
                        .vcrInPercent(8315.31)
                        .viewabilityInPercent(1059.68)
                        .vcpmInAdvertiserCurrency(4588.07)
                        .cpcvInAdvertiserCurrency(2202.71)
                        .miaozhenOTPInPercent(2682.12)
                        .iqviaAudienceQualityIndex(false)
                        .crossixAudienceQualityIndex(true)
                        .iqviaAudienceQualityIndexAndCostPerTarget(true)
                        .crossixCostPerTarget(true)
                        .pharmaOptimization(true)
                        .newBuyerTargetValue(776250)
                        .build())
                    .startDateInUtc(OffsetDateTime.parse("2024-02-29T10:31:50.069Z"))
                    .budget(CampaignUpdateWorkflowBudgetInput.builder()
                        .pacingMode(CampaignPacingMode.PACE_AS_SOON_AS_POSSIBLE)
                        .build())
                    .pharmaOptimizationGoalSettingUpdates(List.of(
                        CampaignWorkflowPharmaOptimizationGoalSettingInput.builder()
                            .goalPriority(GoalPriorityInput.TERTIARY)
                            .metricWeights(List.of(
                                CampaignWorkflowPharmaOptimizationGoalMetricWeightInput.builder()
                                    .metricType(PharmaOptimizationGoalMetricTypeInput.IQVIA_COST_PER_TARGET)
                                    .weight(8554.35)
                                    .build()))
                            .build()))
                    .build())
                .advancedInput(CampaignUpdateWorkflowAdvancedInput.builder()
                    .purchaseOrderNumber("<value>")
                    .build())
                .validateInputOnly(true)
                .build();

        UpdateCampaignResponse res = sdk.campaign().updateCampaign()
                .request(req)
                .call();

        if (res.campaignPayload().isPresent()) {
            System.out.println(res.campaignPayload().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [CampaignUpdateWorkflowInputWithValidation](../../models/shared/CampaignUpdateWorkflowInputWithValidation.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |

### Response

**[UpdateCampaignResponse](../../models/operations/UpdateCampaignResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/ProblemDetailsException | 400                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |

## createCampaignsJob

Submit a job to create multiple new campaigns

### Example Usage

<!-- UsageSnippet language="java" operationID="createCampaignsJob" method="post" path="/standardjob/campaign/bulk" -->
```java
package hello.world;

import com.thetradedesk.workflows.Workflows;
import com.thetradedesk.workflows.models.components.*;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.CreateCampaignsJobResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        Workflows sdk = Workflows.builder()
                .ttdAuth(System.getenv().getOrDefault("WORKFLOWS_TTD_AUTH", ""))
            .build();

        CampaignBulkCreateWorkflowInputWithValidation req = CampaignBulkCreateWorkflowInputWithValidation.builder()
                .input(List.of(
                    CampaignCreateWorkflowInput.builder()
                        .primaryInput(CampaignCreateWorkflowPrimaryInput.builder()
                            .advertiserId("<id>")
                            .name("<value>")
                            .primaryChannel(CampaignChannelType.NATIVE_VIDEO)
                            .primaryGoal(CampaignWorkflowROIGoalInput.builder()
                                .maximizeReach(false)
                                .maximizeLtvIncrementalReach(false)
                                .cpcInAdvertiserCurrency(25.32)
                                .ctrInPercent(4889.32)
                                .nielsenOTPInPercent(5258.8)
                                .cpaInAdvertiserCurrency(2553.01)
                                .returnOnAdSpendPercent(1142.91)
                                .vcrInPercent(1152.77)
                                .viewabilityInPercent(6711.38)
                                .vcpmInAdvertiserCurrency(4528.37)
                                .cpcvInAdvertiserCurrency(9833.69)
                                .miaozhenOTPInPercent(1951.58)
                                .iqviaAudienceQualityIndex(true)
                                .crossixAudienceQualityIndex(JsonNullable.of(null))
                                .iqviaAudienceQualityIndexAndCostPerTarget(false)
                                .crossixCostPerTarget(true)
                                .pharmaOptimization(true)
                                .newBuyerTargetValue(240701)
                                .build())
                            .description(JsonNullable.of(null))
                            .campaignGroupId(657704L)
                            .timeZone("America/North_Dakota/Center")
                            .customCPAClickWeight(9662.9)
                            .customCPAViewthroughWeight(3558.78)
                            .customCPAType(CustomCPAType.CLICK_VIEWTHROUGH_WEIGHTING)
                            .customRoasType(CustomROASType.COMPOSITE_WEIGHTING)
                            .impressionsOnlyBudgetingCpm(4427.56)
                            .endDateInUtc(OffsetDateTime.parse("2023-12-21T01:12:20.772Z"))
                            .seedId("<id>")
                            .campaignConversionReportingColumns(List.of(
                                CampaignWorkflowCampaignConversionReportingColumnInput.builder()
                                    .trackingTagId("<id>")
                                    .includeInCustomCPA(false)
                                    .reportingColumnId(356532)
                                    .roasConfig(CustomROASConfig.builder()
                                        .includeInCustomROAS(false)
                                        .customROASWeight(1483.03)
                                        .customROASClickWeight(5286.76)
                                        .customROASViewthroughWeight(8906.82)
                                        .build())
                                    .productListReportingType(ProductListReportingTypeInput.HALO)
                                    .weight(JsonNullable.of(null))
                                    .crossDeviceAttributionModelId("<id>")
                                    .build()))
                            .isManagedByTTD(true)
                            .secondaryGoal(CampaignWorkflowROIGoalInput.builder()
                                .maximizeReach(true)
                                .maximizeLtvIncrementalReach(false)
                                .cpcInAdvertiserCurrency(3558.78)
                                .ctrInPercent(2407.01)
                                .nielsenOTPInPercent(2349.25)
                                .cpaInAdvertiserCurrency(7778.32)
                                .returnOnAdSpendPercent(6752.02)
                                .vcrInPercent(5019.36)
                                .viewabilityInPercent(5781.75)
                                .vcpmInAdvertiserCurrency(1696.34)
                                .cpcvInAdvertiserCurrency(5609.2)
                                .miaozhenOTPInPercent(5842.09)
                                .iqviaAudienceQualityIndex(true)
                                .crossixAudienceQualityIndex(false)
                                .iqviaAudienceQualityIndexAndCostPerTarget(false)
                                .crossixCostPerTarget(JsonNullable.of(null))
                                .pharmaOptimization(false)
                                .newBuyerTargetValue(JsonNullable.of(null))
                                .build())
                            .tertiaryGoal(CampaignWorkflowROIGoalInput.builder()
                                .maximizeReach(false)
                                .maximizeLtvIncrementalReach(false)
                                .cpcInAdvertiserCurrency(6123.61)
                                .ctrInPercent(25.32)
                                .nielsenOTPInPercent(4889.32)
                                .cpaInAdvertiserCurrency(5258.8)
                                .returnOnAdSpendPercent(2553.01)
                                .vcrInPercent(1142.91)
                                .viewabilityInPercent(1152.77)
                                .vcpmInAdvertiserCurrency(6711.38)
                                .cpcvInAdvertiserCurrency(4528.37)
                                .miaozhenOTPInPercent(9833.69)
                                .iqviaAudienceQualityIndex(true)
                                .crossixAudienceQualityIndex(false)
                                .iqviaAudienceQualityIndexAndCostPerTarget(false)
                                .crossixCostPerTarget(true)
                                .pharmaOptimization(true)
                                .newBuyerTargetValue(966290)
                                .build())
                            .customLabelNames(List.of(
                                "<value 1>",
                                "<value 2>",
                                "<value 3>"))
                            .startDateInUtc(OffsetDateTime.parse("2025-09-26T21:06:42.946Z"))
                            .budget(CampaignCreateWorkflowBudgetInput.builder()
                                .pacingMode(CampaignPacingMode.PACE_AHEAD)
                                .budgetInAdvertiserCurrency(5501.96)
                                .budgetInImpressions(629784L)
                                .dailyTargetInAdvertiserCurrency(2524.41)
                                .dailyTargetInImpressions(726807L)
                                .build())
                            .campaignIncrementalReachSetting(CampaignCreateWorkflowIncrementalReachCampaignSetting.builder()
                                .iSpotReachSetting(IncrementalReachBrandInput.builder()
                                    .id(178346)
                                    .name("<value>")
                                    .isActive(true)
                                    .build())
                                .realyticsReachSetting(RealyticsReachSettingInput.builder()
                                    .id(268786)
                                    .name("<value>")
                                    .isActive(false)
                                    .products(List.of(
                                        IncrementalReachProductInput.builder()
                                            .id(106975)
                                            .name("<value>")
                                            .build()))
                                    .realyticsEntertainmentInput(RealyticsEntertainmentType.TVS)
                                    .build())
                                .tvSquaredReachSetting(IncrementalReachBrandInput.builder()
                                    .id(772731)
                                    .name("<value>")
                                    .isActive(false)
                                    .build())
                                .sambaAuReachSetting(IncrementalReachBrandInput.builder()
                                    .id(403863)
                                    .name(JsonNullable.of(null))
                                    .isActive(true)
                                    .build())
                                .build())
                            .pharmaOptimizationGoalSettings(List.of(
                                CampaignWorkflowPharmaOptimizationGoalSettingInput.builder()
                                    .goalPriority(GoalPriorityInput.PRIMARY)
                                    .metricWeights(List.of(
                                        CampaignWorkflowPharmaOptimizationGoalMetricWeightInput.builder()
                                            .metricType(PharmaOptimizationGoalMetricTypeInput.CROSSIX_COST_PER_TARGET)
                                            .weight(6297.84)
                                            .build()))
                                    .build()))
                            .campaignRetailBrandSettings(KokaiCampaignRetailBrandSettingsInput.builder()
                                .brandIds(List.of(
                                    501936L))
                                .optInRetailSeedRecommendation(BooleanNullableOptionalInput.builder()
                                    .value(false)
                                    .build())
                                .otherBrandNames(List.of(
                                    "<value 1>"))
                                .build())
                            .build())
                        .advancedInput(CampaignCreateWorkflowAdvancedInput.builder()
                            .purchaseOrderNumber("<value>")
                            .flights(List.of(
                                CampaignWorkflowFlightInput.builder()
                                    .startDateInclusiveUTC(OffsetDateTime.parse("2024-09-20T06:04:19.345Z"))
                                    .budgetInAdvertiserCurrency(8219.9)
                                    .endDateExclusiveUTC(OffsetDateTime.parse("2024-01-18T07:43:56.299Z"))
                                    .budgetInImpressions(76925L)
                                    .dailyTargetInAdvertiserCurrency(9309.03)
                                    .dailyTargetInImpressions(152838L)
                                    .build()))
                            .includeDefaultsFromAdvertiser(false)
                            .associatedBidLists(List.of(
                                CampaignWorkflowAssociateBidListInput.builder()
                                    .bidListId("<id>")
                                    .isEnabled(true)
                                    .isCampaignDefault(true)
                                    .build()))
                            .passThroughFeeCard(CampaignCreateWorkflowPassThroughFeeCardInput.builder()
                                .passThroughFees(List.of(
                                    CampaignCreatePassThroughFeesInput.builder()
                                        .type(PassThroughFeeType.DATA_COST_PERCENTAGE)
                                        .description("sweetly absent fortunately forenenst earnest who solidly wherever step-mother")
                                        .amount(2888.48)
                                        .build()))
                                .startDateUtc(OffsetDateTime.parse("2024-07-24T11:58:59.190Z"))
                                .build())
                            .callerSource("<value>")
                            .frequencyConfigs(List.of(
                                FrequencyConfig.builder()
                                    .counterName("<value>")
                                    .frequencyCap(234925)
                                    .frequencyGoal(777832)
                                    .resetIntervalInMinutes(629784)
                                    .build()))
                            .build())
                        .adGroups(List.of(
                            CampaignCreateWorkflowAdGroupInput.builder()
                                .primaryInput(AdGroupCreateWorkflowPrimaryInput.builder()
                                    .name("<value>")
                                    .channel(AdGroupChannel.DISPLAY)
                                    .funnelLocation(AdGroupFunnelLocation.AWARENESS)
                                    .isEnabled(true)
                                    .description("scenario dish gracefully through tame yahoo pension husband as atop")
                                    .budget(AdGroupWorkflowBudgetInput.builder()
                                        .allocationType(AllocationType.MAXIMUM)
                                        .budgetInAdvertiserCurrency(2283.06)
                                        .budgetInImpressions(301691L)
                                        .dailyTargetInAdvertiserCurrency(9268.18)
                                        .dailyTargetInImpressions(851470L)
                                        .build())
                                    .baseBidCPMInAdvertiserCurrency(694.78)
                                    .maxBidCPMInAdvertiserCurrency(6084.4)
                                    .audienceTargeting(AdGroupWorkflowAudienceTargetingInput.builder()
                                        .audienceId(StringWorkflowsOptional.builder()
                                            .value("<value>")
                                            .build())
                                        .audienceAcceleratorExclusionsEnabled(true)
                                        .audienceBoosterEnabled(false)
                                        .audienceExcluderEnabled(true)
                                        .audiencePredictorEnabled(false)
                                        .crossDeviceVendorListForAudience(List.of(
                                            497890,
                                            566253))
                                        .recencyExclusionWindowInMinutes(742665)
                                        .targetTrackableUsersEnabled(true)
                                        .useMcIdAsPrimary(true)
                                        .build())
                                    .roiGoal(AdGroupWorkflowROIGoalInput.builder()
                                        .maximizeReach(false)
                                        .maximizeLtvIncrementalReach(true)
                                        .cpcInAdvertiserCurrency(9062.02)
                                        .ctrInPercent(7192.99)
                                        .nielsenOTPInPercent(2823.22)
                                        .cpaInAdvertiserCurrency(3140.25)
                                        .returnOnAdSpendPercent(6857.21)
                                        .vcrInPercent(2704.73)
                                        .viewabilityInPercent(2247.4)
                                        .vcpmInAdvertiserCurrency(8383.69)
                                        .cpcvInAdvertiserCurrency(4755.8)
                                        .miaozhenOTPInPercent(4575.86)
                                        .newBuyerTargetValue(528676)
                                        .build())
                                    .associatedBidLists(List.of(
                                        AdGroupWorkflowAssociateBidListInput.builder()
                                            .bidListId("<id>")
                                            .isEnabled(true)
                                            .isDefaultForDimension(false)
                                            .build()))
                                    .creativeIds(List.of(
                                        "<value 1>",
                                        "<value 2>"))
                                    .ownedBidLists(List.of(
                                        AdGroupCreateWorkflowOwnedBidListInput.builder()
                                            .name("<value>")
                                            .adjustmentType(BidListAdjustmentType.EXCLUSION)
                                            .resolutionType(MultipleMatchResolutionType.APPLY_MULTIPLY_ADJUSTMENT)
                                            .dimensions(List.of(
                                                BidListDimension.HAS_DOUBLE_VERIFY_AUTHENTIC_BRAND_SAFETY_CATEGORY_ID))
                                            .bidLines(List.of(
                                                BidLineCreateInput.builder()
                                                    .adFormatId("<id>")
                                                    .domainFragment("<value>")
                                                    .universalCategoryTaxonomyId("<id>")
                                                    .browser(Browser.OTHER)
                                                    .browserId(BrowserInput.IN_APP)
                                                    .carrierId("<id>")
                                                    .deviceModelId(525880)
                                                    .deviceType(DeviceType.TABLET)
                                                    .geoSegmentId("<id>")
                                                    .hourOfWeek(114291)
                                                    .languageId("<id>")
                                                    .osName("<value>")
                                                    .privateContractId("<id>")
                                                    .recencyWindowInMinutes(Int32Range.builder()
                                                        .min(873714)
                                                        .max(306309)
                                                        .build())
                                                    .renderingContext(RenderingContext.MOBILE_OPTIMIZED_WEB)
                                                    .supplyVendorId("<id>")
                                                    .temperatureBucketInCelsius(DecimalRange.builder()
                                                        .min(2847.66)
                                                        .max(8240.9)
                                                        .build())
                                                    .adsTxtSellerType(AdsTxtSellerType.RESELLER)
                                                    .videoMutedState(VideoMutedState.INFREQUENTLY_AUTO_MUTED)
                                                    .videoPlaybackType(VideoPlaybackType.MID_ROLL)
                                                    .videoPlayerSize(VideoPlayerSize.LARGE)
                                                    .videoQuality(VideoQuality.PROFESSIONAL)
                                                    .videoSkippability(VideoSkippability.UNKNOWN)
                                                    .factualProximityTarget(FactualProximityTargetInput.builder()
                                                        .targetingCodeId(930903)
                                                        .designId(152838)
                                                        .build())
                                                    .impressionPlacementValue("<value>")
                                                    .videoTruthScoreRange(DecimalRange.builder()
                                                        .min(4696.75)
                                                        .max(4690.83)
                                                        .build())
                                                    .videoViewabilityScoreRange(DecimalRange.builder()
                                                        .min(2701.91)
                                                        .max(3242.2)
                                                        .build())
                                                    .displayViewabilityScoreRange(DecimalRange.builder()
                                                        .min(7727.31)
                                                        .max(7836.48)
                                                        .build())
                                                    .peer39LanguageId("<id>")
                                                    .doubleVerifyBotAvoidanceCategory(DoubleVerifyBotAvoidance.FRAUD_INVALID)
                                                    .contextualAppCategoryId("<id>")
                                                    .publisherId("<id>")
                                                    .integralViewabilityCategoryId("<id>")
                                                    .integralViewabilityCategory(IntegralViewabilityInput.IN_VIEW60)
                                                    .integralVideoViewabilityCategoryId("<id>")
                                                    .integralVideoViewabilityCategory(IntegralVideoViewabilityInput.IN_VIEW60)
                                                    .doubleVerifyViewabilityCategory(DoubleVerifyDisplayViewability.TOP75)
                                                    .doubleVerifyVideoViewabilityCategory(DoubleVerifyVideoViewability.VIEWABILITY70)
                                                    .peer39ViewabilityCategoryId("<id>")
                                                    .peer39ViewabilityCategory(Peer39ViewabilityInput.TOP80)
                                                    .videoCompletionRateScoreRange(DecimalRange.builder()
                                                        .min(3010.92)
                                                        .max(7910.27)
                                                        .build())
                                                    .internetConnectionInput(InternetConnectionTypeInput.CELLULAR_NETWORK3_G)
                                                    .internetConnectionTypeId(InternetConnectionTypeInput.WI_FI)
                                                    .internetConnection(InternetConnectionType.CELLULAR_NETWORK5_G)
                                                    .rtbAsiaPageQualityCategory(RTBAsiaViewability.BLOCK_HIGH_RISK)
                                                    .rtbAsiaVideoPageQualityCategory(RTBAsiaViewability.BLOCK_MODERATE_AND_HIGH_RISK)
                                                    .supplyPathOptimizationListId(46703)
                                                    .marketType(MarketTypeBidList.NON_PMP_FIXED)
                                                    .weatherCondition(WeatherCondition.CLOUDS)
                                                    .frequencyAdjustment(FrequencyAdjustmentInput.builder()
                                                        .counterId("<id>")
                                                        .timesShown(Int32Range.builder()
                                                            .min(905935)
                                                            .max(JsonNullable.of(null))
                                                            .build())
                                                        .build())
                                                    .sellerDomain("<value>")
                                                    .digitalOutOfHomeVenueTypeId("<id>")
                                                    .nativePlacementType(NativePlacementType.OUTSIDE_CONTENT)
                                                    .nativeContextType(NativeContextType.UNCLASSIFIED)
                                                    .idiosyncraticSegment(IdiosyncraticSegment.LIGHT_TV_VIEWERS)
                                                    .tencentPageQualityCategory(TencentPageQualityInput.BLOCK_HIGH_RISK)
                                                    .domainClassId(474920)
                                                    .geofenceThirdPartyDataAndBrand(GeofenceThirdPartyDataAndBrandInput.builder()
                                                        .dataId(321221L)
                                                        .brandId("<id>")
                                                        .build())
                                                    .genreId("<id>")
                                                    .livestream(Livestream.UNKNOWN)
                                                    .productionQuality(ProductionQuality.PROSUMER)
                                                    .productionQualityId(ProductionQualityInput.PROSUMER)
                                                    .contentRatingId("<id>")
                                                    .contentDuration(ContentDuration.BETWEEN15_AND30_MINUTES)
                                                    .qualityScoreRange(DecimalRange.builder()
                                                        .min(8050.14)
                                                        .max(JsonNullable.of(null))
                                                        .build())
                                                    .atmosphericCondition(AtmosphericCondition.HIGH)
                                                    .marketplaceId(JsonNullable.of(null))
                                                    .audienceReachPercentageTier(AudienceReachPercentageTier.TIER4)
                                                    .contentTransparency(ContentTransparency.NON_TRANSPARENT)
                                                    .fullReferrerUrl(FullReferrerUrl.FULL_URL)
                                                    .likelyRefreshRate(LikelyRefreshRate.BETWEEN30_AND60)
                                                    .rewarded(Rewarded.UNKNOWN)
                                                    .feedId(JsonNullable.of(null))
                                                    .liveEventId("<id>")
                                                    .liveEventTypeId("<id>")
                                                    .extendedZipCodeGroupSegmentThirdPartyDataId(307404L)
                                                    .contentLanguageId("<id>")
                                                    .adToContentRatioRange(DecimalRange.builder()
                                                        .min(2533.55)
                                                        .max(8367.33)
                                                        .build())
                                                    .adsInViewRange(DecimalRange.builder()
                                                        .min(1738.34)
                                                        .max(6682d)
                                                        .build())
                                                    .bidAdjustment(9268.18)
                                                    .volumeControlPriority(VolumeControlPriority.TWO)
                                                    .maxBid(2888.48)
                                                    .build()))
                                            .source(BidListSource.USER)
                                            .associateBehavior(BidListAssociateBehavior.ASSOCIATE)
                                            .dimensionConfig(BidListDimensionOptionsInput.builder()
                                                .geo(GeoBidListOptionsInput.builder()
                                                    .locationContextType(LocationContextTypeInput.HOME)
                                                    .build())
                                                .build())
                                            .isDefaultForDimension(false)
                                            .build()))
                                    .marketType(MarketTypeInput.PRIVATE_MARKET_ONLY)
                                    .programmaticGuaranteedPrivateContractId("<id>")
                                    .includeDefaultsFromCampaign(true)
                                    .build())
                                .advancedInput(CampaignCreateWorkflowAdGroupAdvancedInput.builder()
                                    .koaOptimizationSettings(AdGroupWorkflowKoaOptimizationSettingsInput.builder()
                                        .areFutureKoaFeaturesEnabled(true)
                                        .predictiveClearingEnabled(false)
                                        .build())
                                    .comscoreSettings(AdGroupWorkflowComscoreSettingsInput.builder()
                                        .isEnabled(false)
                                        .populationId(559587)
                                        .demographicMemberIds(List.of(
                                            139340,
                                            129935))
                                        .mobileDemographicMemberIds(JsonNullable.of(null))
                                        .build())
                                    .contractTargeting(AdGroupWorkflowContractTargetingInput.builder()
                                        .allowOpenMarketBiddingWhenTargetingContracts(true)
                                        .build())
                                    .dimensionalBiddingAutoOptimizationSettings(List.of(
                                        List.of(
                                            DimensionalBiddingDimensions.HAS_AUDIENCE_REACH_PERCENTAGE_TIER_ID),
                                        List.of()))
                                    .isUseClicksAsConversionsEnabled(false)
                                    .isUseSecondaryConversionsEnabled(true)
                                    .nielsenTrackingAttributes(AdGroupWorkflowNielsenTrackingAttributesInput.builder()
                                        .gender(TargetingGenderInput.FEMALE)
                                        .startAge(TargetingStartAgeInput.THIRTY_FIVE)
                                        .endAge(TargetingEndAgeInput.TWENTY_FOUR)
                                        .countries(List.of(
                                            "<value 1>",
                                            "<value 2>"))
                                        .enhancedReportingOption(EnhancedNielsenReportingOptionsInput.NONE)
                                        .build())
                                    .newFrequencyConfigs(JsonNullable.of(null))
                                    .inventoryTargeting(AdGroupWorkflowInventoryTargetingInput.builder()
                                        .dealGroupIdsToInclude(List.of(
                                            "<value 1>"))
                                        .dealGroupIdsToExclude(List.of(
                                            "<value 1>",
                                            "<value 2>",
                                            "<value 3>"))
                                        .dealIdsToExclude(List.of(
                                            169634L))
                                        .dealIdsToInclude(List.of(
                                            356532L,
                                            584209L))
                                        .includeDefaultOnDeals(true)
                                        .build())
                                    .isNonDecisioned(false)
                                    .includeDefaultsFromCampaign(true)
                                    .flights(List.of(
                                        CampaignCreateWorkflowAdGroupFlightInput.builder()
                                            .allocationType(AllocationType.MAXIMUM)
                                            .budgetInAdvertiserCurrency(4838.47)
                                            .budgetInImpressions(420224L)
                                            .dailyTargetInAdvertiserCurrency(1513.78)
                                            .dailyTargetInImpressions(735500L)
                                            .build()))
                                    .build())
                                .build()))
                        .build()))
                .validateInputOnly(true)
                .callbackInput(WorkflowCallbackInput.builder()
                    .callbackUrl("https://impeccable-pick.com/")
                    .callbackHeaders(Map.ofEntries(
                        Map.entry("key", "<value>")))
                    .build())
                .build();

        CreateCampaignsJobResponse res = sdk.campaign().createCampaignsJob()
                .request(req)
                .call();

        if (res.standardJobSubmitResponse().isPresent()) {
            System.out.println(res.standardJobSubmitResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                             | [CampaignBulkCreateWorkflowInputWithValidation](../../models/shared/CampaignBulkCreateWorkflowInputWithValidation.md) | :heavy_check_mark:                                                                                                    | The request object to use for the request.                                                                            |

### Response

**[CreateCampaignsJobResponse](../../models/operations/CreateCampaignsJobResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/ProblemDetailsException | 400, 403                              | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |

## updateCampaignsJob

Only the fields provided in the request payload for each specific campaign will be updated.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCampaignsJob" method="patch" path="/standardjob/campaign/bulk" -->
```java
package hello.world;

import com.thetradedesk.workflows.Workflows;
import com.thetradedesk.workflows.models.components.*;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.UpdateCampaignsJobResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        Workflows sdk = Workflows.builder()
                .ttdAuth(System.getenv().getOrDefault("WORKFLOWS_TTD_AUTH", ""))
            .build();

        CampaignBulkUpdateWorkflowInputWithValidation req = CampaignBulkUpdateWorkflowInputWithValidation.builder()
                .input(List.of(
                    CampaignUpdateWorkflowInput.builder()
                        .id("<id>")
                        .primaryInput(CampaignUpdateWorkflowPrimaryInput.builder()
                            .description("hmph energetically yet surprisingly swift knight swear multicolored absent")
                            .campaignGroupId(645576L)
                            .timeZone("America/Argentina/San_Juan")
                            .customCPAClickWeight(JsonNullable.of(null))
                            .customCPAViewthroughWeight(8361.84)
                            .customCPAType(CustomCPAType.PIXEL_WEIGHTING)
                            .customRoasType(CustomROASType.CLICK_VIEWTHROUGH_WEIGHTING)
                            .impressionsOnlyBudgetingCpm(2706.4)
                            .endDateInUtc(OffsetDateTime.parse("2023-11-11T21:39:56.025Z"))
                            .seedId("<id>")
                            .campaignConversionReportingColumns(List.of(
                                CampaignWorkflowCampaignConversionReportingColumnInput.builder()
                                    .trackingTagId("<id>")
                                    .includeInCustomCPA(true)
                                    .reportingColumnId(809247)
                                    .roasConfig(CustomROASConfig.builder()
                                        .includeInCustomROAS(false)
                                        .customROASWeight(JsonNullable.of(null))
                                        .customROASClickWeight(JsonNullable.of(null))
                                        .customROASViewthroughWeight(6784.9)
                                        .build())
                                    .productListReportingType(ProductListReportingTypeInput.HALO)
                                    .weight(2260.69)
                                    .crossDeviceAttributionModelId("<id>")
                                    .build()))
                            .isManagedByTTD(true)
                            .secondaryGoal(CampaignWorkflowROIGoalInput.builder()
                                .maximizeReach(false)
                                .maximizeLtvIncrementalReach(false)
                                .cpcInAdvertiserCurrency(JsonNullable.of(null))
                                .ctrInPercent(JsonNullable.of(null))
                                .nielsenOTPInPercent(5546.51)
                                .cpaInAdvertiserCurrency(7735.11)
                                .returnOnAdSpendPercent(5459.4)
                                .vcrInPercent(7724.91)
                                .viewabilityInPercent(JsonNullable.of(null))
                                .vcpmInAdvertiserCurrency(9927d)
                                .cpcvInAdvertiserCurrency(1852.41)
                                .miaozhenOTPInPercent(2827.93)
                                .iqviaAudienceQualityIndex(false)
                                .crossixAudienceQualityIndex(JsonNullable.of(null))
                                .iqviaAudienceQualityIndexAndCostPerTarget(false)
                                .crossixCostPerTarget(true)
                                .pharmaOptimization(false)
                                .newBuyerTargetValue(201033)
                                .build())
                            .tertiaryGoal(CampaignWorkflowROIGoalInput.builder()
                                .maximizeReach(false)
                                .maximizeLtvIncrementalReach(false)
                                .cpcInAdvertiserCurrency(7329.7)
                                .ctrInPercent(9103.24)
                                .nielsenOTPInPercent(2359.55)
                                .cpaInAdvertiserCurrency(6489.19)
                                .returnOnAdSpendPercent(8265.87)
                                .vcrInPercent(JsonNullable.of(null))
                                .viewabilityInPercent(6404.44)
                                .vcpmInAdvertiserCurrency(1278.49)
                                .cpcvInAdvertiserCurrency(9238.19)
                                .miaozhenOTPInPercent(8948.48)
                                .iqviaAudienceQualityIndex(true)
                                .crossixAudienceQualityIndex(false)
                                .iqviaAudienceQualityIndexAndCostPerTarget(false)
                                .crossixCostPerTarget(true)
                                .pharmaOptimization(false)
                                .newBuyerTargetValue(83180)
                                .build())
                            .name("<value>")
                            .primaryChannel(CampaignChannelType.NONE)
                            .primaryGoal(CampaignWorkflowROIGoalInput.builder()
                                .maximizeReach(true)
                                .maximizeLtvIncrementalReach(false)
                                .cpcInAdvertiserCurrency(3354.68)
                                .ctrInPercent(7716.49)
                                .nielsenOTPInPercent(JsonNullable.of(null))
                                .cpaInAdvertiserCurrency(381.7)
                                .returnOnAdSpendPercent(8461.44)
                                .vcrInPercent(4170.61)
                                .viewabilityInPercent(5364.85)
                                .vcpmInAdvertiserCurrency(1107.08)
                                .cpcvInAdvertiserCurrency(JsonNullable.of(null))
                                .miaozhenOTPInPercent(4584.96)
                                .iqviaAudienceQualityIndex(true)
                                .crossixAudienceQualityIndex(false)
                                .iqviaAudienceQualityIndexAndCostPerTarget(true)
                                .crossixCostPerTarget(true)
                                .pharmaOptimization(JsonNullable.of(null))
                                .newBuyerTargetValue(554651)
                                .build())
                            .startDateInUtc(OffsetDateTime.parse("2023-01-13T23:06:05.083Z"))
                            .budget(CampaignUpdateWorkflowBudgetInput.builder()
                                .pacingMode(CampaignPacingMode.PACE_AS_SOON_AS_POSSIBLE)
                                .build())
                            .pharmaOptimizationGoalSettingUpdates(List.of(
                                CampaignWorkflowPharmaOptimizationGoalSettingInput.builder()
                                    .goalPriority(GoalPriorityInput.TERTIARY)
                                    .metricWeights(List.of())
                                    .build()))
                            .build())
                        .advancedInput(CampaignUpdateWorkflowAdvancedInput.builder()
                            .purchaseOrderNumber("<value>")
                            .build())
                        .build()))
                .validateInputOnly(true)
                .callbackInput(WorkflowCallbackInput.builder()
                    .callbackUrl("https://soggy-apparatus.org/")
                    .callbackHeaders(Map.ofEntries(
                        Map.entry("key", "<value>"),
                        Map.entry("key1", "<value>"),
                        Map.entry("key2", "<value>")))
                    .build())
                .build();

        UpdateCampaignsJobResponse res = sdk.campaign().updateCampaignsJob()
                .request(req)
                .call();

        if (res.campaignPayload().isPresent()) {
            System.out.println(res.campaignPayload().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                             | [CampaignBulkUpdateWorkflowInputWithValidation](../../models/shared/CampaignBulkUpdateWorkflowInputWithValidation.md) | :heavy_check_mark:                                                                                                    | The request object to use for the request.                                                                            |

### Response

**[UpdateCampaignsJobResponse](../../models/operations/UpdateCampaignsJobResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/ProblemDetailsException | 400, 403                              | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |

## archiveCampaigns

**NOTE**: Once archived, campaigns cannot be un-archived.

### Example Usage

<!-- UsageSnippet language="java" operationID="archiveCampaigns" method="post" path="/campaign/archive" -->
```java
package hello.world;

import com.thetradedesk.workflows.Workflows;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.ArchiveCampaignsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        Workflows sdk = Workflows.builder()
                .ttdAuth(System.getenv().getOrDefault("WORKFLOWS_TTD_AUTH", ""))
            .build();

        ArchiveCampaignsResponse res = sdk.campaign().archiveCampaigns()
                .forceArchive(false)
                .requestBody(List.of(
                    "<value 1>",
                    "<value 2>",
                    "<value 3>"))
                .call();

        if (res.strings().isPresent()) {
            System.out.println(res.strings().get());
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

**[ArchiveCampaignsResponse](../../models/operations/ArchiveCampaignsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/ProblemDetailsException | 400, 403                              | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |

## getVersion

Get a campaign's version

### Example Usage

<!-- UsageSnippet language="java" operationID="getCampaignVersion" method="get" path="/campaign/{id}/version" -->
```java
package hello.world;

import com.thetradedesk.workflows.Workflows;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.GetCampaignVersionResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        Workflows sdk = Workflows.builder()
                .ttdAuth(System.getenv().getOrDefault("WORKFLOWS_TTD_AUTH", ""))
            .build();

        GetCampaignVersionResponse res = sdk.campaign().getVersion()
                .id("<id>")
                .call();

        if (res.campaignVersionWorkflow().isPresent()) {
            System.out.println(res.campaignVersionWorkflow().get());
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `id`               | *String*           | :heavy_check_mark: | N/A                |

### Response

**[GetCampaignVersionResponse](../../models/operations/GetCampaignVersionResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/ProblemDetailsException | 400, 401, 403, 404                    | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |