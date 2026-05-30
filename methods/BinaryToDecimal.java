package methods;
import java.util.*;

public class BinaryToDecimal {
    public static void bTD(int n){
        int power = 0;
        int decimal = 0;
        while (n > 0){
            int bit = n % 10;
            decimal = decimal + (bit * (int)Math.pow(2,power));
            n = n / 10;
            
            power++;
            
        }
        System.out.println("Decimal value is  = "+decimal);
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary number");
        int number = sc.nextInt();
        bTD(number);
        sc.close();
    }
}

        
    
    

