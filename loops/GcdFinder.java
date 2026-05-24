package loops;
import java.util.*;

public class GcdFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter two numbers to find out GCD");
        int number1 = sc.nextInt(),number2 = sc.nextInt();
        int minNumber = 0;
        if(number1 >= number2){
            minNumber = number1;
        }else{
            minNumber = number2;
        }
        int gcd = 1;
        int divisor = 2;
        while(divisor <= minNumber){
            if((number1 % divisor == 0) && (number2 % divisor) == 0){
                gcd = gcd * divisor;
                number1 = number1 / divisor;
                number2 = number2 / divisor;
                divisor++;
            }else{
                divisor++;
            }

        }
        System.out.println("Your gretest commen divisor is  = "+gcd);
        sc.close();
    }
}

                
            
        

    

    
    

