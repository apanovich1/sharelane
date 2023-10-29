import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTest {

    @Test
    public void zipCode4Digits () {
        //open browser
        //open page
        //enter 1234 digits
        //continue button
        //error shown
        //close browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.sharelane.com/cgi-bin/register.py");
        browser.findElement(By.name("zip_code")).sendKeys("1234");
        //<input type="text" name="zip_code" value="">
        //<input type="submit" value="Continue">
        //<span class="error_message">Oops, error on page. ZIP code should have 5 digits</span>
        browser.findElement(By.cssSelector("[value=Continue]")).click();
        String error = browser.findElement(By.cssSelector("[class=error_message]")).getText();
        Assert.assertEquals(error,"Oops, error on page. ZIP code should have 5 digits");
        browser.quit();
    }
    @Test
    public void zipCode6Digits () {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.sharelane.com/cgi-bin/register.py");
        browser.findElement(By.name("zip_code")).sendKeys("123456");
        browser.findElement(By.cssSelector("[value=Continue]")).click();
        String error = browser.findElement(By.cssSelector("[class=error_message]")).getText();
        Assert.assertEquals(error,"Oops, error on page. ZIP code should have 5 digits");
        browser.quit();
    }
    @Test
    public void zipCodeEmptySubmit () {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.sharelane.com/cgi-bin/register.py");
        browser.findElement(By.cssSelector("[value=Continue]")).click();
        String error = browser.findElement(By.cssSelector("[class=error_message]")).getText();
        Assert.assertEquals(error,"Oops, error on page. ZIP code should have 5 digits");
        browser.quit();
    }
    @Test
    public void zipCode5Digits () {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.sharelane.com/cgi-bin/register.py");
        browser.findElement(By.name("zip_code")).sendKeys("12345");
        browser.findElement(By.cssSelector("[value=Continue]")).click();
        String currentURL = browser.getCurrentUrl();
        Assert.assertTrue(currentURL.contains("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=12345"));
        browser.quit();
    }
    @Test
    public void signUpHappyPath() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.sharelane.com/cgi-bin/register.py");
        browser.findElement(By.name("zip_code")).sendKeys(new CharSequence[]{"11111"});
        browser.findElement(By.cssSelector("[value=Continue]")).click();
        browser.findElement(By.name("first_name")).sendKeys(new CharSequence[]{"Ann"});
        browser.findElement(By.name("last_name")).sendKeys(new CharSequence[]{"Apanovich"});
        browser.findElement(By.name("email")).sendKeys(new CharSequence[]{"blabla@gmail.com"});
        browser.findElement(By.name("password1")).sendKeys(new CharSequence[]{"12345678"});
        browser.findElement(By.name("password2")).sendKeys(new CharSequence[]{"12345678"});
        browser.findElement(By.cssSelector("[value=Register]")).click();
        String signUpMessage = browser.findElement(By.cssSelector("[class=confirmation_message]")).getText();
        Assert.assertEquals(signUpMessage, "Account is created!");
        browser.quit();
    }

    @Test
    public void signUpEmptyInput() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys(new CharSequence[]{"11111"});
        driver.findElement(By.cssSelector("[value = Continue]")).click();
        driver.findElement(By.cssSelector("[value = Register]")).click();
        String signUpMessage = driver.findElement(By.cssSelector("[class=error_message]")).getText();
        Assert.assertEquals(signUpMessage, "Oops, error on page. Some of your fields have invalid data or email was previously used");
        driver.quit();
    }
}
