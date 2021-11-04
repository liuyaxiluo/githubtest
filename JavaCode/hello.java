import java.time.LocalDate;
import java.util.*;

public class hello{
     public static void main(String[] args) {
        System.out.println("hello,VS code");
        System.out.println("this is my test java file");
        System.out.println(10+3);
        final char zifu = 'c';
        System.out.println(zifu);
        int a = 10;
        System.out.println(a<<1);
        for (int i =1;i<=5;i++){
            System.out.println(a<<i);
        }
        System.out.println(true && false);
        char d = 'a';
        //System.out.println(int(d));
        String f = "\"";
        System.out.println(f);
        //String s = "hello";
        //String t = s;
        //s = "word";
        //System.out.println(t);
        String[] sss = {"a","b","c"};
        String s1 = sss[1];
        System.out.println(s1);
        sss[1] = "ef";
        System.out.println(s1);
        double x = 12.52;
        System.out.println(x);
        int x1 = (int) x;
        System.out.println(x1);
        System.out.println(1+x1*2);
        Size a1  = Size.LAEGE;
        String a2 = "liugangcaii";
        String a3 = a2;
        System.out.println(System.identityHashCode(a2));
        a2 = a2.substring(0,3)+"xixi";
        System.out.println(a2);
        System.out.println(System.identityHashCode(a2));
        System.out.println(System.identityHashCode(a3));
        System.out.println(a2==a3);
        System.out.println(a3.equals("liugangcai"));
        StringBuilder  bl = new StringBuilder();
        bl.append("liu");
        bl.append("gangcai");
        bl.insert(1,"xixi");
        bl.setCharAt(1, '5');
        System.out.println(bl.toString());
        System.out.println("test_________");
        Scanner in = new Scanner(System.in);
        //String testin = in.next();
        //System.out.println(testin+"lxixixi");
        System.out.println("liuxi");
        System.out.printf("my name is %s, my age is %d \n","liugangcai",16);
        int[] shuzu1 = new int[]{1,2,3,4,5};
        for (int i:shuzu1){
            if (i==3){
                break;
            }
            System.out.println(i);

        }
        //System.out.println()
        System.out.println(new Date());
        LocalDate timetest = LocalDate.now();
        //int nowyear = timetest.getYear();
        int nowmonth = timetest.getMonthValue();
        int nowday = timetest.getDayOfMonth();
        LocalDate newtime1 = LocalDate.of(1999,12,31);
        //System.out.println(newtime1.plusDays(100000));
        LocalDate newtime2 = newtime1.plusDays(100000);
        System.out.println(newtime2.getYear());
   
    }
    enum Size{SMALL,MEDIUM,LAEGE};

}