package loops;
import java.util.*;

public class ArmstrongNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check armstronge or not");
        int number  = sc.nextInt();
        int count = 0;
        int sum = 0;
        int temp1 = number;
        int temp = number;
        while(temp > 0){
            count++;
            temp = temp / 10;
        }
        while(temp1 > 0){
            int digit = temp1 % 10;
            sum = sum +(int)( Math.pow(digit,count));
            temp1 =  temp1 / 10;
        }
        if(number == sum){
            System.out.println("Enter number is armstrongeNumber ="+number);
        }else{
            System.out.println("Enter number is not armstrongeNumber  = "+number);
        }
        sc.close();
    }
}
            

        
    
    

