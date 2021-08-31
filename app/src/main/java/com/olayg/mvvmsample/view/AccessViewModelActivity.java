package com.olayg.mvvmsample.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.olayg.mvvmsample.databinding.ActivityMainBinding;
import com.olayg.mvvmsample.viewmodel.MainViewModel;

import java.util.Random;

public class AccessViewModelActivity extends AppCompatActivity {

    // Declare our viewmodel
    private MainViewModel viewModel;

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        // Initialize our viewModel
        viewModel = new ViewModelProvider(this).get(MainViewModel.class);

        /*
        OBSERVING WITHOUT LAMBDA
        viewModel.getDisplayString().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {

            }
        });

        */

        viewModel.getDisplayString().observe(this, s -> binding.tvDisplay.setText(s));

        binding.btnPotatoes.setOnClickListener(view -> viewModel.calculateSomething(new Random().nextInt(50)));
    }


}