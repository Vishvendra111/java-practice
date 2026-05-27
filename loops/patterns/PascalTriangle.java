package loops.patterns;
import java.util.*;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        for(int row = 0; row < number; row++){
            for(int space = 1; space <= number - row; space++){
                System.out.print(" ");
            }
            int num1 = 1;
            for(int column = 0; column <= row; column++){
                System.out.print(num1+" ");
                num1 = num1 * (row - column) / (column + 1);

            }
            System.out.println();
        }
        sc.close();
    }
    
}
