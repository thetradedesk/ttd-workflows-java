/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.thetradedesk.workflows.models.operations;

import static com.thetradedesk.workflows.operations.Operations.RequestOperation;

import com.thetradedesk.workflows.SDKConfiguration;
import com.thetradedesk.workflows.models.components.CampaignBulkUpdateWorkflowInputWithValidation;
import com.thetradedesk.workflows.operations.UpdateCampaignsJobOperation;
import com.thetradedesk.workflows.utils.Options;
import com.thetradedesk.workflows.utils.RetryConfig;
import com.thetradedesk.workflows.utils.Utils;
import java.lang.Exception;
import java.util.Optional;

public class UpdateCampaignsJobRequestBuilder {

    private Optional<? extends CampaignBulkUpdateWorkflowInputWithValidation> request = Optional.empty();
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKConfiguration sdkConfiguration;

    public UpdateCampaignsJobRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }
                
    public UpdateCampaignsJobRequestBuilder request(CampaignBulkUpdateWorkflowInputWithValidation request) {
        Utils.checkNotNull(request, "request");
        this.request = Optional.of(request);
        return this;
    }

    public UpdateCampaignsJobRequestBuilder request(Optional<? extends CampaignBulkUpdateWorkflowInputWithValidation> request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public UpdateCampaignsJobRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public UpdateCampaignsJobRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public UpdateCampaignsJobResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
            .retryConfig(retryConfig)
            .build());

        RequestOperation<Optional<? extends CampaignBulkUpdateWorkflowInputWithValidation>, UpdateCampaignsJobResponse> operation
              = new UpdateCampaignsJobOperation(sdkConfiguration, options);

        return operation.handleResponse(operation.doRequest(request));
    }
}
