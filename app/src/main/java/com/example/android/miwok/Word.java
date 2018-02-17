package com.example.android.miwok;

/**
 * Created by Stefanie on 2/11/2018.
 */

public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private static final int NO_IMAGE_RESOURCE = -1;
    private int mImageResourceId = Word.NO_IMAGE_RESOURCE;
    private int mPronunciationResourceId;

    /**
     * Creates a Word object without an image associated
     * @param defaultWord
     * @param miwokWord
     * @param pronunciationResourceId
     */
    public Word(String defaultWord, String miwokWord, int pronunciationResourceId) {
        this.mMiwokTranslation = miwokWord;
        this.mDefaultTranslation = defaultWord;
        this.mPronunciationResourceId = pronunciationResourceId;
    }

    /**
     * Creates a Word object with a image associated
     * @param defaultWord
     * @param miwokWord
     * @param imageResourceId
     * @param pronunciationResourceId
     */
    public Word(String defaultWord, String miwokWord, int imageResourceId, int pronunciationResourceId) {
        this.mMiwokTranslation = miwokWord;
        this.mDefaultTranslation = defaultWord;
        this.mImageResourceId = imageResourceId;
        this.mPronunciationResourceId = pronunciationResourceId;
    }

    /**
     * Gets the Miwok translation
     */
    public String getMiwokTranslation(){
        return this.mMiwokTranslation;
    }

    /**
     * Gets the translation in the default language
     */
    public String getDefaultTranslation(){
        return this.mDefaultTranslation;
    }

    /**
     * Gets the image resource ID
     */
    public int getImageResourceId(){
        return this.mImageResourceId;
    }

    /**
     * Tells whether or not the word has an image resource associated with it.
     * @return
     */
    public boolean hasImageResource(){
        return this.mImageResourceId != Word.NO_IMAGE_RESOURCE;
    }

    /**
     * Returns resource ID for the pronunciation sound file
     */
    public int getSoundResourceId() {
        return this.mPronunciationResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mPronunciationResourceId=" + mPronunciationResourceId +
                '}';
    }

}
