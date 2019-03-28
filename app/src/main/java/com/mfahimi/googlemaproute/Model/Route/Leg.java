package com.mfahimi.googlemaproute.Model.Route;

/**
 * Created by Fahimi
 */


import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leg {

    @SerializedName("distance")
    private Distance distance;
    @SerializedName("duration")
    private Duration duration;
    @SerializedName("endAddress")
    private String endAddress;
    @SerializedName("endLocation")
    private Location endLocation;
    @SerializedName("startAddress")
    private String startAddress;
    @SerializedName("startLocation")
    private Location startLocation;
    @SerializedName("steps")
    private List<Step> steps = null;
    @SerializedName("trafficSpeedEntry")
    private List<Object> trafficSpeedEntry = null;
    @SerializedName("viaWaypoint")
    private List<Object> viaWaypoint = null;
    @SerializedName("additionalProperties")
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Distance getDistance() {
        return distance;
    }

    public Duration getDuration() {
        return duration;
    }

    public String getEndAddress() {
        return endAddress;
    }

    public Location getEndLocation() {
        return endLocation;
    }

    public String getStartAddress() {
        return startAddress;
    }

    public Location getStartLocation() {
        return startLocation;
    }

    public List<Step> getSteps() {
        return steps;
    }

    public List<Object> getTrafficSpeedEntry() {
        return trafficSpeedEntry;
    }

    public List<Object> getViaWaypoint() {
        return viaWaypoint;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }
}