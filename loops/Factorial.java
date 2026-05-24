package loops;
import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number to find factorial ");
        int number = sc.nextInt();
        int times = number;
        int factorial = 1;
        for(int i = 1 ; i <= times; i++){
            factorial = factorial*number;
            number--;
        }
        System.out.println("Your factorial is  = "+factorial);
        sc.close();
        
    }
    
    
}
