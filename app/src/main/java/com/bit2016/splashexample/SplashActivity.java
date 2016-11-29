package com.bit2016.splashexample;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //지연 (setInterver? setTimeout) 한번만 사용할때 handler 사용
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //초기화 작업을 해야함.

                finish();
            }
        },2000);
    }
}
