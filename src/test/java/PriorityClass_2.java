import org.testng.annotations.Test;

public class PriorityClass_2 {
    @Test(priority = 2)
    public void testCaseZ(){
        System.out.println("Test Case Z");
    }
    @Test
    public void testCaseY(){
        System.out.println("Test Case Y");
    }
    @Test(priority = 1)
    public void testCaseX(){
        System.out.println("Test Case X");
    }
}
