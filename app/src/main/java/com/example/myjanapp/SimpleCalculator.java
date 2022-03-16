package com.example.myjanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SimpleCalculator extends AppCompatActivity {
TextView valuetext;
TextView tottext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_calculator);
        valuetext=(TextView) findViewById(R.id.value_id);
        tottext=(TextView) findViewById(R.id.tot_text);

    }

    public void clickedvalue(View view) {
        String str="";
        String value=valuetext.getText().toString();
      String totalval=tottext.getText().toString();

//        switch (view.getId()){
//
//            case R.id.clr_id:
//                value=null;
//            tottext.setText("");
//            valuetext.setText("");
//            break;
//
//            case R.id.mod_id:
//                value=value+"%";
//                break;
//
//            case R.id.one_id:
//value=value+"1";
//                break;
//            case R.id.two_id:
//                value=value+"2";
//                break;
//            case R.id.three_id:
//                value=value+"3";
//                break;
//            case R.id.four_id:
//                value=value+"4";
//                break;
//            case R.id.five_id:
//                value=value+"5";
//                break;
//            case R.id.six_id:
//                value=value+"6";
//                break;
//            case R.id.seven_id:
//                value=value+"7";
//                break;
//            case R.id.eight_id:
//                value=value+"8";
//                break;
//            case R.id.nine_id:
//                value=value+"9";
//                break;
//            case R.id.zero_id:
//                value=value+"0";
//                break;
//            case R.id.add_id:
//                value=value+"+";
//                break;
//            case R.id.sub_id:
//                value=value+"-";
//                break;
//            case R.id.mul_id:
//                value=value+"*";
//                break;
//            case R.id.div_id:
//                value=value+"/";
//                break;
//            case R.id.dot_id:
//                value=value+".";
//                break;
//            case R.id.equal_id:
//                value=value+"=";
//                break;
//        }
    }

    private void solve() {
    }
}