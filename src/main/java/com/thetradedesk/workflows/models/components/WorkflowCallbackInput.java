/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.thetradedesk.workflows.models.components;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.thetradedesk.workflows.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;


public class WorkflowCallbackInput {

    @JsonProperty("callbackUrl")
    private String callbackUrl;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("callbackHeaders")
    private JsonNullable<? extends Map<String, String>> callbackHeaders;

    @JsonCreator
    public WorkflowCallbackInput(
            @JsonProperty("callbackUrl") String callbackUrl,
            @JsonProperty("callbackHeaders") JsonNullable<? extends Map<String, String>> callbackHeaders) {
        Utils.checkNotNull(callbackUrl, "callbackUrl");
        Utils.checkNotNull(callbackHeaders, "callbackHeaders");
        this.callbackUrl = callbackUrl;
        this.callbackHeaders = callbackHeaders;
    }
    
    public WorkflowCallbackInput(
            String callbackUrl) {
        this(callbackUrl, JsonNullable.undefined());
    }

    @JsonIgnore
    public String callbackUrl() {
        return callbackUrl;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Map<String, String>> callbackHeaders() {
        return (JsonNullable<Map<String, String>>) callbackHeaders;
    }

    public static Builder builder() {
        return new Builder();
    }


    public WorkflowCallbackInput withCallbackUrl(String callbackUrl) {
        Utils.checkNotNull(callbackUrl, "callbackUrl");
        this.callbackUrl = callbackUrl;
        return this;
    }

    public WorkflowCallbackInput withCallbackHeaders(Map<String, String> callbackHeaders) {
        Utils.checkNotNull(callbackHeaders, "callbackHeaders");
        this.callbackHeaders = JsonNullable.of(callbackHeaders);
        return this;
    }

    public WorkflowCallbackInput withCallbackHeaders(JsonNullable<? extends Map<String, String>> callbackHeaders) {
        Utils.checkNotNull(callbackHeaders, "callbackHeaders");
        this.callbackHeaders = callbackHeaders;
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
        WorkflowCallbackInput other = (WorkflowCallbackInput) o;
        return 
            Utils.enhancedDeepEquals(this.callbackUrl, other.callbackUrl) &&
            Utils.enhancedDeepEquals(this.callbackHeaders, other.callbackHeaders);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            callbackUrl, callbackHeaders);
    }
    
    @Override
    public String toString() {
        return Utils.toString(WorkflowCallbackInput.class,
                "callbackUrl", callbackUrl,
                "callbackHeaders", callbackHeaders);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String callbackUrl;

        private JsonNullable<? extends Map<String, String>> callbackHeaders = JsonNullable.undefined();

        private Builder() {
          // force use of static builder() method
        }


        public Builder callbackUrl(String callbackUrl) {
            Utils.checkNotNull(callbackUrl, "callbackUrl");
            this.callbackUrl = callbackUrl;
            return this;
        }


        public Builder callbackHeaders(Map<String, String> callbackHeaders) {
            Utils.checkNotNull(callbackHeaders, "callbackHeaders");
            this.callbackHeaders = JsonNullable.of(callbackHeaders);
            return this;
        }

        public Builder callbackHeaders(JsonNullable<? extends Map<String, String>> callbackHeaders) {
            Utils.checkNotNull(callbackHeaders, "callbackHeaders");
            this.callbackHeaders = callbackHeaders;
            return this;
        }

        public WorkflowCallbackInput build() {

            return new WorkflowCallbackInput(
                callbackUrl, callbackHeaders);
        }

    }
}
