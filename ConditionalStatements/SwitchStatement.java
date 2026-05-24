package conditionalstatements;

import java.util.*;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day number to find respective day of that number");
        int day = sc.nextInt();
        String name = switch(day){
            case  1 -> "Sunday";
            case  2 -> "monday";
            case  3 -> "Tuesday";
            case  4 -> "Wednesday";
            case  5 -> "Thursday";
            case  6 -> "Friday";
            case  7 -> "Saturday";
            default -> {
                         System.out.println("Error! Please enter  number between 1 to 7 ");
                         yield"Ivalid Day";
                        }

        };
        System.out.println("Your day name is  = "+name);
        sc.close();

        
        
    }

    
    
}
