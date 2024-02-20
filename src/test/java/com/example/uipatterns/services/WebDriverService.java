package com.example.uipatterns.services;

import com.example.uipatterns.configs.AppConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.Data;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.ConfigDataApplicationContextInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;

@Data
public class WebDriverService {

    private WebDriver webDriver;

    public WebDriverService(String browser){

        this.webDriver = WebDriverManager.getInstance(browser).create();
    }

}
