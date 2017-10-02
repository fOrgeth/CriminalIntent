package com.mcs.th.forge.criminalintent;

import java.util.Date;
import java.util.UUID;

public class Crime {

    private String title;
    private UUID id;
    private boolean solved;
    private Date date;

    public Crime() {
        this.id = UUID.randomUUID();
        this.date = new Date();
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isSolved() {
        return solved;
    }

    public void setSolved(boolean solved) {
        this.solved = solved;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public UUID getId() {
        return id;
    }
}
