package com.kastro.react.controller;

import com.kastro.react.model.Purchase;
import com.kastro.react.service.CoinbaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/coin/purchase/v1")
public class PurchaseController {

    @Autowired
    private CoinbaseService coinbaseService;

    @PostMapping("/{name}")
    Mono<Purchase> createPurchase(@PathVariable("name") String name){
        return coinbaseService.createPurchase(name);
    }
}
