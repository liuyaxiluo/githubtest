package Tutorial;
public class First{
    public static void main(String[] args){
        System.out.println(113);
        TestClass test111 = new TestClass();
        System.out.println(test111.getId());
        TestClass1 newTest = new TestClass1("l",23,2000);
        System.out.println(newTest.getName());
    }
}


class TestClass{
    private String name;
    private int age;
    public TestClass(String name, int age){
        this.name = name;
        this.age = age;

    }
    public TestClass(){
        //this();
    }
    private static final int Id=100;
    public static int getId(){
        return Id;}
    public String getName(){
        return this.name;}
    public int getAge(){return this.age;}
}
class TestClass1 extends TestClass{
    private int bonus;
    public TestClass1(String name, int age,int bonus){
        super(name, age);
        this.bonus=bonus;
    }
    public String getName(){
        String name = super.getName();
        return name;}
    

}