package com.example.uipatterns.steps;

import com.example.uipatterns.context.ScenarioContext;
import io.cucumber.java.en.Given;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@Log4j2
public class CommonSteps extends BasicSteps{
    @Autowired
    ScenarioContext scenarioContext;

    @Given("user access something saved in scenario context")
    public void userAccessScenarioContext() {

        String key = "someNewKey";

        Optional<String> value = scenarioContext.getFromScenarioContext(key);
//       String value = scenarioContext.getFromScenarioContext(key).get();
        String v= value.get();

        log.info("Extract a key previously saved in scenario context -  key: {} value: {}", key, v);


    }

    @Given("log something to see log")
    public void logSomethingToSeeLog() {
        log.info("Just a message to be printed in logs");
    }
}

