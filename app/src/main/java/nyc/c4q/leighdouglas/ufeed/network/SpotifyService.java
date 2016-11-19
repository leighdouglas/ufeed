package nyc.c4q.leighdouglas.ufeed.network;

import nyc.c4q.leighdouglas.ufeed.model.TopTrack;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by mathcore on 10/30/16.
 */

public interface SpotifyService {

    @GET("v1/me/top/tracks?limit=1&offset=5")
    Call<TopTrack> getTopTrack();


}
