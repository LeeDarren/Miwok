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

    /** basic public constructor, with word pair
     * @param defaultTranslation word in default language
     * @param miwokTranslation word in miwok
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }
    /** Constructor, with word pair and imageID
     * @param defaultTranslation word in default language
     * @param miwokTranslation word in miwok
     * @param imageResourceID icon image for word
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID){
        this(defaultTranslation,miwokTranslation);
        mImageResourceID = imageResourceID;
    }
    /**
     * Get default translation
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /*
     * Get Miwok translation
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /*
     * Get resource id of image
     */
    public int getImageResourceID() { return mImageResourceID; }
}
