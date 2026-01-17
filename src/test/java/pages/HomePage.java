package pages;

import com.microsoft.playwright.Page;

public class HomePage {
    private final Page page;

    public HomePage(Page page) {
        this.page = page;
    }
    public void clickTimeLink(){
        //page.click(timeLink);
        //  private final String timeLink = "getBytRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(\"Time\"))";
        String timeLink = "oxd-text oxd-text--span oxd-main-menu-item--name";
        page.locator(timeLink).click();
    }
}
