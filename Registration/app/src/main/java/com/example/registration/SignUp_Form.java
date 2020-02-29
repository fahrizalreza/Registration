package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SignUp_Form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up__form);
        getSupportActionBar().setTitle("Sign Up Form");
    }
}
