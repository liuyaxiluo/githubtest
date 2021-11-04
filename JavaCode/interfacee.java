import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class interfacee {
    public static void main(String[] args){
        //Hello1 test = new HelloWord();
        //test.morning("liugangcai");
        System.out.println(11);

    }   
}
interface Hello1{
    void morning(String name);
}
/*class HelloWord implements Hello1{
    public void morning(String name){
        System.out.println("good morning"+" "+name);
    }
}*/
