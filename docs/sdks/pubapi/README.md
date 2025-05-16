# PubApi
(*pubApi()*)

## Overview

### Available Operations

* [postPubapi](#postpubapi)

## postPubapi

### Example Usage

```java
package hello.world;

import com.thetradedesk.workflows.TtdWorkflows;
import com.thetradedesk.workflows.models.components.CallPubApiWorkflowInput;
import com.thetradedesk.workflows.models.components.PubApiMethodType;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.PostPubapiResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        TtdWorkflows sdk = TtdWorkflows.builder()
                .ttdAuth("<YOUR_API_KEY_HERE>")
            .build();

        CallPubApiWorkflowInput req = CallPubApiWorkflowInput.builder()
                .methodType(PubApiMethodType.PUT)
                .endpoint("<value>")
                .dataBody("<value>")
                .build();

        PostPubapiResponse res = sdk.pubApi().postPubapi()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [CallPubApiWorkflowInput](../../models/shared/CallPubApiWorkflowInput.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[PostPubapiResponse](../../models/operations/PostPubapiResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/ProblemDetailsException | 400, 401, 403, 404                    | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |