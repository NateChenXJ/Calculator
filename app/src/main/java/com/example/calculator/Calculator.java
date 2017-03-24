package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.util.Log;


import java.util.regex.Pattern;

public class Calculator extends AppCompatActivity {

    private TextView screen; 
    private String display = "";
    private String currentOperator = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        screen = (TextView)findViewById(R.id.textView);
        screen.setText(display);
    }

    private void updateScreen(){

        screen.setText(display);

    }

    public void onClickNumber(View v){

        Button b = (Button) v;
        display += b.getText();
        updateScreen();

    }

    public void onClickOperator(View v){

        Button b = (Button) v;
        display += b.getText();
        currentOperator = b.getText().toString();
        updateScreen();

    }

    private void clear(){

        display = "";
        currentOperator = "";

    }

    public void onClickClear(View v){

        clear();
        updateScreen();

    }






}
