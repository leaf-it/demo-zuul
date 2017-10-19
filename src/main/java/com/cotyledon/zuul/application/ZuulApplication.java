package com.cotyledon.zuul.application;

import com.cotyledon.zuul.filter.ErrorFilter;
import com.cotyledon.zuul.filter.PostDecoratorFilter;
import com.cotyledon.zuul.filter.PreFilter;
import com.cotyledon.zuul.filter.RoutingFilter;
import com.netflix.zuul.ZuulFilter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ZuulApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ZuulApplication.class).web(true).run(args);
    }

    @Bean
    public ZuulFilter perFiler() {
        return new PreFilter();
    }

    @Bean
    public ZuulFilter postFiler() {
        return new PostDecoratorFilter();
    }

    @Bean
    public ZuulFilter routingFiler() {
        return new RoutingFilter();
    }

    @Bean
    public ZuulFilter errorFiler() {
        return new ErrorFilter();
    }


}
