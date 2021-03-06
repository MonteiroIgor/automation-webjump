package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public WebDriver driver;

    public BasePage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



    public void waitTime(int time){
        try {
            Thread.sleep(time);
        }catch (InterruptedException e){
            e.printStackTrace();

        }
    }
}
