package com.example.stockmarketapi.controllers;

import com.example.stockmarketapi.models.TickerDetails;
import com.example.stockmarketapi.models.TickerNews;
import com.example.stockmarketapi.services.TickerDetailsService;
import com.example.stockmarketapi.services.TickerNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("FrostMarket/")
public class TickerNewsController {

    @Autowired
    private TickerNewsService tickerNewsService;

    @GetMapping("ticker-news/{stockTicker}")
    public TickerNews fetchTickerDetailsByName(@PathVariable String stockTicker){
        return tickerNewsService.getNewsByTickerName(stockTicker);
    }
}
