import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class zhujietest {
    @MyAnnotation
    public void test1(){

    }
}
@Target(value = {ElementType.METHOD,ElementType.TYPE})
@Retention(value = RetentionPolicy.RUNTIME)
@interface MyAnnotation{
    String name() default "";
    int age() default 1;
    int id() default -1;
    String[] schools() default {"UESETC","NSMC"};
    



}