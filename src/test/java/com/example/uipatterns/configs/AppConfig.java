package com.example.uipatterns.configs;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties
@Data
public class AppConfig {

    String browser;

    String basePath;
}
