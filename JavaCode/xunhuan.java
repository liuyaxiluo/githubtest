import java.beans.BeanInfo;
import java.text.NumberFormat.Style;
import java.util.Arrays;
import java.util.StringJoiner;

//import jdk.vm.ci.code.site.Site;

import java.beans.*;
public class xunhuan {
    public static void main(String[] args){
        //System.out.println("aaa");
        //int[] data = {1,2,3,4,5,6,7,7,1,3,1,1};
        //for (int n:data){System.out.println(n);}
        //System.out.println(Arrays.toString(data));
        int[][] ns = {
            {1,2,3,4,5,6},
            {2,3,4,5,6,7},
            {6,7,8,9,9,0}
        };
        //System.out.println(ns);
       /* for (int[] arr:ns){
            for (int n:arr){
                System.out.println(n);
            }
        }*/
        System.out.println(1+1);
        String s3 = "abcd";
        String s4 = "abcd";
        String s5 = "abcd";
        System.out.println(s3.equals(s4));
        s3.contains(s4);
        String s6 = " abc ";
        System.out.println(s6.trim());
        String s7 = "";
        System.out.println(s7.isEmpty());
        System.out.println(s3.toCharArray());
        for (char ch:s3.toCharArray())
        {System.out.println(ch);}
        System.out.println(s3);
        char[] ss={'a','b','c'};
        String s9 = new String(ss);
        StringBuilder sb = new StringBuilder(1024);
        for (int i=1;i<=100;i++){
            sb.append(".");
            sb.append(i);
        }
        String sss = sb.toString();
        System.out.println(sss.length());
        StringJoiner join = new StringJoiner(",");
        String[] group = {"liu","gangcai","yangbin"};
        for (String str:group){
            join.add(str);
        }
        System.out.println(join.toString());
        var soin = String.join("**",group);
        System.out.println(soin);
        //Integer i = new Integer(2);
        //System.out.println(i.value());
        Integer n = 100;
        System.out.println(n+100);
        Integer j = null;
        //int i = j;
        Integer x = 127;
        Integer y = 127;
        Integer m = 99999;
        Integer q = 99999;
        System.out.println("x==y :"+(x==y));
        System.out.println("m==n1 :"+(m==q));
        System.out.println(x.equals(y));
        int x1 = Integer.parseInt("100");
        Person p = new Person();
        p.setAge(1313);
        System.out.println(p.getAge());
        //BeanInfo info = introspector.getBeanInfo(Person.class);
        Weekday week = Weekday.MON;
        if (week == Weekday.SUM){
            System.out.println("today we can stay at home");
        }
        else{System.out.println("today we should workc");}

        System.out.println(Weekday.SUM.ordinal());
        System.out.println(Weekday.SUM.name());
        Class cls = String.class;
        System.out.println(cls);


    }    
}
/*class Integer{
    private int value;
    public Integer(int value){
        this.value = value;
    }
    public int value(){
        return this.value;
    }
}*/
class Person{
    private String name;
    private int age;
    public String getName() {return this.name;}
    public int getAge(){return this.age;}
    public void setAge(int age){this.age = age;}    
}
enum Weekday{
    SUM,MON,TUE,WED,THD,THU,FRIDAY
}