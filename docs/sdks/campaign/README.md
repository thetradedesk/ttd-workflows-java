# Campaign
(*campaign()*)

## Overview

### Available Operations

* [create](#create) - Create a new campaign with required fields
* [patchCampaign](#patchcampaign) - Update an existing campaign with specified fields
* [postCampaignBulk](#postcampaignbulk) - Create a list of campaigns with required fields. `ValidateInputOnly` value should be the same for all campaigns.
* [patchCampaignBulk](#patchcampaignbulk) - Update a list of existing campaigns with specified fields. `ValidateInputOnly` value should be the same for all campaigns.
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
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        TtdWorkflows sdk = TtdWorkflows.builder()
                .ttdAuth("<YOUR_API_KEY_HERE>")
            .build();

        CampaignUpdateWorkflowInputWithValidation req = CampaignUpdateWorkflowInputWithValidation.builder()
                .primaryInput(CampaignUpdateWorkflowPrimaryInput.builder()
                    .id("<id>")
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

## postCampaignBulk

Create a list of campaigns with required fields. `ValidateInputOnly` value should be the same for all campaigns.

### Example Usage

```java
package hello.world;

import com.thetradedesk.workflows.TtdWorkflows;
import com.thetradedesk.workflows.models.components.CampaignBulkCreateWorkflowInputWithValidation;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.PostCampaignBulkResponse;
import java.lang.Exception;
import java.util.Optional;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        TtdWorkflows sdk = TtdWorkflows.builder()
                .ttdAuth("<YOUR_API_KEY_HERE>")
            .build();

        CampaignBulkCreateWorkflowInputWithValidation req = CampaignBulkCreateWorkflowInputWithValidation.builder()
                .input(Optional.empty())
                .validateInputOnly(true)
                .build();

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

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                             | [CampaignBulkCreateWorkflowInputWithValidation](../../models/shared/CampaignBulkCreateWorkflowInputWithValidation.md) | :heavy_check_mark:                                                                                                    | The request object to use for the request.                                                                            |

### Response

**[PostCampaignBulkResponse](../../models/operations/PostCampaignBulkResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/ProblemDetailsException | 400, 403                              | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |

## patchCampaignBulk

Update a list of existing campaigns with specified fields. `ValidateInputOnly` value should be the same for all campaigns.

### Example Usage

```java
package hello.world;

import com.thetradedesk.workflows.TtdWorkflows;
import com.thetradedesk.workflows.models.components.*;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.PatchCampaignBulkResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        TtdWorkflows sdk = TtdWorkflows.builder()
                .ttdAuth("<YOUR_API_KEY_HERE>")
            .build();

        CampaignBulkUpdateWorkflowInputWithValidation req = CampaignBulkUpdateWorkflowInputWithValidation.builder()
                .input(List.of(
                    CampaignUpdateWorkflowInput.builder()
                        .primaryInput(CampaignUpdateWorkflowPrimaryInput.builder()
                            .id("<id>")
                            .description("make innocently gerbil")
                            .timeZone("America/Halifax")
                            .customCPAClickWeight(90.53)
                            .customCPAViewthroughWeight(6332.3)
                            .customCPAType(CustomCPAType.DISABLED)
                            .impressionsOnlyBudgetingCpm(JsonNullable.of(null))
                            .budget(CampaignWorkflowBudgetInput.builder()
                                .pacingMode(CampaignPacingMode.PACE_TO_DAILY_CAP)
                                .budgetInAdvertiserCurrency(7811.09)
                                .budgetInImpressions(JsonNullable.of(null))
                                .dailyTargetInAdvertiserCurrency(3493.9)
                                .dailyTargetInImpressions(530411L)
                                .build())
                            .endDateInUtc(OffsetDateTime.parse("2024-04-14T22:55:04.136Z"))
                            .seedId("<id>")
                            .campaignConversionReportingColumns(List.of(
                                CampaignWorkflowCampaignConversionReportingColumnInput.builder()
                                    .trackingTagId("<id>")
                                    .includeInCustomCPA(false)
                                    .reportingColumnId(75289)
                                    .roasConfig(CustomROASConfig.builder()
                                        .includeInCustomROAS(true)
                                        .customROASWeight(8299.16)
                                        .customROASClickWeight(JsonNullable.of(null))
                                        .customROASViewthroughWeight(764.33)
                                        .build())
                                    .weight(9258.39)
                                    .crossDeviceAttributionModelId("<id>")
                                    .build()))
                            .name("<value>")
                            .primaryChannel(CampaignChannelType.DOOH)
                            .primaryGoal(CampaignWorkflowROIGoalInput.builder()
                                .maximizeReach(true)
                                .maximizeLtvIncrementalReach(false)
                                .cpcInAdvertiserCurrency(6613.91)
                                .ctrInPercent(JsonNullable.of(null))
                                .nielsenOTPInPercent(8409.91)
                                .cpaInAdvertiserCurrency(5081.39)
                                .returnOnAdSpendPercent(8381.93)
                                .vcrInPercent(940.02)
                                .viewabilityInPercent(6474.82)
                                .vcpmInAdvertiserCurrency(8867.76)
                                .cpcvInAdvertiserCurrency(9393.86)
                                .miaozhenOTPInPercent(218.76)
                                .build())
                            .startDateInUtc(OffsetDateTime.parse("2024-01-25T12:04:17.661Z"))
                            .build())
                        .advancedInput(CampaignWorkflowAdvancedInput.builder()
                            .flights(JsonNullable.of(null))
                            .purchaseOrderNumber("<value>")
                            .build())
                        .build()))
                .validateInputOnly(false)
                .build();

        PatchCampaignBulkResponse res = sdk.campaign().patchCampaignBulk()
                .request(req)
                .call();

        if (res.bulkJobSubmitResponse().isPresent()) {
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

**[PatchCampaignBulkResponse](../../models/operations/PatchCampaignBulkResponse.md)**

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