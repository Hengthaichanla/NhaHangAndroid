package com.example.nhahangandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ThemActivity extends AppCompatActivity {
        EditText themTenMon,themGiaTri;
        ImageView themImage;
        Button tbnThemNhap;
        TextView themBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_them);

        ArrayList<MonAn> arrayList;
        AdapterMonAn adapter;
        ListView listView;
        themTenMon = findViewById(R.id.themTenMon);
        themGiaTri = findViewById(R.id.themGiaTri);
        themImage = findViewById(R.id.themImage);
        tbnThemNhap = findViewById(R.id.tbnThemNhap);
        themBack = findViewById(R.id.themBack);

        themBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = (new Intent(ThemActivity.this, ListViewMonAn.class));
                startActivity(intent);
            }
        });


    }
}