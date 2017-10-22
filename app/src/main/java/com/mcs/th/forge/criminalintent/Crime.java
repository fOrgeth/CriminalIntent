package com.mcs.th.forge.criminalintent;


import android.text.format.DateFormat;

import java.util.Date;
import java.util.Locale;
import java.util.UUID;

public class Crime {

    private String mTitle;
    private UUID mId;
    private boolean mSolved;
    private Date mDate;
    private String mSuspect;

    public Crime() {
        this(UUID.randomUUID());
    }

    public Crime(UUID id) {
        mId = id;
        mDate = new Date();
    }

    public String getTitle() {

        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        this.mSolved = solved;
    }

    public String getSuspect() {
        return mSuspect;
    }

    public void setSuspect(String suspect) {
        mSuspect = suspect;
    }

    public Date getDate() {
        /*String str = DateFormat.getBestDateTimePattern(Locale.getDefault(),"EEE, MMM, dd, yyyy");
        return DateFormat.format(str, mDate);*/
        return mDate;
    }

    public void setDate(Date date) {
        this.mDate = date;
    }

    public UUID getId() {
        return mId;
    }
}
