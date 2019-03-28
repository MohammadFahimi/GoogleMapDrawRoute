package com.mfahimi.googlemaproute.Model.Route;

/**
 * Created by Fahimi
 */

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeocodedWaypoint {

    @SerializedName("geocoderStatus")
    private String geocoderStatus;
    @SerializedName("placeId")
    private String placeId;
    @SerializedName("types")
    private List<String> types = null;
    @SerializedName("additionalProperties")
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getGeocoderStatus() {
        return geocoderStatus;
    }

    public String getPlaceId() {
        return placeId;
    }

    public List<String> getTypes() {
        return types;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }
}