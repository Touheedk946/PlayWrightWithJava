package tests;

import base.BaseTest;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import org.testng.annotations.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class LoginTest extends BaseTest {

    @Test
    void loginTest() {
            page.navigate("https://www.google.com/?zx=1768639136423&no_sw_cr=1");
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Sign in")).click();
            page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Email or phone")).fill("touheedk946@gmail.com");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Next")).click();
            assertThat(page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Couldn’t sign you in")).locator("span")).isVisible();
        }

}