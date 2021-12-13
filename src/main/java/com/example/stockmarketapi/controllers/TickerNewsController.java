package com.example.stockmarketapi.controllers;

import com.example.stockmarketapi.models.tickernews.TickerNews;
import com.example.stockmarketapi.models.tickernews.TickerNewsResults;
import com.example.stockmarketapi.models.tickers.TickerResults;
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
    public TickerNewsResults fetchTickerDetailsByName(@PathVariable String stockTicker){
        return tickerNewsService.getNewsByTickerName(stockTicker);
    }

    //saves ticker results to this path
//    @GetMapping("saved-news")
//    public TickerNewsResults saveTickerResults(){
//        return tickerNewsService.saveNewsByName();
//    }

}
