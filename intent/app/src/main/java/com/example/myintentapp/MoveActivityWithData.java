package com.example.myintentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MoveActivityWithData extends AppCompatActivity {
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_AGE = "extra_age";

    TextView TvDataReceived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data);

        TvDataReceived = findViewById(R.id.tv_data_receiver);

        String Nama = getIntent().getStringExtra(EXTRA_NAME);
        int Umur = getIntent().getIntExtra(EXTRA_AGE, 0);

        String display = "Nama : "+Nama+ ",\nUmur : "+Umur;
        TvDataReceived.setText(display);
    }
}
