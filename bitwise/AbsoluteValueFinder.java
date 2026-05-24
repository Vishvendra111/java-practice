package bitwise;
import java.util.*;

public class AbsoluteValueFinder {
    public static void main(String[] args) {
        System.out.println("Enter a number to convert absolute value");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int absoluteNumber = Math.abs(number);
        System.out.println("Your absolute number is  = "+absoluteNumber);
        sc.close();
    }
    
}
