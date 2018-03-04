package com.xl.loginregister;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class UserAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        final EditText etUsername=(EditText) findViewById(R.id.etUsername);
        final EditText etEmail=(EditText) findViewById(R.id.etEmail);
        final TextView welcomeMessage=(TextView) findViewById(R.id.tvWelcomeMsg);
    }
}
