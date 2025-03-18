# Seed
(*seed()*)

## Overview

### Available Operations

* [create](#create) - Create a new seed with required fields

## create

Create a new seed with required fields

### Example Usage

```java
package hello.world;

import com.thetradedesk.workflows.TtdWorkflows;
import com.thetradedesk.workflows.models.components.SeedCreationInput;
import com.thetradedesk.workflows.models.components.SeedTargetingDataInput;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.PostSeedResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        TtdWorkflows sdk = TtdWorkflows.builder()
                .ttdAuth("<YOUR_API_KEY_HERE>")
            .build();

        SeedCreationInput req = SeedCreationInput.builder()
                .advertiserId("<id>")
                .seedName("<value>")
                .isDefault(false)
                .targetingData(SeedTargetingDataInput.builder()
                    .build())
                .build();

        PostSeedResponse res = sdk.seed().create()
                .request(req)
                .call();

        if (res.seed().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [SeedCreationInput](../../models/shared/SeedCreationInput.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[PostSeedResponse](../../models/operations/PostSeedResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/ProblemDetailsException | 400                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |