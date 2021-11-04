import java.util.List;
import java.util.ListIterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linktest {
    public static void main(String[] args) {

        //System.out.println(11);
        List<String> listtest = new LinkedList<>();
        listtest.add("liu");
        listtest.add("gangcai");
        listtest.add("yangbin");
        ListIterator<String> itertest = listtest.listIterator();
        String s =itertest.next();
        System.out.println(s);
        System.out.println(itertest.next());
        System.out.println(s);

    }
}
