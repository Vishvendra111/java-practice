package loops.patterns;
import java.util.*;

public class FloydOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lines number");
        int number = sc.nextInt();
        int num1 = 1;
        for(int line = 1; line <= number; line++){
            for(int num = 0; num < line; num++){
                System.out.print(num1+++" " );
            }
            System.out.println();
        }
        sc.close();
    }
    
}
