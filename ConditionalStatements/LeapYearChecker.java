package conditionalstatements;
import java.util.*;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your year");
        int year = sc.nextInt();
        if((year % 4 == 0) || (year % 400 == 0) && (year % 100 == 0)){
            System.out.println("This year is a leap year = "+year);
        }else
            System.out.println("This year is not a leap year = "+year);
            sc.close();
    }
    
}
        

        
        


    
    

