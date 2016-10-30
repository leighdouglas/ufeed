package nyc.c4q.leighdouglas.ufeed.network;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by mathcore on 10/30/16.
 */

public interface InstagramService {

    @GET("v1/tags/nofilter/media/recent")
    Call<ResponseBody> getHashTag(@Query("token") String ApiKey);

}
