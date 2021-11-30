package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    String s1[],s2[];
    int[] images = {R.drawable.cpp, R.drawable.c, R.drawable.java, R.drawable.android, R.drawable.js, R.drawable.kotlin, R.drawable.node, R.drawable.react};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyleView);

        s1 = getResources().getStringArray(R.array.programmming_languages);
        s2 = getResources().getStringArray(R.array.description);


        ////MyAdapter myAdapter = new MyAdapter(this,s1,s2,images);
        ContactAdapter myAdapter = new ContactAdapter(this,s1,s2,images);
        //ViewGroup.LayoutParams params = recyclerView.getLayoutParams();


        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

    }
}