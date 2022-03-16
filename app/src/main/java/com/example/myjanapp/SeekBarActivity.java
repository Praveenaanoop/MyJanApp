package com.example.myjanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class SeekBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar);
        TextView seektext=(TextView) findViewById(R.id.text_seek);
        SeekBar seekbar=(SeekBar) findViewById(R.id.seek_id1);
        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progress=0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                this.progress=progress;
                seektext.setTextSize(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(), "started touching", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(), "seekbar progress"+progress, Toast.LENGTH_SHORT).show();

            }
        });
    }
}