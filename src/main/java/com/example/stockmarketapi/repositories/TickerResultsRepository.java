package com.example.stockmarketapi.repositories;

import com.example.stockmarketapi.models.tickers.TickerResults;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TickerResultsRepository extends JpaRepository<TickerResults, Long> {
}
