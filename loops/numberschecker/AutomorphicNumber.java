package loops.numberschecker;
import java.util.*;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int squreNumber = number * number;
        int temp = squreNumber;
        int count = 0;
        int sum = 0;
        while(squreNumber > 0){
             squreNumber = squreNumber / 10;
            count++;
            
        }
        squreNumber = temp;
        int power = 0;
        while(count > 1){
            int remainder = squreNumber % 10;
            sum = sum + (remainder *(int) Math.pow(10,power));
            count--;
            power++;
            squreNumber = squreNumber / 10;
        }
        if(sum == number){
            System.out.println("Enter number is a automorphic number = "+number);
        }
        else{
            System.out.println("Enter number is not automorphic number = "+number);
        }
        sc.close();

        

        
        

        

            
        
    }
    
}
