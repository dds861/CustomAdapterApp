package com.example.dd.CustomAdapterApp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Product> products = new ArrayList<>();
        products.add(new Product("text1","text2","text3"));
        products.add(new Product("text1","text2","text3"));
        products.add(new Product("text1","text2","text3"));
        products.add(new Product("text1","text2","text3"));
        products.add(new Product("text1","text2","text3"));
        products.add(new Product("text1","text2","text3"));

        MyAdapter myAdapter = new MyAdapter(getApplicationContext(),R.layout.items,products);

        ListView listView = (ListView) findViewById(R.id.listview1);

        listView.setAdapter(myAdapter);

    }


}
