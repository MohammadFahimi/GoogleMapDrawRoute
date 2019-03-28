package com.mfahimi.googlemaproute.Model.Route;

/**
 * Created by Fahimi
 */

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;

public class Location {

    @SerializedName("lat")
    private Double lat;
    @SerializedName("lng")
    private Double lng;
    @SerializedName("additionalProperties")
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Double getLat() {
        return lat;
    }

    public Double getLng() {
        return lng;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }
}