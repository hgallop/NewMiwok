package com.example.android.newmiwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //declare a new array of strings
        String [] words = new String[10];

        //initialize each index of the array
        words[0] = "one";
        words[1] = "two";
        words[2] = "three";
        words[3] = "four";
        words[4] = "five";
        words[5] = "six";
        words[6] = "seven";
        words[7] = "eight";
        words[8] = "nine";
        words[9] = "ten";

        //creates log messages for each element in the array
        Log.v("NumbersActivity", "Word at index 0 is: " + words[0]);
        Log.v("NumbersActivity", "Word at index 1 is: " + words[1]);
        Log.v("NumbersActivity", "Word at index 2 is: " + words[2]);
        Log.v("NumbersActivity", "Word at index 3 is: " + words[3]);
        Log.v("NumbersActivity", "Word at index 4 is: " + words[4]);
        Log.v("NumbersActivity", "Word at index 5 is: " + words[5]);
        Log.v("NumbersActivity", "Word at index 6 is: " + words[6]);
        Log.v("NumbersActivity", "Word at index 7 is: " + words[7]);
        Log.v("NumbersActivity", "Word at index 8 is: " + words[8]);
        Log.v("NumbersActivity", "Word at index 9 is: " + words[9]);
    }
}
