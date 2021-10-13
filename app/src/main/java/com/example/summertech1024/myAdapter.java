package com.example.summertech1024;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myAdapter extends RecyclerView.Adapter<myAdapter.viewHolder> {

    Context ct;
    String[] img_description;
    int[] imgs;

    public myAdapter(Context ct, String[] img_description, int[] imgs) {
        this.ct = ct;
        this.img_description = img_description;
        this.imgs = imgs;
    }

    @NonNull
    @Override
    public myAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(ct);
        View view = inflater.inflate(R.layout.recycleview_layout, parent, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myAdapter.viewHolder holder, int position) {

        holder.mimageview.setImageResource(imgs[position]);
        holder.mtextview.setText(img_description[position]);
    }

    @Override
    public int getItemCount() {
        return img_description.length;
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView mimageview;
        TextView mtextview;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            mtextview = itemView.findViewById(R.id.textView);
            mimageview = itemView.findViewById(R.id.imageView);
        }
    }
}
