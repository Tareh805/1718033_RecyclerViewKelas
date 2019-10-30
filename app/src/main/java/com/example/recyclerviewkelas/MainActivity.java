package com.example.recyclerviewkelas;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ProfileAdapter adapter;
    private ArrayList<Profile> profileArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);

        adapter = new ProfileAdapter(profileArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

    private void addData() {
        profileArrayList = new ArrayList<>();
        profileArrayList.add(new Profile("Soedarsono", "Ayah", getDrawable(R.drawable.ayah)));
        profileArrayList.add(new Profile("Elly Setiawati","Ibu", getDrawable(R.drawable.mama)));
        profileArrayList.add(new Profile("Tareh Rozzaq Adzdziqri","Anak", getDrawable(R.drawable.anak)));
    }
}