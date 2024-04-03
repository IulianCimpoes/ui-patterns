package com.example.uipatterns.steps;

import com.example.uipatterns.actions.BasePageActions;
import com.example.uipatterns.actions.LoginPageActions;
import com.example.uipatterns.context.ScenarioContext;
import com.example.uipatterns.pages.LoginPage;
import io.cucumber.java.en.Given;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;


@Log4j2
public class LoginPageSteps extends BasicSteps {

    @Autowired
    BasePageActions basePageActions;

    @Autowired
    LoginPageActions loginPageActions;

    @Autowired
    ScenarioContext scenarioContext;

    LoginPage loginPage;

    public LoginPageSteps(LoginPage loginPage) {
        this.loginPage = loginPage;
    }

    @Given("user navigate to login page")
    public void userNavigateToLoginPage() {

        basePageActions.assertBasePageElements(loginPage);
        loginPageActions.openLoginPage();

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
