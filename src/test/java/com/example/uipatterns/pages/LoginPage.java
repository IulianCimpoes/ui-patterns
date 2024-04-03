package com.example.uipatterns.pages;


import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class LoginPage extends BasePage {
    final private static String URL = "login-form.html";
    @FindBy(id = "username")
    WebElement username;
    @FindBy(xpath = "//h1[@class='display-6']")
    WebElement loginForm;
    @FindBy(xpath = "//label[contains(.,'Login')]")
    WebElement usernameLabel;
    @FindBy(xpath = "//label[contains(.,'Password')]")
    WebElement passwordLabel;

    public LoginPage() {
        super();
        initElements();
    }


}
