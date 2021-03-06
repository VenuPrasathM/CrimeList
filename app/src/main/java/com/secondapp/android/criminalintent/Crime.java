package com.secondapp.android.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by venu on 18-08-2017.
 */

public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean nSolved;

    public Crime() {

        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isnSolved() {
        return nSolved;
    }

    public void setnSolved(boolean nSolved) {
        this.nSolved = nSolved;
    }
}
