package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebSite extends AppCompatActivity {
    WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_site);
        web=(WebView) findViewById(R.id.website);
        web.loadUrl("https://www.flipkart.com/");
        web.getSettings().setJavaScriptEnabled(true);

        web.setWebViewClient(new WebViewClient());
    }
}