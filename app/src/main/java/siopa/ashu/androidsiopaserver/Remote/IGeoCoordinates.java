package siopa.ashu.androidsiopaserver.Remote;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by DELL on 5/24/2018.
 */

public interface IGeoCoordinates {

    @GET("maps/api/geocode/json")
    Call<String> getGeoCode (@Query("address") String address);

    @GET("maps/api/directions/json")
    Call<String> getDirections(@Query("origin")String origin, @Query("destination") String destination);
}
