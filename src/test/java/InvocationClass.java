import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationClass {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }
    @Test
    public void testCaseA(){
        System.out.println("Test Case A");
    }
    @Test(invocationCount = 3, invocationTimeOut = 2000)
    public void testCaseB(){
        System.out.println("Test Case B");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("Before Method");
    }
}
