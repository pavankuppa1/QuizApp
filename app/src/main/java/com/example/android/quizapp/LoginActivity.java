package com.example.android.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

/**
 * Created by kmurali on 26-03-2018.
 */

public class LoginActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void login(View v){
        AutoCompleteTextView name=(AutoCompleteTextView)findViewById(R.id.name);
        AutoCompleteTextView pass=(AutoCompleteTextView)findViewById(R.id.pass);
        String s1=name.getText().toString();
        String s2=pass.getText().toString();
        if(s1.equals("pavankuppa")&&s2.equals("kuppapavan")){
            Intent intent=new Intent(this,QuizActivity.class);
            startActivity(intent);
        }
       else
        {
            Toast.makeText(this,"Wrong credentials,Try again",Toast.LENGTH_SHORT).show();
        }
    }
}
