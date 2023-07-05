package com.adha.dhp.loancalculator.resolver;

import com.adha.dhp.loancalculator.model.HelloWorld;
import com.adha.dhp.loancalculator.service.HelloWorldService;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class DataFetcherTest {
    private final HelloWorldService service = mock(HelloWorldService.class);
    private final DataFetcher dataFetcher = new DataFetcher(service);

    @Test
    void getHelloWorld() {
        when(service.helloWorld()).thenReturn(new HelloWorld("hello world!"));
        HelloWorld actualObject = dataFetcher.helloWorld();
        String expectedMessage = "hello world!";
        assertThat(actualObject.getMessage(), equalTo(expectedMessage));
    }
 }

