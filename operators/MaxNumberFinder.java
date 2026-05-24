package operators;
import java.util.*;

public class MaxNumberFinder {
    public static void main(String[] args) {
        System.out.println("Enter two numbers (like 1,2)");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(),num2 = sc.nextInt();
        int max = (num1 + num2 + Math.abs(num1 - num2)) / 2;
        System.out.println("Your max number is  = "+max);
        //
        System.out.println("Second method");
        int diff = num1 - num2;
        int sign = (diff >> 31) & 1;
        int maximum = num1 - sign * diff;
        System.out.println(maximum);
        sc.close();
    }
    
}
