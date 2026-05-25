package loops;
import java.util.*;

public class PrimeNumbersFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find its prime numbers");
        int number  = sc.nextInt();
        int divident = 2;
        int divisor = 1;
        int count = 0;
        System.out.println("primes numbers are :");
        while(number >= divident){
            while(divident >= divisor){
                if(divident % divisor == 0){
                    count++;
                }
                divisor++;
            }
            if(count == 2)
            System.out.print(divident+" ");
            divisor = 1;
            divident++;
            count = 0;
        }
        
        sc.close();
    }
}
    

