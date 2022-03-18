Feature: As a user I want to hover over the menu "Автобарахолка" and see submenu with
  categories: brand

  @smokes
  Scenario:Submenu of sections "Автобарахолка" should contains categories: brand
    Given the user open Onliner website
    When the user hover on the "Автобарахолка" sections
    Then submenu appears
    And the brand category is displayed
      |Audi|
      |BMW|
      |Citroen|
      |Ford|
      |Mazda|
      |Mercedes-Benz|