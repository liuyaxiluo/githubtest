import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
public class fanxing {
    public static void main(String[] args){
        List<String> strr = new ArrayList<String>();
        strr.add("liugangcai");
        strr.add("liuxixi");
        strr.add("hahaa");
        System.out.println(strr.toString());
        Map<String,Integer> maptest= new HashMap<String,Integer>();
        maptest.put("Tome",18);
        maptest.put("liu",22);
        maptest.put("xixi",111);
        Set<Map.Entry<String,Integer>> entry=maptest.entrySet();
        Iterator<Map.Entry<String,Integer>> e = entry.iterator();
        while(e.hasNext()){
            Map.Entry<String,Integer> q = e.next();
            String key = q.getKey();
            Integer value = q.getValue();
            System.out.println(key+value);

        }
        OrderTest<String> ordertest = new OrderTest();
        ordertest.setOrderT("liuxixi");
        System.out.println(ordertest.getOrderT());





    }
    
}
class Person2 implements Comparable<Person2>{
    String name;
    int score;
    Person2(String name,int score){
        this.name=name;
        this.score=score;

    }
    public int compareTo(Person2 other){
        return this.name.compareTo(other.name);
    }
    public String toString(){
       return this.name+","+this.score; }
}
class Fantest<T>{
    T name;
    public Fantest(T name){
        this.name = name;
    }
    public T getName(){
        return this.name;
    }
    public void setName(T name){
        this.name = name;
    }
}
class OrderTest<T>{
    String orderName;
    Integer orderId;
    T orderT;
    public OrderTest(){};
    public OrderTest(String name,Integer orderId,T orderT){
        this.orderName=name;
        this.orderId=orderId;
        this.orderT=orderT;
    }
    public T getOrderT(){
        return this.orderT;
    }
    public void setOrderT(T t){
        this.orderT=t;
    }
}