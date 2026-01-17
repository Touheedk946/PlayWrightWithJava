package tests;

import base.BaseTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.SkipException;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTestWithPOM extends BaseTest {

    private static final Logger log = LoggerFactory.getLogger(LoginTestWithPOM.class);

    @Test
    void test() {
        test.info("Navigate the Login Url");
        page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        LoginPage loginPage = new LoginPage(page);
        HomePage homePage = new HomePage(page);
        test.info("Pass the Admin User Name");
        loginPage.addUsername("Admin");
        test.info("Pass the Admin User Password");
        loginPage.addPassword("admin123");

        test.info("Click On Login Button");
        loginPage.clickLoginButton();
        test.info("Validate Click Time Link");
      //  homePage.clickTimeLink();

        test.info("All steps completed");
    }
    @Test
    void test2() {
        test.skip("Navigate the Login Url");
        throw new SkipException("Skipping this test");
    }
    @Test
    void test3() {
        test.info("Navigate the Login Url");
        page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        LoginPage loginPage = new LoginPage(page);
        HomePage homePage = new HomePage(page);
        test.info("Pass the Admin User Name");
        loginPage.addUsername("Admin");
        test.info("Pass the Admin User Password");
        loginPage.addPassword("admin123");

        test.info("Click On Login Button");
        loginPage.clickLoginButton();
        test.info("Validate Click Time Link");
     //   homePage.clickTimeLink();

        test.info("All steps completed");
    }
}