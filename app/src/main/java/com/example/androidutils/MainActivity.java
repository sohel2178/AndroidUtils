package com.example.androidutils;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.forbitbd.androidutils.utils.PrebaseActivity;

public class MainActivity extends PrebaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupToolbar(R.id.toolbar);

        getSupportActionBar().setTitle("HHHHHHHHH");
    }
}
