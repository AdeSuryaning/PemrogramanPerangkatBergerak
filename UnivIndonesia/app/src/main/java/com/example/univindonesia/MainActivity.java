package com.example.univindonesia;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvUnivIndo;
    private ArrayList<UnivIndo> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Perguruan Tinggi di Indonesia");
        }

        rvUnivIndo = findViewById(R.id.rv_UnivIndo);
        rvUnivIndo.setHasFixedSize(true);

        list.addAll(UnivIndoData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvUnivIndo.setLayoutManager(new LinearLayoutManager(this));
        UnivIndoAdapter univIndoAdapter = new UnivIndoAdapter(this, list);
        rvUnivIndo.setAdapter(univIndoAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.profil_utama, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.profile_detail:
                startActivity(new Intent(MainActivity.this, ActivityProfil.class));
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
