package com.example.nhahangandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Bbq extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bbq);

        ListView listView;
        ArrayList<MonAn> arrayList;
        AdapterMonAn adapter;
        listView= findViewById(R.id.listviewBbq);

        arrayList = new ArrayList<>();
        arrayList.add(new MonAn("SN.SƯỜN NƯỚNG BBQ–SIZE M–300GR", " Đơn giá: 130,000 VNG",R.drawable.bbq1));
        arrayList.add(new MonAn("ST.SƯỜN NƯỚNG BBQ–SIZE L–500GR", " Đơn giá: 180,000 VNG",R.drawable.bbq2));




        adapter = new AdapterMonAn(Bbq.this,R.layout.layout_monan,arrayList);
        listView.setAdapter(adapter);
    }
}