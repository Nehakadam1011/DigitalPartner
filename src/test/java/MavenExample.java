

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MavenExample {
    WebDriver driver;
    @BeforeMethod
    public void beforeMethod1(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
         driver = new ChromeDriver();
        System.out.println("Before Method");
    }
     @Test
     public void method1(){
    driver.get("https://www.google.com");
}
    @Test
    public void method2(){
        driver.get("https://www.google.com");
    }
    @AfterMethod
    public void afterMethod1(){
        driver.close();
        System.out.println("After Method");
    }
}
