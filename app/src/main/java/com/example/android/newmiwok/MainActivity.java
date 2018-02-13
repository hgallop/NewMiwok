package com.example.android.newmiwok;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find the views for each category
        TextView numbers = findViewById(R.id.numbers);
        TextView colors = findViewById(R.id.colors);
        TextView phrases = findViewById(R.id.phrases);
        TextView familyMembers = findViewById(R.id.family);

        //set a click listener to the numbers view
        numbers.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });

        //set a click listener to the colors view
        colors.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });

        //set a click listener to the phrases view
        phrases.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent PhrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(PhrasesIntent);
            }
        });

        //set a click listener to the family members view
        familyMembers.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent familyMembersIntent = new Intent(MainActivity.this, FamilyMembersActivity.class);
                startActivity(familyMembersIntent);
            }
        });
    }

}
