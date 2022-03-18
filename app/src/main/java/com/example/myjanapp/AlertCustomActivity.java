package com.example.myjanapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class AlertCustomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_custom);
    }

    public void simpleclick(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(AlertCustomActivity.this);
        builder.setMessage("We have an alert!!");
        //for setting alert msg
        builder.setTitle("Simple Alert!");//title
        builder.setCancelable(false);
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "Ok is clicked", Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "Cancel is clicked", Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog alertDialog= builder.create();
        alertDialog.show();

    }

    public void itemclick(View view) {

        String[] fruits ={"Apple","Orange","Mango"};
        AlertDialog.Builder builder=new AlertDialog.Builder(AlertCustomActivity.this);
        builder.setTitle("List of Items").setItems(fruits, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), fruits[i]+" is selected", Toast.LENGTH_SHORT).show();
            }
        });
        builder.setPositiveButton("Ok",null);
        builder.setNegativeButton("Cancel",null);
        builder.setNeutralButton("Neutral",null);
        builder.setPositiveButtonIcon(getResources().getDrawable(R.drawable.africa,getTheme()));
        builder.setIcon(getResources().getDrawable(R.drawable.fruits,getTheme()));//default color theme - gettheme
        AlertDialog alertDialog= builder.create();
        alertDialog.show();
    }

    public void multiclick(View view) {
        String items[]={"fruits","vegetables","grains"};
        ArrayList<Integer> selectedlist=new ArrayList<>();
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setMultiChoiceItems(items, null, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i, boolean isChecked) {
                if(isChecked){
                    Log.d("pppp","success of "+i);
                    selectedlist.add(i);
                }
                else if(selectedlist.contains(i))
                {
                  selectedlist.remove(Integer.valueOf(i));
                }

            }
        });

        builder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                ArrayList<String> selecteditems=new ArrayList<>();
                for(int j=0;j<selectedlist.size();j++)
                {
                    selecteditems.add(items[selectedlist.get(j)]);
                   // for adding two arraylist
                }

                Toast.makeText(getApplicationContext(), "Selected items are "+ Arrays.toString(selecteditems.toArray()), Toast.LENGTH_SHORT).show();
            }
        });
        builder.show();
        
    }

    public void editclick(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("With Edit text");
        final EditText input=new EditText(AlertCustomActivity.this);
        LinearLayout.LayoutParams lp=new LinearLayout.LayoutParams(
          LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT
        );
        input.setLayoutParams(lp);
        builder.setView(input);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "text entered is "+input.getText(), Toast.LENGTH_SHORT).show();
            }
        });
        builder.show();
    }

    public void imageclick(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        LayoutInflater inflater=getLayoutInflater();
        View dl=inflater.inflate(R.layout.image_alert_layout,null);
        builder.setPositiveButton("OK",null);
        builder.setView(dl);
        builder.show();

    }

    public void seekclick(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final SeekBar seekBar=new SeekBar(AlertCustomActivity.this);
        LinearLayout.LayoutParams lp=new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT
        );
        seekBar.setLayoutParams(lp);
        builder.setView(seekBar);
        builder.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public void onDismiss(DialogInterface dialogInterface) {
                Toast.makeText(getApplicationContext(), "Dismissed", Toast.LENGTH_SHORT).show();
            }
        });
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "Progress is "+seekBar.getProgress(), Toast.LENGTH_SHORT).show();
            }
        });
        builder.show();
    }

    public void ratingclick(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater=getLayoutInflater();
        builder.setTitle("Rating");
       View ind= inflater.inflate(R.layout.rating_layout,null);
       final RatingBar rate=ind.findViewById(R.id.rated);
       builder.setView(ind);
       builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialogInterface, int i) {
               Toast.makeText(getApplicationContext(), "Rating is "+rate.getRating(), Toast.LENGTH_SHORT).show();
           }
       });
       builder.show();


    }
}