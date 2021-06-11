package pages;

import config.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class WebJumpPage extends BasePage {
    public WebJumpPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//div[@id='panel_body_one']//button)[1]")
    public WebElement button_one;

    @FindBy(xpath = "(//div[@id='panel_body_one']//button)[2]")
    public WebElement button_two;

    @FindBy(xpath = "(//div[@id='panel_body_one']//button)[3]")
    public WebElement button_three;

    @FindBy(xpath = "(//div[@id='panel_body_one']//button)[4]")
    public WebElement button_four;

    @FindBy(xpath = "(//div[@class='col-sm-12']//button)[1]")
    public WebElement button_one_iFrame;

    @FindBy(xpath = "//button[@class='btn btn-default']")
    public WebElement button_two_iFrame;

    @FindBy(xpath = "(//div[@id='iframe_panel_body']//button)[3]")
    public WebElement button_three_iFrame;

    @FindBy(xpath = "//button[contains(@class,'btn btn-xs')]")
    public WebElement button_four_iFrame;

    @FindBy(id = "first_name")
    public WebElement field_yourFirstName;

    @FindBy(id = "select_box")
    public WebElement selectBox;

    @FindBy(xpath = "(//div[@class='checkbox']//label)[3]")
    public WebElement checkBox_optionThree;

    @FindBy(xpath = "//option[@value='option_three']")
    public WebElement selectBox_exampleTwo;

    @FindBy(xpath = "//img[@alt='selenium']")
    public WebElement logo_seleniumWebDriver;


    public WebJumpPage clickButtonsAndValidate(){
        button_one.click();
        button_two.click();
        button_four.click();

        waitTime(1000);
        Assert.assertTrue(!button_one.isDisplayed());
        Assert.assertTrue(!button_two.isDisplayed());
        Assert.assertTrue(!button_four.isDisplayed());

        return this;
    }



    public WebJumpPage clickButtonsIframeAndValidate(){
        WebElement iframe = driver.findElement(By.xpath("//iframe[@src='buttons.html']"));
        driver.switchTo().frame(iframe);

        button_one_iFrame.click();
        button_two_iFrame.click();
        button_four_iFrame.click();

        waitTime(1000);
        Assert.assertTrue(!button_one_iFrame.isDisplayed());
        Assert.assertTrue(!button_two_iFrame.isDisplayed());
        Assert.assertTrue(!button_four_iFrame.isDisplayed());
        return this;
    }


    public WebJumpPage fillFieldFirstNameCheckSelectButtonAndValidateLogo(){
        field_yourFirstName.sendKeys("Automation WebJump");
        checkBox_optionThree.click();

        Select combo = new Select(selectBox);
        combo.selectByIndex(1);

        logo_seleniumWebDriver.isDisplayed();

        return this;
    }


}
