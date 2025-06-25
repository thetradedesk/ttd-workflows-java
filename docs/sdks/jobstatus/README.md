# JobStatus
(*jobStatus()*)

## Overview

### Available Operations

* [getTypebasedjobIdStatus](#gettypebasedjobidstatus) - Get the status of a previously submitted type-based job

## getTypebasedjobIdStatus

Use this operation to get a previously submitted job's status and completion percentage.
Once a job is complete, this operation will return the URL from which to download the job results.

### Example Usage

```java
package hello.world;

import com.thetradedesk.workflows.TtdWorkflows;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.GetTypebasedjobIdStatusResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        TtdWorkflows sdk = TtdWorkflows.builder()
                .ttdAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetTypebasedjobIdStatusResponse res = sdk.jobStatus().getTypebasedjobIdStatus()
                .id(416928L)
                .call();

        if (res.typeBasedJobStatusResponse().isPresent()) {
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

**[GetTypebasedjobIdStatusResponse](../../models/operations/GetTypebasedjobIdStatusResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/ProblemDetailsException | 400, 401, 403, 404                    | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |