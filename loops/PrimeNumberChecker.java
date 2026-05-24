package loops;
import java.util.*;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number to check prime or not");
        int number = sc.nextInt();
        int divisor = 1;
        int count = 0;
        
        while(divisor <= number){
            while(number % divisor == 0){
                count++;
                divisor++;
            }
            divisor++;
        }
        if(count == 2){
            System.out.println("Your number is a prime number = "+number);
        }else{
            System.out.println("Your number is not a prime number = "+number);
        }
        sc.close();
    }
    
}
