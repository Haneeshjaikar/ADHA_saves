package com.adha.dhp.loancalculator.resolver;

import com.adha.dhp.loancalculator.model.HelloWorld;
import com.adha.dhp.loancalculator.service.HelloWorldService;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import lombok.AllArgsConstructor;

@DgsComponent
@AllArgsConstructor
public class DataFetcher {
    private final HelloWorldService service;

    @DgsQuery
    public HelloWorld helloWorld() {
        return service.helloWorld();
    }
}