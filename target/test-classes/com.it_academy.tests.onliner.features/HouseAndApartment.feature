Feature: As a user I want to hover over the menu "Дома и квартиры" and see submenu with
  categories: city,rooms

  @smokes
  Scenario:Submenu of sections "Дома и квартиры" should contains categories: city,rooms
    Given the user open Onliner website
    When the user hover on the "Дома и квартиры" sections
    Then submenu appears
    And the city category is displayed
      |Минск|
      |Брест|
      |Витебск|
      |Гомель|
      |Гродно|
      |Могилев|
    And the rooms category is displayed
      |1-комнатные|
      |2-комнатные|
      |3-комнатные|
      |4+-комнатные|