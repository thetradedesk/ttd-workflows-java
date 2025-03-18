# Campaign
(*campaign()*)

## Overview

### Available Operations

* [postCampaign](#postcampaign) - Create a new campaign with required fields
* [getCampaignIdVersion](#getcampaignidversion) - GET a campaign's version

## postCampaign

Create a new campaign with required fields

### Example Usage

```java
package hello.world;

import com.thetradedesk.workflows.TtdWorkflows;
import com.thetradedesk.workflows.models.components.CampaignChannel;
import com.thetradedesk.workflows.models.components.CampaignCreateROIGoalInput;
import com.thetradedesk.workflows.models.components.CampaignCreationInput;
import com.thetradedesk.workflows.models.components.CampaignFlightCreationInput;
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

        CampaignCreationInput req = CampaignCreationInput.builder()
                .advertiserId("<id>")
                .campaignName("<value>")
                .primaryChannel(CampaignChannel.DISPLAY)
                .primaryGoal(CampaignCreateROIGoalInput.builder()
                    .build())
                .campaignFlights(List.of(
                    CampaignFlightCreationInput.builder()
                        .startDateInclusiveUTC(OffsetDateTime.parse("2025-02-22T16:53:04.116Z"))
                        .budgetInAdvertiserCurrency(9541.89d)
                        .build()))
                .build();

        PostCampaignResponse res = sdk.campaign().postCampaign()
                .request(req)
                .call();

        if (res.campaign().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [CampaignCreationInput](../../models/shared/CampaignCreationInput.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[PostCampaignResponse](../../models/operations/PostCampaignResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/ProblemDetailsException | 400                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |

## getCampaignIdVersion

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

        GetCampaignIdVersionResponse res = sdk.campaign().getCampaignIdVersion()
                .id("<id>")
                .call();

        if (res.campaignVersionResponse().isPresent()) {
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