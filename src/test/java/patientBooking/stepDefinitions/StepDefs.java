package patientBooking.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;
import org.junit.Assert;
import patientBooking.pageObjects.HomePage;

public class StepDefs {
    private HomePage homePage = new HomePage();

    @Given("^User is on PatientBooking homepage$")
    public void user_is_on_PatientBooking_homepage() {
        // Write code here that turns the phrase above into concrete actions
        String homePageUrl = homePage.getHomePageUrl();
        Assert.assertThat(homePageUrl, Matchers.comparesEqualTo(homePage.getHomePageUrl()));
    }

    @When("^User clicks on Login button$")
    public void user_clicks_on_Login_button() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^User can see the homepage$")
    public void user_can_see_the_homepage() {
        // Write code here that turns the phrase above into concrete actions
    }
}
