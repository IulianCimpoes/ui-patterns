package com.example.uipatterns.actions;

import com.example.uipatterns.pages.HomePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HomePageActions {

    @Autowired
    HomePage homePage;

    public void openHomePage() {
        homePage.open("https://bonigarcia.dev/selenium-webdriver-java/");
    }
}
