package com.example.mysample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass> userList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initRecyclerView();



    }

    private void initData() {

        userList=new  ArrayList<>();
        userList.add(new ModelClass("Tare","5g"));
        userList.add(new ModelClass("Weight","0g"));
        userList.add(new ModelClass("Chicken Curry Cut","5g"));
        userList.add(new ModelClass("MRP","₹299.0"));
        userList.add(new ModelClass("Price","₹0"));

    }

    private void initRecyclerView() {

        recyclerView=findViewById(R.id.recyclerview);
        layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new Adapter(userList);
        adapter.notifyDataSetChanged();
    }
}