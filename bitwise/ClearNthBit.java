package bitwise;

import java.util.*;

public class ClearNthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number  = sc.nextInt();
        System.out.println("Enter position to clear nth bit");
        int position = sc.nextInt();
        int newNumber = number & (~(1 << position));
        System.out.println("new number after clear nth bit is  = "+newNumber);
        sc.close();

        
    }
    
}
