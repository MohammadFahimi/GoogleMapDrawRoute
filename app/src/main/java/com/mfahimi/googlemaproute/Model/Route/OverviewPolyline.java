package com.mfahimi.googlemaproute.Model.Route;

/**
 * Created by Fahimi
 */

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;

public class OverviewPolyline {

    @SerializedName("points")
    private String points;
    @SerializedName("additionalProperties")
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getPoints() {
        return points;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }


}