package com.example.myjanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainPageActivity extends AppCompatActivity {
String usern;
    String district[]={"Kottayam","Alappuzha","tvm","Kottayam","Thrissur","Pathanamthitta","EKM","Kollam","Palakkad","Malappuram","Kozhikod","Wayanad","Kannur","Kasargode"};
ListView statelist;
String countryflag[]={"India","Africa","America","Bhutan","Nepal","China","Pakisthan","Argentina"};
int flagimages[]={R.drawable.india,R.drawable.africa,R.drawable.america,R.drawable.bhutan,
R.drawable.nepal,R.drawable.china,R.drawable.pakistan,R.drawable.argentina};
    TextView names;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        EditText url=(EditText) findViewById(R.id.edit1);
        Button go=(Button) findViewById(R.id.url_id);
        names=(TextView)findViewById(R.id.name);
        statelist=(ListView)findViewById(R.id.list) ;
        spinner=(Spinner)findViewById(R.id.flagspinner);
        Intent intlog=getIntent();
        usern=intlog.getStringExtra("username");
        names.setText(usern);
        ArrayAdapter adapter=new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,district);
        statelist.setAdapter(adapter);
        statelist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), district[i], Toast.LENGTH_SHORT).show();
            }
        });

        CountryAdapter countryAdapter=new CountryAdapter(getApplicationContext(),countryflag,flagimages);
        spinner.setAdapter(countryAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "Selected country is"+countryflag[i]+"state", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        go.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String data=url.getText().toString();
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www."+data+".com"));
                //implicit intent for loading a particular url on a button click
                startActivity(intent);
            }
        });
    }
}