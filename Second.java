package second;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true)
            try{
                int num = 20;
                int[] arr = new int[num];
                int[] arr1 =  {12,1,32,44,23,1,54,3,23,65,54,3,2,4,42,32,2,3,12,33};
                Random random = new Random();
                for (int i = 0; i < num; i++) {
                    arr[i]=random.nextInt(1,100);
                }
//                System.out.println(Arrays.toString(arr));
                int you = scanner.nextInt();
                System.out.println("Element at index "+you+" is "+arr1[you]);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Try again");
            }
        }
}

