package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getstart(View v) {
        AutoCompleteTextView name = (AutoCompleteTextView) findViewById(R.id.name);
        AutoCompleteTextView pass = (AutoCompleteTextView) findViewById(R.id.pass);
        AutoCompleteTextView confirmpass = (AutoCompleteTextView) findViewById(R.id.confirmpass);
        String s1 = name.getText().toString();
        String s2 = pass.getText().toString();
        String s3 = confirmpass.getText().toString();
        if (name.getText().toString().trim().length() <= 0) {
            Toast.makeText(MainActivity.this, "This field is required", Toast.LENGTH_SHORT).show();
        } else if (pass.getText().toString().trim().length() <= 0) {
            Toast.makeText(MainActivity.this, "Password is required", Toast.LENGTH_SHORT).show();
        } else if (confirmpass.getText().toString().trim().length() <= 0) {
            Toast.makeText(MainActivity.this, "Confirm Password is required", Toast.LENGTH_SHORT).show(); }
         else if (!s2.equals(s3)) {
            Toast.makeText(MainActivity.this, "Passwords do not match", Toast.LENGTH_SHORT).show(); }
         else {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            Toast.makeText(this,"Registration Successful",Toast.LENGTH_SHORT).show();
        }
    }
}
