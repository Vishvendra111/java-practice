package loops.numberschecker;
import java.util.*;

public class SpecialNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int temp = number;
        int sum = 0,product = 1;
        while(temp > 0){
            int remainder = temp % 10;
             sum = sum + remainder;
             product = product * remainder;
             temp = temp / 10;
        }
        int tempNumber = sum + product;
        if(tempNumber == number){
            System.out.println("Enter number is a special number = "+number);
        }else{
            System.out.println("Enter number is not special number = "+number);
        }
        sc.close();
    }
    
}
