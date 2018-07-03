package com.example.android.newsapps1;

import java.util.Date;

public class News {

        //Required
    private String mUrl;
    private String mTitle;
    private String mSection;

        //If exists
    private String mAuthor;
    private Date mTimeInMilliseconds;

    public News(String url, String title, String section, String author, Date timeInMilliseconds){
        mUrl = url;
        mTitle = title;
        mSection = section;
        mAuthor = author;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    public String getUrl() {return mUrl;}
    public String getTitle() {return mTitle;}
    public String getSection() {return mSection;}
    public String getAuthor() {return mAuthor;}
    public Date getTimeInMilliseconds() {return mTimeInMilliseconds;}
}
