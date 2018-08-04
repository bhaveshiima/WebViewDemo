package vsl.bhavesh.webviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        wview.webViewClient = WebViewClient() //set on webview

        //enable javascript in webview - youtube or banner in mostly website [ START ]
        wview.settings.javaScriptEnabled = true  // Enable javascript
        wview.settings.displayZoomControls = true  // enable zoom control
        //enable javascript in webview - youtube or banner in mostly website [ ENE ]


        srch.setOnClickListener({
            wview.loadUrl(et1.text.toString())
        })


        facebook.setOnClickListener({
            wview.loadUrl("http://www.facebook.com")
        })

        google.setOnClickListener({
            wview.loadUrl("http://www.google.com")
        })

        youtube.setOnClickListener({
            wview.loadUrl("http://www.youtube.com")
        })


    } // onCreate()
} // mainActivity()
