package com.example.stockmarketapi.controllers;

//import com.example.stockmarketapi.models.tickers.Ticker;
import com.example.stockmarketapi.models.tickers.Ticker;
import com.example.stockmarketapi.models.tickers.TickerResults;

import com.example.stockmarketapi.services.TickerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@CrossOrigin("*")
@RestController
@RequestMapping("FrostMarket/")
public class TickerController {

    @Autowired
    TickerService tickerResultsService;

    //fetches all ETF tickers in database
    @GetMapping("tickers")
    public List<Ticker> fetchAllETFTickers(){
        return tickerResultsService.getAllETFTickers();
    }

    //fetches individual stock ticker by id in database
    @GetMapping("tickers/{id}")
    public Ticker fetchETFStockById(@PathVariable Long id){
        return tickerResultsService.getETFById(id);
    }

    @GetMapping("tickers/ticker-symbol")
    public Ticker fetchETFByName(@RequestParam("ticker") String ticker){
        return tickerResultsService.getETFByTickerSymbol(ticker);
    }

    //saves ticker results to this path
    @GetMapping("saved-etfs")
    public TickerResults saveTickerResults(){
        return tickerResultsService.saveETFTickers();
    }



}
