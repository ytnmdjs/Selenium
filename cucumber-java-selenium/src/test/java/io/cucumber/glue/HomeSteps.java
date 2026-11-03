package io.cucumber.glue;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.core.Context;
import io.cucumber.core.Manager;
import io.cucumber.java.en.When;
import io.cucumber.pages.Home;
import org.junit.jupiter.api.Assertions;

import java.util.List;
import java.util.Map;

public class HomeSteps extends Context {

  private Home homePage = new Home(manager.getDriver());

  public HomeSteps(Manager manager) {
    super(manager);
  }

  @Given("an example Home Page step")
  public void exampleHomePageStep() {
    System.out.println("printing shared stash :" + getTestStash().toString());
  }

  @Given("User navigate to Basic Auth using {string} with {string} and {string} credentials")
  public void navigateToSignIn(String baseUrl, String username, String password){
      homePage.signInBasicAuth(username, password, baseUrl);
  }

  @When("User click link {string}")
  public void clickLinks(String link){
      homePage.clickLink(link);
  }


  @Then("Then Should verify the links in the page")
  public void verifyLinkListed(DataTable dataTable){
    List<String> expectedLinks = dataTable.asList(String.class);
    List<String> actualLinks = homePage.getLinks();

    Assertions.assertEquals(expectedLinks, actualLinks);

  }

@Then("Should verify the links {string} in the {string} page")
  public void verifyDataLink(String nameExpectedHeader, String linkExpectedTitle){
    String subActualHeader = homePage.getSubPageHeader();

    Assertions.assertEquals(linkExpectedTitle, homePage.getTitle());
    Assertions.assertEquals(nameExpectedHeader, subActualHeader);
}

@Then("Should verify the no class table")
  public void verifyTable(DataTable dataTable){
    List<Map<String, String>> expectedRows = dataTable.asMaps(String.class, String.class);
    List<Map<String, String>> actualRows = homePage.getTableDataAsMaps();

    Assertions.assertEquals(expectedRows, actualRows);
}

}