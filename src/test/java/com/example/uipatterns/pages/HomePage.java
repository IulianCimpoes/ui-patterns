package com.example.uipatterns.pages;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
@Getter
@Setter
public class HomePage extends BasePage{

    public HomePage(){
        super();
        initElements();
    }

    @FindBy(xpath = "//p[@class='lead']")
    WebElement firstLeadText;


}
