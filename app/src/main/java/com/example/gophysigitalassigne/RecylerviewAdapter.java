package com.example.gophysigitalassigne;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class RecylerviewAdapter extends RecyclerView.Adapter<RecylerviewAdapter.MyViewHolder> {
    Context context;
    ArrayList<book> arrayList = new ArrayList<>();

    public RecylerviewAdapter(Context context, ArrayList<book> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_style, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position)
    {
holder.title.setText(arrayList.get(position).Title);
        holder.Author1.setText(arrayList.get(position).AutorFName1);
        holder.AUthorLname.setText(arrayList.get(position).AutorLName1);
        holder.Author2.setText(arrayList.get(position).Type);
        String origoinal = arrayList.get(position).ThumbURL;

        String newString = origoinal.substring(0, 4)
                + "s"
                + origoinal.substring(4);
        Picasso.get().load(newString).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
TextView title,Author1,Author2,AUthorLname;
ImageView imageView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            Author1 = itemView.findViewById(R.id.authorname);
            Author2 = itemView.findViewById(R.id.authorname2);
            AUthorLname = itemView.findViewById(R.id.authorlastname);
            imageView = itemView.findViewById(R.id.image);
        }
    }

}
