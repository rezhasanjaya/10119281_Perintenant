package com.example.a10119281;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.os.Handler;

/**
 * 22 - April - 2022
 * Rezha Satria SP
 * 10119281
 * IF7
 * **/

public class SplashActivity extends AppCompatActivity {
    Handler handler = new Handler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splash = new Intent(SplashActivity.this,LoginActivity.class);
                startActivity(splash);
                finish();
            }
        },2500);
    }
}