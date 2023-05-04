package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.Home;
import starter.login.Login;

public class LoginSteps {
    @Steps
    Login login;

    @Steps
    Home home;

    @Given("I am on the login page")
    public void onTheLoginPage(){
        login.openUrl("https://www.saucedemo.com/");
        login.validateOnLoginPage();
    }
    @When("I enter valid username")
    public void enterValidUsername(){
        login.inputUsername("standard_user");
    }
    @And("I enter invalid password")
    public void enterInvalidPassword(){
        login.inputPassword("secret_sauce2222");
    }
    @And("I click login button")
    public void clickLoginButton(){
        login.ClickLoginButton();
    }
    @Then("I comeback to home page")
    public void onTheHomePage(){
        home.validateOnTheHomePage();
    }
    @Then("I stay on the login page")
    public void stayOnLogin(){
        home.validateNOTOnTheHomePage();
    }

    @When("I enter problem username")
    public void enterProblemUsername(){
        login.inputUsername("problem_user");
    }
    @And("I enter valid password")
    public void enterValidPassword(){
        login.inputPassword("secret_sauce");
    }

}
