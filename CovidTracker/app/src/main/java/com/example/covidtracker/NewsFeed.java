package com.example.covidtracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;

public class NewsFeed extends AppCompatActivity {

    WebView webView;
    WebSettings webSettings;
    Toolbar toolbar;
    ProgressBar progressBar;
    int colorCode;

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
            colorCode = Color.parseColor("#1d5f8a");
            progressBar.setIndeterminateTintList(ColorStateList.valueOf(colorCode));
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            if (!DataConnection.checkInternetConnection(this)) {
                progressBar.setVisibility(View.INVISIBLE);
                Toast.makeText(getApplicationContext(), "No Internet!", Toast.LENGTH_SHORT).show();
            } else {
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("https://indianexpress.com/?s=corona");
                webSettings = webView.getSettings();

                webView.setWebViewClient(new WebViewClient() {

                    @Override
                    public void onPageStarted(WebView view, String url, Bitmap favicon) {

                        progressBar.setVisibility(View.VISIBLE);
                        super.onPageStarted(view, url, favicon);
                    }

                    @Override
                    public void onPageCommitVisible(WebView view, String url) {

                        progressBar.setVisibility(View.INVISIBLE);
                        super.onPageCommitVisible(view, url);
                    }
                });
            }

    }
}
