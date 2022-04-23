package com.example.a10119281;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * 22 - April - 2022
 * Rezha Satria SP
 * 10119281
 * IF7
 * **/

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().hide();
    }

    public void BackToLogin(View view) {
        Intent Kembali = new Intent(RegisterActivity.this,LoginActivity.class);
        startActivity(Kembali);
    }

    public void SignUp(View view) {
        Intent AfterSign = new Intent(RegisterActivity.this,LoginActivity.class);
        startActivity(AfterSign);
        String toastMessage = "Berhasil Daftar";
        Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT).show();
    }
}