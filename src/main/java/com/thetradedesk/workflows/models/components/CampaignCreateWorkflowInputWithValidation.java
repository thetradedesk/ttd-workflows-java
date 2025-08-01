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
import java.util.List;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class CampaignCreateWorkflowInputWithValidation {

    @JsonProperty("primaryInput")
    private CampaignCreateWorkflowPrimaryInput primaryInput;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("advancedInput")
    private Optional<? extends CampaignWorkflowAdvancedInput> advancedInput;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("adGroups")
    private JsonNullable<? extends List<CampaignCreateWorkflowAdGroupInput>> adGroups;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("validateInputOnly")
    private JsonNullable<Boolean> validateInputOnly;

    @JsonCreator
    public CampaignCreateWorkflowInputWithValidation(
            @JsonProperty("primaryInput") CampaignCreateWorkflowPrimaryInput primaryInput,
            @JsonProperty("advancedInput") Optional<? extends CampaignWorkflowAdvancedInput> advancedInput,
            @JsonProperty("adGroups") JsonNullable<? extends List<CampaignCreateWorkflowAdGroupInput>> adGroups,
            @JsonProperty("validateInputOnly") JsonNullable<Boolean> validateInputOnly) {
        Utils.checkNotNull(primaryInput, "primaryInput");
        Utils.checkNotNull(advancedInput, "advancedInput");
        Utils.checkNotNull(adGroups, "adGroups");
        Utils.checkNotNull(validateInputOnly, "validateInputOnly");
        this.primaryInput = primaryInput;
        this.advancedInput = advancedInput;
        this.adGroups = adGroups;
        this.validateInputOnly = validateInputOnly;
    }
    
    public CampaignCreateWorkflowInputWithValidation(
            CampaignCreateWorkflowPrimaryInput primaryInput) {
        this(primaryInput, Optional.empty(), JsonNullable.undefined(),
            JsonNullable.undefined());
    }

    @JsonIgnore
    public CampaignCreateWorkflowPrimaryInput primaryInput() {
        return primaryInput;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CampaignWorkflowAdvancedInput> advancedInput() {
        return (Optional<CampaignWorkflowAdvancedInput>) advancedInput;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<CampaignCreateWorkflowAdGroupInput>> adGroups() {
        return (JsonNullable<List<CampaignCreateWorkflowAdGroupInput>>) adGroups;
    }

    @JsonIgnore
    public JsonNullable<Boolean> validateInputOnly() {
        return validateInputOnly;
    }

    public static Builder builder() {
        return new Builder();
    }


    public CampaignCreateWorkflowInputWithValidation withPrimaryInput(CampaignCreateWorkflowPrimaryInput primaryInput) {
        Utils.checkNotNull(primaryInput, "primaryInput");
        this.primaryInput = primaryInput;
        return this;
    }

    public CampaignCreateWorkflowInputWithValidation withAdvancedInput(CampaignWorkflowAdvancedInput advancedInput) {
        Utils.checkNotNull(advancedInput, "advancedInput");
        this.advancedInput = Optional.ofNullable(advancedInput);
        return this;
    }


    public CampaignCreateWorkflowInputWithValidation withAdvancedInput(Optional<? extends CampaignWorkflowAdvancedInput> advancedInput) {
        Utils.checkNotNull(advancedInput, "advancedInput");
        this.advancedInput = advancedInput;
        return this;
    }

    public CampaignCreateWorkflowInputWithValidation withAdGroups(List<CampaignCreateWorkflowAdGroupInput> adGroups) {
        Utils.checkNotNull(adGroups, "adGroups");
        this.adGroups = JsonNullable.of(adGroups);
        return this;
    }

    public CampaignCreateWorkflowInputWithValidation withAdGroups(JsonNullable<? extends List<CampaignCreateWorkflowAdGroupInput>> adGroups) {
        Utils.checkNotNull(adGroups, "adGroups");
        this.adGroups = adGroups;
        return this;
    }

    public CampaignCreateWorkflowInputWithValidation withValidateInputOnly(boolean validateInputOnly) {
        Utils.checkNotNull(validateInputOnly, "validateInputOnly");
        this.validateInputOnly = JsonNullable.of(validateInputOnly);
        return this;
    }

    public CampaignCreateWorkflowInputWithValidation withValidateInputOnly(JsonNullable<Boolean> validateInputOnly) {
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
        CampaignCreateWorkflowInputWithValidation other = (CampaignCreateWorkflowInputWithValidation) o;
        return 
            Utils.enhancedDeepEquals(this.primaryInput, other.primaryInput) &&
            Utils.enhancedDeepEquals(this.advancedInput, other.advancedInput) &&
            Utils.enhancedDeepEquals(this.adGroups, other.adGroups) &&
            Utils.enhancedDeepEquals(this.validateInputOnly, other.validateInputOnly);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            primaryInput, advancedInput, adGroups,
            validateInputOnly);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CampaignCreateWorkflowInputWithValidation.class,
                "primaryInput", primaryInput,
                "advancedInput", advancedInput,
                "adGroups", adGroups,
                "validateInputOnly", validateInputOnly);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private CampaignCreateWorkflowPrimaryInput primaryInput;

        private Optional<? extends CampaignWorkflowAdvancedInput> advancedInput = Optional.empty();

        private JsonNullable<? extends List<CampaignCreateWorkflowAdGroupInput>> adGroups = JsonNullable.undefined();

        private JsonNullable<Boolean> validateInputOnly = JsonNullable.undefined();

        private Builder() {
          // force use of static builder() method
        }


        public Builder primaryInput(CampaignCreateWorkflowPrimaryInput primaryInput) {
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


        public Builder adGroups(List<CampaignCreateWorkflowAdGroupInput> adGroups) {
            Utils.checkNotNull(adGroups, "adGroups");
            this.adGroups = JsonNullable.of(adGroups);
            return this;
        }

        public Builder adGroups(JsonNullable<? extends List<CampaignCreateWorkflowAdGroupInput>> adGroups) {
            Utils.checkNotNull(adGroups, "adGroups");
            this.adGroups = adGroups;
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

        public CampaignCreateWorkflowInputWithValidation build() {

            return new CampaignCreateWorkflowInputWithValidation(
                primaryInput, advancedInput, adGroups,
                validateInputOnly);
        }

    }
}
