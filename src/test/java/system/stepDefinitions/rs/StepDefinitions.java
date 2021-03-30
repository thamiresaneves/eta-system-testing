package system.stepDefinitions.rs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

//    @Given("the user is on signup page")
//    public void signOutRoute() {
//        System.out.println("Step definition without arguments");
//    }
//
//    @When("{string}, {int}, {string}, {string} are filled")
//    public void fillFormFields(String string, Integer int1, String string2, String string3) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//    @When("clicks on button *")
//    public void click() {
//        System.out.println("Step definition without arguments");
//    }
//
//    @Then("a {string} should be displayed")
//    public void displayMessage(String string) {
//
//    }

    //TeacherExamples #01

    @Given("the user accessed the application")
    public void accessApplication() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }
    @When("the user sets the name as {string}")
    public void fillNameField(String string) {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }
    @When("the user sets the e-mail as {string}")
    public void fillEmailField(String string) {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }
    @When("the user sets the password as {int}")
    public void fillPasswordField(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }
    @When("the user clicks on cadastrar button")
    public void clickOnCadastrarButton() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }
    @Then("the user should be added successfully")
    public void displaySuccessMessage() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }

}
