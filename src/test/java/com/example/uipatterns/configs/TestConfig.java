package com.example.uipatterns.configs;

import com.example.uipatterns.services.WebDriverService;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.ConfigDataApplicationContextInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;

@Configuration
@ComponentScan(basePackages = {"com.example.uipatterns.services", "com.example.uipatterns.pages",
        "com.example.uipatterns.configs"})
@EnableConfigurationProperties(value = AppConfig.class)
@ContextConfiguration(initializers = ConfigDataApplicationContextInitializer.class)
public class TestConfig implements ApplicationContextAware {

    static ApplicationContext applicationContext = null;

    @Autowired
    AppConfig appConfig;

    public static ApplicationContext getContext() {
        return applicationContext;
    }

    public void setApplicationContext(ApplicationContext context) throws BeansException {
        applicationContext = context;
    }

    @Bean
    public WebDriver webDriver() {

        return (new WebDriverService(appConfig.getBrowser())).getWebDriver();
    }
}
