# GraphQLRequest
(*graphQLRequest()*)

## Overview

### Available Operations

* [submitGraphQlRequest](#submitgraphqlrequest) - Submit a valid GraphQL query or mutation
* [submitGraphQlBulkQueryJob](#submitgraphqlbulkqueryjob) - Submit a valid bulk GraphQL query job

## submitGraphQlRequest

This generic operation can be used to execute any valid GraphQL request. The results are returned
directly when the request is complete. To explore the available GraphQL operations, see the
[GraphQL Schema Explorer](https://partner.thetradedesk.com/v3/portal/api/graphql-schema).

### Example Usage

<!-- UsageSnippet language="java" operationID="submitGraphQlRequest" method="post" path="/graphqlrequest" -->
```java
package hello.world;

import com.thetradedesk.workflows.Workflows;
import com.thetradedesk.workflows.models.components.GraphQLRequestInput;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.SubmitGraphQlRequestResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        Workflows sdk = Workflows.builder()
                .ttdAuth(System.getenv().getOrDefault("WORKFLOWS_TTD_AUTH", ""))
            .build();

        GraphQLRequestInput req = GraphQLRequestInput.builder()
                .request("<value>")
                .variables(Map.ofEntries(
                ))
                .betaFeatures("<value>")
                .build();

        SubmitGraphQlRequestResponse res = sdk.graphQLRequest().submitGraphQlRequest()
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

**[SubmitGraphQlRequestResponse](../../models/operations/SubmitGraphQlRequestResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/ProblemDetailsException | 400, 401, 403, 404                    | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |

## submitGraphQlBulkQueryJob

This generic operation can be used to execute any valid bulk GraphQL query. To determine the job's
status, completion percentage, and URL for download (once the job results are ready), query the
[GraphQL Bulk Job Status](https://ttd-workflows.apidocumentation.com/reference#tag/job-status/get/graphqlbulkqueryjob/{id})
endpoint. For information on bulk GraphQL query syntax, see
[GraphQL API Bulk Operations](https://partner.thetradedesk.com/v3/portal/api/doc/GqlBulkOperations).

### Example Usage

<!-- UsageSnippet language="java" operationID="submitGraphQlBulkQueryJob" method="post" path="/graphqlbulkqueryjob" -->
```java
package hello.world;

import com.thetradedesk.workflows.Workflows;
import com.thetradedesk.workflows.models.components.GraphQlBulkJobCallbackInput;
import com.thetradedesk.workflows.models.components.GraphQlQueryJobInput;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.SubmitGraphQlBulkQueryJobResponse;
import java.lang.Exception;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        Workflows sdk = Workflows.builder()
                .ttdAuth(System.getenv().getOrDefault("WORKFLOWS_TTD_AUTH", ""))
            .build();

        GraphQlQueryJobInput req = GraphQlQueryJobInput.builder()
                .query("<value>")
                .callbackInput(GraphQlBulkJobCallbackInput.builder()
                    .callbackUrl("https://sociable-quinoa.info/")
                    .callbackHeaders(JsonNullable.of(null))
                    .build())
                .betaFeatures("<value>")
                .build();

        SubmitGraphQlBulkQueryJobResponse res = sdk.graphQLRequest().submitGraphQlBulkQueryJob()
                .request(req)
                .call();

        if (res.graphQlBulkJobResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GraphQlQueryJobInput](../../models/shared/GraphQlQueryJobInput.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[SubmitGraphQlBulkQueryJobResponse](../../models/operations/SubmitGraphQlBulkQueryJobResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/ProblemDetailsException | 400, 401, 403, 404                    | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |