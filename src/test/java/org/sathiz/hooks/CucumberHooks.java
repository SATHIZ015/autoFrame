package org.sathiz.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.sathiz.utils.RunConfig;

public class CucumberHooks {

    WebDriver driver;
    @Before
    public void beforeScenario(Scenario scenario){

        /*Properties prop=new Properties();
        try {
            FileInputStream fin=new FileInputStream("src/test/resource/framework/BrowserConfig.properties");
            prop.load(fin);

            System.setProperty("webdriver.chrome.driver",prop.getProperty("path"));
            if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
                driver = new ChromeDriver();
                driver.manage().deleteAllCookies();
                driver.get(prop.getProperty("url"));
                driver.manage().window().maximize();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }*/


        //URL provided on the Edit configurations
        driver.get(RunConfig.website);

    }

    @After
    public void afterScenario(Scenario scenario){
     System.out.println(scenario.getStatus());
     if(scenario.isFailed()){
         System.out.println("Scenarios is failed--------------");
         driver.quit();
     }
     driver.quit();

    }
}
