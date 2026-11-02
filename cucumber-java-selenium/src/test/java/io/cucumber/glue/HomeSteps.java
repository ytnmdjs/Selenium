package io.cucumber.glue;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.core.Context;
import io.cucumber.core.Manager;
import io.cucumber.pages.Home;
import org.junit.jupiter.api.Assertions;


import java.util.List;

public class HomeSteps extends Context {

  private Home homePage = new Home(manager.getDriver());

  public HomeSteps(Manager manager) {
    super(manager);
  }

  @Given("an example Home Page step")
  public void exampleHomePageStep() {
    System.out.println("printing shared stash :" + getTestStash().toString());
  }

  @Then("Then Should verify the links in the page")
  public void verifyLinkListed(DataTable dataTable){
    List<String> expectedLinks = dataTable.asList(String.class);
    List<String> actualLinks = homePage.getLinks();

    Assertions.assertEquals(expectedLinks, actualLinks);

  }
}