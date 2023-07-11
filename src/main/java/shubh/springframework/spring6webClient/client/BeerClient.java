package shubh.springframework.spring6webClient.client;

import com.fasterxml.jackson.databind.JsonNode;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import shubh.springframework.spring6webClient.model.BeerDto;

import java.util.Map;

public interface BeerClient {
    Flux<String> listBeers();

    Flux<Map> listBeerMap();

    Flux<JsonNode> listBeersJsonNode();

    Flux<BeerDto> listBeerDtos();

    Mono<BeerDto> getBeerById(String id);
}
