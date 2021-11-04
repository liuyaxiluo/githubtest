

public class StringTest {
     public static void main(String[] args) {
        String greeting = "Hello";
        String s = greeting.substring(0,3);
        String s1 = greeting.substring(2,3);
        System.out.println(s);
        System.out.println(s1);
        String s3=greeting + s;
        System.out.println(s3);
        String all = String.join(s,"/",s1,"/",s3);
        System.out.println(all);
        boolean s4=s.equals(s3);
        System.out.println(s4);
        int length=s.length();
        System.out.println(length);
        String kong = "";
        System.out.println(kong.equals(""));
        System.out.println(greeting.startsWith("Hell"));
        System.out.println(greeting.indexOf("llo"));
        StringBuilder builder = new StringBuilder();
        String str1 = "liu";
        String str2 = "gang";
        builder.append(str1);
        builder.append(str2);
        String all_str=builder.toString();
        System.out.println(builder.length());
               
    }
}
