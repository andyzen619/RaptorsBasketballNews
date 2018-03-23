package com.android.andydesk.raptorsnews;

import java.util.Date;

/**
 * Created by AndyDesk on 3/22/2018.
 */

public class Article {

    private String title;
    private String webUrl;
    private String date;

    public Article(){
        this.title = "";
        this.webUrl = "";
        this.date = "";
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public void setDate(String date) {
        this.date = date.substring(0, 10);
    }

    public static void main(String []args){
        Article article = new Article();
        article.setDate("2017-10-17T11:39:25Z");
        System.out.println(article.date);
    }
}
