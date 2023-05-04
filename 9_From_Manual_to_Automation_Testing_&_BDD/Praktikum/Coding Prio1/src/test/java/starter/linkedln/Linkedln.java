package starter.linkedln;

import net.thucydides.core.annotations.Step;
public class Linkedln {

    //Scenario: Verify user can create a new account
    @Step("I am in the Linkedln homepage")
    public void linkedlnHomepage(){
        System.out.println("I am in the Linkedln homepage");
    }

    @Step("I am click the Join now button")
    public void joinNowButton(){
        System.out.println("I click the Join now button");
    }

    @Step("I am enter my first name")
    public void enterFirstName(){
        System.out.println("I enter my first name");
    }

    @Step("I am enter my last name")
    public void enterLastName(){
        System.out.println("I enter my last name");
    }

    @Step("I am enter my email address")
    public void enterMyEmail(){
        System.out.println("I enter my email address");
    }

    @Step("I am enter my password")
    public void enterMyPassword(){
        System.out.println("I enter my password");
    }

    @Step("I am click the Agree & Join button")
    public void clickAgreeAndJoin(){
        System.out.println("I click the Agree & Join button");
    }

    @Step("I am should have a new account on Linkedln")
    public void haveNewAccountLinkedln(){
        System.out.println("I should have a new account on Linkedln");
    }

    //Scenario: Verify user login

    @Step("I am on the Linkedln homepage")
    public void thelinkedlnHomepage(){
        System.out.println("I am on the Linkedln homepage");

    }

    @Step("I am click the Sign in button")
    public void clickSignInButton(){
        System.out.println("I click the Sign in button");

    }

    @Step("I am enter email address")
    public void enterEmail(){
        System.out.println("I enter email address");

    }

    @Step("I am input password")
    public void inputPassword(){
        System.out.println("I input password");

    }

    @Step("I am click the button Sign in")
    public void clickButtonSignIn(){
        System.out.println("I click the button Sign in");

    }

    @Step("I am should be logged in to my account")
    public void loggedInAccount(){
        System.out.println("I should be logged in to my account");

    }

    //Scenario: Verify user search functionality
    @Step("I am logged in to my Linkedln account")
    public void loggedLinkedlnHomepage(){
        System.out.println("I am logged in to my Linkedln account");

    }

    @Step("I am enter Quality Engineer in the search bar")
    public void enterKeywordTheSearchBar(){
        System.out.println("I am enter Quality Engineer in the search bar");

    }

    @Step("I am click the Search button")
    public void clickSearchBar(){
        System.out.println("I am click the Search button");

    }

    @Step("I am should see a list of results related to Quality Engineer")
    public void listResultRelateKeyword(){
        System.out.println("I am should see a list of results related to Quality Engineer");

    }

    //Scenario: Verify user profile page
    @Step("I am login into my Linkedln account")
    public void loginMyLinkedlnAccount(){
        System.out.println("I am login into my Linkedln account");

    }

    @Step("I am click on my profile picture")
    public void clickMyProfilePicture(){
        System.out.println("I am click on my profile picture");

    }

    @Step("I am click the View profile button")
    public void clickViewProfileButton(){
        System.out.println("I am click the View profile button");

    }

    @Step("I am should be taken to my profile page")
    public void takenToMyProfilePage(){
        System.out.println("I am should be taken to my profile page");

    }

    @Step("I am should see my name, headline, and summary information")
    public void shouldSeeInformation(){
        System.out.println("I am should see my name, headline, and summary information");

    }

    //Scenario: Verify user network page
    @Step("I am logged in my Linkedln account")
    public void loggedMyLinkedlnAccount(){
        System.out.println("I am logged in my Linkedln account");

    }

    @Step("I am click on the My Network tab")
    public void clickMyNetworkTab(){
        System.out.println("I am click on the My Network tab");

    }

    @Step("I am should be taken to the network page")
    public void takenTheNetworkPage(){
        System.out.println("I am should be taken to the network page");

    }

    @Step("I am should see suggestions for people to connect with")
    public void suggestionsPeopleToConnectWith(){
        System.out.println("I am should see suggestions for people to connect with");

    }

    //Scenario: Verify that the user can create a new post
    @Step("I am accessed my LinkedIn account")
    public void accessedMyLinkedlnAccount(){
        System.out.println("I am accessed my LinkedIn account");

    }

    @Step("I am click on the Start a post button")
    public void clickStartAPostButton(){
        System.out.println("I am click on the Start a post button");

    }

    @Step("I am type text in the post text field")
    public void typeTextThePostTextField(){
        System.out.println("I am type text in the post text field");

    }

