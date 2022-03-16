package com.example.myjanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class GridImageActivity extends AppCompatActivity {
GridView flaggrid;
    String gridflag[]={"India","Africa","America","Bhutan","Nepal","China","Pakisthan","Argentina"};
    int gridimages[]={R.drawable.india,R.drawable.africa,R.drawable.america,R.drawable.bhutan,
            R.drawable.nepal,R.drawable.china,R.drawable.pakistan,R.drawable.argentina};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_image);
        flaggrid=(GridView) findViewById(R.id.flg_grid);
        GridAdapter adapter=new GridAdapter(getApplicationContext(),gridflag,gridimages);
        flaggrid.setAdapter(adapter);
        flaggrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if(i==0){
                    int imageRes = gridimages[i];
                    String name=gridflag[i];
                    Intent in=new Intent(getApplicationContext(),FlagIActivity.class);
                    in.putExtra("flagimages",imageRes);
                    in.putExtra("name",name);
                    startActivity(in);
                }
                if(i==1){
                    int imageRes = gridimages[i];
                    String name=gridflag[i];
                    Intent in=new Intent(getApplicationContext(),FlagIActivity.class);
                    in.putExtra("flagimages",imageRes);
                    in.putExtra("name",name);
                    startActivity(in);
                }
                if(i==2){
                    int imageRes = gridimages[i];
                    String name=gridflag[i];
                    Intent in=new Intent(getApplicationContext(),FlagIActivity.class);
                    in.putExtra("flagimages",imageRes);
                    in.putExtra("name",name);
                    startActivity(in);
                }
                if(i==3){
                    int imageRes = gridimages[i];
                    String name=gridflag[i];
                    Intent in=new Intent(getApplicationContext(),FlagIActivity.class);
                    in.putExtra("flagimages",imageRes);
                    in.putExtra("name",name);
                    startActivity(in);
                }
                if(i==4){
                    int imageRes = gridimages[i];
                    String name=gridflag[i];
                    Intent in=new Intent(getApplicationContext(),FlagIActivity.class);
                    in.putExtra("flagimages",imageRes);
                    in.putExtra("name",name);
                    startActivity(in);
                }
                if(i==5){
                    int imageRes = gridimages[i];
                    String name=gridflag[i];
                    Intent in=new Intent(getApplicationContext(),FlagIActivity.class);
                    in.putExtra("flagimages",imageRes);
                    in.putExtra("name",name);
                    startActivity(in);
                }
                if(i==6){
                    int imageRes = gridimages[i];
                    String name=gridflag[i];
                    Intent in=new Intent(getApplicationContext(),FlagIActivity.class);
                    in.putExtra("flagimages",imageRes);
                    in.putExtra("name",name);
                    startActivity(in);
                }
            }
        });
    }
}