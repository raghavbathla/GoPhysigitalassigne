package com.example.gophysigitalassigne;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface BookInterface {
@GET("books.xml")
    Call<BookData> getbooks();
}
