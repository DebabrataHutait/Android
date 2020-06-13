package com.example.covidtracker;

public class CountryData {

    private String mCountryName;
    private int mFlagImage;

    public CountryData(String countryName, int flagImage) {
        mCountryName = countryName;
        mFlagImage = flagImage;
    }

    public String getCountryName() {
        return mCountryName;
    }


    public int getFlagImage() {
        return mFlagImage;
    }

}
