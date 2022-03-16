package com.example.myjanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {
   String numbers[]={"C","","D","1","2","3","4","5","6","7","8","9","0","+","-","*","/","%"};
   GridView grid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        grid=(GridView) findViewById(R.id.cal_grid);
        EditText editText=(EditText)findViewById(R.id.number_edit);
        TextView text=(TextView)findViewById(R.id.tot_text);
        CalculatorAdapter adapter=new CalculatorAdapter(getApplicationContext(),numbers);
        grid.setAdapter(adapter);
        editText.setEnabled(false);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    editText.getText().clear();
                }
                if(i==3){
                    editText.getText().append("1");
                }
                if(i==4){
                    editText.getText().append("2");
                }
                if(i==5){
                    editText.getText().append("3");
                }
                if(i==6){
                    editText.getText().append("4");
                }
                if(i==7){
                    editText.getText().append("5");
                }
                if(i==8){
                    editText.getText().append("6");
                }
                if(i==9){
                    editText.getText().append("7");
                }
                if(i==10){
                    editText.getText().append("8");
                }
                if(i==11){
                    editText.getText().append("9");
                }
                if(i==12){
                    editText.getText().append("0");
                }if(i==13){
                    editText.getText().append("+");
                }

            }
        });
    }
}