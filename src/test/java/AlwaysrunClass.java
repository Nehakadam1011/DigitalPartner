import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysrunClass {
    @Test()
    public void verifyLogin(){
        System.out.println("Verify Login");
        Assert.assertTrue(false);
    }
    @Test(dependsOnMethods = {"verifyLogin"}, alwaysRun = true)
    public void verifyHomepage(){
        System.out.println("Verify Homepage");
    }
    @Test(dependsOnMethods = {"verifyLogin"})
    public void verifyNotificationTab(){
        System.out.println("Verify Notification Tab");
    }
}
