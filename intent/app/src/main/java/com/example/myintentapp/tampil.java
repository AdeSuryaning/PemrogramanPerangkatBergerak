package com.example.myintentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class tampil extends AppCompatActivity {
    TextView TampilBagus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil);
        TampilBagus = findViewById(R.id.TampilBagus);

        String Hasil = getIntent().getStringExtra("Hasil");
        TampilBagus.setText(Hasil);
    }
}
