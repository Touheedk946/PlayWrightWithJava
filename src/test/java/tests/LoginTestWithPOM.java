package tests;

import base.BaseTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTestWithPOM extends BaseTest {

    private static final Logger log = LoggerFactory.getLogger(LoginTestWithPOM.class);

    @Test
    void test() {

        page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        LoginPage loginPage = new LoginPage(page);
        HomePage homePage = new HomePage(page);
        loginPage.addUsername("Admin");
        loginPage.addPassword("admin123");
        loginPage.clickLoginButton();
        homePage.clickTimeLink();
    }
}