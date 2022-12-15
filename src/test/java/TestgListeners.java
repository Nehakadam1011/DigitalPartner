import org.testng.Assert;
import org.testng.annotations.Test;

public class TestgListeners {

    @Test
    public void classA(){
        System.out.println("Class A");
        Assert.assertTrue(false);
    }
    @Test
    public void classB(){
        System.out.println("Class B");
    }
    @Test
    public void classC(){
        System.out.println("Class C");
    }
}
