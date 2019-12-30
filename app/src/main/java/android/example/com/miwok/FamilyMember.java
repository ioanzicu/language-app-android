package android.example.com.miwok;

public class Family {
    private String mMiwokTranslation = "";
    private String mDefaultTranslation = "";

    public Family(String miwokTranslation, String defaultTranslation){
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
