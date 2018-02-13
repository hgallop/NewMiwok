package com.example.android.newmiwok;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openNumbersList(View view) {
        Intent numbers = new Intent(this, NumbersActivity.class);
        startActivity(numbers);
    }

    public void openFamilyMembersList(View view){
        Intent numbers = new Intent(this, FamilyMembersActivity.class);
        startActivity(numbers);
    }

    public void openColorsList(View view){
        Intent numbers = new Intent(this, ColorsActivity.class);
        startActivity(numbers);
    }

    public void openPhrasesList(View view){
        Intent numbers = new Intent(this, PhrasesActivity.class);
        startActivity(numbers);
    }
}
