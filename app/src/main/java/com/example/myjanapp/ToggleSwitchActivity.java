package com.example.myjanapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class ToggleSwitchActivity extends AppCompatActivity {
private Button swtbtn;
private Switch swt1,swt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_switch);
        swtbtn=(Button) findViewById(R.id.swt_btn);
        swt1=(Switch) findViewById(R.id.swt1);
        swt2=(Switch) findViewById(R.id.swt2);

        swtbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str1,str2;
                if(swt1.isChecked())
                {
                    str1=swt1.getTextOn().toString();
                }
                else {
                    str1=swt1.getTextOff().toString();
                }

                if (swt2.isChecked()) {
                    str2=swt2.getTextOn().toString();

                }
                else {
                    str2=swt2.getTextOff().toString();
                }

                Toast.makeText(getApplicationContext(), "Switch1 is "+str1+ "Switch2 is "+str2, Toast.LENGTH_SHORT).show();
            }
        });

    }
}