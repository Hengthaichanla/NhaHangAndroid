package com.example.nhahangandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class XoaActivity extends AppCompatActivity {
    EditText xoaTenMon,xoaGiaTri;
    ImageView xoaImage;
    Button tbnXoaNhap;
    TextView xoaBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xoa);

        xoaTenMon = findViewById(R.id.xoaTenMon);
        xoaGiaTri = findViewById(R.id.xoaGiaTri);
        xoaImage = findViewById(R.id.xaoImage);
        tbnXoaNhap = findViewById(R.id.btnXoaNhap);
        xoaBack = findViewById(R.id.xoaBack);


        tbnXoaNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=(new Intent(XoaActivity.this, ListViewMonAn.class));
                startActivity(intent);
            }
        });

        xoaBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = (new Intent(XoaActivity.this, ListViewMonAn.class));
                startActivity(intent);
            }
        });
    }
}