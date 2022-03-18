package com.example.myjanapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CustomToastActivity extends AppCompatActivity {
    Button clickbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_toast);
        clickbtn=(Button) findViewById(R.id.click_id);
        clickbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater inflater=getLayoutInflater();
                View layout=inflater.inflate(R.layout.custom_toast_layout,(ViewGroup)findViewById(R.id.toast_layout));
                TextView tv=(TextView) layout.findViewById(R.id.text_toast);
                tv.setText("Email Notification");
                Toast toast=new Toast(getApplicationContext());
                toast.setGravity(Gravity.BOTTOM,0,100);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setView(layout);
                toast.show();
            }
        });
    }

}