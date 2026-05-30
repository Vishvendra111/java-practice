package methods;
import java.util.*;
public class primeNumber {
    public static boolean primeNum(int n){
        for (int divisor = 2; divisor * divisor <= n ; divisor++){
            if (n % divisor == 0) {
               return false ;
            }
        }
        return true;
    }
    public static void main(String arg[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            int number = sc.nextInt();
            if (primeNum(number)) {
                System.out.println("Enter number is a prime number: "+number);
            }else{
                System.out.println("Enter number is not a prime number: "+number);
            }
             
            sc.close();

        }
    }
                
            
        
    
    

