# BulkJob
(*bulkJob()*)

## Overview

### Available Operations

* [postBulkjobFirstpartydata](#postbulkjobfirstpartydata) - Submits a query for First Party Data to Hydra
* [getBulkjobIdStatus](#getbulkjobidstatus) - Get the status of a bulk job you submitted earlier

## postBulkjobFirstpartydata

Submits a query for First Party Data to Hydra

### Example Usage

```java
package hello.world;

import com.thetradedesk.workflows.TtdWorkflows;
import com.thetradedesk.workflows.models.components.FirstPartyDataInput;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.PostBulkjobFirstpartydataResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        TtdWorkflows sdk = TtdWorkflows.builder()
                .ttdAuth("<YOUR_API_KEY_HERE>")
            .build();

        FirstPartyDataInput req = FirstPartyDataInput.builder()
                .advertiserId("<id>")
                .nameFilter("<value>")
                .queryShape("<value>")
                .build();

        PostBulkjobFirstpartydataResponse res = sdk.bulkJob().postBulkjobFirstpartydata()
                .request(req)
                .call();

        if (res.bulkJobSubmitResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [FirstPartyDataInput](../../models/shared/FirstPartyDataInput.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[PostBulkjobFirstpartydataResponse](../../models/operations/PostBulkjobFirstpartydataResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/ProblemDetailsException | 400, 401, 403, 404                    | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |

## getBulkjobIdStatus

Get the status of a bulk job you submitted earlier

### Example Usage

```java
package hello.world;

import com.thetradedesk.workflows.TtdWorkflows;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.GetBulkjobIdStatusResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        TtdWorkflows sdk = TtdWorkflows.builder()
                .ttdAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetBulkjobIdStatusResponse res = sdk.bulkJob().getBulkjobIdStatus()
                .id(887039L)
                .call();

        if (res.bulkJobStatusResponse().isPresent()) {
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

**[GetBulkjobIdStatusResponse](../../models/operations/GetBulkjobIdStatusResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/ProblemDetailsException | 400, 401, 403, 404                    | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |