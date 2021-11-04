import java.util.Map;
import java.util.HashMap;
public class Maptest {
    public static void main(String[] args){
        Studenttest ss  =new Studenttest("Ali",22);
        Map< String,Integer > map = new HashMap<>();
        map.put("liu",199);
        map.put("gangcai",188);
        System.out.println(map.get("liu"));
        System.out.println(ss.hashCode());
        Studenttest ss1 = new Studenttest("aaa",23);
        System.out.println(ss1.hashCode());
    }
}
class Studenttest{
    public String name;
    public int score;
    public Studenttest(String name,int score){
        this.name =name;
        this.score=score;
    }
}
