package com.example.android.newmiwok;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by doyou on 2/14/2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words, int color) {
        // initialize the word adapter's internal storage for the context and the list.
        // second argument is used when the array adapter populates a single text view.
        // this is a custom adapter for two text views. the adapter is not
        // going to use the second argument, it can be any value. here it is 0.
        super(context, 0, words);
        mColorResourceId = color;
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

        //set theme color for the list item
        View listItem = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        listItem.setBackgroundColor(color);

        //sets the data from the current miwok translation to the correct text view in the list_item layout
        TextView miwokTextView = listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        //sets the data from the current default translation to the correct text view in the list_item layout
        TextView defaultTextView = listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        //sets the data for the current image to the correct image view in the list_item layout
        ImageView iconImageView = listItemView.findViewById(R.id.icon_view);
        //checks first if image is present in current word
        if(currentWord.hasImage()) {
            iconImageView.setImageResource(currentWord.getImageResourceId());
        } else {
            //if no image is present remove image view
            iconImageView.setVisibility(View.GONE);
        }
        //returns the completed layout
        return listItemView;
    }
}