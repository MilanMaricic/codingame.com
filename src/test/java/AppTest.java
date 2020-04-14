import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileReader;

public class AppTest {
    private String siteURL ="https://www.codingame.com";
    private String projectLocation = System.getProperty("user.dir");

    @Test
    public void loadSitePage(){
        //setup path to webdriver
        System.setProperty("webdriver.gecko.driver", projectLocation +"\\lib\\geckodriver\\geckodriver.exe");
        System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        //initialize webdriver
        WebDriver driver = new FirefoxDriver();
        //open site URL
        driver.get(siteURL);
        //check title with expected
        Assert.assertEquals(driver.getTitle(), "Coding Games and Programming Challenges to Code Better");
        //close connection
        driver.quit();

    }
}
