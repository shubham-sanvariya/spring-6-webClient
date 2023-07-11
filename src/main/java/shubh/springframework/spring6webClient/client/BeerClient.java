package shubh.springframework.spring6webClient.client;

import com.fasterxml.jackson.databind.JsonNode;
import reactor.core.publisher.Flux;

import java.util.Map;

public interface BeerClient {
    Flux<String> listBeers();

    Flux<Map> listBeerMap();

    Flux<JsonNode> listBeersJsonNode();
}
