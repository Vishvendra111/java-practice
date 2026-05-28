package loops.numberschecker;
import java.util.*;

public class StrongeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int orginalNumber = number;
        int factorial = 1;
        int sum = 0;
        while( number > 0){
            int remainder = number % 10;
            for(int i = remainder; i >= 1; i--){
                factorial = factorial * i;
            }
            sum = sum + factorial;
            number = number / 10;
            factorial = 1;
        }
        if(orginalNumber == sum){
            System.out.println("number is a stronge number  = "+orginalNumber);
        }else{
            System.out.println("number is not stronge number = "+orginalNumber);
        }
        sc.close();
    }
}


        

        
    


