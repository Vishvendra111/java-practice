package loops.patterns;
import java.util.*;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
         for(int row = 1; row <= number; row++){
            for(int space = 1; space <= number - row; space++){
                System.out.print(" ");
                
            }for(int num = 1; num <= (2 * row - 1); num++){
                System.out.print(num);
            }
            System.out.println();
        }
        sc.close();
    }
    
}
