package com.example.myjanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ProgreebarActivity extends AppCompatActivity {
Button b;
ProgressBar progressBar;
int progress = 0;
TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progreebar);
        b=(Button) findViewById(R.id.pro_btn);
        progressBar=(ProgressBar) findViewById(R.id.progress_hor);
        text=(TextView)findViewById(R.id.prohortext);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setProgressvalue(progress);
            }
        });
    }

    private void setProgressvalue(int progress) {
        progressBar.setProgress(progress);
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                setProgressvalue(progress+10);




            }
        });
        thread.start();
    }
}