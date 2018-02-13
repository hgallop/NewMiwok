package com.example.android.newmiwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //declare a new array list of strings
        ArrayList<String>words = new ArrayList<String>();

        //initialize each index of the array list
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");


        //initialize variable for linear layout
        LinearLayout rootView = findViewById(R.id.root_view);

        //create a new text view object
        TextView wordView = new TextView(this);

        //set text for first item of array list to new text view object
        wordView.setText(words.get(0));

        //add word view as a child to root view
        rootView.addView(wordView);

        //create a new text view object
        TextView wordView2 = new TextView(this);

        //set text for first item of array list to new text view object
        wordView2.setText(words.get(1));

        //add word view 2 as a child to root view
        rootView.addView(wordView2);

        //create a new text view object
        TextView wordView3 = new TextView(this);

        //set text for first item of array list to new text view object
        wordView3.setText(words.get(2));

        //add word view 2 as a child to root view
        rootView.addView(wordView3);
    }
}
