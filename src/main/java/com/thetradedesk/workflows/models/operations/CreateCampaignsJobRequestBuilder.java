/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.thetradedesk.workflows.models.operations;

import static com.thetradedesk.workflows.operations.Operations.RequestOperation;

import com.thetradedesk.workflows.SDKConfiguration;
import com.thetradedesk.workflows.models.components.CampaignBulkCreateWorkflowInputWithValidation;
import com.thetradedesk.workflows.operations.CreateCampaignsJobOperation;
import com.thetradedesk.workflows.utils.Options;
import com.thetradedesk.workflows.utils.RetryConfig;
import com.thetradedesk.workflows.utils.Utils;
import java.lang.Exception;
import java.util.Optional;

public class CreateCampaignsJobRequestBuilder {

    private Optional<? extends CampaignBulkCreateWorkflowInputWithValidation> request = Optional.empty();
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKConfiguration sdkConfiguration;

    public CreateCampaignsJobRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }
                
    public CreateCampaignsJobRequestBuilder request(CampaignBulkCreateWorkflowInputWithValidation request) {
        Utils.checkNotNull(request, "request");
        this.request = Optional.of(request);
        return this;
    }

    public CreateCampaignsJobRequestBuilder request(Optional<? extends CampaignBulkCreateWorkflowInputWithValidation> request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public CreateCampaignsJobRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public CreateCampaignsJobRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public CreateCampaignsJobResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
            .retryConfig(retryConfig)
            .build());

        RequestOperation<Optional<? extends CampaignBulkCreateWorkflowInputWithValidation>, CreateCampaignsJobResponse> operation
              = new CreateCampaignsJobOperation(sdkConfiguration, options);

        return operation.handleResponse(operation.doRequest(request));
    }
}
