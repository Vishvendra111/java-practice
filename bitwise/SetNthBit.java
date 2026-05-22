package bitwise;
import java.util.*;

public class SetNthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to change bit");
        int number = sc.nextInt();

        System.out.println("Enter position to set 1/0 that position");
        int position = sc.nextInt();

        System.out.println("Enter your bit(1/0) to replace orginal bit");
        int bit = sc.nextInt();
        int newNumber;

        if(bit == 1){
           newNumber = number | (1 << position);
           System.out.println("Your new number is  = "+newNumber);
           
        }else{
            newNumber = number & (~ (1 << position));
            System.out.println("Your new number is  = "+newNumber);
        }
        sc.close();


    }
    
}
