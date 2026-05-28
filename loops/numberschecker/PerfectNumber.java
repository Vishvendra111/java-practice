package loops.numberschecker;
import java.util.*;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int originalNumber = number;
        int divisor = 1;
        int sum = 0;
        while( divisor <= number / 2){
            if(number % divisor == 0){
                sum = sum + divisor;
            } 
            divisor++;
        }
        if(sum == originalNumber){
            System.out.println("enter number is perfect number = "+originalNumber);
        }else{
            System.out.println("Enter number is not perfect number = "+originalNumber);
        }
        sc.close();
    }
    
}
