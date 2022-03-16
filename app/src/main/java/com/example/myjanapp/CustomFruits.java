package com.example.myjanapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomFruits extends BaseAdapter {
    Context context;
    String[] fruits;
    int[] fruitimg;
    LayoutInflater inflater;

    public CustomFruits(Context applicationContext, String[] fruit, int[] fruitimage) {
        context=applicationContext;
        this.fruits=fruit;
        this.fruitimg=fruitimage;
    }

    @Override
    public int getCount() {
        return fruits.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        inflater=LayoutInflater.from(context);
        view=inflater.inflate(R.layout.fruits_layout,null);
        ImageView image=(ImageView) view.findViewById(R.id.img_fruit);
        TextView textView=(TextView) view.findViewById(R.id.fruit_text);
        image.setImageResource(fruitimg[i]);
        textView.setText(fruits[i]);
        return view;
    }
}
