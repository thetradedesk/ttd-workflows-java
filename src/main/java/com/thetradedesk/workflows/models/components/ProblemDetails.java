/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.thetradedesk.workflows.models.components;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.thetradedesk.workflows.utils.Utils;
import java.lang.Override;
import java.lang.String;


public class ProblemDetails {
    @JsonCreator
    public ProblemDetails() {
    }

    public static Builder builder() {
        return new Builder();
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            );
    }
    
    @Override
    public String toString() {
        return Utils.toString(ProblemDetails.class);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Builder() {
          // force use of static builder() method
        }

        public ProblemDetails build() {

            return new ProblemDetails(
                );
        }

    }
}
