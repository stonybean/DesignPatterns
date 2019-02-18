package com.github.stonybean.designpattern_sample.MVP;

/**
 * Created by stonybean on 2019. 2. 1.
 */

public interface Presenter {
    void confirm();

    interface View {
        void setText(String text);
    }
}