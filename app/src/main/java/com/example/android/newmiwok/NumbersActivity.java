package com.example.android.newmiwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //declare a new array of strings
        String [] numbersArray = new String[10];

        //initialize each index of the array
        numbersArray[0] = "one";
        numbersArray[1] = "two";
        numbersArray[2] = "three";
        numbersArray[3] = "four";
        numbersArray[4] = "five";
        numbersArray[5] = "six";
        numbersArray[6] = "seven";
        numbersArray[7] = "eight";
        numbersArray[8] = "nine";
        numbersArray[9] = "ten";
    }
}
