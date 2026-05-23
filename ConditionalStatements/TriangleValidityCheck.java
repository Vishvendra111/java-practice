package ConditionalStatements;
import java.util.*;

public class TriangleValidityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tree sides(like A,B,C) length of triangle");
        int A = sc.nextInt(),B = sc.nextInt(),C = sc.nextInt();
        if((A + B) > C && (A + C) > B && (B + C) > A){
           System.out.println("Accourding to given sides lenght this triangle is valid");
        }else{
            System.out.println("Accourding to given sides lenght this triangle is unvalid");
            sc.close();
        }
    } 
}       
   

        

        
    
    
    
    

