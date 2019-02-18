package com.github.stonybean.designpattern_sample.MVC;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.github.stonybean.designpattern_sample.R;

/**
 * Created by stonybean on 2019. 2. 1.
 */

public class MVCActivity extends AppCompatActivity {
    private Model model;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);
        textView = findViewById(R.id.textView);

        model = new Model();
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(model.clickedTextView());
            }
        });
    }
}
