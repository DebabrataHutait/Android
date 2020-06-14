package com.example.covidtracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class NewsFeed extends AppCompatActivity {

    WebView webView;
    WebSettings webSettings;
    Toolbar toolbar;
    ProgressBar progressBar;

    @Override
    public void onBackPressed() {

        if(webView.canGoBack()){
            webView.goBack();
        }
        else {
            super.onBackPressed();
        }
    }

    @Override
    public void finish() {

        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newsfeed);

            toolbar=(Toolbar) findViewById(R.id.newsToolbar);
            webView=findViewById(R.id.webView);
            progressBar=findViewById(R.id.progress);

            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            webView.setWebViewClient(new WebViewClient());
            webView.loadUrl("https://indianexpress.com/?s=corona");
            webSettings=webView.getSettings();

            webView.setWebViewClient(new WebViewClient(){

                @Override
                public void onPageStarted(WebView view, String url, Bitmap favicon) {

                    progressBar.setVisibility(View.VISIBLE);
                    super.onPageStarted(view, url, favicon);
                }

                @Override
                public void onPageFinished(WebView view, String url) {

                    progressBar.setVisibility(View.INVISIBLE);
                    super.onPageFinished(view, url);
                }

                @Override
                public void onPageCommitVisible(WebView view, String url) {

                    progressBar.setVisibility(View.INVISIBLE);
                    super.onPageCommitVisible(view, url);
                }
            });


    }
}
