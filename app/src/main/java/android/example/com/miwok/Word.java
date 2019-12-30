package android.example.com.miwok;

public class Word {
    private String mDefaultTranslation = "";
    private String mMiwokTranslation = "";
    private int mImageResourceID = 0;

    public Word(String defaultTranslation, String miwokTranslation){
        this.mMiwokTranslation = miwokTranslation;
        this.mDefaultTranslation = defaultTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID){
        this.mMiwokTranslation = miwokTranslation;
        this.mDefaultTranslation = defaultTranslation;
        this.mImageResourceID = imageResourceID;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getImageResourceID() { return mImageResourceID; }
}
