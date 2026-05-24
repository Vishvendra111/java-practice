package conditionalstatements;
import java.util.*;

public class VowelConsonantchacker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your character");
        char ch = sc.next().charAt(0);
        char v1 = 'a', v2 = 'e' ,v3 = 'i', v4 = 'o',v5 = 'u';
        char V1 = 'A',V2 = 'E',V3 = 'I',V4 = 'O',V5 = 'U';

        if((ch == v1) || (ch == v2) || (ch == v3) || (ch == v4) || (ch == v5)){
            System.out.println("Enter character is vowel = "+ch);

        }else if((ch == V1) || (ch == V2) || (ch == V3) || (ch == V4) || (ch == V5)){
            System.out.println("Enter character is vowel  = "+ch);
        }else {
            System.out.println("Enter character is consonant = "+ch);
        }
        sc.close();
      
    }
}

    
    

