package com.example.ananc.compapp;

/**
 * Created by ananc on 12/11/2017.
 */

public class lvmissions {
    protected String title;
    protected String date;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public lvmissions(String title, String date) {

        this.title = title;
        this.date = date;
    }
}
