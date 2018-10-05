package com.example.amikom.solashscreen;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    preferenceshelper insance;
    private Object instent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        intstance =PreferencesHelper.getInstance(getApplicationContext());
        int splashInterval = 10;

        new Handler().postDelayed(new Runnable()) {
                @Override
                        public void run() {


                if (!instent.isLogin()) {
                    startActivity(new Intent(SplashActivity.this, LoginActivity.class));
                } else {
                    startActivity(new Intent(SplashActivty.this, MainActivity.class));
                }
            }, splashInterval);
        }
    }
