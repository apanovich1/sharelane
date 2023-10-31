import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingCartTest {

    @Test
    public void discount0() {
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

        browser.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=3");
        browser.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        browser.findElement(By.name("q")).clear();
        browser.findElement(By.name("q")).sendKeys("1");
        browser.findElement(By.cssSelector("[value=Update]")).click();
        String discountPercent = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discount$ = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String total$ = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();
        Assert.assertEquals(discountPercent, "0", "discount is incorrect");
        Assert.assertEquals(discount$, "0.0");
        Assert.assertEquals(total$, "10.00");

        browser.findElement(By.name("q")).clear();
        browser.findElement(By.name("q")).sendKeys("19");
        browser.findElement(By.cssSelector("[value=Update]")).click();
        discountPercent = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        discount$ = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        total$ = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();
        Assert.assertEquals(discountPercent, "0","discount is incorrect");
        Assert.assertEquals(discount$, "0.0");
        Assert.assertEquals(total$, "190.00");
        browser.quit();
    }

    @Test
    public void discount2() {
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

        browser.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=3");
        browser.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        browser.findElement(By.name("q")).clear();
        browser.findElement(By.name("q")).sendKeys("20");
        browser.findElement(By.cssSelector("[value=Update]")).click();
        String discountPercent = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discount$ = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String total$ = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();
        Assert.assertEquals(discountPercent, "2", "discount is incorrect");
        Assert.assertEquals(discount$, "4.0");
        Assert.assertEquals(total$, "196.00");

        browser.findElement(By.name("q")).clear();
        browser.findElement(By.name("q")).sendKeys("49");
        browser.findElement(By.cssSelector("[value=Update]")).click();
        discountPercent = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        discount$ = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        total$ = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();
        Assert.assertEquals(discountPercent, "2","discount is incorrect");
        Assert.assertEquals(discount$, "9.8");
        Assert.assertEquals(total$, "480.2");
        browser.quit();
    }

    @Test
    public void discount3() {
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

        browser.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=3");
        browser.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        browser.findElement(By.name("q")).clear();
        browser.findElement(By.name("q")).sendKeys("50");
        browser.findElement(By.cssSelector("[value=Update]")).click();
        String discountPercent = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discount$ = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String total$ = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();
        Assert.assertEquals(discountPercent, "3", "discount is incorrect");
        Assert.assertEquals(discount$, "15.0");
        Assert.assertEquals(total$, "485.00");

        browser.findElement(By.name("q")).clear();
        browser.findElement(By.name("q")).sendKeys("99");
        browser.findElement(By.cssSelector("[value=Update]")).click();
        discountPercent = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        discount$ = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        total$ = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();
        Assert.assertEquals(discountPercent, "3", "discount is incorrect");
        Assert.assertEquals(discount$, "29.70");
        Assert.assertEquals(total$, "960.30");
        browser.quit();
    }

    @Test
    public void discount4() {
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

        browser.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=3");
        browser.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        browser.findElement(By.name("q")).clear();
        browser.findElement(By.name("q")).sendKeys("100");
        browser.findElement(By.cssSelector("[value=Update]")).click();
        String discountPercent = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discount$ = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String total$ = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();
        Assert.assertEquals(discountPercent, "4", "discount is incorrect");
        Assert.assertEquals(discount$, "40.0");
        Assert.assertEquals(total$, "960.00");

        browser.findElement(By.name("q")).clear();
        browser.findElement(By.name("q")).sendKeys("499");
        browser.findElement(By.cssSelector("[value=Update]")).click();
        discountPercent = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        discount$ = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        total$ = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();
        Assert.assertEquals(discountPercent, "4", "discount is incorrect");
        Assert.assertEquals(discount$, "199.60");
        Assert.assertEquals(total$, "4790.40");
        browser.quit();
    }

    @Test
    public void discount5() {
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

        browser.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=3");
        browser.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        browser.findElement(By.name("q")).clear();
        browser.findElement(By.name("q")).sendKeys("500");
        browser.findElement(By.cssSelector("[value=Update]")).click();
        String discountPercent = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discount$ = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String total$ = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();
        Assert.assertEquals(discountPercent, "5", "discount is incorrect");
        Assert.assertEquals(discount$, "250.0");
        Assert.assertEquals(total$, "4750.00");

        browser.findElement(By.name("q")).clear();
        browser.findElement(By.name("q")).sendKeys("999");
        browser.findElement(By.cssSelector("[value=Update]")).click();
        discountPercent = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        discount$ = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        total$ = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();
        Assert.assertEquals(discountPercent, "5", "discount is incorrect");
        Assert.assertEquals(discount$, "499.50");
        Assert.assertEquals(total$, "9490.50");
        browser.quit();
    }

    @Test
    public void discount6() {
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

        browser.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=3");
        browser.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        browser.findElement(By.name("q")).clear();
        browser.findElement(By.name("q")).sendKeys("1000");
        browser.findElement(By.cssSelector("[value=Update]")).click();
        String discountPercent = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discount$ = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String total$ = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();
        Assert.assertEquals(discountPercent, "6", "discount is incorrect");
        Assert.assertEquals(discount$, "600.0");
        Assert.assertEquals(total$, "9400.00");

        browser.findElement(By.name("q")).clear();
        browser.findElement(By.name("q")).sendKeys("4999");
        browser.findElement(By.cssSelector("[value=Update]")).click();
        discountPercent = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        discount$ = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        total$ = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();
        Assert.assertEquals(discountPercent, "6", "discount is incorrect");
        Assert.assertEquals(discount$, "2999.40");
        Assert.assertEquals(total$, "46990.60");
        browser.quit();
    }

    @Test
    public void discount7() {
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

        browser.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=3");
        browser.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        browser.findElement(By.name("q")).clear();
        browser.findElement(By.name("q")).sendKeys("5000");
        browser.findElement(By.cssSelector("[value=Update]")).click();
        String discountPercent = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discount$ = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String total$ = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();
        Assert.assertEquals(discountPercent, "7", "discount is incorrect");
        Assert.assertEquals(discount$, "3500.0");
        Assert.assertEquals(total$, "46500.00");

        browser.findElement(By.name("q")).clear();
        browser.findElement(By.name("q")).sendKeys("9999");
        browser.findElement(By.cssSelector("[value=Update]")).click();
        discountPercent = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        discount$ = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        total$ = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();
        Assert.assertEquals(discountPercent, "7", "discount is incorrect");
        Assert.assertEquals(discount$, "6999.3");
        Assert.assertEquals(total$, "92990.70");
        browser.quit();
    }

    @Test
    public void discount8() {
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

        browser.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=3");
        browser.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        browser.findElement(By.name("q")).clear();
        browser.findElement(By.name("q")).sendKeys("10000");
        browser.findElement(By.cssSelector("[value=Update]")).click();
        String discountPercent = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discount$ = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String total$ = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();
        Assert.assertEquals(discountPercent, "8", "discount is incorrect");
        Assert.assertEquals(discount$, "8000.0");
        Assert.assertEquals(total$, "92000.00");

        browser.findElement(By.name("q")).clear();
        browser.findElement(By.name("q")).sendKeys("10001");
        browser.findElement(By.cssSelector("[value=Update]")).click();
        discountPercent = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        discount$ = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        total$ = browser.findElement(
                By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();
        Assert.assertEquals(discountPercent, "8", "discount is incorrect");
        Assert.assertEquals(discount$, "8000.8");
        Assert.assertEquals(total$, "92009.20");
        browser.quit();
    }
}
