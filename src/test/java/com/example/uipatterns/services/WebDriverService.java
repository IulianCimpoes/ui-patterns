package com.example.uipatterns.services;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class WebDriverService {

    private static WebDriver webDriver;

    public static WebDriver getWebDriver(String browser) {
//        WebDriverManager.chromedriver().clearDriverCache().setup();
        if (webDriver == null) {
            webDriver = WebDriverManager.getInstance(browser).create();
        }
        return webDriver;
    }

}
