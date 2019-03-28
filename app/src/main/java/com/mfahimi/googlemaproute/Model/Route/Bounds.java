package com.mfahimi.googlemaproute.Model.Route;

/**
 * Created by Fahimi
 */

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;

public class Bounds {

    @SerializedName("northeast")
    private Direction northeast;
    @SerializedName("southwest")
    private Direction southwest;
    @SerializedName("additionalProperties")
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Direction getNortheast() {
        return northeast;
    }

    public Direction getSouthwest() {
        return southwest;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }
}