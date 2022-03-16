package com.example.myjanapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CalculatorAdapter extends BaseAdapter {
    Context context;
    String num[];
    LayoutInflater inflator;
    public CalculatorAdapter(Context applicationContext, String[] numbers) {
        context=applicationContext;
        this.num=numbers;
    }

    @Override
    public int getCount() {
        return num.length;
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
        inflator=LayoutInflater.from(context);
        view=inflator.inflate(R.layout.calculator_layout,null);
        TextView textView=(TextView) view.findViewById(R.id.num_id);
        textView.setText(num[i]);
        return view;
    }
}
