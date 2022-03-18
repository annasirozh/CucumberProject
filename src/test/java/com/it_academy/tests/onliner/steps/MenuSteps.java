package com.it_academy.tests.onliner.steps;

import com.it_academy.onliner.driver.DriverManager;
import com.it_academy.onliner.pageobject.OnlinerHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class MenuSteps {
    private OnlinerHomePage onlinerHomePage =new OnlinerHomePage();
    Actions action = new Actions(DriverManager.getDriver());


    @Given("the user open Onliner website")
    public void userOpenOnlinerWebsite() {
       onlinerHomePage.openOnlinerWebsite();
    }

    @When("the user hover on the {string} sections")
    public void userHoverOnTheSections(String section) {
        action.moveToElement(onlinerHomePage.seeMenuSection(section)).perform();
    }

    @Then("submenu appears")
    public void userSeeThatSubmenuAppears() {
       assertThat(onlinerHomePage.seeSubmenuSections()).isTrue();
    }

    @Then("the brand category is displayed")
    public void userSeeBrandCategoryIsDisplayed(List<String> brandList) {
        assertThat(onlinerHomePage.getValuesTitleSubmenuSectioins())
                .as("Brand title is not displayed")
                .containsAll(brandList);
        System.out.println(onlinerHomePage);
         brandList.stream().forEach(link -> System.out.println("brand display: " + link));
    }
    @Then("the city category is displayed")
    public void the_city_category_is_displayed(List<String> cityList) {
        assertThat(onlinerHomePage.getValuesTitleSubmenuSectioins())
                .as("City title is not displayed")
                .containsAll(cityList);
        System.out.println(onlinerHomePage);
        cityList.stream().forEach(link -> System.out.println("city display: " + link));
    }

    @Then("the rooms category is displayed")
    public void the_rooms_category_is_displayed(List<String> roomList) {
        assertThat(onlinerHomePage.getValuesTitleSubmenuSectioins())
                .as("Room title is not displayed")
                .containsAll(roomList);
        System.out.println(onlinerHomePage);
        roomList.stream().forEach(link -> System.out.println("room display: " + link));
    }


}
