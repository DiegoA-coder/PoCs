package com.baz.poc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class YouTubeEmbed extends AppCompatActivity {

    WebView miVisorVideo;
    String contentVideo ="<iframe width=\"350\" height=\"250\" src=\"https://www.youtube.com/embed/AmzecNxfNtU\" title=\"Prueba con un video\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>";

    WebView miVisorListVideo;
    String contentListVideo="<iframe width=\"350\" height=\"250\" src=\"https://www.youtube.com/embed/videoseries?list=PLgKzFnvAFPsZkLSFlUABOsb9Vx5gukaCO\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_you_tube_embed);

        miVisorVideo = (WebView) findViewById(R.id.webView1);
        final WebSettings ajustesVisorWeb = miVisorVideo.getSettings();
        ajustesVisorWeb.setJavaScriptEnabled(true);
        miVisorVideo.loadDataWithBaseURL(null, contentVideo,"text/html", "UTF-8",null);

        miVisorListVideo = (WebView) findViewById(R.id.webView2);
        final WebSettings ajustesVisorWeb2 = miVisorListVideo.getSettings();
        ajustesVisorWeb2.setJavaScriptEnabled(true);
        miVisorListVideo.loadDataWithBaseURL(null, contentListVideo,"text/html", "UTF-8",null);

    }
}