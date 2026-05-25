package loops.patterns;
import java.util.*;

public class NumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number = sc.nextInt();
        for(int line = 1; line <= number; line++){
            for(int numbers = 1; numbers <= line; numbers++){
                System.out.print(numbers+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}

            
        
    
    

