package com.example.android.quizapp;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

/**
 * Created by kmurali on 26-03-2018.
 */

public class QuizActivity extends LoginActivity {

    int count=0;
    private RadioButton rb1,rb2,rb3,rb4,rb5,rb6,rb7,rb8,rb9;
    private CheckBox ch1,ch2,ch3,ch4,ch5,ch6;
    EditText ed1,ed2,ed3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        rb1=(RadioButton)findViewById(R.id.rb1);
        rb2=(RadioButton)findViewById(R.id.rb2);
        rb3=(RadioButton)findViewById(R.id.rb3);
        rb4=(RadioButton)findViewById(R.id.rb4);
        rb5=(RadioButton)findViewById(R.id.rb5);
        rb6=(RadioButton)findViewById(R.id.rb6);
        rb7=(RadioButton)findViewById(R.id.rb7);
        rb8=(RadioButton)findViewById(R.id.rb8);
        RadioButton rb9=(RadioButton)findViewById(R.id.rb9);
         ch1=(CheckBox)findViewById(R.id.ch1);
        ch2=(CheckBox)findViewById(R.id.ch2);
        ch3=(CheckBox)findViewById(R.id.ch3);
        ch4=(CheckBox)findViewById(R.id.ch4);
        ch5=(CheckBox)findViewById(R.id.ch5);
        ch6=(CheckBox)findViewById(R.id.ch6);
        ed1=(EditText)findViewById(R.id.ed1);
        ed2=(EditText)findViewById(R.id.ed2);
        ed3=(EditText)findViewById(R.id.ed3);
    }
    public void onRadioButtonClicked1(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.rb1:
                if (checked)
                    count = count + 1;
                break;

        }
    }
    public void onRadioButtonClicked2(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.rb5:
                if (checked)
                    count = count + 1;
                break;

        }
    }
    public void onRadioButtonClicked3(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.rb9:
                if (checked)
                    count = count + 1;
                break;

        }
    }
    public void check1(View v) {
        if (ch1.isChecked() && ch2.isChecked() && ch3.isChecked()) {
            count = count + 3;
        }

    }
    public void check2(View v){
        if(ch4.isChecked()&&ch5.isChecked()&&ch6.isChecked()){
            count=count+3;
        }

    }
    public void submit(View v){
        if(ed1.getText().toString()=="English"){
            count=count+1;
        }
        if(ed2.getText().toString()=="2012"){
            count=count+1;
        }
        if(ed3.getText().toString()=="Sebastian Thrun"){
            count=count+1;
        }

        Toast.makeText(this,"Your total score is:"+count+"/12",Toast.LENGTH_SHORT).show();
    }
}
