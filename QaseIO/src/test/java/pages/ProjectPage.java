package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProjectPage {

    final String CREATE_SUITE_BUTTON = ("create-suite-button");

    public void waitTillOpened() {
       $(CREATE_SUITE_BUTTON).shouldBe(Condition.visible);
    }
}
