package siopa.ashu.androidsiopaserver.Remote;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import siopa.ashu.androidsiopaserver.Model.MyResponse;
import siopa.ashu.androidsiopaserver.Model.Sender;

/**
 * Created by DELL on 5/28/2018.
 */

public interface APIService {
    @Headers(
            {
                    "content-type:application/json",
                    "Authorization:key=AAAA5ZS2M6E:APA91bGUcRx7UJtqy8ZsKRgfClxCBBchNVQrAscSdjZEBHYpTPxi8IO7CIH-6vUVyCXqrxI1FloDE1-EPGAcStWKpSIl_08vx-qKniSqePO5epAGPEgo3KLJnaBF7VbU-BmWS2u7gt-U"

            }
    )
    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);

}