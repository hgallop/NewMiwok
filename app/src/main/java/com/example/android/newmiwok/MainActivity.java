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

        TextView numbers = findViewById(R.id.numbers);
        TextView colors = findViewById(R.id.colors);
        TextView phrases = findViewById(R.id.phrases);
        TextView familyMembers = findViewById(R.id.family);

        numbers.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });

        colors.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });

        phrases.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent PhrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(PhrasesIntent);
            }
        });

        familyMembers.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent familyMembersIntent = new Intent(MainActivity.this, FamilyMembersActivity.class);
                startActivity(familyMembersIntent);
            }
        });
    }

}
