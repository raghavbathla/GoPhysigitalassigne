package com.example.gophysigitalassigne;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class Books extends Fragment {
RecylerviewAdapter adapter;
RecyclerView recyclerView;
ArrayList<book> arrayList;
ProgressBar progressBar;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_books, container, false);
        arrayList = new ArrayList();

        recyclerView = v.findViewById(R.id.books_relative);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        progressBar = v.findViewById(R.id.progress);
        return v;
    }

    @Override
    public void onResume() {
        super.onResume();
        getData();
    }

    private void getData(){
        arrayList.clear();
        Call<BookData> book = APIClient.getbookinterface().getbooks();
        book.enqueue(new Callback<BookData>() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onResponse(Call<BookData> call, Response<BookData> response) {
                if(!response.isSuccessful()){
                    Log.i("MAINTAG1", response.body().toString()+response.errorBody().toString());
                }
                else {
                    Log.i("MAINTAG2", "Success");

                    arrayList = response.body().getBooks();
                    adapter = new RecylerviewAdapter(getActivity().getApplicationContext(),arrayList);
                    recyclerView.setAdapter(adapter);
                    adapter.notifyDataSetChanged();


                    progressBar.setVisibility(View.INVISIBLE);


                }

            }

            @Override
            public void onFailure(Call<BookData> call, Throwable t) {
                Log.i("MAINTAG",t.getMessage().toString());
            }
        });
    }
}