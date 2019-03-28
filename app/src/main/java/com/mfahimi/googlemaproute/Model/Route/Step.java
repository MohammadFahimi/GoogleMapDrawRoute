package com.mfahimi.googlemaproute.Model.Route;

/**
 * Created by Fahimi
 */


import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;

public class Step {

    @SerializedName("distance")
    private Distance distance;
    @SerializedName("duration")
    private Duration duration;
    @SerializedName("endLocation")
    private Location endLocation;
    @SerializedName("htmlInstructions")
    private String htmlInstructions;
    @SerializedName("polyline")
    private Polyline polyline;
    @SerializedName("startLocation")
    private Location startLocation;
    @SerializedName("travelMode")
    private String travelMode;
    @SerializedName("maneuver")
    private String maneuver;
    @SerializedName("additionalProperties")
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Distance getDistance() {
        return distance;
    }

    public void setDistance(Distance distance) {
        this.distance = distance;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public Location getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(Location endLocation) {
        this.endLocation = endLocation;
    }

    public String getHtmlInstructions() {
        return htmlInstructions;
    }

    public void setHtmlInstructions(String htmlInstructions) {
        this.htmlInstructions = htmlInstructions;
    }

    public Polyline getPolyline() {
        return polyline;
    }

    public void setPolyline(Polyline polyline) {
        this.polyline = polyline;
    }

    public Location getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(Location startLocation) {
        this.startLocation = startLocation;
    }

    public String getTravelMode() {
        return travelMode;
    }

    public void setTravelMode(String travelMode) {
        this.travelMode = travelMode;
    }

    public String getManeuver() {
        return maneuver;
    }

    public void setManeuver(String maneuver) {
        this.maneuver = maneuver;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }
}