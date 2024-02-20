package com.example.uipatterns.pages;


import com.example.uipatterns.configs.AppConfig;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class LoginPage extends BasePage {
    final private static String URL = "login-form.html";

    public LoginPage() {
        this(URL);
    }

    @Autowired
    AppConfig appConfig;

    public LoginPage(String url) {
        super(url);
    }

    @FindBy(id = "username")
    WebElement username;

    @FindBy(className = "display-6")
    WebElement formName;
}
