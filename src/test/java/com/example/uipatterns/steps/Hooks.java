package com.example.uipatterns.steps;


import com.example.uipatterns.configs.TestConfig;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;

@Log4j2
public class Hooks {
    private final WebDriver webDriver = TestConfig.getContext().getBean("webDriver", WebDriver.class);

    @Before(order = 1)
    public void doSomethingBefore() {
        log.info("Before all scenarios ->");
    }

    @Before(value = "@second")
    public void soSomethingElse(){
        log.info("Second before action");
    }

    @After
    public void closeWebDriver() {
        webDriver.close();
    }

}
