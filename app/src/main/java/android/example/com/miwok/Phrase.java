package android.example.com.miwok;

public class Phrase {
    private String mDefaultTranslation = "";
    private String mMiwokTranslation = "";

    public Phrase(String defaultTranslation, String miwokTranslation) {
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
