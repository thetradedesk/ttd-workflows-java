# GraphQlQueryJobInput

Fields for executing a GraphQL query job


## Fields

| Field                                                                                            | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `query`                                                                                          | *String*                                                                                         | :heavy_check_mark:                                                                               | The GraphQL query to execute                                                                     |
| `callbackInput`                                                                                  | [Optional\<GraphQlBulkJobCallbackInput>](../../models/components/GraphQlBulkJobCallbackInput.md) | :heavy_minus_sign:                                                                               | Input class for providing a callback's url and any headers needed for the callback.              |
| `betaFeatures`                                                                                   | *JsonNullable\<String>*                                                                          | :heavy_minus_sign:                                                                               | Beta features to be enabled for this GraphQL query (passed as TTD-GQL-Beta header)               |