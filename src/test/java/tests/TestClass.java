package tests;

import base.BaseTest;
import org.testng.annotations.Test;

public class TestClass extends BaseTest {
//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
    @Test
    public void verifyTitle(){
        page.navigate("https://google.com/ncr");

        //Optional : Handle cookie popup
        if(page.isVisible("button:has-text('Accept all')")){
            page.click("buton:has-text('Accept all')");
        }
    }
}
