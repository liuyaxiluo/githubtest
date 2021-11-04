import java.util.List;
import java.util.ArrayList;


public class AnnotainTest {
    @Deprecated
    public static void DepreTest(){
        System.out.println("this method is out");
    }
    public static void main(String[] args) {
        DepreTest();
    }
    @SuppressWarnings("all")
    public void test2(){
        List list = new ArrayList();
    }
}

