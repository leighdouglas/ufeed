package nyc.c4q.leighdouglas.ufeed.network;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by mathcore on 10/30/16.
 */

public interface SpotifyService {

    @GET("v1/browse/new-releases")
    Call<ResponseBody> getNewRelease();


}
