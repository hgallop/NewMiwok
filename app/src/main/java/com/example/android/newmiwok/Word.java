package com.example.android.newmiwok;

/**
 * Created by doyou on 2/14/2018.
 */
//creates class for Word. used to display default and mowok translation
public class Word {

    //create variables for each translation and the image to describe them
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mMiwokAudio;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    //constructor for Word object
    public Word(String defaultTranslation, String miwokTranslation, int miwokAudio) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mMiwokAudio = miwokAudio;
    }

    //constructor for word object with an image
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int miwokAudio){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mMiwokAudio = miwokAudio;
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

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;


    }

    public int getMiwokAudio(){
        return mMiwokAudio;
    }

    //overrides built in class method toString. constructs a string fom each item in Word object
    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mMiwokAudio=" + mMiwokAudio +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}
