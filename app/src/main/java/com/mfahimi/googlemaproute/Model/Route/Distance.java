package com.mfahimi.googlemaproute.Model.Route;

/**
 * Created by Fahimi
 */

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;

public class Distance {

    @SerializedName("text")
    private String text;
    @SerializedName("value")
    private Integer value;
    @SerializedName("additionalProperties")
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getText() {
        return text;
    }

    public Integer getValue() {
        return value;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }
}