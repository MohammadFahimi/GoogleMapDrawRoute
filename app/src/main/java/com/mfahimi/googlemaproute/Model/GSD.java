package com.mfahimi.googlemaproute.Model;

import com.google.gson.annotations.SerializedName;
import com.mfahimi.googlemaproute.Model.Route.GeocodedWaypoint;
import com.mfahimi.googlemaproute.Model.Route.Route;

import java.util.List;

/**
 * Created by Fahimi
 */

public class GSD {
    @SerializedName("status")
    private String status;
    @SerializedName("routes")
    private List<Route> routes;
    @SerializedName("geocoded_waypoints")
    private List<GeocodedWaypoint> geocoded_waypoints;

    public String getStatus() {
        return status;
    }

    public List<GeocodedWaypoint> getGeocoded_waypoints() {
        return geocoded_waypoints;
    }

    public List<Route> getRoutes() {
        return routes;
    }

}
