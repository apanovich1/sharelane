import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BookCardTest {
    @Test
    public void addToCartValid() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.sharelane.com/cgi-bin/register.py?page=2&zip_code=11111&" +
                "first_name=test&last_name=testl&email=test%40test.com&password1=test&password2=test");
        String email = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b")).getText();
        browser.get("https://www.sharelane.com/cgi-bin/main.py");
        browser.findElement(By.name("email")).sendKeys(email);
        browser.findElement(By.name("password")).sendKeys("1111");
        browser.findElement(By.cssSelector("[value=Login]")).click();

        browser.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=5");
        browser.findElement(By.xpath("//table/tbody/tr[5]/td/table/tbody/tr/td[2]/p[2]/a")).click();
        String addToCartSuccessMessage = browser.findElement(By.cssSelector("[class=confirmation_message]"))
                .getText();
        Assert.assertEquals(addToCartSuccessMessage, "Book was added to the Shopping Cart",
                "user is not able to add book in cart");
        
        browser.quit();
    }
    @Test
    public static void addToCartSignOut() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.sharelane.com/cgi-bin/main.py");

        browser.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=5");
        browser.findElement(By.xpath("//table/tbody/tr[5]/td/table/tbody/tr/td[2]/p[2]/a")).click();
        String searchErrorMessage = browser.findElement(By.cssSelector("[class=error_message]"))
                .getText();
        Assert.assertEquals(searchErrorMessage, "Oops, error. You must log in",
                "incorrect message/user can add book");

        browser.quit();

    }

}
