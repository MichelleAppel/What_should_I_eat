package com.example.michelle.whatshouldieat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/*
 * Contains a WebView that shows the website with directions
 * of the recipe.
 */

public class ViewDirections extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_directions);

        Intent intent = getIntent();
        String url = intent.getStringExtra("url");
        System.out.println("url" + url);
        setTitle(intent.getStringExtra("title"));

        WebView webView = (WebView)findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);
    }
}
