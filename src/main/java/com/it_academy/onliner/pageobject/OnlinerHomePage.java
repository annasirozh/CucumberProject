package com.it_academy.onliner.pageobject;

import com.it_academy.onliner.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;

public class OnlinerHomePage extends BasePage {

    private static final String ONLINER_URL = "https://www.onliner.by/";
    private static final String TEXT_PATTERN = "%s[contains(text(), '%s')]";
    private static final String MENU_SECTIONS = "//*[contains(@class,'b-main-navigation__text')]";
    private static final String SUBMENU_SECTIONS = "//*[contains(@class,'b-main-navigation__dropdown')]";
    private static final String TITLE_SUBMENU_SECTIONS =
            "//*[contains(@class,'b-main-navigation__dropdown-column')]//*[contains(@class,'b-main-navigation__dropdown-advert-list')]//*[contains(@class,'b-main-navigation__dropdown-advert-item')]//*[contains(@class,'b-main-navigation__dropdown-advert-sign')]";

    public void openOnlinerWebsite() {
        DriverManager.getDriver().get(ONLINER_URL);
    }

    public WebElement seeMenuSection(String linkText) {
        return findElement(By.xpath(format(TEXT_PATTERN, MENU_SECTIONS, linkText)));
    }

    public boolean seeSubmenuSections() {
        return isElementDisplayed(By.xpath(SUBMENU_SECTIONS));
    }

    public List<String> getValuesTitleSubmenuSectioins() {
        List<String> valuesTitleSubmeuSections=new ArrayList<>();
        List<WebElement> webElements = findElements(By.xpath(TITLE_SUBMENU_SECTIONS));
       for(WebElement element:webElements){
           valuesTitleSubmeuSections.add(element.getText());
       }
        return valuesTitleSubmeuSections;
    }
}