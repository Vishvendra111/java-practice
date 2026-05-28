package loops.numberschecker;
import java.util.*;

public class HarshedNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number = sc.nextInt();
        int temp = number;
        int sum = 0,power = 0;
        while(temp > 0){
            int remainder = temp % 10;
            sum = sum + remainder *(int)Math.pow(10,power);
            temp = temp / 10;
        }
        if(number % sum == 0){
            System.out.println("Enter number is a harshed number = "+number);
        }else{
            System.out.println("Enter number is not a harshed number = "+number);
        }
        sc.close();
    }
    
}
