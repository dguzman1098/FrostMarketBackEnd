package com.example.stockmarketapi.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.ElementCollection;
import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)

//brief, individual ticker information
public class TickerResults {

    private Set<Ticker> results;
    private String status;
    private String request_id;
    private Integer count;
    private String next_url;

    public TickerResults() {
    }

    public Set<Ticker> getResults() {
        return results;
    }

    public void setResults(Set<Ticker> results) {
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
        this.next_url = next_url + "?apiKey=bamxspsyOWyNVumgmrmxfo648Bq5A3OU";
    }

    @Override
    public String toString() {
        return "TickerResults{" +
                "results=" + results +
                ", status='" + status + '\'' +
                ", request_id='" + request_id + '\'' +
                ", count=" + count +
                ", next_url='" + next_url + '\'' +
                '}';
    }
}
