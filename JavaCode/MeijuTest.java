public class MeijuTest {
     public static void main(String[] args) {
        System.out.println("liuxixi");
        ColorEnum color = ColorEnum.RED;


        
    }
}
enum ColorEnum{
    RED,GREEN,BLACk,YELLOW
}
enum ErrorcodeEnum{
    SUCCESS(1000,"success");
    PARAM_ERROR(1001,"parameter error");
    private int code;
    private String msg;
    ErrorcodeEnum(int code, String msg){
        
    }



}