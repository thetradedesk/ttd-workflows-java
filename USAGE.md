<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import com.thetradedesk.workflows.TtdWorkflows;
import com.thetradedesk.workflows.models.components.*;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.PostCampaignResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ProblemDetailsException, Exception {

        TtdWorkflows sdk = TtdWorkflows.builder()
                .ttdAuth("<YOUR_API_KEY_HERE>")
            .build();

        CampaignCreateWorkflowInput req = CampaignCreateWorkflowInput.builder()
                .campaignCreateWorkflowPrimaryInput(CampaignCreateWorkflowPrimaryInput.builder()
                    .advertiserId("<id>")
                    .name("<value>")
                    .primaryChannel(CampaignChannelType.AUDIO)
                    .primaryGoal(CampaignCreateROIGoalWorkflow.builder()
                        .build())
                    .build())
                .build();

        PostCampaignResponse res = sdk.campaign().create()
                .request(req)
                .call();

        if (res.campaignPayload().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->