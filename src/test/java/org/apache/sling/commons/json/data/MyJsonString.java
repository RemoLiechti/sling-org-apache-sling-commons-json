package org.apache.sling.commons.json.data;

import org.apache.sling.commons.json.JSONString;

/**
 * Used in testing when a JSONString is needed
 */
public class MyJsonString implements JSONString {

    @Override
    public String toJSONString() {
        return "my string";
    }
}