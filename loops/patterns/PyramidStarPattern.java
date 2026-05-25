package loops.patterns;
import java.util.*;

public class PyramidStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        
        for(int line = 1; line <= number; line++){
            for(int space = number; space <= number - line; space--){
                System.out.print("  ");
            }
                for(int star = 1; star <= (2 * line - 1); star++){
                    System.out.print(" *");
                }
                System.out.println();
            }
            sc.close();
        }
    }
    


        
            
            

            
           
            
        
        
    
    

