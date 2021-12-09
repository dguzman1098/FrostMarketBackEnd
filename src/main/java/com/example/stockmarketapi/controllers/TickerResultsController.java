package com.example.stockmarketapi.controllers;

import com.example.stockmarketapi.models.TickerDetails;
import com.example.stockmarketapi.models.TickerResults;

import com.example.stockmarketapi.services.TickerResultsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("FrostMarket/")
public class TickerResultsController {

    @Autowired
    TickerResultsService tickerResultsService;

    @GetMapping("tickers")
    public TickerResults fetchAllTickers(){
        return tickerResultsService.getAllTickers();
    }

    @GetMapping("tickers/{stockTicker}")
    public TickerResults fetchTickerByName(@PathVariable String stockTicker){
        return tickerResultsService.getTickerByName(stockTicker);
    }

}
