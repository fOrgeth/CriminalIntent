package com.mcs.th.forge.criminalintent;

import java.util.Date;
import java.util.UUID;

public class Crime {

    private String mTitle;
    private UUID mId;
    private boolean mSolved;
    private Date mDate;

    public Crime() {
        mId = UUID.randomUUID();
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

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        this.mDate = date;
    }

    public UUID getId() {
        return mId;
    }
}
