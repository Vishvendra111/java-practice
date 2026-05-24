package loops;
import java.util.*;

public class ReverseNumber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number to reverse");
        int number = sc.nextInt();
        System.out.println("your reverse number is  = ");
        while(number > 0){
            int remender = number % 10;
            System.out.print(remender);
             number = number / 10;
        }
        sc.close();
    }
}
