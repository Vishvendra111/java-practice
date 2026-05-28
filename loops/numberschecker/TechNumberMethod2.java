package loops.numberschecker;
import java.util.*;

public class TechNumberMethod2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int temp = number;
        int count = 0;
        while(temp > 0){
            temp = temp / 10;
            count++;
        }if(count % 2 == 0){
            int splitDivisor =(int)Math.pow(10,count / 2);
            int rightHalf = number % splitDivisor;
            int leftHalf = number / splitDivisor;
            int sum = rightHalf + leftHalf;
            int product = sum * sum;
            if(product == number){
                System.out.println("Enter number is temp number = "+number);
            }
        }else{
            System.out.println("Enter number is not a temp number = "+number);
        }
        sc.close();
    }
}

            
        
    
    

