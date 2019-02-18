package com.github.stonybean.designpattern_sample.MVVM;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.stonybean.designpattern_sample.R;

/**
 * Created by stonybean on 2019. 2. 1.
 */

public class MVVMActivity extends AppCompatActivity {
    private ViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);

        viewModel = new ViewModel(MVVMActivity.this);
    }
}