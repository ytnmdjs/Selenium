package io.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortTable extends Page {

    @FindBy(xpath = "//*[@id='table1']/thead/tr/th")
    private List<WebElement> tableHeaders;
    @FindBy (xpath = "//*[@id='table1']/tbody/tr")
    private List<WebElement> tableRows;

    public SortTable(ChromeDriver driver){
        super(driver);
        System.out.println(driver.getTitle());
    }

    public List<Map<String, String>> getTableDataAsMaps (){
        List<Map<String, String>> actTables = new ArrayList<>();
        List<String> headerNames = new ArrayList<>();

        for (WebElement th : tableHeaders){
            headerNames.add(th.getText().trim().replaceAll("\\s+", " "));
        }

        for (WebElement row : tableRows){
            List<WebElement> cells = row.findElements(By.tagName("td"));
            Map<String, String> rowMap = new LinkedHashMap<>();

            for (int i = 0; i < cells.size(); i++){
                String cellText = cells.get(i).getText().trim().replaceAll("\\s+", " ");
                rowMap.put(headerNames.get(i), cellText);
            }
            actTables.add(rowMap);
        }
        return actTables;
    }

}

