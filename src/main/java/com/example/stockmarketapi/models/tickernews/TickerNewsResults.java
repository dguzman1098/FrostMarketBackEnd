package com.example.stockmarketapi.models.tickernews;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

//ticker news and updates

public class TickerNewsResults {

    private List<TickerNews> results;

    private String status;

    @JsonIgnore
    private String request_id;

    private Integer count;
    private String next_url;

    public TickerNewsResults(){

    }

    public TickerNewsResults(List<TickerNews> results) {
        this.results = results;
    }

    public List<TickerNews> getResults() {
        return results;
    }

    public void setResults(List<TickerNews> results) {
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

    @Override
    public String toString() {
        return "TickerNewsResults{" +
                "results=" + results +
                '}';
    }
}
