package tests;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.testng.Assert.assertTrue;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import tests.BaseTest;

public class ProjectTest extends BaseTest {
    @Test
    public void projectShouldBeCreated() {
      loginPage.openPage();
      loginPage.login("anna.apanovich1@gmail.com", "Kx#E-_$Usrv97cQ");
      projectsPage.waitTillOpened();
    }

    @Test
    public void createNewProject() {
        projectsPage.createNewProject("Test name", "test code");
        projectPage.waitTillOpened();
        String projectName = faker.name().firstName() + faker.name().lastName();
    }
}
