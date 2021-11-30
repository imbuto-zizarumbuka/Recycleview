package com.example.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.MyViewHolder>{
    int[] images;
    String[] data1;
    String[] data2;

    public ContactAdapter(Context ct, String s1[], String s2[], int[] img){
        Context context = ct;
        data1 = s1;
        data2 = s2;
        images = img;

    }

    @NonNull
    @Override
    public ContactAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_row ,parent,false);
        return new ContactAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactAdapter.MyViewHolder holder, int position) {
        holder.myText1.setText(data1[position]);
        holder.myText2.setText(data2[position]);
        holder.myImage.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        int length = data2.length;
        return length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView myText1,myText2;
        ImageView myImage;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            myText1 = itemView.findViewById(R.id.titleView);
            myText2 = itemView.findViewById(R.id.descritionView);
            myImage = itemView.findViewById(R.id.imageView);
        }
    }

}
