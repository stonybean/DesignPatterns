package com.github.stonybean.designpattern_sample.MVVM;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;

import com.github.stonybean.designpattern_sample.R;

/**
 * Created by stonybean on 2019. 2. 1.
 */

class ViewModel {
    private Activity activity;
    private Model model;
    private TextView textView;

    ViewModel(Activity activity) {
        this.activity = activity;
        this.model = new Model();
        initView();
    }

    private void initView() {
        textView = activity.findViewById(R.id.textView);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(model.clickedTextView());
            }
        });
    }
}