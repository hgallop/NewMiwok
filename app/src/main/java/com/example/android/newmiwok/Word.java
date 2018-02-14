package com.example.android.newmiwok;

/**
 * Created by doyou on 2/14/2018.
 */
//creates class for Word. used to display default and mowok translation
public class Word {

    //create variables for each translation
    private String mDefaultTranslation;
    private String mMiwokTranslation;

    //constructor for Word object
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    //accessor. allows default translation to be accessed.
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    //accessor. allows miwok translation to be accessed
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
}
