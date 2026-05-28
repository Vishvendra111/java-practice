package loops.numberschecker;
import java.util.*;

public class NeonNumber {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int number = sc.nextInt();
    int squreNumber = number * number;
    int sum = 0;
    while(squreNumber > 0){
        int remainder = squreNumber % 10;
        sum = sum + remainder;
        squreNumber = squreNumber / 10;
    }
    if(number == sum){
        System.out.println("Enter number is a neon number = "+number);
    }else{
        System.out.println("Enter number is not a neon number = "+number);
    }
    sc.close();
}
    
}
