package loops.patterns;
import java.util.*;

public class CharacterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lines number");
        int number = sc.nextInt();
        System.out.println("Enter character");
        int ch1 = sc.next().charAt(0);
          for(int line = 1; line <= number; line++){
            for(char ch = (char)ch1; ch < ch1 + line; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
        sc.close();
    }
}




    
    

