package com.example.stockmarketapi.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Ticker {

    private String ticker;
    private String name;
    private String market;
    private String locale;
    private String primary_exchange;
    private String type;
    private Boolean active;
    private String currency_name;
    private String cik;
    private String composite_figi;
    private String share_class_figi;
    private String last_updated_utc;

    public Ticker() {
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getPrimary_exchange() {
        return primary_exchange;
    }

    public void setPrimary_exchange(String primary_exchange) {
        this.primary_exchange = primary_exchange;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getCurrency_name() {
        return currency_name;
    }

    public void setCurrency_name(String currency_name) {
        this.currency_name = currency_name;
    }

    public String getCik() {
        return cik;
    }

    public void setCik(String cik) {
        this.cik = cik;
    }

    public String getComposite_figi() {
        return composite_figi;
    }

    public void setComposite_figi(String composite_figi) {
        this.composite_figi = composite_figi;
    }

    public String getShare_class_figi() {
        return share_class_figi;
    }

    public void setShare_class_figi(String share_class_figi) {
        this.share_class_figi = share_class_figi;
    }

    public String getLast_updated_utc() {
        return last_updated_utc;
    }

    public void setLast_updated_utc(String last_updated_utc) {
        this.last_updated_utc = last_updated_utc;
    }
}
