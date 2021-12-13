package com.example.stockmarketapi.services;

import com.example.stockmarketapi.StockMarketApiApplication;
import com.example.stockmarketapi.models.tickernews.TickerNews;
import com.example.stockmarketapi.models.tickernews.TickerNewsResults;
import com.example.stockmarketapi.models.tickers.Ticker;
import com.example.stockmarketapi.models.tickers.TickerResults;
import com.example.stockmarketapi.repositories.TickerResultsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class TickerNewsService {

    @Autowired
    RestTemplate restTemplate;

//    @Autowired
//    TickerNewsResultsRepository tickerResultsRepository;

    private static final Logger logger = LoggerFactory.getLogger(StockMarketApiApplication.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

//    Stores Stock news to the tickerNews repo
//    public TickerNewsResults saveNewsByName() {
//        try {
//            TickerNewsResults data = restTemplate.getForObject(
//                    "https://api.polygon.io/v2/reference/news?ticker=AAPL&apiKey=bamxspsyOWyNVumgmrmxfo648Bq5A3OU", TickerNewsResults.class
//            );
//            tickerResultsRepository.save(data);
//            return data;
//        } catch (RuntimeException e) {
//            logger.info("Failed to Store News: ");
//        }
//        return null;
//    }

    public TickerNewsResults getNewsByTickerName(String name) {
        try {
            TickerNewsResults data = restTemplate.getForObject(
                    "https://api.polygon.io/v2/reference/news?ticker=" + name + "&apiKey=bamxspsyOWyNVumgmrmxfo648Bq5A3OU", TickerNewsResults.class);
            logger.info("The time is now {}", dateFormat.format(new Date()));
            logger.info(data.toString());
            //tickerRepository.save(details);
            data.setResults(data.getResults());
            return new TickerNewsResults(data.getResults());
        } catch (RuntimeException e) {
            logger.info("Failed to load News for Ticker: " + name);
        }
        return null;


    }
}
