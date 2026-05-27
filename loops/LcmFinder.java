package loops;
import java.util.*;

public class LcmFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two  numbers ");
        int num1  = sc.nextInt();
        int num2 = sc.nextInt();
        int divident = 1;
        while(divident > 0){
            if(divident % num1 == 0 && divident % num2 == 0){
              break;
            }
            divident++;
        }
        System.out.println("lcm is = "+divident);
        sc.close();
    }
}
        
        
        
            
        

    
    

