package com.example.stockmarketapi.models;

import java.util.List;

public class TickerNewsResults {

    private String title;
    private String author;
    private String published_utc;
    private String article_url;
    private List<String> tickers;
    private String amp_url;
    private String image_url;
    private String description;
    private List<String> keywords;

    public TickerNewsResults() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublished_utc() {
        return published_utc;
    }

    public void setPublished_utc(String published_utc) {
        this.published_utc = published_utc;
    }

    public String getArticle_url() {
        return article_url;
    }

    public void setArticle_url(String article_url) {
        this.article_url = article_url;
    }

    public List<String> getTickers() {
        return tickers;
    }

    public void setTickers(List<String> tickers) {
        this.tickers = tickers;
    }

    public String getAmp_url() {
        return amp_url;
    }

    public void setAmp_url(String amp_url) {
        this.amp_url = amp_url;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }
}
