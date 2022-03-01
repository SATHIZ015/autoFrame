@home
Feature: Home Page Functionalities verification

  @pros
    #beforescenario
    #home page url + device
  Scenario: Verify display of PROS panel on Home page as a guest user
    #home page URL
    Given I visit the site as a guest user
    #scroll the page
    When I scroll the pages up and down the page to load dynamic elements completely
    #verify the panel
    Then I verify horizontal PROS panel is displayed on page
    #AfterScenario

  @pros
  Scenario: Verify the horizontal PROS panel on Home page as a guest user
    Given I visit the site as a guest user
    When I scroll the pages up and down the page to load dynamic elements completely
    Then I verify horizontal PROS panel is displayed on page
    And I click random product from the panel