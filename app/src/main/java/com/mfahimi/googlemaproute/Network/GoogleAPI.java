package com.mfahimi.googlemaproute.Network;

import com.mfahimi.googlemaproute.Model.GSD;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Fahimi
 */

public interface GoogleAPI {

    @GET("api/directions/json?")
    Call<GSD> getDistanceDuration(@Query("key") String key, @Query("units") String units, @Query("origin") String origin,
                                  @Query("destination") String destination, @Query("mode") String mode, @Query("alternatives") boolean alternatives);


  @GET("api/directions/json?")
    Call<GSD> getRoute(@Query("key") String key,@Query("units") String units, @Query("origin") String origin,
                       @Query("destination") String destination, @Query("mode") String mode, @Query("alternatives") boolean alternatives);

}
