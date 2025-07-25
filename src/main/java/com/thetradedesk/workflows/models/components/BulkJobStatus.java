/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.thetradedesk.workflows.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum BulkJobStatus {
    QUEUED("Queued"),
    IN_PROGRESS("InProgress"),
    PARTIAL_SUCCESS("PartialSuccess"),
    FAILURE("Failure"),
    SUCCESS("Success"),
    CANCELLED("Cancelled");

    @JsonValue
    private final String value;

    BulkJobStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<BulkJobStatus> fromValue(String value) {
        for (BulkJobStatus o: BulkJobStatus.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

