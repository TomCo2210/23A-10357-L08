package dev.tomco.a23a_10357_l08;

import android.app.Application;

import dev.tomco.a23a_10357_l08.Utils.ImageLoader;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ImageLoader.initImageLoader(this);
    }
}
