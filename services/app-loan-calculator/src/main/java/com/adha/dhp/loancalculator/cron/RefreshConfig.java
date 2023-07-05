//package com.adha.dhp.loancalculator.cron;
//
//import com.adha.dhp.loancalculator.config.AzureConfigFetcher;
//import com.adha.dhp.loancalculator.constants.DomainCodes;
//import com.adha.dhp.loancalculator.service.RedisService;
//import com.adha.dhp.logging.logger.LogService;
//import lombok.extern.flogger.Flogger;
//import org.springframework.http.HttpStatus;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//import java.util.Map;
//
//@Component
//@Flogger
//public class RefreshConfig {
//
//    private final AzureConfigFetcher azureConfigFetcher;
//    private RedisService redisService;
//    LogService logger = LogService.getLoggerInstance(String.valueOf(DomainCodes.MS));
//
//    public RefreshConfig(AzureConfigFetcher azureConfigFetcher, RedisService redisService) {
//        this.azureConfigFetcher = azureConfigFetcher;
//        this.redisService = redisService;
//    }
//
//    @Scheduled(fixedRateString = "${refresh-interval}")
//    public void refreshConfig() {
//        try {
//            log.atInfo().log("Fetching Config from Azure");
//            logger.log("Fetching Config from Azure", String.valueOf(HttpStatus.OK), null, null );
//            Map<String, Object> redisStore = azureConfigFetcher.fetchConfig();
//            log.atInfo().log("Putting data in redis config");
//            redisStore.keySet().forEach(item ->
//                    redisService.put(item, redisStore.get(item)));
//        } catch(Exception e) {
//            log.atSevere().log(String.format("Something went wrong: %s", e.getMessage()));
//        }
//    }
//}