import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HardAssertClass {
    WebDriver driver;
    @BeforeMethod
    public void beforeMethod1() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }
        @Test
        public void method1(){
        driver.get("https://www.gmail.com");
            Assert.assertEquals(driver.getTitle(), "gmail", "The title should Gmail" );
            System.out.println("Hello TestNG");

    }
    @AfterMethod
    public void afterMethod1(){
        driver.close();
    }
}
