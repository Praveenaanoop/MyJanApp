package com.example.myjanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splash extends AppCompatActivity {
ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //creating view- oncreate
        super.onCreate(savedInstanceState);
        // for saving currently working page backup- savedinstancestate
        setContentView(R.layout.splash);//showing the particular layout
        image=(ImageView)findViewById(R.id.imageView);
        Animation rotate= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
        image.startAnimation(rotate);
        //splash screen is executed by using thread/handler
//        Thread obj=new Thread(){
//            @Override
//            public void run() {
//                try {
//                    sleep(5000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                Intent i=new Intent(getApplicationContext(),LoginActivity.class);
//                startActivity(i);
//                finish();//to remove that current activity
//            }
//        };
//        obj.start();
//using handler
        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(getApplicationContext(),AlertDlgActivity.class);
               startActivity(i);
               finish();
            }
        },3000);
    }
}