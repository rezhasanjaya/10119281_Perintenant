package com.example.a10119281;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.os.Bundle;
import android.widget.Toast;

/**
 * 22 - April - 2022
 * Rezha Satria SP
 * 10119281
 * IF7
 * **/


public class MainActivity extends AppCompatActivity {
    private Button button1,button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        button1 = findViewById(R.id.buttonProfil);
        button2 = findViewById(R.id.buttonOff);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }

    public void ProfileAct(View view) {
    Intent profile = new Intent(MainActivity.this,ProfileActivity.class);
        startActivity(profile);

    }

    public void LogOff(View view) {
        Intent LogOut = new Intent(MainActivity.this,LoginActivity.class);
        startActivity(LogOut);
        String toastMessage = "Log out Success";
        Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT).show();
    }
}