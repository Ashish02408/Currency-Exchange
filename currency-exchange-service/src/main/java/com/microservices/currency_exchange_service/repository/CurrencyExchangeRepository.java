package com.microservices.currency_exchange_service.repository;

import com.microservices.currency_exchange_service.bean.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository
        extends JpaRepository<CurrencyExchange,Long> {
        CurrencyExchange findByFromAndTo(String From, String To);

}
