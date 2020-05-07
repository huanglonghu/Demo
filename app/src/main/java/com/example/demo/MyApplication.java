package com.example.demo;

import android.app.Application;
import android.content.Context;

import com.example.demo.language.LanguagesManager;

import java.util.Locale;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        LanguagesManager.init(this);

        new RudenessScreenHelper(this, 1920).activate();
    }

    @Override
    protected void attachBaseContext(Context base) {
        // 国际化适配（绑定语种）
        super.attachBaseContext(LanguagesManager.attach(base));
    }

}
