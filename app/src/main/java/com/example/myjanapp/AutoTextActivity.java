package com.example.myjanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class AutoTextActivity extends AppCompatActivity {

    String[] country={"Australia","India","USA","UAE","Europe","Thailand","Korea","China","Nepal"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_text);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,country);
        AutoCompleteTextView atv=(AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);

        atv.setThreshold(1);//for searching from the first letter
        atv.setAdapter(adapter);

        atv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                String name=(String) parent.getItemAtPosition(i);
                Toast.makeText(getApplicationContext(), "Selected Item: "+name, Toast.LENGTH_SHORT).show();
            }
        });
    }
}