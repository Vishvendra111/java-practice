package loops;
import java.util.*;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        System.out.println("fibonacci series is = ");
        int num1 = 0,num2 = 1;
        System.out.print(num1);
        System.out.print(" "+ num2);
        int count = 2;
        while(count < num){
            int result = num1 + num2;
            System.out.print( " "+result);
            num1 = num2;
            num2 = result;
            count++;
        }
        sc.close();
    }
}


        

    
    

