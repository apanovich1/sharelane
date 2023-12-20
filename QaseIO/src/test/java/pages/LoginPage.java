package pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {

    final String EMAIL_CSS = "[name=email]";
    final String PASSWORD_CSS = "[name=password]";
    final String SUBMIT_BUTTON_CSS = "[type=submit]";

    public void openPage() {
        open("/login");
    }

    public void login(String user, String password) {
        $(EMAIL_CSS).sendKeys(user);
        $(PASSWORD_CSS).sendKeys(password);
        $(SUBMIT_BUTTON_CSS).click();
    }

}
