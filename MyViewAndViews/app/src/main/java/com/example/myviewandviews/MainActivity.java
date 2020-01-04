package com.example.myviewandviews;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button BtnDonasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getActionBar() != null);
            getSupportActionBar().setTitle("Donasi Pesawat R-80");

        BtnDonasi = findViewById(R.id.btn_donasi);
        BtnDonasi.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_donasi:
                startActivity(new Intent(MainActivity.this, Activity2.class));
        }
    }
}
