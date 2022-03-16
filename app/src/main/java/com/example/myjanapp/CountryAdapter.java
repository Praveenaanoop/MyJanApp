package com.example.myjanapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CountryAdapter extends BaseAdapter {

    Context context;
    String cntryflgs[];
    int imagesflg[];
    LayoutInflater inflator;

    public CountryAdapter(Context applicationContext, String[] countryflag, int[] flagimages) {
        context=applicationContext;
        this.cntryflgs=countryflag;
        this.imagesflg=flagimages;
    }

    @Override
    public int getCount() {
        return cntryflgs.length;
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
        view=inflator.inflate(R.layout.country_layout,null);
        ImageView image=(ImageView) view.findViewById(R.id.img_flag);
        TextView textflag=(TextView) view.findViewById(R.id.country_text);
        image.setImageResource(imagesflg[i]);
        textflag.setText(cntryflgs[i]);
        return view;
    }
}
