<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import com.thetradedesk.workflows.TtdWorkflows;
import com.thetradedesk.workflows.models.components.*;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.PostCampaignResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        TtdWorkflows sdk = TtdWorkflows.builder()
                .ttdAuth("<YOUR_API_KEY_HERE>")
            .build();

        CampaignCreationInput req = CampaignCreationInput.builder()
                .advertiserId("<id>")
                .campaignName("<value>")
                .primaryChannel(CampaignChannel.VIDEO)
                .primaryGoal(CampaignCreateROIGoalInput.builder()
                    .build())
                .campaignFlights(List.of(
                    CampaignFlightCreationInput.builder()
                        .startDateInclusiveUTC(OffsetDateTime.parse("2024-11-30T17:06:07.804Z"))
                        .budgetInAdvertiserCurrency(4174.58)
                        .build()))
                .build();

        PostCampaignResponse res = sdk.campaign().create()
                .request(req)
                .call();

        if (res.campaign().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->