package loops;
import java.util.*;

public class PowerFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and expression number");
        long base = sc.nextLong();
        int exp = sc.nextInt();
        long result = 1;
        while(exp > 0){
            if(exp % 2 == 1){
                 result = result * base;
            }
            base *= base;
            exp /= 2;
        }
        System.out.println("Result is = "+result);
        sc.close();
    }
}

        
    
    

