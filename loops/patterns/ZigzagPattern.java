package loops.patterns;
import java.util.*;

public class ZigzagPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of columns :");
        int number = sc.nextInt();
        for(int row = 0; row < number - 6; row++){
            for(int col = 1; col <= number; col++){
                if(row == 0 && col % 4 == 1){
                    System.out.print("*");
                }else if(row == 1 && col % 2 == 0){
                    System.out.print("*");
                }else if(row == 2 && col % 4 == 3){
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

                
            
        
    
    

