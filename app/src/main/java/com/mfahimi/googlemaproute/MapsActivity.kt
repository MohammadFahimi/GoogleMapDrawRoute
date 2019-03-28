package com.mfahimi.googlemaproute

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.google.android.gms.maps.*

import com.google.android.gms.maps.model.*
import com.mfahimi.googlemaproute.Model.GSD
import com.mfahimi.googlemaproute.Network.GoogleApiService
import com.mfahimi.googlemaproute.Util.DataParser
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.ArrayList
import java.util.HashMap

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var mapFragment: SupportMapFragment
    private var Olat: Double = 35.700385
    private var Olng: Double = 51.365694
    private var Dlat: Double = 35.721067
    private var Dlng: Double = 51.408557

    internal var lineOptions: PolylineOptions = PolylineOptions()
    internal var polyline: Polyline? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        val source = LatLng(Olat, Olng)
        val destination = LatLng(Dlat, Dlng)
        mMap.addMarker(MarkerOptions().position(source))
        mMap.addMarker(MarkerOptions().position(destination))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(source))

        getGoRoute()
    }

    private fun drawRoute(result: List<List<HashMap<String, String>>>) {

        try {
            var points: ArrayList<LatLng>
            val builder = LatLngBounds.Builder()

            // Traversing through all the routes
            for (i in result.indices) {
                points = ArrayList()
                lineOptions = PolylineOptions()

                // Fetching i-th route
                val path = result[i]

                // Fetching all the points in i-th route
                for (j in path.indices) {
                    val point = path[j]

                    val lat = java.lang.Double.parseDouble(point["lat"]!!)
                    val lng = java.lang.Double.parseDouble(point["lng"]!!)
                    val position = LatLng(lat, lng)

                    points.add(position)
                    builder.include(position)
                }

                // Adding all the points in the route to LineOptions
                lineOptions.addAll(points)
                lineOptions.width(15f)
                lineOptions.zIndex(2f)

                lineOptions.color(ContextCompat.getColor(this, R.color.maproute))


                val bounds = builder.build()
                val padding = 180
                val cu = CameraUpdateFactory.newLatLngBounds(bounds, padding)

                mMap.animateCamera(cu)

            }

            // Drawing polyline in the Google Map for the i-th route

            polyline?.remove()

            polyline = mMap.addPolyline(lineOptions)

            polyline?.setStartCap(RoundCap())
            polyline?.setEndCap(RoundCap())
            polyline?.setJointType(JointType.ROUND)


        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    private fun getGoRoute() {

        val call = GoogleApiService.getAPI().getRoute(
            resources.getString(R.string.google_maps_webservice_key),
            "metric",
            "$Olat,$Olng",
            "$Dlat,$Dlng",
            "driving", false
        )

        call.enqueue(object : Callback<GSD> {
            override fun onResponse(call: Call<GSD>, response: Response<GSD>) {
                try {
                    if (response.body()!!.getRoutes() != null)
                        drawRoute(DataParser.parseRouteObject(response.body()!!.getRoutes().get(0)))
                } catch (e: Exception) {
                }

            }

            override fun onFailure(call: Call<GSD>, t: Throwable) {}
        })


    }

}
