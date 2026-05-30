package methods;
import java.util.*;

public class primeNumbers {
    public static boolean primeNum(int n){
        for (int divisor = 2; divisor * divisor <= n ; divisor++){
            if (n % divisor == 0) {
               return false ;
            }
        }
        return true;
    }
    public static void prime(int num){
        for(int i = 2; i <= num; i++){
            if(primeNum(i)){
                System.out.print(i+" ");
            }
        }
    }
     public static void main(String arg[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            int number = sc.nextInt();
            prime(number);
            
            sc.close();
        }
    }

            
            
             
            

        
    
                
            
    

