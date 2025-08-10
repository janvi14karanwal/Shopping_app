package com.shopping.cart.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Bean
public WebClient.Builder webClientBuilder(){
   return WebClient.builder();
}
//This allows you to inject WebClient.Builder anywhere in your app.

}
