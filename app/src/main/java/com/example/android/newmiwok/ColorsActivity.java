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
        words.add(new Word("red","weṭeṭṭi", R.drawable.color_red));
        words.add(new Word("green","chokokki", R.drawable.color_green));
        words.add(new Word("brown","ṭakaakki", R.drawable.color_brown));
        words.add(new Word("gray","ṭopoppi", R.drawable.color_gray));
        words.add(new Word( "black","kululli", R.drawable.color_black));
        words.add(new Word("white","kelelli", R.drawable.color_white));
        words.add(new Word("dusty yellow","ṭopiisә", R.drawable.color_dusty_yellow));
        words.add(new Word("mustard yellow","chiwiiṭә", R.drawable.color_mustard_yellow));

        //create an array adapter object that makes a layout of a single text view, predefined by android, for each array list item in words
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);

        // creates a variable for the list view layout from word_list
        ListView listView = findViewById(R.id.list);

        //sets the array adapter to the list view layout
        listView.setAdapter(adapter);
    }


}
