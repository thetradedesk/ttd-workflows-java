# Graphql
(*graphql()*)

## Overview

### Available Operations

* [execute](#execute) - An endpoint that executes valid GraphQL queries.

## execute

An endpoint that executes valid GraphQL queries.

### Example Usage

```java
package hello.world;

import com.thetradedesk.workflows.TtdWorkflows;
import com.thetradedesk.workflows.models.components.GraphQLQueryInput;
import com.thetradedesk.workflows.models.components.Variables;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.PostGraphqlResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        TtdWorkflows sdk = TtdWorkflows.builder()
                .ttdAuth("<YOUR_API_KEY_HERE>")
            .build();

        GraphQLQueryInput req = GraphQLQueryInput.builder()
                .query("<value>")
                .variables(Variables.builder()
                    .build())
                .build();

        PostGraphqlResponse res = sdk.graphql().execute()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [GraphQLQueryInput](../../models/shared/GraphQLQueryInput.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[PostGraphqlResponse](../../models/operations/PostGraphqlResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/ProblemDetailsException | 400, 401, 403, 404                    | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |