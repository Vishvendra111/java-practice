package loops.patterns;
import java.util.*;

public class HollowRombusStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        for(int row = 1; row <= number; row++){
            for(int space = 1; space <= number - row; space++){
                System.out.print(" ");
            }for(int star = 1; star <= number; star++){
                if(row == 1 || row == number || star == 1 || star == number){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
    
}
