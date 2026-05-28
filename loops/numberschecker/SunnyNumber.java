package loops.numberschecker;
import java.util.*;

public class SunnyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int sunnyNumber = sc.nextInt();
        int temp = sunnyNumber;
        int number = (temp + 1);
        int sqrt =(int) Math.sqrt(number);
        if((temp + 1) % sqrt == 0){
            System.out.println("Enter number is a sunny number = "+sunnyNumber);
        }else{
            System.out.println("Enter number is not a sunny number = "+sunnyNumber);
        }
        System.out.println(sqrt);
        System.out.println((sunnyNumber + 1) % sqrt);
        sc.close();
    }
    
}
