package loops.patterns;
import java.util.*;

public class PalindromicPatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number = sc.nextInt();
        for(int row = 1; row <= number; row++){
            for(int space = 1; space <= number - row; space++){
                System.out.print(" ");
            }
            for(int num1 = 1; num1 <= row; num1++){
                System.out.print(num1 );
            }
             for(int num2 = row - 1; num2 >= 1; num2--){
                System.out.print(num2 );
             
            }
            System.out.println();
        }
        sc.close();
    }
}
                
            
        
    
    

