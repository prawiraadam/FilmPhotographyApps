package com.example.film_photography;

import android.content.Context;
import android.util.Log;
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

public class adapterListKamera extends RecyclerView.Adapter<adapterListKamera.ViewHolder>{

    private static final String TAG = "RVHomeAdapter";
    private ArrayList<String> mImageUrl;
    private ArrayList<String> mImages;
    private Context mContext;

    public adapterListKamera(ArrayList<String> mImageUrl, ArrayList<String> mImages, Context context) {
        this.mImageUrl = mImageUrl;
        this.mImages = mImages;
        this.mContext = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_camera, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder: called.");

        Glide.with(mContext)
                .asBitmap()
                .load(mImageUrl.get(position))
                .into(holder.image);

        holder.text.setText(mImages.get(position));
    }

    @Override
    public int getItemCount() {
        return mImageUrl.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView text;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.iv_camera);
            text = itemView.findViewById(R.id.tv_text_camera);
        }
    }

}
