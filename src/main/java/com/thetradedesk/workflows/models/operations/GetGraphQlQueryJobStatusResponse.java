/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.thetradedesk.workflows.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.thetradedesk.workflows.models.components.GraphQLQueryJobRetrievalResponse;
import com.thetradedesk.workflows.utils.Response;
import com.thetradedesk.workflows.utils.Utils;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.Optional;


public class GetGraphQlQueryJobStatusResponse implements Response {
    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    /**
     * OK
     */
    private Optional<? extends GraphQLQueryJobRetrievalResponse> graphQLQueryJobRetrievalResponse;

    @JsonCreator
    public GetGraphQlQueryJobStatusResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends GraphQLQueryJobRetrievalResponse> graphQLQueryJobRetrievalResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(graphQLQueryJobRetrievalResponse, "graphQLQueryJobRetrievalResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.graphQLQueryJobRetrievalResponse = graphQLQueryJobRetrievalResponse;
    }
    
    public GetGraphQlQueryJobStatusResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, statusCode, rawResponse,
            Optional.empty());
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    /**
     * HTTP response status code for this operation
     */
    @JsonIgnore
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonIgnore
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    /**
     * OK
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GraphQLQueryJobRetrievalResponse> graphQLQueryJobRetrievalResponse() {
        return (Optional<GraphQLQueryJobRetrievalResponse>) graphQLQueryJobRetrievalResponse;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * HTTP response content type for this operation
     */
    public GetGraphQlQueryJobStatusResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetGraphQlQueryJobStatusResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetGraphQlQueryJobStatusResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * OK
     */
    public GetGraphQlQueryJobStatusResponse withGraphQLQueryJobRetrievalResponse(GraphQLQueryJobRetrievalResponse graphQLQueryJobRetrievalResponse) {
        Utils.checkNotNull(graphQLQueryJobRetrievalResponse, "graphQLQueryJobRetrievalResponse");
        this.graphQLQueryJobRetrievalResponse = Optional.ofNullable(graphQLQueryJobRetrievalResponse);
        return this;
    }


    /**
     * OK
     */
    public GetGraphQlQueryJobStatusResponse withGraphQLQueryJobRetrievalResponse(Optional<? extends GraphQLQueryJobRetrievalResponse> graphQLQueryJobRetrievalResponse) {
        Utils.checkNotNull(graphQLQueryJobRetrievalResponse, "graphQLQueryJobRetrievalResponse");
        this.graphQLQueryJobRetrievalResponse = graphQLQueryJobRetrievalResponse;
        return this;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetGraphQlQueryJobStatusResponse other = (GetGraphQlQueryJobStatusResponse) o;
        return 
            Utils.enhancedDeepEquals(this.contentType, other.contentType) &&
            Utils.enhancedDeepEquals(this.statusCode, other.statusCode) &&
            Utils.enhancedDeepEquals(this.rawResponse, other.rawResponse) &&
            Utils.enhancedDeepEquals(this.graphQLQueryJobRetrievalResponse, other.graphQLQueryJobRetrievalResponse);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            contentType, statusCode, rawResponse,
            graphQLQueryJobRetrievalResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetGraphQlQueryJobStatusResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "graphQLQueryJobRetrievalResponse", graphQLQueryJobRetrievalResponse);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String contentType;

        private Integer statusCode;

        private HttpResponse<InputStream> rawResponse;

        private Optional<? extends GraphQLQueryJobRetrievalResponse> graphQLQueryJobRetrievalResponse = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * HTTP response content type for this operation
         */
        public Builder contentType(String contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }


        /**
         * HTTP response status code for this operation
         */
        public Builder statusCode(int statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }


        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(HttpResponse<InputStream> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = rawResponse;
            return this;
        }


        /**
         * OK
         */
        public Builder graphQLQueryJobRetrievalResponse(GraphQLQueryJobRetrievalResponse graphQLQueryJobRetrievalResponse) {
            Utils.checkNotNull(graphQLQueryJobRetrievalResponse, "graphQLQueryJobRetrievalResponse");
            this.graphQLQueryJobRetrievalResponse = Optional.ofNullable(graphQLQueryJobRetrievalResponse);
            return this;
        }

        /**
         * OK
         */
        public Builder graphQLQueryJobRetrievalResponse(Optional<? extends GraphQLQueryJobRetrievalResponse> graphQLQueryJobRetrievalResponse) {
            Utils.checkNotNull(graphQLQueryJobRetrievalResponse, "graphQLQueryJobRetrievalResponse");
            this.graphQLQueryJobRetrievalResponse = graphQLQueryJobRetrievalResponse;
            return this;
        }

        public GetGraphQlQueryJobStatusResponse build() {

            return new GetGraphQlQueryJobStatusResponse(
                contentType, statusCode, rawResponse,
                graphQLQueryJobRetrievalResponse);
        }

    }
}
