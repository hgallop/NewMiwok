package com.example.android.newmiwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by doyou on 2/14/2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> words) {
        // initialize the word adapter's internal storage for the context and the list.
        // second argument is used when the array adapter populates a single text view.
        // this is a custom adapter for two text views. the adapter is not
        // going to use the second argument, it can be any value. here it is 0.
        super(context, 0, words);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate a new view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

        }

        //retrieves the current Word object from array list for Words
        Word currentWord = getItem(position);

        //sets the data from the current miwok translation to the correct text view in the list_item layout
        TextView miwokTextView = listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        //sets the data from the current default translation to the correct text view in the list_item layout
        TextView defaultTextView = listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        ImageView iconImageView = listItemView.findViewById(R.id.icon_view);
        iconImageView.setImageResource(currentWord.getImageResourceId());

        //returns the completed layout
        return listItemView;
    }
}