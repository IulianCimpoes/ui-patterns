package com.example.uipatterns.steps;

import com.example.uipatterns.actions.BasePageActions;
import com.example.uipatterns.actions.LoginPageActions;
import com.example.uipatterns.pages.LoginPage;
import io.cucumber.java.en.Given;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;


@Log4j2
public class LoginPageSteps extends BasicSteps {

    @Autowired
    BasePageActions basePageActions;

    @Autowired
    LoginPageActions loginPageActions;

    LoginPage loginPage;

    public LoginPageSteps(LoginPage loginPage) {
        this.loginPage = loginPage;
    }

    @Given("user navigate to login page")
    public void userNavigateToLoginPage() {

        basePageActions.assertBasePageElements(loginPage);
        loginPageActions.assertLoginPageElements();


    }
}
