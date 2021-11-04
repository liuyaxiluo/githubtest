package Tutorial;

import java.util.Arrays;

public class shuzu {
    

    
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        for (int i =0; i<10; i++){
            arr1[i]=i;
        }
        for (int element : arr1){
            System.out.println(element);
        }
        int[] arr2 = Arrays.copyOf(arr1, 10);
        System.out.println(arr2.length);
        int[] arr3 ={2,3,4,51,1,3,6};
         Arrays.sort(arr3);
         for (int element:arr3){
             System.out.println(element);
         }
         
    }
}
