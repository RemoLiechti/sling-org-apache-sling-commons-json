package org.apache.sling.commons.json.data;

import org.apache.sling.commons.json.JSONPropertyIgnore;
import org.apache.sling.commons.json.JSONPropertyName;

public interface MyBeanCustomNameInterface {
    @JSONPropertyName("InterfaceField")
    float getSomeFloat();

    @JSONPropertyIgnore
    int getIgnoredInt();
}