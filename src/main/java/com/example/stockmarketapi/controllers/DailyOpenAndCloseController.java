package com.example.stockmarketapi.controllers;

import com.example.stockmarketapi.models.market.DailyOpenAndClose;
import com.example.stockmarketapi.services.DailyOpenAndCloseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("FrostMarket/")
public class DailyOpenAndCloseController {

    @Autowired
    private DailyOpenAndCloseService dailyOpenAndCloseService;

    @GetMapping("daily-open-and-close/{stockTicker}/{date}")
    public DailyOpenAndClose fetchDailyOpenAndClose(@PathVariable String stockTicker, @PathVariable String date){
        return dailyOpenAndCloseService.getDailyOpenAndCloseByTickerName(stockTicker, date);
    }
}
