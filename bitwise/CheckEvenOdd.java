package bitwise;
import java.util.*;

public class CheckEvenOdd {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check Even or Odd");
        int number = sc.nextInt();
        if((number & 1)  == 0){
            System.out.println("Number is a Even  = "+number);
        }else{
            System.out.println("Number is odd = "+number);
        }
        
        sc.close();


    }
    
}
