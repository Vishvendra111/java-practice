package loops.patterns;
import java.util.*;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        
        for(int line = 1; line <= number; line++){
            for(int space = 1; space <= number - line; space++){
                System.out.print("  ");
            }
                for(int star = 1; star <= (2 * line - 1); star++){
                    System.out.print(" *");
                }
                System.out.println();
            }
        
            for(int revLine = number; revLine >=1; revLine--){
                for(int revSpace = 1; revSpace <= number - revLine; revSpace++)
                    System.out.print("  ");
                for(int revStar = 1; revStar <= 2 * revLine - 1; revStar++)
                    System.out.print(" *");
                System.out.println();

            }
            sc.close();
        
    }
    
}
