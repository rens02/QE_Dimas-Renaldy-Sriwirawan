package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Linkedln {

    @Steps
    starter.linkedln.Linkedln login;

    //Scenario: Verify user can create a new account
    @Given("I am in the Linkedln homepage")
    public void linkedlnHomepage(){

    }
    @When("I am click the Join now button")
    public void joinNowButton(){

    }

    @And("I am enter my first name")
    public void enterFirstName(){

    }

    @And("I am enter my last name")
    public void enterLastName(){

    }

    @And("I am enter my email address")
    public void enterMyEmail(){

    }

    @And("I am enter my password")
    public void enterMyPassword(){

    }

    @And("I am click the Agree & Join button")
    public void clickAgreeAndJoin(){

    }

    @Then("I am should have a new account on Linkedln")
    public void haveNewAccountLinkedln(){

    }

    //Scenario: Verify user login
    @Given("I am on the Linkedln homepage")
    public void thelinkedlnHomepage(){

    }

    @When("I am click the Sign in button")
    public void clickSignInButton(){

    }

    @And("I am enter email address")
    public void enterEmailAddress(){

    }

    @And("I am input my password")
    public void enterPass(){

    }

    @And("I am click the button Sign in")
    public void clickButtonSignIn(){

    }

    @Then("I am should be logged in to my account")
    public void loggedInAccount(){

    }

    //Scenario: Verify user search functionality

    @Given("I am logged in to my Linkedln account")
    public void loggedLinkedlnHomepage(){

    }

    @When("I am enter Quality Engineer in the search bar")
    public void enterKeywordTheSearchBar(){

    }

    @And("I am click the Search button")
    public void clickSearchBar(){

    }

    @Then("I am should see a list of results related to Quality Engineer")
    public void listResultRelateKeyword(){

    }

    //Scenario: Verify user profile page
    @Given("I am login into my Linkedln account")
    public void loginMyLinkedlnAccount(){

    }

    @When("I am click on my profile picture")
    public void clickMyProfilePicture(){

    }

    @And("I am click the View profile button")
    public void clickViewProfileButton(){

    }

    @Then("I am should be taken to my profile page")
    public void takenToMyProfilePage(){

    }

    @And("I am should see my name, headline, and summary information")
    public void shouldSeeInformation(){

    }

    //Scenario: Verify user network page
    @Given("I am logged in my Linkedln account")
    public void loggedMyLinkedlnAccount(){

    }

    @When("I am click on the My Network tab")
    public void clickMyNetworkTab(){

    }

    @Then("I am should be taken to the network page")
    public void takenTheNetworkPage(){

    }

    @And("I am should see suggestions for people to connect with")
    public void suggestionsPeopleToConnectWith(){

    }

    //Scenario: Verify that the user can create a new post
    @Given("I am accessed my LinkedIn account")
    public void accessedMyLinkedlnAccount(){

    }

    @When("I am click on the Start a post button")
    public void clickStartAPostButton(){

    }

    @And("I am type text in the post text field")
    public void typeTextThePostTextField(){

    }

    @And("I am click on the Post button")
    public void clickThePostButton(){

    }

    @Then("I am should see my new post on my feed")
    public void shouldSeeMyNewPostOnMyFeed(){

    }

    //Scenario: Verify that the user can react to a post by liking, commenting, or sharing

    @Given("I am signed into my Linkedln account")
    public void signedLinkedlnAccount(){

    }

    @And("there is a post on my feed")
    public void therePostMyFeed(){

    }

    @When("I am click on the Like button on the post")
    public void clickLikeButtonThePost(){

    }

    @And("I am type Great post in the comment text field")
    public void typeGreatPostInTheCommentTextField(){

    }

    @And("I am click on the Comment button")
    public void clickCommentButton(){

    }

    @And("I am click on the Share button")
    public void clickShareButton(){

    }

    @Then("I am should see the post on my activity feed")
    public void shouldSeePostMyActivityFeed(){

    }

    //Scenario: Verify that the user can edit their profile information
    @Given("I am access login My profile in to Linkedln")
    public void accessedLoginProfileInLinkedln(){

    }

    @When("I am click picture on profile")
    public void clickPictureOnProfile(){

    }

    @And("I am select the View profile button")
    public void selectTheViewProfileButton(){

    }

    @And("I am click on the Edit button on the About section")
    public void clickEditButtonAboutSection(){

    }

    @And("I am update my Headline to Quality Engineer")
    public void updateHeadline(){

    }

    @And("I am click on the Save button")
    public void clickSaveButton(){

    }

    @Then("I am should see my updated profile information")
    public void shouldSeeUpdateProfileInformation(){

    }

    //Scenario: Verify that the user can upload a new profile picture
    @Given("I am login in Linkedln account")
    public void loginInLinkedlnAccount(){

    }

    @When("I am click on Picture in my profile")
    public void clickOnPictureInMyProfile(){

    }

    @And("I am click on the Change photo button")
    public void clickChangePhotoButton(){

    }

    @And("I am select a new profile picture to upload")
    public void selectNewProfileToUpload(){

    }

    @And("I am selected the Save button")
    public void selectedSaveButton(){

    }

    @Then("I am should see my new profile picture on my profile page")
    public void shouldSeeMyNewProfileOnProfilePage(){

    }

    //Scenario: Verify that the user can search for jobs and apply to job postings
    @Given("I am accessed my LinkedIn profile by sign in")
    public void accessedLinkendlnProfileBySignIn(){

    }

    @When("I am click on the Jobs tab")
    public void clickTheJobsTab(){

    }

    @And("I am input Quality Engineer in the search box")
    public void inputKeywordInSearchBox(){

    }

    @And("I am select a job posting to view")
    public void selectJobPostingToView(){

    }

    @And("I am click on the Apply button")
    public void clickApplyButton(){

    }

    @And("I am fill out the job application form")
    public void fillOutJobApplicationForm(){

    }

    @And("I am click on the Submit button")
    public void clickSubmitButton(){

    }

    @Then("I am should see a confirmation message that my job application was submitted")
    public void shouldSeeConfirmationMessageWasSubmitted(){

    }
}
