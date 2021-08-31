package com.olayg.mvvmsample.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    // This uses Observer Pattern
    // LiveData is the class we will use to make data avaiable for the view
    // MutableLiveData is private because we want the viewmodel to be only
    // source than can change it
    private final MutableLiveData<String> displayString = new MutableLiveData<>();

    // LiveData is read only and is made public for the view
    public LiveData<String> getDisplayString() {
        return displayString;
    }

    // Entry method to do some logic
    public void calculateSomething(int num) {
        // do some work
        displayString.setValue("My num is " + num);
    }
}
