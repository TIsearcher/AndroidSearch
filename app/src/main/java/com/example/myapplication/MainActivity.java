package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.service.autofill.TextValueSanitizer;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtenClick (View text)
    {
        EditText num1 = (EditText)findViewById(R.id.editTextNumber1) ;
        EditText num2 = (EditText)findViewById(R.id.editTextNumber2) ;
        TextView resText = (TextView)findViewById(R.id.Result);

        int fuck1 = Integer.parseInt(num1.getText().toString());
        int fuck2 = Integer.parseInt(num2.getText().toString());
        fuck1 = fuck1 * fuck2;

        resText.setText(Integer.toString(fuck1));

    }
}