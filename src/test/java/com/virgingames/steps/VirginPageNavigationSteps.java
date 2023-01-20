package com.virgingames.steps;

import com.virgingames.pages.HomePage;
import com.virgingames.pages.LiveCasinoPage;
import com.virgingames.pages.OnlineSlotsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VirginPageNavigationSteps {

    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }


    @When("^I accept all cookies$")
    public void iAcceptAllCookies() {
        new HomePage().manageCookies();
    }

    @And("^I click on online slots tab$")
    public void iClickOnOnlineSlotsTab() {
        new HomePage().clickOnOnlineSlotsTab();
    }

    @Then("^I should be navigated to online slots page$")
    public void iShouldBeNavigatedToOnlineSlotsPage() {
        new OnlineSlotsPage().verifyUserIsOnOnlineSlotsPage("Play Online Slots at Virgin Games");
    }


    @And("^I click on live casino tab$")
    public void iClickOnLiveCasinoTab() {
        new HomePage().clickOnLiveCasinoTab();
    }

    @Then("^I should be navigated to live casino page$")
    public void iShouldBeNavigatedToLiveCasinoPage() {
        new LiveCasinoPage().verifyUserIsOnLiveCasinoPage("Try Live Casino - Live Action Dealers & Selection of Games");
    }
}
