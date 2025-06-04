# BulkJob
(*bulkJob()*)

## Overview

### Available Operations

* [postBulkjobFirstpartydata](#postbulkjobfirstpartydata) - Submit a query for First Party Data to Hydra
* [postBulkjobCallback](#postbulkjobcallback) - Used for receiving a callback from Hydra once a job is completed
* [getBulkjobIdStatus](#getbulkjobidstatus) - Get the status of a bulk job workflow you submitted earlier
* [postBulkjobThirdpartydata](#postbulkjobthirdpartydata) - Submits a query for Third Party Data to Hydra

## postBulkjobFirstpartydata

Submit a query for First Party Data to Hydra

### Example Usage

```java
package hello.world;

import com.thetradedesk.workflows.TtdWorkflows;
import com.thetradedesk.workflows.models.components.FirstPartyDataInput;
import com.thetradedesk.workflows.models.components.WorkflowCallbackInput;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.PostBulkjobFirstpartydataResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        TtdWorkflows sdk = TtdWorkflows.builder()
                .ttdAuth("<YOUR_API_KEY_HERE>")
            .build();

        FirstPartyDataInput req = FirstPartyDataInput.builder()
                .advertiserId("<id>")
                .nameFilter("<value>")
                .queryShape("<value>")
                .callbackInput(WorkflowCallbackInput.builder()
                    .callbackUrl("https://querulous-knight.name/")
                    .callbackHeaders(Map.ofEntries(
                        Map.entry("key", "<value>"),
                        Map.entry("key1", "<value>")))
                    .build())
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

## postBulkjobCallback

Used for receiving a callback from Hydra once a job is completed

### Example Usage

```java
package hello.world;

import com.thetradedesk.workflows.TtdWorkflows;
import com.thetradedesk.workflows.models.operations.PostBulkjobCallbackResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        TtdWorkflows sdk = TtdWorkflows.builder()
                .ttdAuth("<YOUR_API_KEY_HERE>")
            .build();

        PostBulkjobCallbackResponse res = sdk.bulkJob().postBulkjobCallback()
                .call();

        // handle response
    }
}
```

### Response

**[PostBulkjobCallbackResponse](../../models/operations/PostBulkjobCallbackResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getBulkjobIdStatus

Get the status of a bulk job workflow you submitted earlier

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
                .id(582277L)
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

## postBulkjobThirdpartydata

Submits a query for Third Party Data to Hydra

### Example Usage

```java
package hello.world;

import com.thetradedesk.workflows.TtdWorkflows;
import com.thetradedesk.workflows.models.components.ThirdPartyDataInput;
import com.thetradedesk.workflows.models.components.WorkflowCallbackInput;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.PostBulkjobThirdpartydataResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        TtdWorkflows sdk = TtdWorkflows.builder()
                .ttdAuth("<YOUR_API_KEY_HERE>")
            .build();

        ThirdPartyDataInput req = ThirdPartyDataInput.builder()
                .partnerId("<id>")
                .queryShape("<value>")
                .callbackInput(WorkflowCallbackInput.builder()
                    .callbackUrl("https://impolite-coal.name/")
                    .callbackHeaders(Map.ofEntries(
                        Map.entry("key", "<value>"),
                        Map.entry("key1", "<value>"),
                        Map.entry("key2", "<value>")))
                    .build())
                .build();

        PostBulkjobThirdpartydataResponse res = sdk.bulkJob().postBulkjobThirdpartydata()
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
| `request`                                                         | [ThirdPartyDataInput](../../models/shared/ThirdPartyDataInput.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[PostBulkjobThirdpartydataResponse](../../models/operations/PostBulkjobThirdpartydataResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/ProblemDetailsException | 400, 401, 403, 404                    | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |