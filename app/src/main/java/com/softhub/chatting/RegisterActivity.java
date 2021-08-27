package com.softhub.chatting;


import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONException;
import org.json.JSONObject;

public class RegisterActivity extends AppCompatActivity {
    EditText first_name;
    EditText middle_name;
    EditText last_name;
    EditText DD;
    EditText MM;
    EditText YY;
    EditText moblie_no;
    EditText email;
    EditText password;
    EditText confirm_password;
    Button registration;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);
        first_name = findViewById(R.id.et_first_name);
        middle_name = findViewById(R.id.et_middle_name);
        last_name = findViewById(R.id.et_last_name);
        DD = findViewById(R.id.et_date);
        MM = findViewById(R.id.et_month);
        YY = findViewById(R.id.et_year);
        moblie_no = findViewById(R.id.et_mobile_no);
        email = findViewById(R.id.et_email);
        password = findViewById(R.id.et_password);
        confirm_password = findViewById(R.id.et_confirm_password);
        registration = findViewById(R.id.btn_register);
        registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JSONObject userDetails = new JSONObject();
                JSONObject userList = new JSONObject();
                if (first_name.getText().toString().isEmpty()) {
                    Toast.makeText(RegisterActivity.this, "first name should not be empty.", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (middle_name.getText().toString().isEmpty()){
                    Toast.makeText(RegisterActivity.this,"middle name should not be empty",Toast.LENGTH_SHORT).show();
                    return;
                }
                if (last_name.getText().toString().isEmpty()) {
                    Toast.makeText(RegisterActivity.this, "last name should not be empty", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (DD.getText().toString().isEmpty()){
                    Toast.makeText(RegisterActivity.this,"DD should not be empty",Toast.LENGTH_SHORT).show();
                    return;
                }
                if (MM.getText().toString().isEmpty()) {
                    Toast.makeText(RegisterActivity.this, "MM should not be empty", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (YY.getText().toString().isEmpty()) {
                    Toast.makeText(RegisterActivity.this, "YY should not be empty", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (moblie_no.getText().toString().isEmpty()) {
                    Toast.makeText(RegisterActivity.this, "mobile no should not be empty", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (password.getText().toString().isEmpty()) {
                    Toast.makeText(RegisterActivity.this, "password should not be empty", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (confirm_password.getText().toString().isEmpty()) {
                    Toast.makeText(RegisterActivity.this, "confirm password should not be empty", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (password.getText().toString().equals(confirm_password.getText().toString())) {
                    Toast.makeText(RegisterActivity.this, "password matched", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(RegisterActivity.this, "password mismatched", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(RegisterActivity.this, SignInActivity.class);
        startActivity(intent);
        finish();
    }
}

