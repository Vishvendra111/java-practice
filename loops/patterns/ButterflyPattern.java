package loops.patterns;
import java.util.*;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        for(int line = 1; line <= number; line++){
            for(int star = 1; star <= line; star++){
                System.out.print("*");
            }
            for(int space = 1; space <= 2 * (number - line); space++){
                System.out.print(" ");
            }
            for(int star = 1; star <= line; star++){
                System.out.print("*");
            }
            System.out.println();
        }
            
            for(int revline = number; revline >= 1; revline--){
            for(int star = 1; star <= revline; star++){
                System.out.print("*");
            }
            for(int space = 1; space <= 2 * (number - revline); space++){
                System.out.print(" ");
            }
            for(int star = 1; star <= revline; star++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
        
        
                        
                    

                    

                
            
        
    

    

