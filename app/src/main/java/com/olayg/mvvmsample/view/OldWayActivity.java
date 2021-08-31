package com.olayg.mvvmsample.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.textview.MaterialTextView;
import com.olayg.mvvmsample.R;
import com.olayg.mvvmsample.databinding.ActivityMainBinding;

public class OldWayActivity extends AppCompatActivity {

    // OLD WAY: Declare Widget class
    private MaterialTextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // OLD WAY: Initialize Widget class
        tvDisplay = findViewById(R.id.tv_display);

        // Use your widgets
        tvDisplay.setText("Hello from MainActivity");
    }
}