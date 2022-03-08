package com.example.myjanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
EditText username,password;
Button login,cancel;
    String un="admin";
    String pwd="abc123";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
username=(EditText) findViewById(R.id.name_edit);
password=(EditText) findViewById(R.id.pass_edit);
login=(Button) findViewById(R.id.login_btn);
cancel=(Button) findViewById(R.id.cancel_btn);

//login.setOnClickListener(new View.OnClickListener() {
//    @Override
//    public void onClick(View view) {
//        if (username.equals("admin")&& password.equals("admin")){
//Intent i=new Intent(getApplicationContext(),MainPageActivity.class);
//startActivity(i);
//        }
//        else
//        {
//            Toast.makeText(getApplicationContext(), "Invalid username/password", Toast.LENGTH_SHORT).show();
//        }
//    }
//});

cancel.setOnClickListener(this);


    }

    public void LoginClick(View view) {
       String uname=username.getText().toString();
       String pname=password.getText().toString();
        if(uname.equals(un) && pname.equals(pwd)){
            Intent i=new Intent(getApplicationContext(),MainPageActivity.class);
             startActivity(i);
        }
        else
        {
            Toast.makeText(getApplicationContext(), "Invalid username/password", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onClick(View view) {
        finish();
    }
}