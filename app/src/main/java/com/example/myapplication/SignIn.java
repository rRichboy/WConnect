package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        EditText email = findViewById(R.id.editTextTextEmailAddress1);
        EditText password = findViewById(R.id.editTextTextPassword1);

        Bundle args = getIntent().getExtras();

        if (args != null) {

            String emailArg = args.getString("email");
            String passwordArg = args.getString("password");

            email.setText(emailArg);
            password.setText(passwordArg);
        }
    }

    public void moveOn2(View view) {
        Intent intent = new Intent(SignIn.this, SignUp.class);
        SignIn.this.startActivity(intent);
    }
}