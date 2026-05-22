package bitwise;
import java.util.*;

public class ToggleNthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to Toggle nth bit");
        int number = sc.nextInt();
        System.out.println("Enter position to toggle that bit");
        int position = sc.nextInt();
        int newNumber = number ^ (1 << position);
        System.out.println("New number after toggle nth position of bit is  = "+newNumber);
        sc.close();
    }
    
}
