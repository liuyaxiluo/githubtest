import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
public class TestCollections {
    public static void main(String[] args){
        System.out.println(11);
        String[] ss = new String[10];
        ss[0] = "hello";
        ss[1] = "world";
        ss[2] = "java";
        List<String> list1 = new ArrayList<>();
        list1.add(ss[0]);
        list1.add(ss[1]);
        list1.add(ss[2]);
        String item1 = list1.get(0);
        System.out.println(item1);
        for (Iterator<String> it = list1.iterator();it.hasNext();){
            String s = it.next();
            System.out.println(s);
        }
        String[] stringarray = list1.toArray(new String[list1.size()]);
        List<String> list2 = List.of(stringarray);
        
        System.out.println(list2.indexOf("hello"));
        System.out.println(list2.indexOf("world"));
        System.out.println(list2.contains("hello"));
        List<Persontest> personlist = List.of(new Persontest("Ali",21),
        new Persontest("Bob",22),new Persontest("Cc",33));
        System.out.println(personlist.contains(new Persontest("Bob",22)));


        }
}
class Persontest{
    String name;
    int age;
    public Persontest(String name,int age){
        this.name = name;
        this.age = age;

    }
    //对于新建的类， 如果来实现集合中的index等方法，必须要改写equals方法
    public boolean equals(Object o){
        if(o instanceof Persontest){
            Persontest p = (Persontest) o;
            return Objects.equals(this.name,p.name) && this.age==p.age;

        }
        return false;
    }
}
