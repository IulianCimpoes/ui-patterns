package com.example.uipatterns.steps;

import com.example.uipatterns.actions.BasePageActions;
import com.example.uipatterns.actions.HomePageActions;
import com.example.uipatterns.pages.HomePage;
import io.cucumber.java.en.Given;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

@Log4j2
public class HomePageSteps extends BasicSteps {

    @Autowired
    BasePageActions basePageActions;

    @Autowired
    HomePageActions homePageActions;

    HomePage homePage;

    public HomePageSteps(HomePage homePage) {
        this.homePage = homePage;
    }

    @Given("user navigate to home page")
    public void userNavigateToHomePage() {
        homePageActions.openHomePage();

        String firstLeadText = homePage.getFirstLeadText().getText();
        assertThat(firstLeadText).isEqualTo("This site contains a collection of sample web pages to be tested with Selenium WebDriver. Check out the O'Reilly book and the source code on GitHub.");
    }
}
