package com.example.myjanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class WebViewActivity extends AppCompatActivity {

    EditText webtext;
    Button web_btn;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        webtext=(EditText) findViewById(R.id.web_id);
        web_btn=(Button) findViewById(R.id.go_btn);
        webView=(WebView)findViewById(R.id.webcontent);

        webView.setWebViewClient(new WebViewClient());

        web_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url=webtext.getText().toString();
                webView.getSettings().setLoadsImagesAutomatically(true);//for loading images as it is
                webView.getSettings().setJavaScriptEnabled(true);//loading javascripts
                webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                webView.loadUrl("https://www."+url+".com");
            }
        });
    }
}