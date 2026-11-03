package io.cucumber.core;

import java.util.HashMap;

import io.cucumber.pages.Home;
import io.cucumber.pages.SortTable;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manager {

  //Used as a stash for any data that needs shared across steps
  final HashMap<String, Object> stash;

  private ChromeDriver driver;
  private SortTable sortTable;
  private Home home;

  public Manager() {
    this.stash = new HashMap<>();
  }

  public ChromeDriver getDriver() {
    return driver;
  }

  public void setDriver(ChromeDriver driver) {
    this.driver = driver;
    sortTable = new SortTable(driver);
    home = new Home(driver);
  }

  public SortTable getSortTable(){
    return sortTable;
  }

  public Home getHome(){
    return home;
  }
}