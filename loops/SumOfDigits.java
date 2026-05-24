package loops;
import java.util.*;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your digits to find sum of them");
        int number  = sc.nextInt();
        int sum = 0;
        while(number > 0){
            int remender = number % 10;
            sum = sum + remender;
            number = number / 10;
            }
            System.out.println("Your sum is  = "+sum);
            sc.close();

    }
    
}