    @Step("I am click on the Post button")
    public void clickThePostButton(){
        System.out.println("I am click on the Post button");

    }

    @Step("I am should see my new post on my feed")
    public void shouldSeeMyNewPostOnMyFeed(){
        System.out.println("I am should see my new post on my feed");

    }

    //Scenario: Verify that the user can react to a post by liking, commenting, or sharing
    @Step("I am signed into my Linkedln account")
    public void signedLinkedlnAccount(){
        System.out.println("I am signed into my Linkedln account");

    }

    @Step("there is a post on my feed")
    public void therePostMyFeed(){
        System.out.println("there is a post on my feed");

    }

    @Step("I am click on the Like button on the post")
    public void clickLikeButtonThePost(){
        System.out.println("I am click on the Like button on the post");

    }

    @Step("I am type Great post in the comment text field")
    public void typeGreatPostInTheCommentTextField(){
        System.out.println("I am type Great post in the comment text field");

    }

    @Step("I am click on the Comment button")
    public void clickCommentButton(){
        System.out.println("I am click on the Comment button");

    }

    @Step("I am click on the Share button")
    public void clickShareButton(){
        System.out.println("I am click on the Share button");

    }

    @Step("I am should see the post on my activity feed")
    public void shouldSeePostMyActivityFeed(){
        System.out.println("I am should see the post on my activity feed");

    }

    //Scenario: Verify that the user can edit their profile information
    @Step("I am access login My profile in to Linkedln")
    public void accessedLoginProfileInLinkedln(){
        System.out.println("I am accessed my Linkedln profile by login");

    }

    @Step("I am click picture on profile")
    public void clickPictureOnProfile(){
        System.out.println("I am click picture on profile");

    }

    @Step("I am select the View profile button")
    public void selectTheViewProfileButton(){
        System.out.println("I am select the View profile button");

    }

    @Step("I am click on the Edit button on the About section")
    public void clickEditButtonAboutSection(){
        System.out.println("I am click on the Edit button on the About section");

    }

    @Step("I am update my Headline to Quality Engineer")
    public void updateHeadline(){
        System.out.println("I am update my Headline to Quality Engineer");

    }

    @Step("I am click on the Save button")
    public void clickSaveButton(){
        System.out.println("I am click on the Save button");

    }

    @Step("I am should see my updated profile information")
    public void shouldSeeUpdateProfileInformation(){
        System.out.println("I am should see my updated profile information");

    }

    //Scenario: Verify that the user can upload a new profile picture
    @Step("I am login in Linkedln account")
    public void loginInLinkedlnAccount(){
        System.out.println("I am login in Linkedln account");

    }

    @Step("I am click on Picture in my profile")
    public void clickOnPictureInMyProfile(){
        System.out.println("I am click on Picture in my profile");

    }

    @Step("I am click on the Change photo button")
    public void clickChangePhotoButton(){
        System.out.println("I am click on the Change photo button");

    }

    @Step("I am select a new profile picture to upload")
    public void selectNewProfileToUpload(){
        System.out.println("I am select a new profile picture to upload");

    }

    @Step("I am selected the Save button")
    public void selectedSaveButton(){
        System.out.println("I am selected the Save button");

    }

    @Step("I am should see my new profile picture on my profile page")
    public void shouldSeeMyNewProfileOnProfilePage(){
        System.out.println("I am should see my new profile picture on my profile page");

    }

    //Scenario: Verify that the user can search for jobs and apply to job postings
    @Step("I am accessed my LinkedIn profile by sign in")
    public void accessedLinkendlnProfileBySignIn(){
        System.out.println("I am accessed my LinkedIn profile by sign in");

    }

    @Step("I am click on the Jobs tab")
    public void clickTheJobsTab(){
        System.out.println("I am click on the Jobs tab");

    }

    @Step("I am input Quality Engineer in the search box")
    public void inputKeywordInSearchBox(){
        System.out.println("I am input Quality Engineer in the search box");

    }

    @Step("I am select a job posting to view")
    public void selectJobPostingToView(){
        System.out.println("I am select a job posting to view");

    }

    @Step("I am click on the Apply button")
    public void clickApplyButton(){
        System.out.println("I am click on the Apply button");

    }

    @Step("I am fill out the job application form")
    public void fillOutJobApplicationForm(){
        System.out.println("I am fill out the job application form");

    }

    @Step("I am click on the Submit button")
    public void clickSubmitButton(){
        System.out.println("I am click on the Submit button");

    }

    @Step("I am should see a confirmation message that my job application was submitted")
    public void shouldSeeConfirmationMessageWasSubmitted(){
        System.out.println("I am should see a confirmation message that my job application was submitted");

    }
}