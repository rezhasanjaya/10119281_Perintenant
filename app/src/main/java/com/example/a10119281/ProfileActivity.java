package com.example.a10119281;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

/**
 * 22 - April - 2022
 * Rezha Satria SP
 * 10119281
 * IF7
 * **/

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        getSupportActionBar().hide();
    }

    public void BackToMain(View view) {
        Intent Kembali = new Intent(ProfileActivity.this,MainActivity.class);
        startActivity(Kembali);
    }
}