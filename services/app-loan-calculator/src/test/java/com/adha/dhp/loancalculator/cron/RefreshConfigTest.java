package com.adha.dhp.loancalculator.cron;

import com.adha.dhp.loancalculator.config.AzureConfigFetcher;
import com.adha.dhp.loancalculator.service.RedisService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.HashMap;
import java.util.Map;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.anyString;
import static org.mockito.Mockito.any;

class RefreshConfigTest {

    @Mock
    private AzureConfigFetcher azureConfigFetcher;

    @Mock
    private RedisService redisService;

    private RefreshConfig refreshConfig;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
        refreshConfig = new RefreshConfig(azureConfigFetcher, redisService);
    }

    @Test
    void testRefreshConfig_Success() {
        Map<String, Object> configData = new HashMap<>();
        configData.put("key1", "value1");
        configData.put("key2", "value2");

        when(azureConfigFetcher.fetchConfig()).thenReturn(configData);
        refreshConfig.refreshConfig();

        verify(azureConfigFetcher, times(1)).fetchConfig();
        verify(redisService, times(1)).put("key1", "value1");
        verify(redisService, times(1)).put("key2", "value2");
    }

    @Test
    void testRefreshConfig_Exception() {
        when(azureConfigFetcher.fetchConfig()).thenThrow(RuntimeException.class);
        refreshConfig.refreshConfig();

        verify(azureConfigFetcher, times(1)).fetchConfig();
        verify(redisService, never()).put(anyString(), any());
    }
}
