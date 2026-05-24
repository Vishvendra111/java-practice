package loops;
import java.util.*;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to count digits");
        int number = sc.nextInt();
        int number1 = number;
        int number2 = number;
        int number3 = number;
        int count = 0;
        do{
            number = number / 10;
            count++;
        }while(number > 0);
        System.out.println("Your number digits is = "+count);
        sc.close();
        //method2
        int count1 = String.valueOf(number1).length();
        System.out.println("Digits = "+count1);
        //method3
        if(number < 0){
            int count2 = String.valueOf(Math.abs(number2)).length();
            System.out.println("digits is = "+count2);
            //method4
            int count3 = (int)(Math.log10(number3))+1;
            System.out.println("digit is  = "+count3);

        }


    }
}
            
        
    
    

