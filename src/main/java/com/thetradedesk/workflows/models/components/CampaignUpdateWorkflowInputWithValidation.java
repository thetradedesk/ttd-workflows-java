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
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class CampaignUpdateWorkflowInputWithValidation {

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("id")
    private Optional<String> id;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("primaryInput")
    private Optional<? extends CampaignUpdateWorkflowPrimaryInput> primaryInput;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("advancedInput")
    private Optional<? extends CampaignWorkflowAdvancedInput> advancedInput;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("validateInputOnly")
    private JsonNullable<Boolean> validateInputOnly;

    @JsonCreator
    public CampaignUpdateWorkflowInputWithValidation(
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("primaryInput") Optional<? extends CampaignUpdateWorkflowPrimaryInput> primaryInput,
            @JsonProperty("advancedInput") Optional<? extends CampaignWorkflowAdvancedInput> advancedInput,
            @JsonProperty("validateInputOnly") JsonNullable<Boolean> validateInputOnly) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(primaryInput, "primaryInput");
        Utils.checkNotNull(advancedInput, "advancedInput");
        Utils.checkNotNull(validateInputOnly, "validateInputOnly");
        this.id = id;
        this.primaryInput = primaryInput;
        this.advancedInput = advancedInput;
        this.validateInputOnly = validateInputOnly;
    }
    
    public CampaignUpdateWorkflowInputWithValidation() {
        this(Optional.empty(), Optional.empty(), Optional.empty(),
            JsonNullable.undefined());
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

    @JsonIgnore
    public JsonNullable<Boolean> validateInputOnly() {
        return validateInputOnly;
    }

    public static Builder builder() {
        return new Builder();
    }


    public CampaignUpdateWorkflowInputWithValidation withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }


    public CampaignUpdateWorkflowInputWithValidation withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public CampaignUpdateWorkflowInputWithValidation withPrimaryInput(CampaignUpdateWorkflowPrimaryInput primaryInput) {
        Utils.checkNotNull(primaryInput, "primaryInput");
        this.primaryInput = Optional.ofNullable(primaryInput);
        return this;
    }


    public CampaignUpdateWorkflowInputWithValidation withPrimaryInput(Optional<? extends CampaignUpdateWorkflowPrimaryInput> primaryInput) {
        Utils.checkNotNull(primaryInput, "primaryInput");
        this.primaryInput = primaryInput;
        return this;
    }

    public CampaignUpdateWorkflowInputWithValidation withAdvancedInput(CampaignWorkflowAdvancedInput advancedInput) {
        Utils.checkNotNull(advancedInput, "advancedInput");
        this.advancedInput = Optional.ofNullable(advancedInput);
        return this;
    }


    public CampaignUpdateWorkflowInputWithValidation withAdvancedInput(Optional<? extends CampaignWorkflowAdvancedInput> advancedInput) {
        Utils.checkNotNull(advancedInput, "advancedInput");
        this.advancedInput = advancedInput;
        return this;
    }

    public CampaignUpdateWorkflowInputWithValidation withValidateInputOnly(boolean validateInputOnly) {
        Utils.checkNotNull(validateInputOnly, "validateInputOnly");
        this.validateInputOnly = JsonNullable.of(validateInputOnly);
        return this;
    }

    public CampaignUpdateWorkflowInputWithValidation withValidateInputOnly(JsonNullable<Boolean> validateInputOnly) {
        Utils.checkNotNull(validateInputOnly, "validateInputOnly");
        this.validateInputOnly = validateInputOnly;
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
        CampaignUpdateWorkflowInputWithValidation other = (CampaignUpdateWorkflowInputWithValidation) o;
        return 
            Utils.enhancedDeepEquals(this.id, other.id) &&
            Utils.enhancedDeepEquals(this.primaryInput, other.primaryInput) &&
            Utils.enhancedDeepEquals(this.advancedInput, other.advancedInput) &&
            Utils.enhancedDeepEquals(this.validateInputOnly, other.validateInputOnly);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            id, primaryInput, advancedInput,
            validateInputOnly);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CampaignUpdateWorkflowInputWithValidation.class,
                "id", id,
                "primaryInput", primaryInput,
                "advancedInput", advancedInput,
                "validateInputOnly", validateInputOnly);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<String> id = Optional.empty();

        private Optional<? extends CampaignUpdateWorkflowPrimaryInput> primaryInput = Optional.empty();

        private Optional<? extends CampaignWorkflowAdvancedInput> advancedInput = Optional.empty();

        private JsonNullable<Boolean> validateInputOnly = JsonNullable.undefined();

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


        public Builder validateInputOnly(boolean validateInputOnly) {
            Utils.checkNotNull(validateInputOnly, "validateInputOnly");
            this.validateInputOnly = JsonNullable.of(validateInputOnly);
            return this;
        }

        public Builder validateInputOnly(JsonNullable<Boolean> validateInputOnly) {
            Utils.checkNotNull(validateInputOnly, "validateInputOnly");
            this.validateInputOnly = validateInputOnly;
            return this;
        }

        public CampaignUpdateWorkflowInputWithValidation build() {

            return new CampaignUpdateWorkflowInputWithValidation(
                id, primaryInput, advancedInput,
                validateInputOnly);
        }

    }
}
