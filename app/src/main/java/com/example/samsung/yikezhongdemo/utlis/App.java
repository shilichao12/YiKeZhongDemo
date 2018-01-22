package com.example.samsung.yikezhongdemo.utlis;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by samsung on 2018/1/19.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);

    }
}
