# GraphQLRequestInput

Required fields for executing a GraphQL query


## Fields

| Field                                   | Type                                    | Required                                | Description                             |
| --------------------------------------- | --------------------------------------- | --------------------------------------- | --------------------------------------- |
| `request`                               | *String*                                | :heavy_check_mark:                      | The GraphQL query to execute.           |
| `variables`                             | Map\<String, *Object*>                  | :heavy_minus_sign:                      | Variables to substitute into the query. |