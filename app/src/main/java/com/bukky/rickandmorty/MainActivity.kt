import com.bukky.rickandmorty.R

0package com.bukky.rickandmorty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
//    private lateinit var webView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val webView = findViewById<WebView>(R.id.webview)
//        webView.webViewClient =MyWebViewClient()
        webView.loadUrl("https://rickandmortyapi.com")
    }
}

//    override fun onBackPressed() {
//        val canGoBack = webView.canGoBack()
//        if (canGoBack){
//            webView.goBack()
//        }else{
//            super.onBackPressed()
//        }
//    }
//    inner class MyWebViewClient: WebViewClient(){
//        override fun shouldOverrideUrlLoading(view: WebView?, url:String): Boolean {
//            view?.loadUrl(url)
//            return true
//        }
//    }
//}