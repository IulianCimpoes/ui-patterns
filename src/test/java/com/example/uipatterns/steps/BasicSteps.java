package com.example.uipatterns.steps;

import com.example.uipatterns.configs.AppConfig;
import com.example.uipatterns.configs.TestConfig;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = TestConfig.class)
//@EnableAutoConfiguration
public class BasicSteps {
}
