package android.example.com.miwok;

import androidx.annotation.NonNull;

public class Word {

    private String mDefaultTranslation;
    private String mForeignTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mAudioResourceId;

    public Word(String defaultTranslation, String foreignTranslation, int soundResourceID) {
        this.mForeignTranslation = foreignTranslation;
        this.mDefaultTranslation = defaultTranslation;
        this.mAudioResourceId = soundResourceID;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID, int soundResourceID) {
        this.mForeignTranslation = miwokTranslation;
        this.mDefaultTranslation = defaultTranslation;
        this.mImageResourceId = imageResourceID;
        this.mAudioResourceId = soundResourceID;
    }

    public String getmForeignTranslation() {
        return mForeignTranslation;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getImageResourceID() {
        return mImageResourceId;
    }

    public int getmAudioResourceId() {
        return mAudioResourceId;
    }

    /**
     * Returns whether or not there is an image for this word
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Returns the string representation of the {@link Word} object.
     */
    @NonNull
    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mForeignTranslation='" + mForeignTranslation + '\'' +
                ", mAudioResourceId=" + mAudioResourceId +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}
