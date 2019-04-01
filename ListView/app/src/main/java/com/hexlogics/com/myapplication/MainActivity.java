package com.hexlogics.com.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public int[] ImagArray={R.drawable.ic_btoff,R.drawable.ic_delete,
                                R.drawable.ic_excel,R.drawable.ic_ticket,
                                R.drawable.ic_logo};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView _listView= (ListView)findViewById(R.id.ListView);

        ArrayList<String> countyList = new ArrayList<>();
        countyList.add("India");
        countyList.add("USA");
        countyList.add("Shri Lanka");
        countyList.add("Canda");
        countyList.add("Hadson");


       // ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,countyList);
        MyListAdaptor adapter = new MyListAdaptor(this,countyList,ImagArray);
        _listView.setAdapter(adapter);
    }
}
