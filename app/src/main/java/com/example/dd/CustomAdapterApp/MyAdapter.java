package com.example.dd.CustomAdapterApp;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by dd on 23.06.2017.
 */

public class MyAdapter extends ArrayAdapter<Product> {
    private List<Product> objects;

    public MyAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Product> objects) {
        super(context, resource, objects);
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from(getContext()).inflate(R.layout.items, parent, false);

        Product product = getItem(position);

        TextView textView1 = (TextView) view.findViewById(R.id.text1);
        TextView textView2 = (TextView) view.findViewById(R.id.text2);
        TextView textView3 = (TextView) view.findViewById(R.id.text3);

        textView1.setText(product.getTextView1());
        textView2.setText(product.getTextView2());
        textView3.setText(product.getTextView3());


        return view;
    }
}
