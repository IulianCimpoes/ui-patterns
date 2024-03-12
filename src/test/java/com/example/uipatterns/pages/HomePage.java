package com.example.uipatterns.pages;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class HomePage extends BasePage{
    final private static String URL = "";

    public HomePage(){
        this(URL);
    }
    public HomePage(String url) {
        super(url);
    }


}
