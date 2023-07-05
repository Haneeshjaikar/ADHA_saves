package com.adha.dhp.loancalculator.config;

import com.adha.dhp.azure.blob.service.DocumentFetchService;
import com.adha.dhp.azure.blob.service.DocumentStoreService;
import com.adha.dhp.loancalculator.exception.DHPException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.flogger.Flogger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.io.IOException;
import java.util.Map;

@Component
@Flogger
public class AzureConfigFetcher {

    private final DocumentFetchService documentFetchService;
    private final DocumentStoreService documentStoreService;
    private final ObjectMapper objectMapper;

    @Value("${available-blobstore.globalConfigPath}")
    private String globalConfigPath;

    public AzureConfigFetcher(DocumentFetchService documentFetchService, DocumentStoreService documentStoreService,
                              ObjectMapper objectMapper) {
        this.documentFetchService = documentFetchService;
        this.documentStoreService = documentStoreService;
        this.objectMapper = objectMapper;
    }

    public Map<String, Object> fetchConfig() {
        try {
            log.atInfo().log("Fetching Config from Azure");
            String url = documentStoreService.fetchURL(globalConfigPath);
            byte[] byteContent = documentFetchService.retrieveDocument(url);
            Map<String, Object> map = objectMapper.readValue(byteContent, Map.class);
            log.atInfo().log("Getting config from Azure %s ", map.toString());
            return map;
        } catch (IOException e) {
            log.atSevere().log("Getting error while fetching config.");
            throw new DHPException();
        }
    }
}
