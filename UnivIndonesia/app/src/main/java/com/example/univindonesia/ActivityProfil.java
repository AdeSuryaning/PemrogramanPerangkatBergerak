package com.example.univindonesia;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityProfil extends AppCompatActivity implements View.OnClickListener {
    Button button_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        button_back = findViewById(R.id.button_back);
        button_back.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_back:
                Intent backIntent = new Intent(ActivityProfil.this, MainActivity.class);
                startActivity(backIntent);
                break;
        }
    }
}
