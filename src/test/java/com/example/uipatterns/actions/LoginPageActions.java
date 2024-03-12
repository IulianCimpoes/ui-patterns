package com.example.uipatterns.actions;

import com.example.uipatterns.pages.LoginPage;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.assertj.core.api.Assertions.assertThat;

@Component
public class LoginPageActions {

    @Autowired
    LoginPage loginPage;

    public void assertLoginPageElements(){

        WebElement loginForm = loginPage.getLoginForm();
        assertThat(loginForm.getText()).isEqualTo("Login form");
        assertThat(loginForm.isDisplayed()).isTrue();

        WebElement usernameLabel = loginPage.getUsernameLabel();
        assertThat(usernameLabel.getText()).isEqualTo("Login");
        assertThat(usernameLabel.isDisplayed()).isTrue();

        WebElement passwordLabel = loginPage.getPasswordLabel();
        assertThat(passwordLabel.getText()).isEqualTo("Password");
        assertThat(passwordLabel.isDisplayed()).isTrue();
    }
}
