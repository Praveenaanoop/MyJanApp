package com.example.myjanapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class SnackbarRActivity extends AppCompatActivity {
Button but;
CoordinatorLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snackbar_r);
        but=(Button) findViewById(R.id.snack_btn);
        layout=(CoordinatorLayout) findViewById(R.id.snack_layout);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar=Snackbar.make(layout,"Message Deleted",Snackbar.LENGTH_LONG).setAction("UNDO",
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(getApplicationContext(), "Undo Clicked", Toast.LENGTH_SHORT).show();
                            }
                        }
                );

                snackbar.show();
            }
        });
    }
}