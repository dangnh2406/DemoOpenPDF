package com.example.caromono

import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView = findViewById(R.id.webview)
        webView.webViewClient = WebViewClient()
        webView.settings.javaScriptEnabled = true
        val settings: WebSettings = webView.getSettings()

        settings.allowFileAccessFromFileURLs = true;
        settings.allowUniversalAccessFromFileURLs = true;
        // if you want to enable zoom feature
        webView.settings.setSupportZoom(true)
        webView.loadUrl("file:///android_asset/index.html?https://www.africau.edu/images/default/sample.pdf")

    }
}
