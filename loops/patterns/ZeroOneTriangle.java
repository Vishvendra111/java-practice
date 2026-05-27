package loops.patterns;
import java.util.*;

public class ZeroOneTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        for(int row = 1; row <= number; row++){
            for(int column = 1; column <= row; column++){
                if((row + column) % 2 == 0){
                    System.out.print("1 ");
                    
                }else{
                    System.out.print("0 ");
                    
                }

            }
            System.out.println();
        }
        sc.close();
    }
    
}
