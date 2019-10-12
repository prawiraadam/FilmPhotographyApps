package com.example.film_photography;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class adapterListFilm extends RecyclerView.Adapter<adapterListFilm.ViewHolder> {

    private ArrayList<String> mImage;
    private ArrayList<String> mImageName;
    private Context mContext;

    public adapterListFilm(ArrayList<String> mImageName, ArrayList<String> mText, Context mContext) {
        this.mImage = mImageName;
        this.mImageName = mText;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_film, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(mContext)
                .asBitmap()
                .load(mImage.get(position))
                .into(holder.image);

        holder.text.setText(mImageName.get(position));
    }

    @Override
    public int getItemCount() {
        return mImage.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView text;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.iv_film);
            text = itemView.findViewById(R.id.tv_text_film);
        }
    }
}
