<!-- Start SDK Example Usage [usage] -->
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
                .name("<value>")
                .channel(AdGroupChannel.NATIVE)
                .funnelLocation(AdGroupFunnelLocation.NONE)
                .campaignId("<id>")
                .isEnabled(true)
                .description("whose countess instead helplessly honestly unblinking hence opposite")
                .programmaticGuaranteedPrivateContractId("<id>")
                .budget(AdGroupBudgetInput.builder()
                    .allocationType(AllocationType.FIXED)
                    .budgetInAdvertiserCurrency(1255.27)
                    .budgetInImpressions(469226L)
                    .dailyTargetInAdvertiserCurrency(7461.36)
                    .dailyTargetInImpressions(790907L)
                    .build())
                .baseBidCPMInAdvertiserCurrency(310.16)
                .maxBidCPMInAdvertiserCurrency(2360.6)
                .audienceTargeting(AdGroupAudienceTargetingInput.builder()
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
                .roiGoal(AdGroupRoiGoalInput.builder()
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
                    AdGroupAssociateBidListInput.builder()
                        .bidListId("<id>")
                        .isEnabled(false)
                        .isDefaultForDimension(true)
                        .build(),
                    AdGroupAssociateBidListInput.builder()
                        .bidListId("<id>")
                        .isEnabled(true)
                        .isDefaultForDimension(false)
                        .build(),
                    AdGroupAssociateBidListInput.builder()
                        .bidListId("<id>")
                        .isEnabled(false)
                        .isDefaultForDimension(true)
                        .build()))
                .advancedSettings(AdGroupCreateAdvancedSettingsInput.builder()
                    .koaOptimizationSettings(AdGroupKoaOptimizationSettingsInput.builder()
                        .areFutureKoaFeaturesEnabled(true)
                        .predictiveClearingEnabled(true)
                        .build())
                    .comscoreSettings(AdGroupComscoreSettingsInput.builder()
                        .isEnabled(true)
                        .populationId(133150)
                        .demographicMemberIds(List.of(
                            199046))
                        .mobileDemographicMemberIds(List.of(
                            964861,
                            667844))
                        .build())
                    .contractTargeting(AdGroupContractTargetingInput.builder()
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
                    .nielsenTrackingAttributes(AdGroupNielsenTrackingAttributesInput.builder()
                        .gender(TargetingGender.FEMALE)
                        .startAge(TargetingStartAge.SIXTY_FIVE)
                        .endAge(TargetingEndAge.TWENTY_NINE)
                        .countries(List.of(
                            "<value>"))
                        .enhancedReportingOption(EnhancedNielsenReportingOptions.NONE)
                        .build())
                    .newFrequencyConfigs(List.of(
                        AdGroupNewFrequencyConfigInput.builder()
                            .counterName("<value>")
                            .frequencyCap(746348)
                            .frequencyGoal(510683)
                            .resetIntervalInMinutes(129092)
                            .build(),
                        AdGroupNewFrequencyConfigInput.builder()
                            .counterName("<value>")
                            .frequencyCap(755997)
                            .frequencyGoal(198769)
                            .resetIntervalInMinutes(168827)
                            .build()))
                    .flights(List.of(
                        AdGroupCreateAdGroupFlightInput.builder()
                            .campaignFlightId(136905L)
                            .allocationType(AllocationType.FIXED)
                            .budgetInAdvertiserCurrency(1595.69)
                            .budgetInImpressions(474397L)
                            .dailyTargetInAdvertiserCurrency(7814.66)
                            .dailyTargetInImpressions(542673L)
                            .build(),
                        AdGroupCreateAdGroupFlightInput.builder()
                            .campaignFlightId(186465L)
                            .allocationType(AllocationType.FIXED)
                            .budgetInAdvertiserCurrency(3145.56)
                            .budgetInImpressions(465009L)
                            .dailyTargetInAdvertiserCurrency(8108.2)
                            .dailyTargetInImpressions(109630L)
                            .build(),
                        AdGroupCreateAdGroupFlightInput.builder()
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
<!-- End SDK Example Usage [usage] -->