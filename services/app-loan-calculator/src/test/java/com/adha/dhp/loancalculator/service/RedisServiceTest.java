package com.adha.dhp.loancalculator.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.data.redis.core.RedisTemplate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.springframework.data.redis.core.ValueOperations;
class RedisServiceTest {

    @Mock
    private RedisTemplate<String, Object> mockRedisTemplate;

    @Mock
    private ValueOperations<String, Object> mockValueOperations;

    private RedisService redisService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        when(mockRedisTemplate.opsForValue()).thenReturn(mockValueOperations);
        redisService = new RedisService(mockRedisTemplate);
    }

    @Test
     void testPut() {
        String key = "myKey";
        Object value = "myValue";
        redisService.put(key, value);
        verify(mockValueOperations).set(key, value);
    }

    @Test
    void testGet() {
        String key = "myKey";
        Object expectedValue = "myValue";
        when(mockValueOperations.get(key)).thenReturn(expectedValue);
        Object actualValue = redisService.get(key);
        verify(mockValueOperations).get(key);
        assertEquals(expectedValue, actualValue);
    }
}
