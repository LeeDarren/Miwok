package com.example.android.miwok;

import java.lang.reflect.Constructor;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceID;

    // basic public constructor, with word pair
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /** Constructor, with word pair and imageID
     * @param defaultTranslation
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID){
        this(defaultTranslation,miwokTranslation);
        mImageResourceID = imageResourceID;
    }

    /**
     * Get default translation
     */
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    /*
     * Get Miwok translation
     */
    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    /*
     * Get resource id of image
     */
    public int getmImageResourceID() { return mImageResourceID; }
}
