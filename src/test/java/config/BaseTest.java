package config;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    public WebDriver driver;
    protected BasePage basePage;

    @Before
    public void before(){

        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://wejump-automation-test.github.io/qa-test/");
        driver.manage().window().maximize();

        basePage = new BasePage(driver);
    }


    @After
    public void after(){
        driver.quit();
    }


}
