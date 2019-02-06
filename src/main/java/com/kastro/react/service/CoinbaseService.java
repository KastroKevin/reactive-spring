package com.kastro.react.service;

import com.kastro.react.model.CoinBaseResponse;
import com.kastro.react.model.Purchase;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CoinbaseService {
    Mono<CoinBaseResponse> getCryptoPrice(String priceName);

    Mono<Purchase> createPurchase(String priceName);

    Mono<Purchase> getPurchaseById(String id);

    Flux<Purchase> listAllPurchases();
}
