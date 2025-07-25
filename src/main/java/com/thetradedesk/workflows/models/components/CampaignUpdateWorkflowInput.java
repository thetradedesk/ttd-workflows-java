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
import java.util.Optional;


public class CampaignUpdateWorkflowInput {

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("id")
    private Optional<String> id;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("primaryInput")
    private Optional<? extends CampaignUpdateWorkflowPrimaryInput> primaryInput;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("advancedInput")
    private Optional<? extends CampaignWorkflowAdvancedInput> advancedInput;

    @JsonCreator
    public CampaignUpdateWorkflowInput(
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("primaryInput") Optional<? extends CampaignUpdateWorkflowPrimaryInput> primaryInput,
            @JsonProperty("advancedInput") Optional<? extends CampaignWorkflowAdvancedInput> advancedInput) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(primaryInput, "primaryInput");
        Utils.checkNotNull(advancedInput, "advancedInput");
        this.id = id;
        this.primaryInput = primaryInput;
        this.advancedInput = advancedInput;
    }
    
    public CampaignUpdateWorkflowInput() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CampaignUpdateWorkflowPrimaryInput> primaryInput() {
        return (Optional<CampaignUpdateWorkflowPrimaryInput>) primaryInput;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CampaignWorkflowAdvancedInput> advancedInput() {
        return (Optional<CampaignWorkflowAdvancedInput>) advancedInput;
    }

    public static Builder builder() {
        return new Builder();
    }


    public CampaignUpdateWorkflowInput withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }


    public CampaignUpdateWorkflowInput withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public CampaignUpdateWorkflowInput withPrimaryInput(CampaignUpdateWorkflowPrimaryInput primaryInput) {
        Utils.checkNotNull(primaryInput, "primaryInput");
        this.primaryInput = Optional.ofNullable(primaryInput);
        return this;
    }


    public CampaignUpdateWorkflowInput withPrimaryInput(Optional<? extends CampaignUpdateWorkflowPrimaryInput> primaryInput) {
        Utils.checkNotNull(primaryInput, "primaryInput");
        this.primaryInput = primaryInput;
        return this;
    }

    public CampaignUpdateWorkflowInput withAdvancedInput(CampaignWorkflowAdvancedInput advancedInput) {
        Utils.checkNotNull(advancedInput, "advancedInput");
        this.advancedInput = Optional.ofNullable(advancedInput);
        return this;
    }


    public CampaignUpdateWorkflowInput withAdvancedInput(Optional<? extends CampaignWorkflowAdvancedInput> advancedInput) {
        Utils.checkNotNull(advancedInput, "advancedInput");
        this.advancedInput = advancedInput;
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
        CampaignUpdateWorkflowInput other = (CampaignUpdateWorkflowInput) o;
        return 
            Utils.enhancedDeepEquals(this.id, other.id) &&
            Utils.enhancedDeepEquals(this.primaryInput, other.primaryInput) &&
            Utils.enhancedDeepEquals(this.advancedInput, other.advancedInput);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            id, primaryInput, advancedInput);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CampaignUpdateWorkflowInput.class,
                "id", id,
                "primaryInput", primaryInput,
                "advancedInput", advancedInput);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<String> id = Optional.empty();

        private Optional<? extends CampaignUpdateWorkflowPrimaryInput> primaryInput = Optional.empty();

        private Optional<? extends CampaignWorkflowAdvancedInput> advancedInput = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }


        public Builder primaryInput(CampaignUpdateWorkflowPrimaryInput primaryInput) {
            Utils.checkNotNull(primaryInput, "primaryInput");
            this.primaryInput = Optional.ofNullable(primaryInput);
            return this;
        }

        public Builder primaryInput(Optional<? extends CampaignUpdateWorkflowPrimaryInput> primaryInput) {
            Utils.checkNotNull(primaryInput, "primaryInput");
            this.primaryInput = primaryInput;
            return this;
        }


        public Builder advancedInput(CampaignWorkflowAdvancedInput advancedInput) {
            Utils.checkNotNull(advancedInput, "advancedInput");
            this.advancedInput = Optional.ofNullable(advancedInput);
            return this;
        }

        public Builder advancedInput(Optional<? extends CampaignWorkflowAdvancedInput> advancedInput) {
            Utils.checkNotNull(advancedInput, "advancedInput");
            this.advancedInput = advancedInput;
            return this;
        }

        public CampaignUpdateWorkflowInput build() {

            return new CampaignUpdateWorkflowInput(
                id, primaryInput, advancedInput);
        }

    }
}
