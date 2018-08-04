package vsl.bhavesh.webviewdemo

import android.app.ProgressDialog
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var pDial = ProgressDialog(this) // declare variable for progress dialog
        pDial.setMessage("Please wait.. Page is loading...!")
        
        //wview.webViewClient = WebViewClient() //set on webview
         wview.webViewClient = object : WebViewClient() {

             // Before loading the page this method called
             override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                 super.onPageStarted(view, url, favicon)
                 pDial.show()
             }

             // After loading the page this method called
             override fun onPageFinished(view: WebView?, url: String?) {
                 super.onPageFinished(view, url)
                 pDial.dismiss()
             }
         }


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
