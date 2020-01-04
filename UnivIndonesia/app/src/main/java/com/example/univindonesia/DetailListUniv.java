package com.example.univindonesia;



import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class DetailListUniv extends AppCompatActivity {
    private int UnivIndo_id;
    ImageView imgDetail;
    TextView tvName, tvDesc;
    private ArrayList<UnivIndo>listUnivIndo = new ArrayList<>();

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list_univ);

        UnivIndo_id = getIntent().getIntExtra("UnivIndo_id",0);
        tvName = findViewById(R.id.nama_univIndo);
        tvDesc = findViewById(R.id.desc_detail);
        imgDetail = findViewById(R.id.img_detail);

        listUnivIndo.addAll(UnivIndoData.getListData());


        getSupportActionBar().setTitle(listUnivIndo.get(UnivIndo_id).getName());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setLayout();
    }

    void setLayout() {
        tvName.setText(listUnivIndo.get(UnivIndo_id).getName());
        tvDesc.setText(listUnivIndo.get(UnivIndo_id).getDescription());
        Glide.with(this).load(listUnivIndo.get(UnivIndo_id).getPhoto()).apply(new RequestOptions().fitCenter()).into(imgDetail);
    }
}
