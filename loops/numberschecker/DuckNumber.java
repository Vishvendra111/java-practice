package loops.numberschecker;
import java.util.*;

public class DuckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positve number");
        String numStr = sc.next();
        if(numStr.charAt(0) == 0){
            System.out.println("Enter number is not a duck number = "+numStr);
        }else{
            boolean hasZero = false;
        for(int i = 1; i < numStr.length(); i++){
            if(numStr.charAt(i) == 0){
                hasZero = true;
                break;
            }
        }
     if(hasZero){
        System.out.println("Enter number is a duck number = "+numStr);
     }else{
        System.out.println("Enter number is not a duck number = "+numStr);
     }

    }
    sc.close();

        
    }
    
}
