public class ConditionTest {
     public static void main(String[] args) {
        int a= 10;
        if (a>12){
            System.out.println(a);
        }
        else{
            System.out.println("a <=12");
        }
        boolean b = true;
        int n=0;
        while (b){
            a=a+1;
            n+=1;

            if (a==100000){
                b=false;
            }
        }
        System.out.println(n);
        
    }
}
