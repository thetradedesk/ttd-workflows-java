# SeedCreationInput

Required fields for creating a new seed


## Fields

| Field                                                                       | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `advertiserId`                                                              | *String*                                                                    | :heavy_check_mark:                                                          | The platform ID of the advertiser that owns this Seed.                      |
| `seedName`                                                                  | *String*                                                                    | :heavy_check_mark:                                                          | The name of the Seed.                                                       |
| `isDefault`                                                                 | *boolean*                                                                   | :heavy_check_mark:                                                          | Whether this is the default seed for this advertiser                        |
| `targetingData`                                                             | [SeedTargetingDataInput](../../models/components/SeedTargetingDataInput.md) | :heavy_check_mark:                                                          | N/A                                                                         |