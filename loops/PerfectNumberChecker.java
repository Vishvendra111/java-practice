package loops;
import java.util.*;

public class PerfectNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check perfect or not :");
        int number = sc.nextInt();
        int sum = 0;
        int divisor = 1;
        while(number > divisor){
            if(number % divisor == 0){
                sum = sum + divisor;
                
            }
            divisor++;
        }if(number == sum){
        System.out.println("Enter number is perfect number = "+number);
        }else{
            System.out.println("Enter number is not a perfect number :"+number);
        }
        sc.close();
    }
    
}
