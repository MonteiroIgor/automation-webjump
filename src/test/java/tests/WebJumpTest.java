package tests;

import config.BaseTest;
import org.junit.Before;
import org.junit.Test;
import pages.WebJumpPage;

public class WebJumpTest extends BaseTest {

    WebJumpPage webJumpPage;

    @Before
    public void initPage(){
        webJumpPage = new WebJumpPage(driver);
    }

    @Test
    public void firstCase() {
        webJumpPage.clickButtonsAndValidate();

    }

    @Test
    public void secondCase(){
        webJumpPage.clickButtonsIframeAndValidate();
    }

    @Test
    public void thirdCase(){
        webJumpPage.fillFieldFirstNameCheckSelectButtonAndValidateLogo();
    }
}
