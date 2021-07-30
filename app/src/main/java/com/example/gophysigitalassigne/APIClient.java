package com.example.gophysigitalassigne;

import android.telecom.GatewayInfo;

import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

public class APIClient {
    public static Retrofit getRetrofit(){
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .baseUrl("https://www.wits-interactive.com/ftp/test/")
                .build();

        return retrofit;
    }
public static  BookInterface getbookinterface(){
        BookInterface bookInterface = getRetrofit().create(BookInterface.class);
        return bookInterface;
}
    public static  MusicInterface getMusicInterface(){
        MusicInterface musicInterface = getRetrofit().create(MusicInterface.class);
        return musicInterface;
    }
    public static  GamesInterface getGamesInterface(){
        GamesInterface gamesInterface = getRetrofit().create(GamesInterface.class);
        return gamesInterface;
    }
}
