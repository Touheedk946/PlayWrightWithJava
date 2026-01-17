package pages;

import com.microsoft.playwright.Page;

public class LoginPage {
    private Page page;

    private final String usernameTextbox = "input[name='username']";
    private final String passworkTextbox = "input[name='password']";
    private final String loginButton = "button[type='submit']";

    public LoginPage(Page page ){
        this.page = page;
    }

    public void addUsername(String userName){
        page.fill(usernameTextbox,userName);
    }
    public void addPassword(String userPassword){
        page.fill(passworkTextbox, userPassword);
    }

    public void clickLoginButton(){
        page.click(loginButton);

    }
    public void loginUser(String userName, String userPassword){
        page.fill(usernameTextbox,userName);
        page.fill(passworkTextbox, userPassword);
        page.click(loginButton);
    }
}
