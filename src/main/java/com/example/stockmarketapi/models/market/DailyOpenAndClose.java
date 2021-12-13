package com.example.stockmarketapi.models.market;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import java.util.List;


public class DailyOpenAndClose {

    private String status;
    private String from;
    private String symbol;
    private Double open;
    private Double high;
    private Double low;
    private Double close;
    private Long volume;
    private Double afterHours;
    private Double preMarket;

    public DailyOpenAndClose() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Double getOpen() {
        return open;
    }

    public void setOpen(Double open) {
        this.open = open;
    }

    public Double getHigh() {
        return high;
    }

    public void setHigh(Double high) {
        this.high = high;
    }

    public Double getLow() {
        return low;
    }

    public void setLow(Double low) {
        this.low = low;
    }

    public Double getClose() {
        return close;
    }

    public void setClose(Double close) {
        this.close = close;
    }

    public Long getVolume() {
        return volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    public Double getAfterHours() {
        return afterHours;
    }

    public void setAfterHours(Double afterHours) {
        this.afterHours = afterHours;
    }

    public Double getPreMarket() {
        return preMarket;
    }

    public void setPreMarket(Double preMarket) {
        this.preMarket = preMarket;
    }

    @Override
    public String toString() {
        return "DailyOpenAndClose{" +
                "status='" + status + '\'' +
                ", from='" + from + '\'' +
                ", symbol='" + symbol + '\'' +
                ", open=" + open +
                ", high=" + high +
                ", low=" + low +
                ", close=" + close +
                ", volume=" + volume +
                ", afterHours=" + afterHours +
                ", preMarket=" + preMarket +
                '}';
    }
}
