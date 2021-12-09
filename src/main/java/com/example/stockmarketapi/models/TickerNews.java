package com.example.stockmarketapi.models;

import java.util.List;

//ticker news and updates
public class TickerNews {

    private List<TickerNewsResults> results;
    private String status;
    private String request_id;
    private Integer count;
    private String next_url;
//    private String title;
//    private String author;
//    private String published_utc;
//    private String article_url;
//    private List<String> tickers;
//    private String amp_url;
//    private String image_url;
//    private String description;
//    private List<String> keywords;


    public TickerNews() {
    }

    public List<TickerNewsResults> getResults() {
        return results;
    }

    public void setResults(List<TickerNewsResults> results) {
        this.results = results;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRequest_id() {
        return request_id;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getNext_url() {
        return next_url;
    }

    public void setNext_url(String next_url) {
        this.next_url = next_url;
    }
}
