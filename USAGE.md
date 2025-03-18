<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import com.thetradedesk.workflows.TtdWorkflows;
import com.thetradedesk.workflows.models.components.CampaignChannel;
import com.thetradedesk.workflows.models.components.CampaignCreateROIGoalInput;
import com.thetradedesk.workflows.models.components.CampaignCreationInput;
import com.thetradedesk.workflows.models.components.CampaignFlightCreationInput;
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
                .primaryChannel(CampaignChannel.DISPLAY)
                .primaryGoal(CampaignCreateROIGoalInput.builder()
                    .build())
                .campaignFlights(List.of(
                    CampaignFlightCreationInput.builder()
                        .startDateInclusiveUTC(OffsetDateTime.parse("2025-02-22T16:53:04.116Z"))
                        .budgetInAdvertiserCurrency(9541.89d)
                        .build()))
                .build();

        PostCampaignResponse res = sdk.campaign().postCampaign()
                .request(req)
                .call();

        if (res.campaign().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->