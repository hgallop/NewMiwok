package com.example.android.newmiwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //declare a new array list of strings
        ArrayList<String>words = new ArrayList<>();

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

        //create an array adapter object that makes a layout of a single text view, predefined by android, for each array list item in words
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, words);

        // createa a variable for the grid view layout from activity_numbers
        GridView gridView = findViewById(R.id.grid);

        //sets the array adapter to the grid view layout
        gridView.setAdapter(itemsAdapter);
    }
}
