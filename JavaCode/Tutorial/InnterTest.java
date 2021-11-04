package Tutorial;

public class InnterTest {
    public static void main(String[] args){
        Outer.Inner inner = new Outer.Inner();
        inner.showAge();

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
