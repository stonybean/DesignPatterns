package com.github.stonybean.designpattern_sample.MVP;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.github.stonybean.designpattern_sample.R;

/**
 * Created by stonybean on 2019. 2. 1.
 */

public class MVPActivity extends AppCompatActivity implements Presenter.View {
    private Presenter presenter;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);

        presenter = new PresenterImpl(MVPActivity.this);

        textView = findViewById(R.id.textView);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.confirm();
            }
        });
    }

    @Override
    public void setText(String text) {
        textView.setText(text);
    }
}
