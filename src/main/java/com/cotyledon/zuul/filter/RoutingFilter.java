/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cotyledon.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import org.springframework.stereotype.Component;

/**
 * @author leaf
 */
@Component
public class RoutingFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "routing";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        System.out.println("--------------hi,  i am  a routingFilter");
        return "hi,  i am  a routingFilter";
    }
}
