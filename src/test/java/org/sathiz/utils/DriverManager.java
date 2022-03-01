package org.sathiz.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

//driver instance
public class DriverManager {

    public static ThreadLocal<WebDriver> threadLocalDriver=new ThreadLocal<>();
    public WebDriver driver;
    //Getting driver instance
    public WebDriver initDriver(){
        String browserDriver= RunConfig.browser;
        switch (browserDriver){
            case "chrome":
                //DesiredCapabilities dc=new DesiredCapabilities()
                WebDriverManager.chromedriver().setup();
                threadLocalDriver.set(new ChromeDriver());
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                threadLocalDriver.set(new FirefoxDriver());

            case "ie":
                WebDriverManager.iedriver().setup();
                threadLocalDriver.set(new InternetExplorerDriver());

            }
        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();


            return getDriver();
        }

    public static WebDriver getDriver(){
        return threadLocalDriver.get();

    }
    }

