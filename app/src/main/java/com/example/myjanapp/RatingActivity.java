package com.example.myjanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class RatingActivity extends AppCompatActivity {
private RatingBar ratingBar;
private TextView ratetext;
private Button ratebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);
        ratingBar=(RatingBar) findViewById(R.id.rating_id);
        ratetext=(TextView) findViewById(R.id.ratetext);
        ratebtn=(Button) findViewById(R.id.rat_btn);
        ratebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numstars=ratingBar.getNumStars();
                float ratingvalue=ratingBar.getRating();
                ratetext.setText("rating is "+ratingvalue);
            }
        });
    }
}