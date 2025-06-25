# GraphQLRequest
(*graphQLRequest()*)

## Overview

### Available Operations

* [postGraphqlrequest](#postgraphqlrequest) - Submit a valid GraphQL query or mutation

## postGraphqlrequest

This generic operation can be used to execute any valid GraphQL request.
To explore the available GraphQL operations, see the [GraphQL Schema Explorer](https://partner.thetradedesk.com/v3/portal/api/graphql-schema).

### Example Usage

```java
package hello.world;

import com.thetradedesk.workflows.TtdWorkflows;
import com.thetradedesk.workflows.models.components.GraphQLRequestInput;
import com.thetradedesk.workflows.models.components.Variables;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.PostGraphqlrequestResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        TtdWorkflows sdk = TtdWorkflows.builder()
                .ttdAuth("<YOUR_API_KEY_HERE>")
            .build();

        GraphQLRequestInput req = GraphQLRequestInput.builder()
                .request("<value>")
                .variables(Variables.builder()
                    .build())
                .build();

        PostGraphqlrequestResponse res = sdk.graphQLRequest().postGraphqlrequest()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [GraphQLRequestInput](../../models/shared/GraphQLRequestInput.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[PostGraphqlrequestResponse](../../models/operations/PostGraphqlrequestResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/ProblemDetailsException | 400, 401, 403, 404                    | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |