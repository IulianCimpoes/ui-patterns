package com.example.uipatterns.actions;

import com.example.uipatterns.pages.LoginPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class LoginPageActions {

    @Autowired
    LoginPage loginPage;

    public void openLoginPage() {

        loginPage.open("https://bonigarcia.dev/selenium-webdriver-java/login-form.html");

    }
}
