package tests;

import com.codeborne.selenide.Config;
import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import pages.ProjectPage;
import pages.ProjectsPage;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTest {

    LoginPage loginPage;
    ProjectsPage projectsPage;
    ProjectPage projectPage;
    Faker faker;

    @BeforeMethod
    public void setUp(){
        Configuration.browser = "chrome";
        Configuration.headless = true;
        Configuration.timeout = 10000; //10sec
        Configuration.baseUrl = "https://app.qase.io";
        open();
        getWebDriver().manage().window().maximize();
        faker = new Faker();
        loginPage = new LoginPage();
        projectsPage = new ProjectsPage();
        projectPage = new ProjectPage();
    }

    @AfterMethod(alwaysRun = true)
    public void close() {
        closeWebDriver();
    }
}
