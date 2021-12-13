package com.example.stockmarketapi.models.tickers;

import com.example.stockmarketapi.models.tickers.Ticker;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
import java.util.Set;


//brief, individual ticker information
@Entity
public class TickerResults {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //one result to many tickers
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tickerResults", fetch = FetchType.LAZY)
    private List<Ticker> results;

    private String status;

    @JsonIgnore
    private String request_id;

    private Integer count;

    @JsonIgnore
    private String next_url;

    public TickerResults() {

    }

    public TickerResults(Set<Ticker> results, String next_url) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Ticker> getResults() {
        return results;
    }

    public void setResults(List<Ticker> results) {
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
