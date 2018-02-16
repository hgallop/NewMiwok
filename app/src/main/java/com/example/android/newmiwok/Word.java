package com.example.android.newmiwok;

/**
 * Created by doyou on 2/14/2018.
 */
//creates class for Word. used to display default and mowok translation
public class Word {

    //create variables for each translation and the image to describe them
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId;

    //constructor for Word object
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    //accessor. allows default translation to be accessed.
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    //accessor. allows miwok translation to be accessed
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    //accessor.allows image resource id to be accessed
    public int getImageResourceId(){
        return mImageResourceId;
    }
}
