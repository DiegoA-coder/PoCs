package com.baz.poc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonAds = findViewById(R.id.buttonAds);
        buttonAds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), AdsGoogle.class);
                startActivityForResult(intent, 0);
            }
        });

        Button buttonExo = findViewById(R.id.buttonExoPlater);
        buttonExo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), ExoPlayerM3U8.class);
                startActivityForResult(intent, 0);
            }
        });

        Button buttonWeb = findViewById(R.id.buttonWebView);
        buttonWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), WebViewMediastream.class);
                startActivityForResult(intent, 0);
            }
        });
    }
}