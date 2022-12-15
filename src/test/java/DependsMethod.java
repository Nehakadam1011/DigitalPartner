import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsMethod {
    @Test()
    public void verifyLogin(){
        System.out.println("Verif Login");
        Assert.assertTrue(false);
    }
    @Test(dependsOnMethods = {"verifyLogin"})
    public void verifyHomepage(){
        System.out.println("Verif Homepage");
    }
    @Test()
    public void verifyNotificationTab(){
        System.out.println("Verif Notification Tab");
    }
}
