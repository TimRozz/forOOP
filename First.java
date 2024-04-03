package first;
import java.util.InputMismatchException;
import java.util.Scanner;
public class First{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            try{
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                System.out.println(x+" + "+y+" = "+(x+y));
            }catch(InputMismatchException e){
                System.out.println("Wrong input,try again");
                scanner.next();
            }
        }
    }
}