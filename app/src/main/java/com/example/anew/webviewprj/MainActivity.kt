package com.example.anew.webviewprj

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.EditText

class MainActivity : AppCompatActivity()
{
    var et1:EditText?=null
    var wv1:WebView?=null
    var wv2:WebView?=null
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        et1=findViewById(R.id.et1)
        wv1=findViewById(R.id.wv1)
        wv2=findViewById(R.id.wv2)
        wv1?.webViewClient= WebViewClient()
        wv2?.webViewClient=WebViewClient()
    }
    fun load(v:View)
    {
        when(v.id)
        {
            R.id.iv1->wv1?.loadUrl(et1?.text.toString())
            R.id.iv2->wv2?.loadUrl("http://www.google.com")
            R.id.iv3->wv2?.loadUrl("http://www.facebook.com")
            R.id.iv4->wv2?.loadUrl("http://www.youtube.com")
            R.id.iv5->wv2?.loadUrl("http://www.html.com")
        }
    }
}
