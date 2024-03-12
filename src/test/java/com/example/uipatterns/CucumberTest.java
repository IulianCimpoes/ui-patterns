package com.example.uipatterns;

import com.epam.reportportal.junit5.ReportPortalExtension;
import com.example.uipatterns.configs.AppConfig;
import io.cucumber.junit.platform.engine.Cucumber;
import io.cucumber.junit.platform.engine.CucumberTestEngine;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.example.uipatterns.steps")

@ExtendWith(ReportPortalExtension.class)
public class CucumberTest {
}
