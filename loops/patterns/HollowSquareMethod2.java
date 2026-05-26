package loops.patterns;
import java.util.*;

public class HollowSquareMethod2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        for(int line = 1; line <= number; line++){
            for(int star = 1; star <= number; star++){
                if(line == 1 || line == number || star == 1 || star == number){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
    
}
