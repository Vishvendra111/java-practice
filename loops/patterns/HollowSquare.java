package loops.patterns;
import java.util.*;

public class HollowSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        for(int line = 1; line <= number; line++){
            if((line == 1) || (line == number)){
                for(int star = 1; star <= number; star++){
                System.out.print("* ");
                }
            }else{
                for(int star = 1; star <= 2; star++){
                    System.out.print("* ");
                    if(star == 1){
                        for(int space = 1; space <= (number - 2); space++)
                            System.out.print("  ");
                    }
                }
            }
            System.out.println();
        
        }
        sc.close();
    }
    
}
