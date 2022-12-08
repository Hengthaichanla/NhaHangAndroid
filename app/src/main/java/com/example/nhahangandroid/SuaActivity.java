package com.example.nhahangandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class SuaActivity extends AppCompatActivity {
    EditText suaTenMon,suaGiaTri;
    ImageView suaImage;
    Button tbnSuaNhap;
    TextView suaBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sua);

        suaTenMon = findViewById(R.id.suaTenMon);
        suaGiaTri = findViewById(R.id.suaGiaTri);
        suaImage = findViewById(R.id.suaImage);
        tbnSuaNhap = findViewById(R.id.btnSuaNhap);
        suaBack = findViewById(R.id.suaBack);

        suaBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=(new Intent(SuaActivity.this, ListViewMonAn.class));
                startActivity(intent);
            }
        });

        tbnSuaNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = (new Intent(SuaActivity.this, ListViewMonAn.class));
                startActivity(intent);
            }
        });
    }
}