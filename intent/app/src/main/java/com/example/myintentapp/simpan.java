package com.example.myintentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class simpan extends AppCompatActivity {
    Button btnSimpan;
    EditText EditSimpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simpan);
        btnSimpan = findViewById(R.id.btn_simpan);
        EditSimpan = findViewById(R.id.EditSimpan);

        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View view){
                String nama = EditSimpan.getText().toString();
                startActivity(new Intent(simpan.this, tampil.class).putExtra("Hasil", nama));
            }
        });
    }
}
