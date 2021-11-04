import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

public class reflection {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException,
    IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException{
        //static{System.out.println("this is first method");}
        Person2 p1 = new Person2("liuxixi", 100);
        Class p2class = p1.getClass();
        System.out.println(p2class);
        System.out.println(p2class.getSuperclass());
        Class p3class = Person2.class;
        System.out.println(p3class);
        System.out.println(p2class.getSimpleName());
        System.out.println(p2class.getName());
        System.out.println(p2class.getModifiers());
        Field[] allfield = p2class.getFields();
        for (Field field:allfield){
            System.out.println(field);
        }
        Student s1 = new Student();
        System.out.println(s1);
        Class stuclass = s1.getClass();
        Field[] stufield = stuclass.getDeclaredFields();
        for (Field field:stufield){
            System.out.println(field);
        }
        //Method helloMethod = stuclass.getMethod("hello", parameterTypes:null);
        //Method hello = stuclass.getMethod(name:"hello", parameterTypes:null);
        Constructor[] stucon = stuclass.getConstructors();
        for (Constructor con:stucon){
            System.out.println(con);
        }
        Student stu2 = (Student) stuclass.getDeclaredConstructor().newInstance();
        System.out.println(stu2);
        //Class c1 = 
       // Person2 p2 = (Person2) p2class.newInstance();
       Method helloMethod = stuclass.getMethod("hello");
       helloMethod.invoke(stu2, args);
       //Field nameField = stuclass.getDeclaredField("name");
       Field nameField = stuclass.getDeclaredField("name");
       nameField.setAccessible(true);
       nameField.set(stu2, "liuxux");
       System.out.println(stu2.getName());
       //System.out.println(nameField);
       //nameField.set(stu2, "luxuxu");


 


    }}
class Person1{
    public void hello(){
        System.out.println("Person1:hello");
    }
}
class Student extends Person1 {
    private String name;
    int age;
    @Override
    public void hello(){
        System.out.println("Student:hello");

    }
    public String getName(){
        return this.name;
    }

}