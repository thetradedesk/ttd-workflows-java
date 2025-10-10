# GraphQLBulkJobRetrievalResponse

This is the top level class returned to a user when they retrieve a bulk job


## Fields

| Field                                                                  | Type                                                                   | Required                                                               | Description                                                            |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `job`                                                                  | [Optional\<GraphQlBulkJob>](../../models/components/GraphQlBulkJob.md) | :heavy_minus_sign:                                                     | The response model that mirrors the GQL bulkjob.                       |
| `errors`                                                               | *JsonNullable\<String>*                                                | :heavy_minus_sign:                                                     | N/A                                                                    |