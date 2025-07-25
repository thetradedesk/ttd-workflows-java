/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.thetradedesk.workflows.utils;

import java.util.Objects;

// internal class, not for public use
// TODO move to internal package
public final class QueryParameter {
    
    private final String name;
    private final String value;
    private final boolean allowReserved;
    
    private QueryParameter(String name, String value, boolean allowReserved) {
        this.name = name;
        this.value = value;
        this.allowReserved = allowReserved;
    }
    
    public static QueryParameter of(String name, String value, boolean allowReserved) {
        return new QueryParameter(name, value, allowReserved);
    }
    
    public String name() {
        return name;
    }
    
    public String value() {
        return value;
    }
    
    public boolean allowReserved() {
        return allowReserved;
    }

    @Override
    public String toString() {
        return "QueryParameter [name=" + name + ", value=" + value + ", allowReserved=" + allowReserved + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(allowReserved, name, value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        QueryParameter other = (QueryParameter) obj;
        return allowReserved == other.allowReserved && Objects.equals(name, other.name)
                && Objects.equals(value, other.value);
    }

}
