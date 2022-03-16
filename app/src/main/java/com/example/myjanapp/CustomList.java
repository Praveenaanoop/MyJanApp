package com.example.myjanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class CustomList extends AppCompatActivity {
ListView fruitslist;
String fruit[]={"Apple","Orange","Mango","Pineapple","Banana","Grapes","Watermelon"};
int fruitimage[]={R.drawable.apple,R.drawable.orange,R.drawable.mango,R.drawable.pineapple,
        R.drawable.banana,R.drawable.grapes,R.drawable.watermelon};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);
        fruitslist=(ListView) findViewById(R.id.fruitslist);
        CustomFruits customFruits=new CustomFruits(getApplicationContext(),fruit,fruitimage);
        fruitslist.setAdapter(customFruits);

        fruitslist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "Selected fruit is"+fruit[i]+"fruit", Toast.LENGTH_SHORT).show();
                if(i==0){
                    Intent in=new Intent(getApplicationContext(),MainPageActivity.class);
                    startActivity(in);
                }
                //for moving to another activity on an item click
            }
        });
    }
}