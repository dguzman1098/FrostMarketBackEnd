package com.example.stockmarketapi.controllers;

import com.example.stockmarketapi.StockMarketApiApplication;
import com.example.stockmarketapi.models.TickerDetails;
import com.example.stockmarketapi.services.TickerDetailsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;

@CrossOrigin("*")
@RestController
@RequestMapping("FrostMarket/")
public class TickerDetailsController {

    @Autowired
    private TickerDetailsService tickerDetailsService;

    @GetMapping("ticker-details/{stockTicker}")
    public TickerDetails fetchTickerDetailsByName(@PathVariable String stockTicker){
        return tickerDetailsService.getTickerDetailsByName(stockTicker);
    }
}
