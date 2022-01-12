package com.example.stockmarketapi.services;

import com.example.stockmarketapi.StockMarketApiApplication;
import com.example.stockmarketapi.models.tickers.Ticker;
import com.example.stockmarketapi.models.tickers.TickerResults;
import com.example.stockmarketapi.repositories.TickerRepository;
import com.example.stockmarketapi.repositories.TickerResultsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Service
public class TickerService {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    TickerResultsRepository tickerResultsRepository;

    @Autowired
    TickerRepository tickerRepository;

    private static final Logger logger = LoggerFactory.getLogger(StockMarketApiApplication.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    //Stores 1000 ETF stocks into the ticker database
    public TickerResults saveETFTickers() {
        try {
        TickerResults tickerResults = restTemplate.getForObject(
                "https://api.polygon.io/v3/reference/tickers?type=ETF&market=stocks&active=true&sort=ticker&order=asc&limit=1000&apiKey=bamxspsyOWyNVumgmrmxfo648Bq5A3OU", TickerResults.class
        );

        tickerResultsRepository.save(tickerResults);
        return tickerResults;
        } catch (RuntimeException e) {
            logger.info("Failed to Store Tickers: ");
        }
        return null;
    }

    //Stores 1000 ETF stocks into the ticker database
    public TickerResults saveTickers() {
        try {
            TickerResults tickerResults = restTemplate.getForObject(
                    "https://api.polygon.io/v3/reference/tickers?type=ETF&market=stocks&active=true&sort=ticker&order=asc&limit=1000&apiKey=bamxspsyOWyNVumgmrmxfo648Bq5A3OU", TickerResults.class
            );

            tickerResultsRepository.save(tickerResults);
            return tickerResults;
        } catch (RuntimeException e) {
            logger.info("Failed to Store Tickers: ");
        }
        return null;
    }

    public List<Ticker> getAllETFTickers() {
        return (tickerRepository.findAll());

    }

    public Ticker getETFById(Long id) {
        return (tickerRepository.findById(id).orElse(null));
    }

    public Ticker getETFByTickerSymbol(String ticker){
        logger.info("Found ETF: " + ticker);
        return tickerRepository.findTickerByName(ticker);
    }


}


