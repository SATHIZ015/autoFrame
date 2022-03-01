package org.sathiz.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageElements {
    WebDriver driver;
    public HomePageElements(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(this.driver,driver);

    }
     WebElement panel=driver.findElement(By.xpath("//div[contains(@id,'deals-shoveler-ns')]"));
     WebElement product=driver.findElement(By.xpath("(//li[@class='feed-carousel-card'])[position()<='1']"));

     @FindBy(xpath = "//div[contains(@id,'deals-shoveler-ns')]")
     WebElement prosPanel;
     @FindBy(xpath = "//div[contains(@id,'deals-shoveler-ns')]//h2")
     WebElement panelHeader;

     public String verifyPanelHeader(){
         return panelHeader.getText();
     }

     public void clickRandomProduct(){
         if(product.isDisplayed()){
             product.click();
         }
     }

}
