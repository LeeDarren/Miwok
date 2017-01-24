package com.example.android.miwok;

import java.lang.reflect.Constructor;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceID = NO_IMAGE_PROVIDED;
    private int mAudioResourceID = NO_AUDIO_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;
    private static final int NO_AUDIO_PROVIDED = -1;

    /**
     * basic public constructor, with word pair
     *
     * @param defaultTranslation word in default language
     * @param miwokTranslation   word in miwok
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }
    /**
     * Constructor, with word pair and imageID
     *
     * @param defaultTranslation word in default language
     * @param miwokTranslation   word in miwok
     * @param imageResourceID    icon image for word
     * @param audioResourceID    audio file for word
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID, int audioResourceID) {
        this(defaultTranslation, miwokTranslation);
        mImageResourceID = imageResourceID;
        mAudioResourceID = audioResourceID;
    }

    /**
     * Constructor, with word pair and imageID
     *
     * @param defaultTranslation word in default language
     * @param miwokTranslation   word in miwok
     * @param audioResourceID    audio file for word
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceID) {
        this(defaultTranslation, miwokTranslation);
        mAudioResourceID = audioResourceID;
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
    public int getImageResourceID() {
        return mImageResourceID;
    }

    /*
     * Get resource id of audio
     */
    public int getAudioResourceID() {
        return mAudioResourceID;
    }

    //Returns true if there is an image
    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceID=" + mImageResourceID +
                ", mAudioResourceID=" + mAudioResourceID +
                '}';
    }
}
