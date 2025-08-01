/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.thetradedesk.workflows.operations;

import static com.thetradedesk.workflows.operations.Operations.RequestOperation;

import com.fasterxml.jackson.core.type.TypeReference;
import com.thetradedesk.workflows.SDKConfiguration;
import com.thetradedesk.workflows.SecuritySource;
import com.thetradedesk.workflows.models.components.CampaignVersionWorkflow;
import com.thetradedesk.workflows.models.errors.APIException;
import com.thetradedesk.workflows.models.errors.ProblemDetailsException;
import com.thetradedesk.workflows.models.operations.GetCampaignVersionRequest;
import com.thetradedesk.workflows.models.operations.GetCampaignVersionResponse;
import com.thetradedesk.workflows.utils.BackoffStrategy;
import com.thetradedesk.workflows.utils.HTTPClient;
import com.thetradedesk.workflows.utils.HTTPRequest;
import com.thetradedesk.workflows.utils.Hook.AfterErrorContextImpl;
import com.thetradedesk.workflows.utils.Hook.AfterSuccessContextImpl;
import com.thetradedesk.workflows.utils.Hook.BeforeRequestContextImpl;
import com.thetradedesk.workflows.utils.Options;
import com.thetradedesk.workflows.utils.Retries.NonRetryableException;
import com.thetradedesk.workflows.utils.Retries;
import com.thetradedesk.workflows.utils.RetryConfig;
import com.thetradedesk.workflows.utils.Utils;
import java.io.InputStream;
import java.lang.Exception;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;


public class GetCampaignVersionOperation implements RequestOperation<GetCampaignVersionRequest, GetCampaignVersionResponse> {

    private final SDKConfiguration sdkConfiguration;
    private final String baseUrl;
    private final SecuritySource securitySource;
    private final RetryConfig retryConfig;
    private final List<String> retryStatusCodes;
    private final HTTPClient client;

    public GetCampaignVersionOperation(
        SDKConfiguration sdkConfiguration,
        Optional<Options> options) {
        this.sdkConfiguration = sdkConfiguration;
        this.baseUrl = this.sdkConfiguration.serverUrl();
        this.securitySource = this.sdkConfiguration.securitySource();
        options
                .ifPresent(o -> o.validate(List.of(Options.Option.RETRY_CONFIG)));
        this.retryConfig = options
                .flatMap(Options::retryConfig)
                .or(this.sdkConfiguration::retryConfig)
                .orElse(RetryConfig.builder()
                        .backoff(BackoffStrategy.builder()
                            .initialInterval(500, TimeUnit.MILLISECONDS)
                            .maxInterval(60000, TimeUnit.MILLISECONDS)
                            .baseFactor((double)(1.5))
                            .maxElapsedTime(3600000, TimeUnit.MILLISECONDS)
                            .retryConnectError(true)
                            .build())
                        .build());
        this.retryStatusCodes = List.of("5XX");
        this.client = this.sdkConfiguration.client();
    }

    private Optional<SecuritySource> securitySource() {
        return Optional.ofNullable(this.securitySource);
    }

    public HttpRequest buildRequest(GetCampaignVersionRequest request) throws Exception {
        String url = Utils.generateURL(
                GetCampaignVersionRequest.class,
                this.baseUrl,
                "/campaign/{id}/version",
                request, null);
        HTTPRequest req = new HTTPRequest(url, "GET");
        req.addHeader("Accept", "application/json")
                .addHeader("user-agent", SDKConfiguration.USER_AGENT);
        Utils.configureSecurity(req, this.sdkConfiguration.securitySource().getSecurity());

        return sdkConfiguration.hooks().beforeRequest(
              new BeforeRequestContextImpl(
                  this.sdkConfiguration,
                  this.baseUrl,
                  "getCampaignVersion",
                  java.util.Optional.of(java.util.List.of()),
                  securitySource()),
              req.build());
    }

    private HttpResponse<InputStream> onError(HttpResponse<InputStream> response,
                                              Exception error) throws Exception {
        return sdkConfiguration.hooks()
            .afterError(
                new AfterErrorContextImpl(
                    this.sdkConfiguration,
                    this.baseUrl,
                    "getCampaignVersion",
                    java.util.Optional.of(java.util.List.of()),
                    securitySource()),
                Optional.ofNullable(response),
                Optional.ofNullable(error));
    }

    private HttpResponse<InputStream> onSuccess(HttpResponse<InputStream> response) throws Exception {
        return sdkConfiguration.hooks()
            .afterSuccess(
                new AfterSuccessContextImpl(
                    this.sdkConfiguration,
                    this.baseUrl,
                    "getCampaignVersion",
                    java.util.Optional.of(java.util.List.of()),
                    securitySource()),
                response);
    }

    @Override
    public HttpResponse<InputStream> doRequest(GetCampaignVersionRequest request) throws Exception {
        Retries retries = Retries.builder()
            .action(() -> {
                HttpRequest r;
                try {
                    r = buildRequest(request);
                } catch (Exception e) {
                    throw new NonRetryableException(e);
                }
                try {
                    return client.send(r);
                } catch (Exception e) {
                    return onError(null, e);
                }
            })
            .retryConfig(retryConfig)
            .statusCodes(retryStatusCodes)
            .build();
        return onSuccess(retries.run());
    }


    @Override
    public GetCampaignVersionResponse handleResponse(HttpResponse<InputStream> response) throws Exception {
        String contentType = response
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetCampaignVersionResponse.Builder resBuilder = 
            GetCampaignVersionResponse
                .builder()
                .contentType(contentType)
                .statusCode(response.statusCode())
                .rawResponse(response);

        GetCampaignVersionResponse res = resBuilder.build();
        
        if (Utils.statusCodeMatches(response.statusCode(), "200")) {
            if (Utils.contentTypeMatches(contentType, "application/json")) {
                CampaignVersionWorkflow out = Utils.mapper().readValue(
                    response.body(),
                    new TypeReference<>() {
                    });
                res.withCampaignVersionWorkflow(out);
                return res;
            } else {
                throw new APIException(
                    response, 
                    response.statusCode(), 
                    "Unexpected content-type received: " + contentType, 
                    Utils.extractByteArrayFromBody(response));
            }
        }
        if (Utils.statusCodeMatches(response.statusCode(), "400", "401", "403", "404")) {
            if (Utils.contentTypeMatches(contentType, "application/json")) {
                ProblemDetailsException out = Utils.mapper().readValue(
                    response.body(),
                    new TypeReference<>() {
                    });
                throw out;
            } else {
                throw new APIException(
                    response, 
                    response.statusCode(), 
                    "Unexpected content-type received: " + contentType, 
                    Utils.extractByteArrayFromBody(response));
            }
        }
        if (Utils.statusCodeMatches(response.statusCode(), "4XX")) {
            // no content 
            throw new APIException(
                    response, 
                    response.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(response));
        }
        if (Utils.statusCodeMatches(response.statusCode(), "500", "5XX")) {
            // no content 
            throw new APIException(
                    response, 
                    response.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(response));
        }
        throw new APIException(
            response, 
            response.statusCode(), 
            "Unexpected status code received: " + response.statusCode(), 
            Utils.extractByteArrayFromBody(response));
    }
}
