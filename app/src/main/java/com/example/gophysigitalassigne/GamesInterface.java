package com.example.gophysigitalassigne;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GamesInterface {
@GET("games.xml")
    Call<GamesData> getGames();
}
