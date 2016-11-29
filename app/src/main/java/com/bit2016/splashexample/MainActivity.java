package com.bit2016.splashexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //splash activity 호출
        Intent intent = new Intent(this, SplashActivity.class);
        startActivity(intent);

        //원래 테마로 세팅
        setTheme(R.style.AppTheme);

        //inflation
        setContentView(R.layout.activity_main);
    }
}
