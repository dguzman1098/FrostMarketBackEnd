package com.example.stockmarketapi.controllers;

import com.example.stockmarketapi.models.tickerdetails.TickerDetails;
import com.example.stockmarketapi.services.TickerDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
