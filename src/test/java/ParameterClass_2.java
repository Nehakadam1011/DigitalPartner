import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import java.io.FileInputStream;
import java.io.IOException;

public class ParameterClass_2 {
    WebDriver driver;

    @DataProvider(name = "excel-data")
    public Object[][] getExcelData() throws IOException {
        Object[][] arrObj = getExcelData("C:\\Users\\Admin\\Documents\\Neha\\ExcelSheet.xlsx", "Sample");
        return arrObj;
    }

    public String[][] getExcelData(String fileName, String sheetName) throws IOException {
        String[][] data = null;
        FileInputStream fileInputStream = new FileInputStream(fileName);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sh = xssfWorkbook.getSheet(sheetName);
        XSSFRow row = sh.getRow(0);
        int noOfRow = sh.getPhysicalNumberOfRows();
        int noOfcCol = row.getLastCellNum();
        Cell cell;
        data = new String[noOfRow-1][noOfcCol];

        for (int i=1; i<noOfRow; i++) {
            for (int j=0; j<noOfcCol; j++) {
                row = sh.getRow(i);
                cell = row.getCell(j);
                data[i-1][j] = cell.getStringCellValue();
            }
        }
        return data;
    }
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

    @Test(dataProvider = "excel-data")
    public void method2(String course,String city){
        driver.get("https://www.google.com");
        WebElement textBox = driver.findElement(By.name("q"));
        textBox.sendKeys(course+" "+city);
        textBox.sendKeys(Keys.ENTER);
    }
    @AfterMethod
    public void afterMethod1(){
        driver.close();
    }
}
