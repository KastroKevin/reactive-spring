package com.kastro.react.controller;

import com.kastro.react.model.CoinBaseResponse;
import com.kastro.react.service.CoinbaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("coin/price/v1")
public class PriceController {

    @Autowired
    private CoinbaseService coinbaseService;

    @GetMapping("/{name}")
    Mono<CoinBaseResponse> gerPrice(@PathVariable String name){
      return coinbaseService.getCryptoPrice(name);
    }}