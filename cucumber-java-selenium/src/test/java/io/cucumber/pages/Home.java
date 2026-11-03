package io.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Home extends Page {

  public Home(ChromeDriver driver) {
    super(driver);
    System.out.println("Homepage title is : " + driver.getTitle());
  }

  @FindBy (css = "div#content > ul > li")
  private List<WebElement> featureListItems;
  @FindBy (css = "#content h3")
  private WebElement pageSubHeader;


  public String getTitle() {
    return driver.getTitle();
  }

  public String getSubPageHeader (){
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    return wait.until(ExpectedConditions.visibilityOf(pageSubHeader)).getText();
  }

  public void clickLink(String link){
    driver.findElement(By.linkText(link)).click();
  }

  public List<String> getLinks(){
    List<String> actualLinks = new ArrayList<>();

    for (WebElement element : featureListItems) {
        actualLinks.add(element.getText().trim());
    }
    return actualLinks;
  }

  public void signInBasicAuth(String username, String password, String baseUrl){
    String authenticatedUrl = baseUrl.replace("https://","https://" + username + ":" + password + "@");
    driver.get(authenticatedUrl);
  }

  public void refresh() {
    driver.navigate().refresh();
    System.out.println("Refreshed page");
  }
}
