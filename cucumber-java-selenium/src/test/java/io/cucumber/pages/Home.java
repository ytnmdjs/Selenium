package io.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class Home extends Page {

  public Home(ChromeDriver driver) {
    super(driver);
    System.out.println("Homepage title is : " + getTitle().getText());
  }

  @FindBy(css = "h1")
  private WebElement title;
  @FindBy (css = "div#content > ul > li")
  private List<WebElement> featureListItems;

  public WebElement getTitle() {
    return title;
  }



  public List<String> getLinks(){
    List<String> actualLinks = new ArrayList<>();

    for (WebElement element : featureListItems) {
        actualLinks.add(element.getText().trim());
    }
    return actualLinks;
  }

  public void refresh() {
    driver.navigate().refresh();
    System.out.println("Refreshed page");
  }
}
