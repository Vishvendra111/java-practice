package bitwise;
import java.util.*;

public class DivideByTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int afterDivision = number >> 1;
        System.out.println("number after division by 2 is  = "+afterDivision);
        sc.close();


        

    }

    
}
