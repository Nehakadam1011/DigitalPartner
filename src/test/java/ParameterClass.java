import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterClass {
    WebDriver driver;

    @Parameters({"browserName"})
    @BeforeMethod
    public void Method1(String browserName) {
        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browserName.equals("Firefox")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new FirefoxDriver();
        } else if (browserName.equals("edge")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new EdgeDriver();
        } else {
            System.out.println("please enter the correct browser name");
        }
    }
        @Parameters({"city"})
        @Test
        public void method2(String city){
        driver.get("https://www.google.com");
            WebElement textBox = driver.findElement(By.name("q"));
            textBox.sendKeys(city);
            textBox.sendKeys(Keys.ENTER);
        }
        @AfterMethod
        public void afterMethod1(){
            driver.close();
        }
    }
