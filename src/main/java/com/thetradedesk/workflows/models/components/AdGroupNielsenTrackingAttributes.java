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
import java.util.List;
import java.util.Optional;


public class AdGroupNielsenTrackingAttributes {

    @JsonProperty("enhancedReportingOption")
    private EnhancedNielsenReportingOptions enhancedReportingOption;


    @JsonProperty("gender")
    private TargetingGender gender;


    @JsonProperty("startAge")
    private TargetingStartAge startAge;


    @JsonProperty("endAge")
    private TargetingEndAge endAge;


    @JsonInclude(Include.ALWAYS)
    @JsonProperty("countries")
    private Optional<? extends List<String>> countries;

    @JsonCreator
    public AdGroupNielsenTrackingAttributes(
            @JsonProperty("enhancedReportingOption") EnhancedNielsenReportingOptions enhancedReportingOption,
            @JsonProperty("gender") TargetingGender gender,
            @JsonProperty("startAge") TargetingStartAge startAge,
            @JsonProperty("endAge") TargetingEndAge endAge,
            @JsonProperty("countries") Optional<? extends List<String>> countries) {
        Utils.checkNotNull(enhancedReportingOption, "enhancedReportingOption");
        Utils.checkNotNull(gender, "gender");
        Utils.checkNotNull(startAge, "startAge");
        Utils.checkNotNull(endAge, "endAge");
        Utils.checkNotNull(countries, "countries");
        this.enhancedReportingOption = enhancedReportingOption;
        this.gender = gender;
        this.startAge = startAge;
        this.endAge = endAge;
        this.countries = countries;
    }
    
    public AdGroupNielsenTrackingAttributes(
            EnhancedNielsenReportingOptions enhancedReportingOption,
            TargetingGender gender,
            TargetingStartAge startAge,
            TargetingEndAge endAge) {
        this(enhancedReportingOption, gender, startAge,
            endAge, Optional.empty());
    }

    @JsonIgnore
    public EnhancedNielsenReportingOptions enhancedReportingOption() {
        return enhancedReportingOption;
    }

    @JsonIgnore
    public TargetingGender gender() {
        return gender;
    }

    @JsonIgnore
    public TargetingStartAge startAge() {
        return startAge;
    }

    @JsonIgnore
    public TargetingEndAge endAge() {
        return endAge;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> countries() {
        return (Optional<List<String>>) countries;
    }

    public static Builder builder() {
        return new Builder();
    }


    public AdGroupNielsenTrackingAttributes withEnhancedReportingOption(EnhancedNielsenReportingOptions enhancedReportingOption) {
        Utils.checkNotNull(enhancedReportingOption, "enhancedReportingOption");
        this.enhancedReportingOption = enhancedReportingOption;
        return this;
    }

    public AdGroupNielsenTrackingAttributes withGender(TargetingGender gender) {
        Utils.checkNotNull(gender, "gender");
        this.gender = gender;
        return this;
    }

    public AdGroupNielsenTrackingAttributes withStartAge(TargetingStartAge startAge) {
        Utils.checkNotNull(startAge, "startAge");
        this.startAge = startAge;
        return this;
    }

    public AdGroupNielsenTrackingAttributes withEndAge(TargetingEndAge endAge) {
        Utils.checkNotNull(endAge, "endAge");
        this.endAge = endAge;
        return this;
    }

    public AdGroupNielsenTrackingAttributes withCountries(List<String> countries) {
        Utils.checkNotNull(countries, "countries");
        this.countries = Optional.ofNullable(countries);
        return this;
    }


    public AdGroupNielsenTrackingAttributes withCountries(Optional<? extends List<String>> countries) {
        Utils.checkNotNull(countries, "countries");
        this.countries = countries;
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
        AdGroupNielsenTrackingAttributes other = (AdGroupNielsenTrackingAttributes) o;
        return 
            Utils.enhancedDeepEquals(this.enhancedReportingOption, other.enhancedReportingOption) &&
            Utils.enhancedDeepEquals(this.gender, other.gender) &&
            Utils.enhancedDeepEquals(this.startAge, other.startAge) &&
            Utils.enhancedDeepEquals(this.endAge, other.endAge) &&
            Utils.enhancedDeepEquals(this.countries, other.countries);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            enhancedReportingOption, gender, startAge,
            endAge, countries);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AdGroupNielsenTrackingAttributes.class,
                "enhancedReportingOption", enhancedReportingOption,
                "gender", gender,
                "startAge", startAge,
                "endAge", endAge,
                "countries", countries);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private EnhancedNielsenReportingOptions enhancedReportingOption;

        private TargetingGender gender;

        private TargetingStartAge startAge;

        private TargetingEndAge endAge;

        private Optional<? extends List<String>> countries = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        public Builder enhancedReportingOption(EnhancedNielsenReportingOptions enhancedReportingOption) {
            Utils.checkNotNull(enhancedReportingOption, "enhancedReportingOption");
            this.enhancedReportingOption = enhancedReportingOption;
            return this;
        }


        public Builder gender(TargetingGender gender) {
            Utils.checkNotNull(gender, "gender");
            this.gender = gender;
            return this;
        }


        public Builder startAge(TargetingStartAge startAge) {
            Utils.checkNotNull(startAge, "startAge");
            this.startAge = startAge;
            return this;
        }


        public Builder endAge(TargetingEndAge endAge) {
            Utils.checkNotNull(endAge, "endAge");
            this.endAge = endAge;
            return this;
        }


        public Builder countries(List<String> countries) {
            Utils.checkNotNull(countries, "countries");
            this.countries = Optional.ofNullable(countries);
            return this;
        }

        public Builder countries(Optional<? extends List<String>> countries) {
            Utils.checkNotNull(countries, "countries");
            this.countries = countries;
            return this;
        }

        public AdGroupNielsenTrackingAttributes build() {

            return new AdGroupNielsenTrackingAttributes(
                enhancedReportingOption, gender, startAge,
                endAge, countries);
        }

    }
}
