package uk.co.expedia.cucumber.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.co.expedia.pages.FlightSearchPage;
import uk.co.expedia.pages.HomePage;
import uk.co.expedia.pages.SearchResultPage;

public class FlightSteps {

    @When("^I click on Flights link$")
    public void iClickOnFlightsLink() {
        new HomePage().clickOnFlightLink();
    }

    @Then("^I should be on Flights page$")
    public void iShouldBeOnFlightsPage() {
        new FlightSearchPage().verifySearchFlightsText("Search Flights");
    }

    @When("^I click on Flights Tab$")
    public void iClickOnFlightsTab() {
        new HomePage().clickOnFlightTab();
    }

    @And("^I enter origin \"([^\"]*)\"$")
    public void iEnterOrigin(String origin) {
        new FlightSearchPage().sendTextToFlyingFrom(origin);
    }

    @And("^I enter destination \"([^\"]*)\"$")
    public void iEnterDestination(String destination) {
        new FlightSearchPage().sendTextToGoingTo(destination);
    }

    @And("^I enter departing date \"([^\"]*)\"$")
    public void iEnterDepartingDate(String departDate) {
        new FlightSearchPage().sendTextToDepartingDate(departDate);
    }

    @And("^I enter returning date \"([^\"]*)\"$")
    public void iEnterReturningDate(String returnDate) {
        new FlightSearchPage().sendTextToReturningDate(returnDate);
    }

    @And("^I select number of adults travelling$")
    public void iSelectNumberOfAdultsTravelling() {
        new FlightSearchPage().clickOnTravellerField();
        new FlightSearchPage().addAdultTravellers();
    }

    @And("^I select number of children travelling and their age$")
    public void iSelectNumberOfChildrenTravellingAndTheirAge() {
        new FlightSearchPage().addChildrenTraveller();
        new FlightSearchPage().selectChildrenAge("6");
    }

    @And("^I click on Search button$")
    public void iClickOnSearchButton() {
        new FlightSearchPage().clickOnSearchBtn();
    }

    @Then("^I should see \"([^\"]*)\" for my chosen destination$")
    public void iShouldSeeForMyChosenDestination(String resultMessage) {
        new SearchResultPage().verifyDestinationText(resultMessage);
    }

}
