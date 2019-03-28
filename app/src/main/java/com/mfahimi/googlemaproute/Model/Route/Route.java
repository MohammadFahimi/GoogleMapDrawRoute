package com.mfahimi.googlemaproute.Model.Route;

/**
 * Created by Fahimi
 */

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Route {

    @SerializedName("bounds")
    private Bounds bounds;
    @SerializedName("copyrights")
    private String copyrights;
    @SerializedName("legs")
    private List<Leg> legs = null;
    @SerializedName("overviewPolyline")
    private OverviewPolyline overviewPolyline;
    @SerializedName("summary")
    private String summary;
    @SerializedName("warnings")
    private List<Object> warnings = null;
    @SerializedName("waypointOrder")
    private List<Object> waypointOrder = null;
    @SerializedName("additionalProperties")
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Bounds getBounds() {
        return bounds;
    }

    public String getCopyrights() {
        return copyrights;
    }

    public List<Leg> getLegs() {
        return legs;
    }

    public OverviewPolyline getOverviewPolyline() {
        return overviewPolyline;
    }

    public String getSummary() {
        return summary;
    }

    public List<Object> getWarnings() {
        return warnings;
    }

    public List<Object> getWaypointOrder() {
        return waypointOrder;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }
}