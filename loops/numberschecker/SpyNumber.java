package loops.numberschecker;
import java.util.*;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int originalNumber = number;
        int product = 1,sum = 0;
        while(number > 0){
            int remainder = number % 10;
            sum = sum + remainder;
            product = product * remainder;
            number = number / 10;
        }
        if(sum == product){
            System.out.println("Enter number is a spy number = "+originalNumber);
        }else{
            System.out.println("Enter number is not a spy number = "+originalNumber);
        }
        sc.close();
    }
    
}
