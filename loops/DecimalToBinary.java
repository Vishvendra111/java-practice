package loops;
import java.util.*;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        while(number > 0){
            int remainder = number % 2;
            int result = remainder ^ 1;
            System.out.print(result);
            number = number / 2;
        }

        sc.close();
    }
}


            
        

    
    

