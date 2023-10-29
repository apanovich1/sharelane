import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest {

    @Test
    public void searchLessThan3Chars() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.sharelane.com/cgi-bin/main.py");
        browser.findElement(By.name("keyword")).sendKeys("acd");
        browser.findElement(By.cssSelector("[value = Search]")).click();
        //Please, note that current MySQL settings don't allow searches for words containing less than 4 chars
        String searchErrorMessage = browser.findElement(By.cssSelector("[class=confirmation_message]"))
                .getText();
        Assert.assertEquals(searchErrorMessage, "Please, note that current MySQL settings don't"
                +" allow searches for words containing less than 4 chars");
        browser.quit();
    }
    @Test
    public void searchBookByName() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.sharelane.com/cgi-bin/main.py");

        browser.findElement(By.name("keyword")).sendKeys("The Analects of Confucius");
        browser.findElement(By.cssSelector("[value = Search]")).click();

        String currentURL = browser.getCurrentUrl();
        Assert.assertEquals(currentURL,"https://www.sharelane.com/cgi-bin/"
                +"search.py?keyword=The+Analects+of+Confucius","incorret book found/not found");
        browser.quit();
    }
    @Test
    public void searchBookByAuthorName() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.sharelane.com/cgi-bin/main.py");

        browser.findElement(By.name("keyword")).sendKeys("Rabindranath Tagore");
        browser.findElement(By.cssSelector("[value = Search]")).click();

        String currentURL = browser.getCurrentUrl();
        Assert.assertEquals(currentURL,"https://www.sharelane.com/cgi-bin/show_book.py?book_id=9",
                "incorret book found/not found");
        browser.quit();
    }
    @Test
    public void searchInvalidName() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.sharelane.com/cgi-bin/main.py");

        browser.findElement(By.name("keyword")).sendKeys("Confucius123");
        browser.findElement(By.cssSelector("[value = Search]")).click();

        String searchErrorMessage = browser.findElement(By.cssSelector("[class=confirmation_message]"))
                .getText();
        Assert.assertEquals(searchErrorMessage, "Nothing is found :(");
        browser.quit();
    }
    @Test
    public void searchEmptyField() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.sharelane.com/cgi-bin/main.py");

        browser.findElement(By.cssSelector("[value = Search]")).click();

        String searchErrorMessage = browser.findElement(By.cssSelector("[class=error_message]"))
                .getText();
        Assert.assertEquals(searchErrorMessage, "Oops, error. No keyword is provided");
        browser.quit();
    }
}