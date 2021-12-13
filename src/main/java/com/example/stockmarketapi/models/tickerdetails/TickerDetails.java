package com.example.stockmarketapi.models.tickerdetails;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

//
//@Entity
@JsonIgnoreProperties()
//deep, descriptive ticker details
public class TickerDetails {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean active;
    private String bloomberg;
    private String ceo;
    private String cik;
    private String country;
    private String description;
    private int employees;
    private String exchange;
    private String exchangeSymbol;
    private String figi;
    private String hq_address;
    private String hg_country;
    private String industry;
    private String lei;
    private String listdate;
    private String logo;
    private Long marketcap;
    private String name;
    private String phone;
    private String sector;
    private int sic;

//    @ElementCollection(targetClass=String.class)
    private Set<String> similar;

    private String symbol;

//    @ElementCollection(targetClass=String.class)
    private Set<String> tags;

    private String type;
    private String updated;
    private String url;

    public TickerDetails() {
    }

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getBloomberg() {
        return bloomberg;
    }

    public void setBloomberg(String bloomberg) {
        this.bloomberg = bloomberg;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    public String getCik() {
        return cik;
    }

    public void setCik(String cik) {
        this.cik = cik;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getExchangeSymbol() {
        return exchangeSymbol;
    }

    public void setExchangeSymbol(String exchangeSymbol) {
        this.exchangeSymbol = exchangeSymbol;
    }

    public String getHq_address() {
        return hq_address;
    }

    public void setHq_address(String hq_address) {
        this.hq_address = hq_address;
    }

    public String getHg_country() {
        return hg_country;
    }

    public void setHg_country(String hg_country) {
        this.hg_country = hg_country;
    }

    public String getFigi() {
        return figi;
    }

    public void setFigi(String figi) {
        this.figi = figi;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getLei() {
        return lei;
    }

    public void setLei(String lei) {
        this.lei = lei;
    }

    public String getListdate() {
        return listdate;
    }

    public void setListdate(String listdate) {
        this.listdate = listdate;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Long getMarketcap() {
        return marketcap;
    }

    public void setMarketcap(Long marketcap) {
        this.marketcap = marketcap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public int getSic() {
        return sic;
    }

    public void setSic(int sic) {
        this.sic = sic;
    }

    public Set<String> getSimilar() {
        return similar;
    }

    public void setSimilar(Set<String> similar) {
        this.similar = similar;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Set<String> getTags() {
        return tags;
    }

    public void setTags(Set<String> tags) {
        this.tags = tags;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "TickerDetails{" +
                "active=" + active +
                ", bloomberg='" + bloomberg + '\'' +
                ", ceo='" + ceo + '\'' +
                ", cik=" + cik +
                ", country='" + country + '\'' +
                ", description='" + description + '\'' +
                ", employees=" + employees +
                ", exchange='" + exchange + '\'' +
                ", exchangeSymbol='" + exchangeSymbol + '\'' +
                ", figi='" + figi + '\'' +
                ", hq_address='" + hq_address + '\'' +
                ", hg_country='" + hg_country + '\'' +
                ", industry='" + industry + '\'' +
                ", lei='" + lei + '\'' +
                ", listdate='" + listdate + '\'' +
                ", logo='" + logo + '\'' +
                ", marketcap=" + marketcap +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", sector='" + sector + '\'' +
                ", sic=" + sic +
                ", similar=" + similar +
                ", symbol='" + symbol + '\'' +
                ", tags=" + tags +
                ", type='" + type + '\'' +
                ", updated='" + updated + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
