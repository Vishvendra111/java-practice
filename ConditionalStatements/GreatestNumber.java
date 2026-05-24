package conditionalstatements;
import java.util.*;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 4 numbers num1 , num2 ,num3 ,num4 respectivlly");
        double num1 =  99.0 / 89,num2 = 99.0/ 79, num3 = 89.0 / 99, num4 = 89.0 / 79;

        if((num1 > num2) && (num1 > num3) && (num1 > num4)){
            System.out.println("num1 is a greatest number amoung 4  = "+num1);

        }else if((num2 > num3) && (num2 > num4)){
            System.out.println("num2 is a greatest number amoung 4 = "+num2);

        }else if((num3 > num4)){
            System.out.println("num3 is a greatest number amoung 4  =  "+num3);

        }else{
            System.out.println("num4 is a greatest number amoung 4 = "+num4);
        }
        sc.close();
    }
    
}
