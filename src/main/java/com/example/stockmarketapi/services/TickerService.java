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


//    public TickerResults getTickerByName(String name) {
//        try {
//            TickerResults details = restTemplate.getForObject(
//                    "https://api.polygon.io/v3/reference/tickers?ticker=" + name + "&apiKey=bamxspsyOWyNVumgmrmxfo648Bq5A3OU", TickerResults.class);
//            logger.info("The time is now {}", dateFormat.format(new Date()));
//            logger.info("Found Ticker: " + name);
//            return details;
//
//        } catch (RuntimeException e) {
//            logger.info("Failed to Load Ticker: " + name);
//        }
//        return null;
//    }

    //https://api.polygon.io/v3/reference/tickers?ticker=MSFT&active=true&sort=ticker&order=asc&limit=10&apiKey=bamxspsyOWyNVumgmrmxfo648Bq5A3OU

}


//    public Set<Ticker> saveTickers() {
//        TickerResults data = restTemplate.getForObject(
//                "https://api.polygon.io/v3/reference/tickers?type=ETF&market=stocks&active=true&sort=ticker&order=asc&limit=1000&apiKey=bamxspsyOWyNVumgmrmxfo648Bq5A3OU", TickerResults.class
//        );
//        System.out.println(data);
//        Set<Ticker> tickers = data.getResults();
//        for (Ticker ticker : data.getResults()) {
//            ticker.setId(ticker.getId());
//            ticker.setTicker(ticker.getTicker());
//            ticker.setName(ticker.getName());
//            ticker.setMarket(ticker.getMarket());
//            ticker.setLocale(ticker.getLocale());
//            ticker.setPrimary_exchange(ticker.getPrimary_exchange());
//            ticker.setType(ticker.getType());
//            ticker.setActive(ticker.getActive());
//            ticker.setCurrency_name(ticker.getCurrency_name());
//            ticker.setCik(ticker.getCik());
//            ticker.setComposite_figi(ticker.getComposite_figi());
//            ticker.setShare_class_figi(ticker.getShare_class_figi());
//            ticker.setLast_updated_utc(ticker.getLast_updated_utc());
//        }
//        tickerRepository.saveAll(tickers);
//        return tickers;
//    }
