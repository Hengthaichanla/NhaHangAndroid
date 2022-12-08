package com.example.nhahangandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewMonAn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_mon_an);

        ListView listView;
        ArrayList<MonAn> arrayList;
        AdapterMonAn adapter;
        TextView lvmonan = findViewById(R.id.lvmonan);
        listView= findViewById(R.id.listviewmonan);
        Button btnThem = findViewById(R.id.btnThem);
        Button btnSua = findViewById(R.id.btnSua);
        Button btnXoa = findViewById(R.id.btnxoa);


        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=(new Intent(ListViewMonAn.this, ThemActivity.class));
                startActivity(intent);
            }
        });

        btnSua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=(new Intent(ListViewMonAn.this, SuaActivity.class));
                startActivity(intent);
            }
        });

        btnXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=(new Intent(ListViewMonAn.this, XoaActivity.class));
                startActivity(intent);
            }
        });



       lvmonan.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent=(new Intent(ListViewMonAn.this, MainActivity.class));
               startActivity(intent);
           }
       });

        arrayList = new ArrayList<>();
        arrayList.add(new MonAn("P1.BEEFY PIZZA", " Đơn giá: 90,000-150,000 VNG",R.drawable.pizza1));
        arrayList.add(new MonAn("P2.HAWAII PIZZA", " Đơn giá: 90,000-150,000 VNG",R.drawable.pizza2));
        arrayList.add(new MonAn("P3.SALAMI PIZZA", " Đơn giá: 110,000-170,000 VNG",R.drawable.pizza3));
        arrayList.add(new MonAn("P4.CHORIZO PIZZA", " Đơn giá: 90,000-15,000 VNG",R.drawable.pizza4));
        arrayList.add(new MonAn("P5.MEAT LOVERS PIZZA", " Đơn giá: 100,000-160,000 VNG",R.drawable.pizza5));
        arrayList.add(new MonAn("P6.BBQ CHICKEN PIZZA", " Đơn giá: 90,000-150,000 VNG",R.drawable.pizza6));
        arrayList.add(new MonAn("P7.SMOKE CHICKEN PIZZA", " Đơn giá: 90,000-150,000 VNG",R.drawable.pizza7));
        arrayList.add(new MonAn("P8.MEXICAN PIZZA", " Đơn giá: 90,000-150,000 VNG",R.drawable.pizza8));
        arrayList.add(new MonAn("P9.VEGGIE PIZZA", " Đơn giá: 90,000-150,000 VNG",R.drawable.pizza9));
        arrayList.add(new MonAn("P10.MARGHERITA PIZZA\n", " Đơn giá: 90,000-150,000 VNG",R.drawable.pizza10));






        adapter = new AdapterMonAn(ListViewMonAn.this,R.layout.layout_monan,arrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i ==0){

                    Intent intent = new Intent();
                    intent.setClass(ListViewMonAn.this, DetailActivity1.class);
                    startActivity(intent);
                }
                if(i ==1){

                    Intent intent = new Intent();
                    intent.setClass(ListViewMonAn.this, DetailActivity2.class);
                    startActivity(intent);
                }
                if(i ==2){

                    Intent intent = new Intent();
                    intent.setClass(ListViewMonAn.this, DetailActivity3.class);
                    startActivity(intent);
                }
                if(i ==3){

                    Intent intent = new Intent();
                    intent.setClass(ListViewMonAn.this, DetailActivity4.class);
                    startActivity(intent);
                }
                if(i ==4){

                    Intent intent = new Intent();
                    intent.setClass(ListViewMonAn.this, DetailActivity5.class);
                    startActivity(intent);
                }
                if(i ==5){

                    Intent intent = new Intent();
                    intent.setClass(ListViewMonAn.this, DetailActivity6.class);
                    startActivity(intent);
                }
                if(i ==6){

                    Intent intent = new Intent();
                    intent.setClass(ListViewMonAn.this, DetailActivity7.class);
                    startActivity(intent);
                }
                if(i ==7){

                    Intent intent = new Intent();
                    intent.setClass(ListViewMonAn.this, DetailActivity8.class);
                    startActivity(intent);
                }
                if(i ==8){

                    Intent intent = new Intent();
                    intent.setClass(ListViewMonAn.this, DetailActivity9.class);
                    startActivity(intent);
                }
                if(i ==9){

                    Intent intent = new Intent();
                    intent.setClass(ListViewMonAn.this, DetailActivity10.class);
                    startActivity(intent);
                }

            }
        });
    }
}