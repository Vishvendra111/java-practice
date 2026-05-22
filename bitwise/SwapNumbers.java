package bitwise;
import java.util.*;

public class SwapNumbers {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int temp = num1 ^ num2;
        num1 = temp ^ num1;
        num2 = temp ^ num2;
        System.out.println("The value of num1 after swaping  = "+num1);
        System.out.println("The value of num2 after swaping  = "+num2);
        sc.close();

    }
    
}
