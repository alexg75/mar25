package com.version1.tgjco.mar25.client;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class ConsumerService {

    private final WebClient webClient;

    public ConsumerService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://localhost:9090").build();
    }

    public String getShuffleResponse() {
        return webClient.get()
                .uri("/shuffle")
                .retrieve()
                .bodyToMono(String.class)
                .block(); // Blocking for simplicity; avoid in reactive environments
    }

    public String getCard() {
        return webClient.get()
                .uri("/get-card")
                .retrieve()
                .bodyToMono(String.class)
                .block(); // Blocking for simplicity; avoid in reactive environments
    }
}
