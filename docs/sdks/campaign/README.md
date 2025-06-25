# Campaign
(*campaign()*)

## Overview

### Available Operations

* [create](#create) - Create a new campaign with required fields
* [patchCampaign](#patchcampaign) - Update a campaign with specified fields
* [postTypebasedjobCampaignBulk](#posttypebasedjobcampaignbulk) - Create multiple new campaigns with required fields
* [patchTypebasedjobCampaignBulk](#patchtypebasedjobcampaignbulk) - Update multiple campaigns with specified fields
* [postCampaignArchive](#postcampaignarchive) - Archive multiple campaigns
* [getVersion](#getversion) - Get a campaign's version

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
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        TtdWorkflows sdk = TtdWorkflows.builder()
                .ttdAuth("<YOUR_API_KEY_HERE>")
            .build();

        CampaignCreateWorkflowInputWithValidation req = CampaignCreateWorkflowInputWithValidation.builder()
                .primaryInput(CampaignCreateWorkflowPrimaryInput.builder()
                    .advertiserId("<id>")
                    .name("<value>")
                    .primaryChannel(CampaignChannelType.NATIVE_VIDEO)
                    .primaryGoal(CampaignWorkflowROIGoalInput.builder()
                        .maximizeReach(true)
                        .maximizeLtvIncrementalReach(true)
                        .cpcInAdvertiserCurrency(8043.58)
                        .ctrInPercent(5969.41)
                        .nielsenOTPInPercent(2053.15)
                        .cpaInAdvertiserCurrency(1984.87)
                        .returnOnAdSpendPercent(JsonNullable.of(null))
                        .vcrInPercent(8220.61)
                        .viewabilityInPercent(3757.54)
                        .vcpmInAdvertiserCurrency(5996.9)
                        .cpcvInAdvertiserCurrency(JsonNullable.of(null))
                        .miaozhenOTPInPercent(9595.06)
                        .build())
                    .description("brightly once incidentally biodegrade waterlogged geez quaff coolly remark")
                    .timeZone("America/Martinique")
                    .customCPAClickWeight(8565.86)
                    .customCPAViewthroughWeight(4944.28)
                    .customCPAType(CustomCPAType.DISABLED)
                    .impressionsOnlyBudgetingCpm(3563.37)
                    .budget(CampaignWorkflowBudgetInput.builder()
                        .pacingMode(CampaignPacingMode.PACE_AS_SOON_AS_POSSIBLE)
                        .budgetInAdvertiserCurrency(3004.71)
                        .budgetInImpressions(470604L)
                        .dailyTargetInAdvertiserCurrency(6178.77)
                        .dailyTargetInImpressions(229960L)
                        .build())
                    .endDateInUtc(OffsetDateTime.parse("2023-10-12T00:18:24.941Z"))
                    .seedId("<id>")
                    .campaignConversionReportingColumns(List.of(
                        CampaignWorkflowCampaignConversionReportingColumnInput.builder()
                            .trackingTagId("<id>")
                            .includeInCustomCPA(false)
                            .reportingColumnId(637398)
                            .roasConfig(CustomROASConfig.builder()
                                .includeInCustomROAS(false)
                                .customROASWeight(6976.5)
                                .customROASClickWeight(3551.1)
                                .customROASViewthroughWeight(4100.93)
                                .build())
                            .weight(2092.05)
                            .crossDeviceAttributionModelId("<id>")
                            .build(),
                        CampaignWorkflowCampaignConversionReportingColumnInput.builder()
                            .trackingTagId("<id>")
                            .includeInCustomCPA(false)
                            .reportingColumnId(637398)
                            .roasConfig(CustomROASConfig.builder()
                                .includeInCustomROAS(false)
                                .customROASWeight(6976.5)
                                .customROASClickWeight(3551.1)
                                .customROASViewthroughWeight(4100.93)
                                .build())
                            .weight(2092.05)
                            .crossDeviceAttributionModelId("<id>")
                            .build(),
                        CampaignWorkflowCampaignConversionReportingColumnInput.builder()
                            .trackingTagId("<id>")
                            .includeInCustomCPA(false)
                            .reportingColumnId(637398)
                            .roasConfig(CustomROASConfig.builder()
                                .includeInCustomROAS(false)
                                .customROASWeight(6976.5)
                                .customROASClickWeight(3551.1)
                                .customROASViewthroughWeight(4100.93)
                                .build())
                            .weight(2092.05)
                            .crossDeviceAttributionModelId("<id>")
                            .build()))
                    .startDateInUtc(OffsetDateTime.parse("2025-11-14T15:34:57.905Z"))
                    .build())
                .advancedInput(CampaignWorkflowAdvancedInput.builder()
                    .flights(List.of(
                        CampaignWorkflowFlightInput.builder()
                            .startDateInclusiveUTC(OffsetDateTime.parse("2025-03-12T15:05:09.942Z"))
                            .budgetInAdvertiserCurrency(4180.14)
                            .endDateExclusiveUTC(OffsetDateTime.parse("2023-09-04T20:53:09.531Z"))
                            .budgetInImpressions(222439L)
                            .dailyTargetInAdvertiserCurrency(7167.72)
                            .dailyTargetInImpressions(948610L)
                            .build(),
                        CampaignWorkflowFlightInput.builder()
                            .startDateInclusiveUTC(OffsetDateTime.parse("2025-03-12T15:05:09.942Z"))
                            .budgetInAdvertiserCurrency(4180.14)
                            .endDateExclusiveUTC(OffsetDateTime.parse("2023-09-04T20:53:09.531Z"))
                            .budgetInImpressions(222439L)
                            .dailyTargetInAdvertiserCurrency(7167.72)
                            .dailyTargetInImpressions(948610L)
                            .build()))
                    .purchaseOrderNumber("<value>")
                    .build())
                .adGroups(JsonNullable.of(null))
                .validateInputOnly(false)
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

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [CampaignCreateWorkflowInputWithValidation](../../models/shared/CampaignCreateWorkflowInputWithValidation.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |

### Response

**[PostCampaignResponse](../../models/operations/PostCampaignResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/ProblemDetailsException | 400, 403                              | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |

## patchCampaign

Only the fields provided in the request payload will be updated.

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
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        TtdWorkflows sdk = TtdWorkflows.builder()
                .ttdAuth("<YOUR_API_KEY_HERE>")
            .build();

        CampaignUpdateWorkflowInputWithValidation req = CampaignUpdateWorkflowInputWithValidation.builder()
                .id("<id>")
                .primaryInput(CampaignUpdateWorkflowPrimaryInput.builder()
                    .description("until notwithstanding bump")
                    .timeZone(JsonNullable.of(null))
                    .customCPAClickWeight(6995)
                    .customCPAViewthroughWeight(8563.38)
                    .customCPAType(CustomCPAType.DISABLED)
                    .impressionsOnlyBudgetingCpm(8246.96)
                    .budget(CampaignWorkflowBudgetInput.builder()
                        .pacingMode(CampaignPacingMode.PACE_EVENLY)
                        .budgetInAdvertiserCurrency(8712.02)
                        .budgetInImpressions(JsonNullable.of(null))
                        .dailyTargetInAdvertiserCurrency(8897.46)
                        .dailyTargetInImpressions(665232L)
                        .build())
                    .endDateInUtc(JsonNullable.of(null))
                    .seedId("<id>")
                    .campaignConversionReportingColumns(List.of(
                        CampaignWorkflowCampaignConversionReportingColumnInput.builder()
                            .trackingTagId("<id>")
                            .includeInCustomCPA(true)
                            .reportingColumnId(97349)
                            .roasConfig(CustomROASConfig.builder()
                                .includeInCustomROAS(false)
                                .customROASWeight(4101.84)
                                .customROASClickWeight(JsonNullable.of(null))
                                .customROASViewthroughWeight(4368.63)
                                .build())
                            .weight(7340.95)
                            .crossDeviceAttributionModelId("<id>")
                            .build(),
                        CampaignWorkflowCampaignConversionReportingColumnInput.builder()
                            .trackingTagId("<id>")
                            .includeInCustomCPA(true)
                            .reportingColumnId(97349)
                            .roasConfig(CustomROASConfig.builder()
                                .includeInCustomROAS(false)
                                .customROASWeight(4101.84)
                                .customROASClickWeight(JsonNullable.of(null))
                                .customROASViewthroughWeight(4368.63)
                                .build())
                            .weight(7340.95)
                            .crossDeviceAttributionModelId("<id>")
                            .build(),
                        CampaignWorkflowCampaignConversionReportingColumnInput.builder()
                            .trackingTagId("<id>")
                            .includeInCustomCPA(true)
                            .reportingColumnId(97349)
                            .roasConfig(CustomROASConfig.builder()
                                .includeInCustomROAS(false)
                                .customROASWeight(4101.84)
                                .customROASClickWeight(JsonNullable.of(null))
                                .customROASViewthroughWeight(4368.63)
                                .build())
                            .weight(7340.95)
                            .crossDeviceAttributionModelId("<id>")
                            .build()))
                    .name("<value>")
                    .primaryChannel(CampaignChannelType.NONE)
                    .primaryGoal(CampaignWorkflowROIGoalInput.builder()
                        .maximizeReach(false)
                        .maximizeLtvIncrementalReach(true)
                        .cpcInAdvertiserCurrency(8699.49)
                        .ctrInPercent(8949.6)
                        .nielsenOTPInPercent(37.27)
                        .cpaInAdvertiserCurrency(3521.28)
                        .returnOnAdSpendPercent(7256.13)
                        .vcrInPercent(5452.85)
                        .viewabilityInPercent(737.27)
                        .vcpmInAdvertiserCurrency(1743.53)
                        .cpcvInAdvertiserCurrency(JsonNullable.of(null))
                        .miaozhenOTPInPercent(5666.12)
                        .build())
                    .startDateInUtc(OffsetDateTime.parse("2023-03-15T19:37:35.952Z"))
                    .build())
                .advancedInput(CampaignWorkflowAdvancedInput.builder()
                    .flights(List.of(
                        CampaignWorkflowFlightInput.builder()
                            .startDateInclusiveUTC(OffsetDateTime.parse("2023-06-20T19:40:02.162Z"))
                            .budgetInAdvertiserCurrency(8764.81)
                            .endDateExclusiveUTC(OffsetDateTime.parse("2025-01-24T04:52:37.846Z"))
                            .budgetInImpressions(472441L)
                            .dailyTargetInAdvertiserCurrency(5399.55)
                            .dailyTargetInImpressions(808445L)
                            .build(),
                        CampaignWorkflowFlightInput.builder()
                            .startDateInclusiveUTC(OffsetDateTime.parse("2023-06-20T19:40:02.162Z"))
                            .budgetInAdvertiserCurrency(8764.81)
                            .endDateExclusiveUTC(OffsetDateTime.parse("2025-01-24T04:52:37.846Z"))
                            .budgetInImpressions(472441L)
                            .dailyTargetInAdvertiserCurrency(5399.55)
                            .dailyTargetInImpressions(808445L)
                            .build()))
                    .purchaseOrderNumber("<value>")
                    .build())
                .validateInputOnly(JsonNullable.of(null))
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

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [CampaignUpdateWorkflowInputWithValidation](../../models/shared/CampaignUpdateWorkflowInputWithValidation.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |

### Response

**[PatchCampaignResponse](../../models/operations/PatchCampaignResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/ProblemDetailsException | 400                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |

## postTypebasedjobCampaignBulk

Create multiple new campaigns with required fields

### Example Usage

```java
package hello.world;

import com.thetradedesk.workflows.TtdWorkflows;
import com.thetradedesk.workflows.models.components.*;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.PostTypebasedjobCampaignBulkResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        TtdWorkflows sdk = TtdWorkflows.builder()
                .ttdAuth("<YOUR_API_KEY_HERE>")
            .build();

        CampaignBulkCreateWorkflowInputWithValidation req = CampaignBulkCreateWorkflowInputWithValidation.builder()
                .input(List.of(
                    CampaignCreateWorkflowInput.builder()
                        .primaryInput(CampaignCreateWorkflowPrimaryInput.builder()
                            .advertiserId("<id>")
                            .name("<value>")
                            .primaryChannel(CampaignChannelType.NONE)
                            .primaryGoal(CampaignWorkflowROIGoalInput.builder()
                                .maximizeReach(JsonNullable.of(null))
                                .maximizeLtvIncrementalReach(true)
                                .cpcInAdvertiserCurrency(7342.9)
                                .ctrInPercent(4157.33)
                                .nielsenOTPInPercent(1508.37)
                                .cpaInAdvertiserCurrency(5200.65)
                                .returnOnAdSpendPercent(2714.64)
                                .vcrInPercent(4408.66)
                                .viewabilityInPercent(4646.22)
                                .vcpmInAdvertiserCurrency(5303.62)
                                .cpcvInAdvertiserCurrency(7628.07)
                                .miaozhenOTPInPercent(2965.51)
                                .build())
                            .description("terribly someplace deflect")
                            .timeZone("America/Miquelon")
                            .customCPAClickWeight(779.21)
                            .customCPAViewthroughWeight(1198.23)
                            .customCPAType(CustomCPAType.PIXEL_WEIGHTING)
                            .impressionsOnlyBudgetingCpm(5375.63)
                            .budget(CampaignWorkflowBudgetInput.builder()
                                .pacingMode(CampaignPacingMode.PACE_AHEAD)
                                .budgetInAdvertiserCurrency(4629.97)
                                .budgetInImpressions(808130L)
                                .dailyTargetInAdvertiserCurrency(4067.56)
                                .dailyTargetInImpressions(243576L)
                                .build())
                            .endDateInUtc(OffsetDateTime.parse("2025-12-15T08:27:00.961Z"))
                            .seedId(JsonNullable.of(null))
                            .campaignConversionReportingColumns(List.of(
                                CampaignWorkflowCampaignConversionReportingColumnInput.builder()
                                    .trackingTagId("<id>")
                                    .includeInCustomCPA(true)
                                    .reportingColumnId(265596)
                                    .roasConfig(CustomROASConfig.builder()
                                        .includeInCustomROAS(false)
                                        .customROASWeight(1659.76)
                                        .customROASClickWeight(7838.93)
                                        .customROASViewthroughWeight(7814.81)
                                        .build())
                                    .weight(9286.55)
                                    .crossDeviceAttributionModelId("<id>")
                                    .build()))
                            .startDateInUtc(JsonNullable.of(null))
                            .build())
                        .advancedInput(CampaignWorkflowAdvancedInput.builder()
                            .flights(List.of(
                                CampaignWorkflowFlightInput.builder()
                                    .startDateInclusiveUTC(OffsetDateTime.parse("2023-05-29T15:44:07.749Z"))
                                    .budgetInAdvertiserCurrency(9558.91)
                                    .endDateExclusiveUTC(OffsetDateTime.parse("2024-01-24T07:42:34.281Z"))
                                    .budgetInImpressions(73147L)
                                    .dailyTargetInAdvertiserCurrency(4332.71)
                                    .dailyTargetInImpressions(768928L)
                                    .build()))
                            .purchaseOrderNumber("<value>")
                            .build())
                        .adGroups(List.of(
                            CampaignCreateWorkflowAdGroupInput.builder()
                                .primaryInput(AdGroupCreateWorkflowPrimaryInput.builder()
                                    .name("<value>")
                                    .channel(AdGroupChannel.AUDIO)
                                    .funnelLocation(AdGroupFunnelLocation.AWARENESS)
                                    .isEnabled(true)
                                    .description(JsonNullable.of(null))
                                    .budget(AdGroupWorkflowBudgetInput.builder()
                                        .allocationType(AllocationType.MAXIMUM)
                                        .budgetInAdvertiserCurrency(6785.04)
                                        .budgetInImpressions(835320L)
                                        .dailyTargetInAdvertiserCurrency(4763.51)
                                        .dailyTargetInImpressions(267343L)
                                        .build())
                                    .baseBidCPMInAdvertiserCurrency(2929.53)
                                    .maxBidCPMInAdvertiserCurrency(3306.27)
                                    .audienceTargeting(AdGroupWorkflowAudienceTargetingInput.builder()
                                        .audienceId("<id>")
                                        .audienceAcceleratorExclusionsEnabled(true)
                                        .audienceBoosterEnabled(true)
                                        .audienceExcluderEnabled(false)
                                        .audiencePredictorEnabled(false)
                                        .crossDeviceVendorListForAudience(List.of(
                                            745991,
                                            421485,
                                            187325))
                                        .recencyExclusionWindowInMinutes(651644)
                                        .targetTrackableUsersEnabled(JsonNullable.of(null))
                                        .useMcIdAsPrimary(true)
                                        .build())
                                    .roiGoal(AdGroupWorkflowROIGoalInput.builder()
                                        .maximizeReach(false)
                                        .maximizeLtvIncrementalReach(false)
                                        .cpcInAdvertiserCurrency(3342.73)
                                        .ctrInPercent(8498.13)
                                        .nielsenOTPInPercent(JsonNullable.of(null))
                                        .cpaInAdvertiserCurrency(4541.91)
                                        .returnOnAdSpendPercent(1951.31)
                                        .vcrInPercent(4890.16)
                                        .viewabilityInPercent(7796.33)
                                        .vcpmInAdvertiserCurrency(9686.38)
                                        .cpcvInAdvertiserCurrency(5397.14)
                                        .miaozhenOTPInPercent(6837.51)
                                        .build())
                                    .creativeIds(JsonNullable.of(null))
                                    .associatedBidLists(List.of(
                                        AdGroupWorkflowAssociateBidListInput.builder()
                                            .bidListId("<id>")
                                            .isEnabled(false)
                                            .isDefaultForDimension(JsonNullable.of(null))
                                            .build()))
                                    .programmaticGuaranteedPrivateContractId("<id>")
                                    .build())
                                .advancedInput(CampaignCreateWorkflowAdGroupAdvancedInput.builder()
                                    .koaOptimizationSettings(AdGroupWorkflowKoaOptimizationSettingsInput.builder()
                                        .areFutureKoaFeaturesEnabled(JsonNullable.of(null))
                                        .predictiveClearingEnabled(true)
                                        .build())
                                    .comscoreSettings(AdGroupWorkflowComscoreSettingsInput.builder()
                                        .isEnabled(false)
                                        .populationId(392396)
                                        .demographicMemberIds(List.of(
                                            815546,
                                            208096,
                                            412653))
                                        .mobileDemographicMemberIds(JsonNullable.of(null))
                                        .build())
                                    .contractTargeting(AdGroupWorkflowContractTargetingInput.builder()
                                        .allowOpenMarketBiddingWhenTargetingContracts(true)
                                        .build())
                                    .dimensionalBiddingAutoOptimizationSettings(List.of(
                                        List.of(
                                            DimensionalBiddingDimensions.HAS_FREQUENCY_V2_ADJUSTMENT_ID)))
                                    .isUseClicksAsConversionsEnabled(false)
                                    .isUseSecondaryConversionsEnabled(true)
                                    .nielsenTrackingAttributes(AdGroupWorkflowNielsenTrackingAttributesInput.builder()
                                        .gender(TargetingGender.MALE)
                                        .startAge(TargetingStartAge.THIRTY)
                                        .endAge(TargetingEndAge.TWENTY_NINE)
                                        .countries(List.of(
                                            "<value 1>",
                                            "<value 2>"))
                                        .enhancedReportingOption(EnhancedNielsenReportingOptions.SITE)
                                        .build())
                                    .newFrequencyConfigs(List.of(
                                        AdGroupWorkflowNewFrequencyConfigInput.builder()
                                            .counterName("<value>")
                                            .frequencyCap(26304)
                                            .frequencyGoal(197135)
                                            .resetIntervalInMinutes(993919)
                                            .build()))
                                    .flights(List.of(
                                        CampaignCreateWorkflowAdGroupFlightInput.builder()
                                            .allocationType(AllocationType.FIXED)
                                            .budgetInAdvertiserCurrency(1254.25)
                                            .budgetInImpressions(426962L)
                                            .dailyTargetInAdvertiserCurrency(3971.88)
                                            .dailyTargetInImpressions(746686L)
                                            .build()))
                                    .build())
                                .build()))
                        .build()))
                .validateInputOnly(false)
                .callbackInput(WorkflowCallbackInput.builder()
                    .callbackUrl("https://neat-inspection.biz/")
                    .callbackHeaders(Map.ofEntries(
                        Map.entry("key", "<value>"),
                        Map.entry("key1", "<value>")))
                    .build())
                .build();

        PostTypebasedjobCampaignBulkResponse res = sdk.campaign().postTypebasedjobCampaignBulk()
                .request(req)
                .call();

        if (res.typeBasedJobSubmitResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                             | [CampaignBulkCreateWorkflowInputWithValidation](../../models/shared/CampaignBulkCreateWorkflowInputWithValidation.md) | :heavy_check_mark:                                                                                                    | The request object to use for the request.                                                                            |

### Response

**[PostTypebasedjobCampaignBulkResponse](../../models/operations/PostTypebasedjobCampaignBulkResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/ProblemDetailsException | 400, 403                              | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |

## patchTypebasedjobCampaignBulk

Only the fields provided in the request payload for each specific campaign will be updated.

### Example Usage

```java
package hello.world;

import com.thetradedesk.workflows.TtdWorkflows;
import com.thetradedesk.workflows.models.components.*;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.PatchTypebasedjobCampaignBulkResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        TtdWorkflows sdk = TtdWorkflows.builder()
                .ttdAuth("<YOUR_API_KEY_HERE>")
            .build();

        CampaignBulkUpdateWorkflowInputWithValidation req = CampaignBulkUpdateWorkflowInputWithValidation.builder()
                .input(List.of(
                    CampaignUpdateWorkflowInput.builder()
                        .id("<id>")
                        .primaryInput(CampaignUpdateWorkflowPrimaryInput.builder()
                            .description("dreamily oxygenate swine instead cannon indeed concerning clamp queasily")
                            .timeZone("America/North_Dakota/New_Salem")
                            .customCPAClickWeight(2069.39)
                            .customCPAViewthroughWeight(6500.84)
                            .customCPAType(CustomCPAType.CLICK_VIEWTHROUGH_WEIGHTING)
                            .impressionsOnlyBudgetingCpm(6512.22)
                            .budget(CampaignWorkflowBudgetInput.builder()
                                .pacingMode(CampaignPacingMode.PACE_EVENLY)
                                .budgetInAdvertiserCurrency(4239.6)
                                .budgetInImpressions(22149L)
                                .dailyTargetInAdvertiserCurrency(2521.81)
                                .dailyTargetInImpressions(843774L)
                                .build())
                            .endDateInUtc(OffsetDateTime.parse("2024-08-25T01:07:39.538Z"))
                            .seedId("<id>")
                            .campaignConversionReportingColumns(JsonNullable.of(null))
                            .name(JsonNullable.of(null))
                            .primaryChannel(CampaignChannelType.NATIVE_DISPLAY)
                            .primaryGoal(CampaignWorkflowROIGoalInput.builder()
                                .maximizeReach(false)
                                .maximizeLtvIncrementalReach(false)
                                .cpcInAdvertiserCurrency(7023.26)
                                .ctrInPercent(JsonNullable.of(null))
                                .nielsenOTPInPercent(7851.49)
                                .cpaInAdvertiserCurrency(JsonNullable.of(null))
                                .returnOnAdSpendPercent(8228.66)
                                .vcrInPercent(1734.42)
                                .viewabilityInPercent(9398.46)
                                .vcpmInAdvertiserCurrency(3476.53)
                                .cpcvInAdvertiserCurrency(6537.87)
                                .miaozhenOTPInPercent(4667.23)
                                .build())
                            .startDateInUtc(JsonNullable.of(null))
                            .build())
                        .advancedInput(CampaignWorkflowAdvancedInput.builder()
                            .flights(List.of(
                                CampaignWorkflowFlightInput.builder()
                                    .startDateInclusiveUTC(OffsetDateTime.parse("2025-05-03T18:31:10.973Z"))
                                    .budgetInAdvertiserCurrency(1936.69)
                                    .endDateExclusiveUTC(OffsetDateTime.parse("2023-02-05T18:37:52.192Z"))
                                    .budgetInImpressions(216227L)
                                    .dailyTargetInAdvertiserCurrency(3384.57)
                                    .dailyTargetInImpressions(677379L)
                                    .build()))
                            .purchaseOrderNumber("<value>")
                            .build())
                        .build()))
                .validateInputOnly(false)
                .callbackInput(WorkflowCallbackInput.builder()
                    .callbackUrl("https://hollow-rosemary.biz/")
                    .callbackHeaders(Map.ofEntries(
                        Map.entry("key", "<value>"),
                        Map.entry("key1", "<value>"),
                        Map.entry("key2", "<value>")))
                    .build())
                .build();

        PatchTypebasedjobCampaignBulkResponse res = sdk.campaign().patchTypebasedjobCampaignBulk()
                .request(req)
                .call();

        if (res.typeBasedJobSubmitResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                             | [CampaignBulkUpdateWorkflowInputWithValidation](../../models/shared/CampaignBulkUpdateWorkflowInputWithValidation.md) | :heavy_check_mark:                                                                                                    | The request object to use for the request.                                                                            |

### Response

**[PatchTypebasedjobCampaignBulkResponse](../../models/operations/PatchTypebasedjobCampaignBulkResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/ProblemDetailsException | 400, 403                              | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |

## postCampaignArchive

**NOTE**: Once archived, campaigns cannot be un-archived.

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
                .forceArchive(false)
                .requestBody(List.of(
                    "<value 1>"))
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

Get a campaign's version

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