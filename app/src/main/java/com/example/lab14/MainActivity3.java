package com.example.lab14;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

public class MainActivity3 extends AppCompatActivity {

    private WebView webView;
    private SwipeRefreshLayout swipeRefresh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        swipeRefresh = findViewById(R.id.swipeRefresh);
        webView = findViewById(R.id.webView);

        // WebView settings
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);

        // Fix scrolling conflict
        webView.setOnScrollChangeListener((v, scrollX, scrollY, oldX, oldY) ->
                swipeRefresh.setEnabled(scrollY == 0)
        );

        webView.setWebViewClient(new WebViewClient() {

            @Override
            public void onPageFinished(WebView view, String url) {
                swipeRefresh.setRefreshing(false);
            }
        });

        swipeRefresh.setOnRefreshListener(() -> webView.reload());

        webView.loadUrl("https://www.github.com");
    }
}
