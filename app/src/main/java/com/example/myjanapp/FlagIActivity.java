package com.example.myjanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FlagIActivity extends AppCompatActivity {
    ImageView imageflag;
    TextView textView;
    int image;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flag_iactivity);
        imageflag=(ImageView) findViewById(R.id.flagi_id);
        textView=(TextView)findViewById(R.id.flagname);
        Bundle extras = getIntent().getExtras();
        image = extras.getInt("flagimages");
        name=extras.getString("name");
        textView.setText(name);
        imageflag.setImageResource(image);
    }

}