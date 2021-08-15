package com.example.gateway.config;

import com.example.gateway.filter.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Autowired
    private Filter filter;

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("authenticate-service",r->r.path("/authenticate/**").uri("lb://authenticate-service"))
                .route("first-service", r -> r.path("/one/**").filters(f -> f.filter(filter)).uri("lb://first-service"))
                .route("second-service", r -> r.path("/two/**").filters(f -> f.filter(filter)).uri("lb://second-service"))
                .build();
    }

}