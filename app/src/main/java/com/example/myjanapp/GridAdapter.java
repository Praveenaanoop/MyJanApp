package com.example.myjanapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridAdapter extends BaseAdapter {
    Context context;
    String[] fgrid;
    int[] fgridimg;
    LayoutInflater inflater;
    public GridAdapter(Context applicationContext, String[] gridflag, int[] gridimages) {
        context=applicationContext;
        this.fgrid=gridflag;
        this.fgridimg=gridimages;


    }

    @Override
    public int getCount() {
        return fgrid.length;
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
        view=inflater.inflate(R.layout.grid_layout,null);
        ImageView image=(ImageView) view.findViewById(R.id.flg_img);
        TextView text=(TextView) view.findViewById(R.id.flg_id);
        image.setImageResource(fgridimg[i]);
        text.setText(fgrid[i]);
        return view;
    }
}
