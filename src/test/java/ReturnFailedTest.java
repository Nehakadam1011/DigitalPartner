import org.testng.Assert;
import org.testng.annotations.Test;

public class ReturnFailedTest {
    @Test(retryAnalyzer = FailedTestCases.class)
    public void classA(){
        System.out.println("Class A");
        Assert.assertTrue(false);
    }
    @Test(retryAnalyzer = FailedTestCases.class)
    public void classB(){
        System.out.println("Class B");
    }
    @Test(retryAnalyzer = FailedTestCases.class)
    public void classC(){
        System.out.println("Class C");
    }
}
