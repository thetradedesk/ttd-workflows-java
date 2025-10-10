# JobStatus
(*jobStatus()*)

## Overview

### Available Operations

* [getGraphQlBulkJobStatus](#getgraphqlbulkjobstatus) - Get the status of a previously submitted GraphQL bulk job
* [getJobStatus](#getjobstatus) - Get the status of a previously submitted job

## getGraphQlBulkJobStatus

Use this operation to get a previously submitted GraphQL bulk job's status and completion percentage.
Once a job is complete, this operation will return the URL from which to download the job results.

### Example Usage

<!-- UsageSnippet language="java" operationID="getGraphQlBulkJobStatus" method="get" path="/graphqlbulkjob/{id}" -->
```java
package hello.world;

import com.thetradedesk.workflows.Workflows;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.GetGraphQlBulkJobStatusResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        Workflows sdk = Workflows.builder()
                .ttdAuth(System.getenv().getOrDefault("WORKFLOWS_TTD_AUTH", ""))
            .build();

        GetGraphQlBulkJobStatusResponse res = sdk.jobStatus().getGraphQlBulkJobStatus()
                .id("<id>")
                .call();

        if (res.graphQLBulkJobRetrievalResponse().isPresent()) {
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

**[GetGraphQlBulkJobStatusResponse](../../models/operations/GetGraphQlBulkJobStatusResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/ProblemDetailsException | 400, 401, 403, 404                    | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |

## getJobStatus

Use this operation to get a previously submitted job's status and completion percentage.
Once a job is complete, this operation will return the URL from which to download the job results.
            
Job results expire after 24 hours, at which point you will need to submit a new job.

### Example Usage

<!-- UsageSnippet language="java" operationID="getJobStatus" method="get" path="/standardjob/{id}/status" -->
```java
package hello.world;

import com.thetradedesk.workflows.Workflows;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.GetJobStatusResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        Workflows sdk = Workflows.builder()
                .ttdAuth(System.getenv().getOrDefault("WORKFLOWS_TTD_AUTH", ""))
            .build();

        GetJobStatusResponse res = sdk.jobStatus().getJobStatus()
                .id(412651L)
                .call();

        if (res.standardJobStatusResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `id`               | *long*             | :heavy_check_mark: | N/A                |

### Response

**[GetJobStatusResponse](../../models/operations/GetJobStatusResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/ProblemDetailsException | 400, 401, 403, 404                    | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |