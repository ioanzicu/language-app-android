package android.example.com.miwok;

public class Word {
    private String mDefaultTranslation = "";
    private String mMiwokTranslation = "";

    public Word(String defaultTranslation, String miwokTranslation){
        this.mMiwokTranslation = miwokTranslation;
        this.mDefaultTranslation = defaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }
}
