package com.example.uipatterns.pages;

import com.example.uipatterns.configs.AppConfig;
import com.example.uipatterns.configs.TestConfig;
import com.example.uipatterns.services.WebDriverService;
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

    private static final AppConfig appConfig = TestConfig.getContext().getBean(AppConfig.class);
    private final static String BROWSER = appConfig.getBrowser();
    private final static String BASIC_PATH = appConfig.getBasePath();
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
    protected WebDriver webDriver;

    public BasePage() {
        this.webDriver = WebDriverService.getWebDriver(BROWSER);
    }

    protected void initElements() {
        PageFactory.initElements(webDriver, this);
    }

    protected void close() {
        webDriver.quit();
    }

    protected void refresh() {
        webDriver.navigate().refresh();
    }

    protected void back() {
        webDriver.navigate().back();
    }

    protected void forward() {
        webDriver.navigate().forward();
    }

    public void open(String url) {
        webDriver.get(url);
    }

    protected String getTitle() {
        return webDriver.getTitle();
    }
}
