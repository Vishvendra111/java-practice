package bitwise;
import java.util.*;

public class FindNthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number = sc.nextInt();
        System.out.println("Enter nth position of a bit");
        int position  = sc.nextInt();
        int bit = (number >> (position )) & 1;
        System.out.println("The nth position bit is  = "+bit);
        sc.close();



    }
}
