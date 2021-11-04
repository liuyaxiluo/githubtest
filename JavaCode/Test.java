import java.lang.ClassLoader;
public class Test {
     public static void main(String[] args) {
        ClassLoader loader = Test.class.getClassLoader();
        System.out.println(loader);
        ClassLoader loader2 = loader.getParent();
        System.out.println(loader2);
        //Outer.Inner inner = new Outer.Inner();
        //inner.showAge();


    }
}
class Outer{
    public int age=10;
    class Inner{
        public int age =100;
        public void showAge(){
            int age=1000;
            System.out.println(age);
            System.out.println(this.age);
            System.out.println(Outer.this.age);
        }
    }
}