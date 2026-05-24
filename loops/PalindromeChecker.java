package loops;
import java.util.*;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check palindrome or not");
        int number  = sc.nextInt();
        if(number < 0){
            System.out.println("Error! Please enter positive number");
        }
        int reverse = 0;
        int temp = number;
        while(temp > 0){
            int remender = temp % 10;
            reverse = (reverse * 10) + remender;
            temp = temp / 10;
        }
        if(reverse == number){
            System.out.println("Your number is a palindrom number = "+reverse);
        }else{
            System.out.println("Your number is not a palindrom = "+reverse);
        }
        sc.close();
    }
}

        
        

        
    
    

