package com.example.a10119281;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.Toast;


/**
 * 22 - April - 2022
 * Rezha Satria SP
 * 10119281
 * IF7
 * **/

public class LoginActivity extends AppCompatActivity {
    private Button button1,button2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        button1 = findViewById(R.id.buttonLog);
        button2 = findViewById(R.id.regButton);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

    }

    public void LoginToMain(View view) {
        Intent Login = new Intent(LoginActivity.this,MainActivity.class);
        startActivity(Login);
        String toastMessage = "Log In Success";
        Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT).show();
    }

    public void SignUp(View view) {
        Intent Register = new Intent(LoginActivity.this,RegisterActivity.class);
        startActivity(Register);

    }
}