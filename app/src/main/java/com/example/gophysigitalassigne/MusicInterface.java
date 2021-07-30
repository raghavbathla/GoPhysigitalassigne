package com.example.gophysigitalassigne;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MusicInterface {
@GET("music.xml")
    Call<iTunes> getMusic();
}
