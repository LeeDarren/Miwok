package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceID;

    // basic public constructor
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;

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
