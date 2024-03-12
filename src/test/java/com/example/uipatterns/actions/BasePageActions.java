package com.example.uipatterns.actions;

import com.example.uipatterns.pages.BasePage;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import static org.assertj.core.api.Assertions.assertThat;

@Log4j2
@Component
public class BasePageActions {
    public void assertBasePageElements(BasePage basePage){
        String title = basePage.getWebDriver().getTitle();
        assertThat(title).isEqualTo("Hands-On Selenium WebDriver with Java");

        String head = basePage.getHead().getText();
        assertThat(head).isEqualTo("Hands-On Selenium WebDriver with Java");

        String subHead = basePage.getSubhead().getText();
        assertThat(subHead).isEqualTo("Practice site");

        String githubLink = basePage.getGithubLink().getAttribute("href");
        assertThat(githubLink).isEqualTo("https://github.com/bonigarcia/selenium-webdriver-java");

        boolean isDisplayed = basePage.getHorizontalRule().isDisplayed();
        assertThat(isDisplayed).isTrue();

        String footerText = basePage.getFooterText().getText();
        assertThat(footerText).isEqualTo("Copyright © 2021-2023 Boni García");

        String footerLink = basePage.getFooterLink().getAttribute("href");
        assertThat(footerLink).isEqualTo("https://bonigarcia.dev/");
    }
}
