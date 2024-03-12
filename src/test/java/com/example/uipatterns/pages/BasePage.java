package com.example.uipatterns.pages;

import com.example.uipatterns.configs.AppConfig;
import com.example.uipatterns.configs.TestConfig;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;

@Getter
@Setter
public class BasePage {

    @FindBy(className = "display-4")
    WebElement head;

    @FindBy(xpath = "//h5")
    WebElement subhead;

    @FindBy(tagName = "a")
    WebElement githubLink;

    @FindBy(xpath = "/html/..//hr")
    WebElement horizontalRule;

    @FindBy(xpath = "//footer//span")
    WebElement footerText;

    @FindBy(xpath = "//footer//span//a")
    WebElement footerLink;


    private WebDriver webDriver;

    private String basicPath;

    public BasePage(String url) {
        this.webDriver = TestConfig.getContext().getBean(WebDriver.class);
        this.basicPath = TestConfig.getContext().getBean(AppConfig.class).getBasePath();
        this.webDriver.get(basicPath + url);
        PageFactory.initElements(webDriver, this);
    }
}
