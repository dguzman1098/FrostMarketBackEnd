package com.example.stockmarketapi.repositories;

import com.example.stockmarketapi.models.tickers.Ticker;
import com.example.stockmarketapi.models.tickers.TickerResults;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TickerRepository extends JpaRepository<Ticker, Long> {

    @Query("SELECT t FROM Ticker t WHERE t.ticker LIKE ?1% ")
    Ticker findTickerByName(String ticker);

}
