package com.example.vehiclemanage.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "cors")
@Data
public class CorsConfig {

    private String allowedOrigins = "*";
//    private String allowedMethods = "*";
//    private boolean allowCredentials = true;
//    private long maxAge = 1800;
}
