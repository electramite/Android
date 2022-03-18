package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String miWokTranslation;

    public Word(String DefaultTranslation, String MiWokTranslation){
        mDefaultTranslation = DefaultTranslation;
        miWokTranslation = MiWokTranslation;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }


    public String getMiWokTranslation() {
        return miWokTranslation;
    }

}
