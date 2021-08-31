package com.olayg.mvvmsample.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.textview.MaterialTextView;
import com.olayg.mvvmsample.R;
import com.olayg.mvvmsample.databinding.ActivityMainBinding;

public class NewWayActivity extends AppCompatActivity implements View.OnClickListener {

    // NEW WAY: Declare Generated Binding class *you need to enable viewBinding in the gradle*
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // NEW WAY: Initialize Binding class
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        // NEW WAY: Pass binding root to content view
        setContentView(binding.getRoot());

        // Use your widgets
        binding.tvDisplay.setText("Hello from the new Way");

        // Setting up clicklistener for button using anonymous implementation
        binding.btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateDisplay("Hello from clickListener");
            }
        });

        // Setting up clicklistener for button using anonymous implementation [LAMBDA]
        binding.btnClick.setOnClickListener(view -> updateDisplay("Hello from clickListener"));

        // Setting up clickListener for button using class implementation
        binding.btnPotatoes.setOnClickListener(this);
        binding.btnFries.setOnClickListener(this);
        binding.btnPotatoes.setOnClickListener(this);
        binding.cvMash.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.btn_potatoes || id == R.id.btn_fries) updateDisplay("Hello from potatoes family clickListener");
        else if (id == R.id.btn_click) updateDisplay("Hello from potatoes clickListener");
        else if (id == R.id.cv_mash) updateDisplay("Hello from cardview clickListener");
        else updateDisplay("Default");

        // Don't use switch cases for view IDs
        /*switch (view.getId()) {
            case R.id.btn_potatoes:
                break;
        }*/
    }

    public void updateDisplay(String msg) {
        binding.tvDisplay.setText(msg);
    }
}