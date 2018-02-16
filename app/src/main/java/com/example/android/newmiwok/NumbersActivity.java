package com.example.android.newmiwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //declare a new array list of strings
        ArrayList<Word> words = new ArrayList<>();

        //initialize each index of the array list
        words.add(new Word("one","lutti", R.drawable.number_one));
        words.add(new Word("two","otiiko", R.drawable.number_two));
        words.add(new Word("three","tolookosu", R.drawable.number_three));
        words.add(new Word("four","oyyisa", R.drawable.number_four));
        words.add(new Word( "five","massokka", R.drawable.number_five));
        words.add(new Word("six","temmokka", R.drawable.number_six));
        words.add(new Word("seven","kenekaku", R.drawable.number_seven));
        words.add(new Word("eight","kawinta", R.drawable.number_eight));
        words.add(new Word("nine","wo’e", R.drawable.number_nine));
        words.add(new Word("ten", "na’aacha", R.drawable.number_ten));

        //create an array adapter object that makes a layout of a single text view, predefined by android, for each array list item in words
        WordAdapter adapter = new WordAdapter(this, words);

        // creates a variable for the list view layout from word_list
        ListView listView = findViewById(R.id.list);

        //sets the array adapter to the list view layout
        listView.setAdapter(adapter);
    }
}
