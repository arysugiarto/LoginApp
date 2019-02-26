package com.example.loginapp.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.loginapp.R;
import com.example.loginapp.helper.SharedPrefManager;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonSignIn, buttonSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //if user is already logged in openeing the profile activity
        if (SharedPrefManager.getInstance(this).isLoggedIn()){
            finish();
            startActivity(new Intent(this, HomeActivity.class));
        }

        buttonSignIn = (Button) findViewById(R.id.buttonSignIn);
        buttonSignUp = (Button) findViewById(R.id.buttonSigUp);

        buttonSignIn.setOnClickListener(this);
        buttonSignUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
            if (view == buttonSignIn){
                startActivity(new Intent(this,SigninActivity.class));
            }else if (view == buttonSignUp){
                startActivity(new Intent(this, SignUpActivity.class));
            }
    }
}
