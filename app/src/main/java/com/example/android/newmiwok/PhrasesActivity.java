package com.example.android.newmiwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //declare a new array list of strings
        ArrayList<Word> words = new ArrayList<>();

        //initialize each index of the array list
        words.add(new Word("Where are you going?","minto wuksus"));
        words.add(new Word("What is your name?","tinnә oyaase'nә"));
        words.add(new Word("My name is...","oyaaset..."));
        words.add(new Word("How are you feeling?","michәksәs?"));
        words.add(new Word( "I’m feeling good.","kuchi achit"));
        words.add(new Word("Are you coming?","әәnәs'aa?"));
        words.add(new Word("Yes, I’m coming.","hәә’ әәnәm"));
        words.add(new Word("I’m coming.","әәnәm"));
        words.add(new Word("Let’s go.","yoowutis"));
        words.add(new Word("Come here.","әnni'nem"));

        //create an array adapter object that makes a layout of a single text view, predefined by android, for each array list item in words
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);

        // creates a variable for the list view layout from word_list
        ListView listView = findViewById(R.id.list);

        //sets the array adapter to the list view layout
        listView.setAdapter(adapter);
    }
}
