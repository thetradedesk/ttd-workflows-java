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
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class AdGroupComscoreSettings {

    @JsonProperty("isEnabled")
    private boolean isEnabled;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("populationId")
    private JsonNullable<Integer> populationId;


    @JsonInclude(Include.ALWAYS)
    @JsonProperty("demographicMemberIds")
    private Optional<? extends List<Integer>> demographicMemberIds;


    @JsonInclude(Include.ALWAYS)
    @JsonProperty("mobileDemographicMemberIds")
    private Optional<? extends List<Integer>> mobileDemographicMemberIds;

    @JsonCreator
    public AdGroupComscoreSettings(
            @JsonProperty("isEnabled") boolean isEnabled,
            @JsonProperty("populationId") JsonNullable<Integer> populationId,
            @JsonProperty("demographicMemberIds") Optional<? extends List<Integer>> demographicMemberIds,
            @JsonProperty("mobileDemographicMemberIds") Optional<? extends List<Integer>> mobileDemographicMemberIds) {
        Utils.checkNotNull(isEnabled, "isEnabled");
        Utils.checkNotNull(populationId, "populationId");
        Utils.checkNotNull(demographicMemberIds, "demographicMemberIds");
        Utils.checkNotNull(mobileDemographicMemberIds, "mobileDemographicMemberIds");
        this.isEnabled = isEnabled;
        this.populationId = populationId;
        this.demographicMemberIds = demographicMemberIds;
        this.mobileDemographicMemberIds = mobileDemographicMemberIds;
    }
    
    public AdGroupComscoreSettings(
            boolean isEnabled) {
        this(isEnabled, JsonNullable.undefined(), Optional.empty(),
            Optional.empty());
    }

    @JsonIgnore
    public boolean isEnabled() {
        return isEnabled;
    }

    @JsonIgnore
    public JsonNullable<Integer> populationId() {
        return populationId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Integer>> demographicMemberIds() {
        return (Optional<List<Integer>>) demographicMemberIds;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Integer>> mobileDemographicMemberIds() {
        return (Optional<List<Integer>>) mobileDemographicMemberIds;
    }

    public static Builder builder() {
        return new Builder();
    }


    public AdGroupComscoreSettings withIsEnabled(boolean isEnabled) {
        Utils.checkNotNull(isEnabled, "isEnabled");
        this.isEnabled = isEnabled;
        return this;
    }

    public AdGroupComscoreSettings withPopulationId(int populationId) {
        Utils.checkNotNull(populationId, "populationId");
        this.populationId = JsonNullable.of(populationId);
        return this;
    }

    public AdGroupComscoreSettings withPopulationId(JsonNullable<Integer> populationId) {
        Utils.checkNotNull(populationId, "populationId");
        this.populationId = populationId;
        return this;
    }

    public AdGroupComscoreSettings withDemographicMemberIds(List<Integer> demographicMemberIds) {
        Utils.checkNotNull(demographicMemberIds, "demographicMemberIds");
        this.demographicMemberIds = Optional.ofNullable(demographicMemberIds);
        return this;
    }


    public AdGroupComscoreSettings withDemographicMemberIds(Optional<? extends List<Integer>> demographicMemberIds) {
        Utils.checkNotNull(demographicMemberIds, "demographicMemberIds");
        this.demographicMemberIds = demographicMemberIds;
        return this;
    }

    public AdGroupComscoreSettings withMobileDemographicMemberIds(List<Integer> mobileDemographicMemberIds) {
        Utils.checkNotNull(mobileDemographicMemberIds, "mobileDemographicMemberIds");
        this.mobileDemographicMemberIds = Optional.ofNullable(mobileDemographicMemberIds);
        return this;
    }


    public AdGroupComscoreSettings withMobileDemographicMemberIds(Optional<? extends List<Integer>> mobileDemographicMemberIds) {
        Utils.checkNotNull(mobileDemographicMemberIds, "mobileDemographicMemberIds");
        this.mobileDemographicMemberIds = mobileDemographicMemberIds;
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
        AdGroupComscoreSettings other = (AdGroupComscoreSettings) o;
        return 
            Utils.enhancedDeepEquals(this.isEnabled, other.isEnabled) &&
            Utils.enhancedDeepEquals(this.populationId, other.populationId) &&
            Utils.enhancedDeepEquals(this.demographicMemberIds, other.demographicMemberIds) &&
            Utils.enhancedDeepEquals(this.mobileDemographicMemberIds, other.mobileDemographicMemberIds);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            isEnabled, populationId, demographicMemberIds,
            mobileDemographicMemberIds);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AdGroupComscoreSettings.class,
                "isEnabled", isEnabled,
                "populationId", populationId,
                "demographicMemberIds", demographicMemberIds,
                "mobileDemographicMemberIds", mobileDemographicMemberIds);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Boolean isEnabled;

        private JsonNullable<Integer> populationId = JsonNullable.undefined();

        private Optional<? extends List<Integer>> demographicMemberIds = Optional.empty();

        private Optional<? extends List<Integer>> mobileDemographicMemberIds = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        public Builder isEnabled(boolean isEnabled) {
            Utils.checkNotNull(isEnabled, "isEnabled");
            this.isEnabled = isEnabled;
            return this;
        }


        public Builder populationId(int populationId) {
            Utils.checkNotNull(populationId, "populationId");
            this.populationId = JsonNullable.of(populationId);
            return this;
        }

        public Builder populationId(JsonNullable<Integer> populationId) {
            Utils.checkNotNull(populationId, "populationId");
            this.populationId = populationId;
            return this;
        }


        public Builder demographicMemberIds(List<Integer> demographicMemberIds) {
            Utils.checkNotNull(demographicMemberIds, "demographicMemberIds");
            this.demographicMemberIds = Optional.ofNullable(demographicMemberIds);
            return this;
        }

        public Builder demographicMemberIds(Optional<? extends List<Integer>> demographicMemberIds) {
            Utils.checkNotNull(demographicMemberIds, "demographicMemberIds");
            this.demographicMemberIds = demographicMemberIds;
            return this;
        }


        public Builder mobileDemographicMemberIds(List<Integer> mobileDemographicMemberIds) {
            Utils.checkNotNull(mobileDemographicMemberIds, "mobileDemographicMemberIds");
            this.mobileDemographicMemberIds = Optional.ofNullable(mobileDemographicMemberIds);
            return this;
        }

        public Builder mobileDemographicMemberIds(Optional<? extends List<Integer>> mobileDemographicMemberIds) {
            Utils.checkNotNull(mobileDemographicMemberIds, "mobileDemographicMemberIds");
            this.mobileDemographicMemberIds = mobileDemographicMemberIds;
            return this;
        }

        public AdGroupComscoreSettings build() {

            return new AdGroupComscoreSettings(
                isEnabled, populationId, demographicMemberIds,
                mobileDemographicMemberIds);
        }

    }
}
