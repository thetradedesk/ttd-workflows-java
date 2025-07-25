/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.thetradedesk.workflows.utils;

import java.lang.reflect.Field;

class MultipartFormMetadata {

    boolean file;
    boolean content;
    boolean json;
    String name;

    private MultipartFormMetadata() {
    }

    // multipartForm:name=file
    static MultipartFormMetadata parse(Field field) throws IllegalArgumentException, IllegalAccessException {
        return Metadata.parse("multipartForm", new MultipartFormMetadata(), field);
    }
}
