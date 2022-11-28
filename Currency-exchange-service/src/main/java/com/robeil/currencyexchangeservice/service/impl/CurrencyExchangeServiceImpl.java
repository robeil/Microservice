package com.robeil.currencyexchangeservice.service.impl;

import com.robeil.currencyexchangeservice.entity.CurrencyExchange;
import com.robeil.currencyexchangeservice.repository.CurrencyExchangeRepository;
import com.robeil.currencyexchangeservice.service.CurrencyExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrencyExchangeServiceImpl implements CurrencyExchangeService {

    @Autowired
    private CurrencyExchangeRepository repository;

    @Override
    public CurrencyExchange findByFromAndTo(String from, String to) {
        return repository.findCurrencyExchangeByFromAndTo(from,to);
    }
}
