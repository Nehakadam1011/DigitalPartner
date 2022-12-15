import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertClass {

    WebDriver driver;
    @BeforeMethod
    public void beforeMethod1() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void method1(){
        SoftAssert softAssert = new SoftAssert();
        driver.get("https://www.gmail.com");
        softAssert.assertEquals(driver.getTitle(), "gmail", "The title should Gmail" );
        System.out.println("Hello TestNG");
        softAssert.assertTrue(driver.findElement(By.xpath("//a[text()='Gmail']")).isDisplayed(), "Gmail link should be displayed");
        softAssert.assertAll();

    }
    @AfterMethod
    public void afterMethod1(){
        driver.close();
    }
}
