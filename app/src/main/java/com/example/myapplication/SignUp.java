package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void back(View view) {
        Intent intent = new Intent(SignUp.this, SignIn.class);
        SignUp.this.startActivity(intent);
    }

    public void sign_up(View view){
        EditText email = findViewById(R.id.editTextTextEmailAddress1);
        EditText password = findViewById(R.id.editTextTextPassword1);

        String emailStr = email.getText().toString();
        String passwordStr = password.getText().toString();

        Intent intent = new Intent(this, SignIn.class);
        intent.putExtra("email", emailStr);
        intent.putExtra("password", passwordStr);
        startActivity(intent);

    }
}