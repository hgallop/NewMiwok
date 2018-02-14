package com.example.android.newmiwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //declare a new array list of strings
        ArrayList<Word> words = new ArrayList<>();

        //initialize each index of the array list
        words.add(new Word("red","weṭeṭṭi"));
        words.add(new Word("green","chokokki"));
        words.add(new Word("brown","ṭakaakki"));
        words.add(new Word("gray","ṭopoppi"));
        words.add(new Word( "black","kululli"));
        words.add(new Word("white","kelelli"));
        words.add(new Word("dusty yellow","ṭopiisә"));
        words.add(new Word("mustard yellow","chiwiiṭә"));

        //create an array adapter object that makes a layout of a single text view, predefined by android, for each array list item in words
        WordAdapter adapter = new WordAdapter(this, words);

        // creates a variable for the list view layout from word_list
        ListView listView = findViewById(R.id.list);

        //sets the array adapter to the list view layout
        listView.setAdapter(adapter);
    }


}
