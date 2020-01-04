package com.example.myintentapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements
        View.OnClickListener {

    Button btnMoveActivity;
    Button btnMoveActivityWithData;
    Button btnDial;
    Button btnWebsitePolines;
    Button btnBelajarExplisit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        btnMoveActivityWithData = findViewById(R.id.btn_move_data);
        btnMoveActivityWithData.setOnClickListener(this);

        btnDial = findViewById(R.id.btn_dial);
        btnDial.setOnClickListener(this);

        btnWebsitePolines = findViewById(R.id.btn_web);
        btnWebsitePolines.setOnClickListener(this);

        btnBelajarExplisit = findViewById(R.id.btn_explisit);
        btnBelajarExplisit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_move_activity:
                Intent moveIntent = new Intent(MainActivity.this, NewActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.btn_move_data:
                Intent moveData = new Intent
                        (MainActivity.this, MoveActivityWithData.class);
                moveData.putExtra(MoveActivityWithData.EXTRA_NAME, "Ade Suryaning");
                moveData.putExtra(MoveActivityWithData.EXTRA_AGE, 19);
                startActivity(moveData);
                break;
            case R.id.btn_dial:
                String phoneNumber = "081325748830";
                Intent dialPhone = new Intent(Intent.ACTION_DIAL,
                        Uri.parse("telp : "+phoneNumber));
                startActivity(dialPhone);
                break;
            case R.id.btn_web:
                String Website = "https://www.polines.ac.id/id/";
                Intent webPolines = new Intent(Intent.ACTION_VIEW, Uri.parse(Website));
                startActivity(webPolines);
            case R.id.btn_explisit:
                Intent SimpanIntent = new Intent(MainActivity.this, simpan.class);
                startActivity(SimpanIntent);
                break;
        }
    }
}
