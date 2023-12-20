package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ProjectsPage {
    final String CREATE_BUTTON_ID = byText("Login");

    final String PROJECT_NAME = "#project-name";

    final String PROJECT_CODE = "project-code";

    final String CREATE_BUTTON = "[type=submit]";

    public void openPage() {
        open("/projects");
    }

    public void waitTillOpened() {
        $(CREATE_BUTTON_ID).shouldBe(Condition.visible); //timeout in basetest
    }

    public void createNewProject(String newProjectName, String newProjectCode) {
        $(CREATE_BUTTON_ID).click();
        $(PROJECT_NAME).sendKeys(newProjectName);
        $(PROJECT_CODE).sendKeys(newProjectCode);
        $(CREATE_BUTTON).click();
    }
}
