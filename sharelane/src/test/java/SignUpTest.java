import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTest {

    @Test
    public void zipCode4Digits() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.sharelane.com/cgi-bin/register.py");
        browser.findElement(By.name("zip_code")).sendKeys("1111");
        browser.findElement(By.cssSelector("[value=Continue]")).click();

        String error = browser.findElement(By.cssSelector("[class=error_message]")).getText();
        Assert.assertEquals(error, "Oops, error on page. ZIP code should have 5 digits");
        browser.quit();
    }

    @Test
    public void zipCode6Digits() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.sharelane.com/cgi-bin/register.py");
        browser.findElement(By.name("zip_code")).sendKeys("111111");
        browser.findElement(By.cssSelector("[value=Continue]")).click();

        String error = browser.findElement(By.cssSelector("[class=error_message]")).getText();
        Assert.assertEquals(error, "Oops, error on page. ZIP code should have 5 digits");
        browser.quit();
    }

    @Test
    public void positiveSignUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.sharelane.com/cgi-bin/register.py");

        browser.findElement(By.name("zip_code")).sendKeys("11111");
        browser.findElement(By.cssSelector("[value=Continue]")).click();

        browser.findElement(By.name("first_name")).sendKeys("Dmitry");
        browser.findElement(By.name("last_name")).sendKeys("Rak");
        browser.findElement(By.name("email")).sendKeys("blabla@gmail.com");
        browser.findElement(By.name("password1")).sendKeys("12345678");
        browser.findElement(By.name("password2")).sendKeys("12345678");

        browser.findElement(By.cssSelector("[value=Register]")).click();

        String signUpMessage = browser.findElement(By.cssSelector("[class=confirmation_message]")).getText();
        Assert.assertEquals(signUpMessage, "Account is created!");

        browser.quit();
    }

    @Test
    public void negativeRegistrationEmptyInput() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("11111");
        driver.findElement(By.cssSelector("[value = Continue]")).click();
        driver.findElement(By.cssSelector("[value = Register]")).click();
        String signUpMessage = driver.findElement(By.cssSelector("[class=error_message]")).getText();
        Assert.assertEquals(signUpMessage, "Oops, error on page. Some of your fields have invalid data or email was previously used");
        driver.quit();
    }
}