package org.sathiz.stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.sathiz.utils.DriverManager;
import org.sathiz.webelements.HomePageElements;

public class HomeSteps {
    WebDriver driver= DriverManager.getDriver();
    @Given("^I visit the site as a guest user$")
    public void i_visit_the_site_as_a_guest_user() {
        // Write code here that turns the phrase above into concrete actions
        HomePageElements elements=new HomePageElements(driver);




    }
    @When("I scroll the pages up and down the page to load dynamic elements completely")
    public void i_scroll_the_pages_up_and_down_the_page_to_load_dynamic_elements_completely() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I verify horizontal PROS panel is displayed on page")
    public void i_verify_horizontal_pros_panel_is_displayed_on_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("^I click random product from the panel$")
    public void i_click_random_product_from_the_panel() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
