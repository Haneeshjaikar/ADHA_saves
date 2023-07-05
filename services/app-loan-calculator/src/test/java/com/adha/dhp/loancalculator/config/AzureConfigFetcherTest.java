package com.adha.dhp.loancalculator.config;

import com.adha.dhp.azure.blob.service.DocumentFetchService;
import com.adha.dhp.azure.blob.service.DocumentStoreService;
import com.adha.dhp.loancalculator.exception.DHPException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.util.ReflectionTestUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

class AzureConfigFetcherTest {

    @Mock
    private DocumentFetchService documentFetchService;

    @Mock
    private DocumentStoreService documentStoreService;

    @Mock
    private ObjectMapper objectMapper;

    private AzureConfigFetcher azureConfigFetcher;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        azureConfigFetcher = new AzureConfigFetcher(documentFetchService, documentStoreService, objectMapper);
    }

    @Test
    void testFetchConfig() throws IOException, JSONException {
        String url = "http://example.com/config";
        byte[] byteContent = "{\"key1\":\"value1\",\"key2\":\"value2\"}".getBytes();

        Map<String, Object> expectedConfig = new HashMap<>();
        expectedConfig.put("key1", "value1");
        expectedConfig.put("key2", "value2");
        ReflectionTestUtils.setField(azureConfigFetcher, "globalConfigPath", url);

        when(documentStoreService.fetchURL(anyString())).thenReturn(url);
        when(documentFetchService.retrieveDocument(url)).thenReturn(byteContent);
        when(objectMapper.readValue(byteContent, Map.class)).thenReturn(expectedConfig);

        Map<String, Object> actualConfig = azureConfigFetcher.fetchConfig();

        verify(documentFetchService, times(1)).retrieveDocument(url);
        verify(objectMapper, times(1)).readValue(byteContent, Map.class);
        assertEquals(expectedConfig, actualConfig);
    }

    @Test
    void testFetchConfigIOException() throws IOException {
        String url = "http://example.com/config";
        byte[] byteContent = "config data".getBytes();
        ReflectionTestUtils.setField(azureConfigFetcher, "globalConfigPath", url);

        when(documentStoreService.fetchURL(anyString())).thenReturn(url);
        when(documentFetchService.retrieveDocument(anyString())).thenReturn(byteContent);
        when(objectMapper.readValue(byteContent, Map.class)).thenThrow(IOException.class);

        Executable executable = () -> {
            try {
                azureConfigFetcher.fetchConfig();
            } catch (DHPException e) {
                assertNull(e.getMessage());
                throw e;
            }
        };
        assertThrows(DHPException.class, executable);
    }
}