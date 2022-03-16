package com.example.myjanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class Registration extends AppCompatActivity {
RadioGroup radioGroup;
Button register;
String district[]={"Kottayam","Alappuzha","tvm","Kottayam","Thrissur","Pathanamthitta","EKM","Kollam","Palakkad","Malappuram","Kozhikod","Wayanad","Kannur","Kasargode"};
Spinner distspinner;
CheckBox malcheck,engcheck,hindcheck,tamcheck;
    RadioButton radioButton;
    Boolean check;
    EditText username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        radioGroup=(RadioGroup) findViewById(R.id.radiogender);
        malcheck=(CheckBox) findViewById(R.id.mal);
        engcheck=(CheckBox) findViewById(R.id.eng);
        hindcheck=(CheckBox) findViewById(R.id.hind);
        tamcheck=(CheckBox) findViewById(R.id.tam);
        register=(Button) findViewById(R.id.reg_btn);
        username=(EditText)findViewById(R.id.username_id);
        password=(EditText)findViewById(R.id.pass_id);
        distspinner=(Spinner)findViewById(R.id.statespinner);
        ArrayAdapter adapter=new ArrayAdapter(getApplicationContext(), android.R.layout.simple_dropdown_item_1line,district);
        distspinner.setAdapter(adapter);//for setting value
        distspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), district[i], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(getApplicationContext(), "Please select any districts", Toast.LENGTH_SHORT).show();
            }
        });


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user=username.getText().toString();
                String pass=password.getText().toString();
                Intent intent=new Intent(getApplicationContext(),LoginActivity.class);
                intent.putExtra("username",user);
                intent.putExtra("password",pass);
                startActivity(intent);
            }
        });

    }

//    public void Clickme(View view) {
////        radioButton=(RadioButton)findViewById(radioGroup.getCheckedRadioButtonId());
////        String remarks=radioButton.getText().toString();
////        String checkresult= "Selected language";
////        if (malcheck.isChecked()){
////            checkresult+= "\nMalayalam";
////        }
////        if(engcheck.isChecked()){
////            checkresult+= "\nEnglish";
////        }
////        if(hindcheck.isChecked()){
////            checkresult+= "\nHindi";
////        }
////        if(tamcheck.isChecked()){
////            checkresult+= "\nTamil";
////        }
//        Toast.makeText(getApplicationContext(), "Successfully registered!!!", Toast.LENGTH_SHORT).show();
//    }

//    public void checkme(View view) {
//        boolean checked=((CheckBox) view).isChecked();
//        String str="";
//        switch (view.getId()){
//            case R.id.eng:
//                str=checked?"English is checked":"English is dischecked";
//                break;
//            case R.id.mal:
//                str=checked?"Malayalam is checked":"Malayalam is dischecked";
//                break;
//            case R.id.hind:
//                str=checked?"Hindi is checked":"Hindi is dischecked";
//                break;
//            case R.id.tam:
//                str=checked?"Tamil is checked":"Tamil is dischecked";
//                break;
//
//        }
//        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
//    }
}