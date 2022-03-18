package com.it_academy.onliner.pageobject;

import com.it_academy.onliner.driver.DriverManager;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(DriverManager.getDriver(), this);
    }
    public WebElement findElement(By by) {
        return DriverManager.getDriver().findElement(by);
    }
    public List<WebElement> findElements(By by){
        return  DriverManager.getDriver().findElements(by);
    }
    public boolean isElementDisplayed(By by){return !findElements(by).isEmpty();}
}
