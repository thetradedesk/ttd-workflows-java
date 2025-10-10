<!-- Start SDK Example Usage [usage] -->
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
                        .gender(TargetingGenderInput.MALE)
                        .startAge(TargetingStartAgeInput.TWENTY_FIVE)
                        .endAge(TargetingEndAgeInput.SEVENTEEN)
                        .countries(List.of(
                            "<value 1>",
                            "<value 2>",
                            "<value 3>"))
                        .enhancedReportingOption(EnhancedNielsenReportingOptionsInput.SITE)
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
<!-- End SDK Example Usage [usage] -->