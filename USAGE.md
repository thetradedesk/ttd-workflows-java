<!-- Start SDK Example Usage [usage] -->
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