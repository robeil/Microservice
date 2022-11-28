package com.robeil.currencyexchangeservice.service;

import com.robeil.currencyexchangeservice.entity.CurrencyExchange;

public interface CurrencyExchangeService {

     CurrencyExchange findByFromAndTo(String from, String to);
}
