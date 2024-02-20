package com.example.uipatterns.steps;

import com.example.uipatterns.pages.LoginPage;
import io.cucumber.java.en.Given;
import lombok.extern.log4j.Log4j2;

import static org.assertj.core.api.Assertions.assertThat;


@Log4j2

public class UISteps extends BasicSteps {

    LoginPage loginPage;

    public UISteps(LoginPage loginPage) {
        this.loginPage = loginPage;
    }

    @Given("user navigate to login page")
    public void userNavigateToLoginPage() {

        String title = loginPage.getWebDriver().getTitle();
        log.info("Page title is: {}", title);
        assertThat(title).isEqualTo("Hands-On Selenium WebDriver with Java");

        String head = loginPage.getHead().getText();
        log.info("Page head is: {}", head);
        assertThat(head).isEqualTo("Hands-On Selenium WebDriver with Java");

        String githubLink = loginPage.getGithubLink().getAttribute("href");
        log.info("Link to github head is: {}", githubLink);
        assertThat(githubLink).isEqualTo("https://github.com/bonigarcia/selenium-webdriver-java");

    }
}
