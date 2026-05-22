package bitwise;
import java.util.*;

public class CountSetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int originalNumber = number;
        int count = 0;
        while(number > 0){
            number = number & (number - 1);
            count++;
        }
        System.out.println("the orginal number is  = "+originalNumber +" in total count set bits is = "+count++);
        sc.close();

    }

    }
        
    

