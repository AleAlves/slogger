package com.github.android.aleson.sloggerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.android.aleson.slogger.SLogger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SLogger.init(true);
        SLogger.defaulTag("SLOGGER TAG");
        SLogger.d(new NullPointerException());
    }
}
