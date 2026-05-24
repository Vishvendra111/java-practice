package conditionalstatements;
import java.util.*;

public class CalculatorUsingSwitch {
    public static void main(String[] args) {
        System.out.println("Enter values of a and b to calculate  ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("If you want to add,sub,mul,div,modulo enter 1,2,3,4,5 repectively");
        int num = sc.nextInt();
        switch(num){
            case(1) : System.out.println("The addtion of two numbers is = "+(a + b));
                      break;
            case(2) : System.out.println("The subtraction of two numbers is = "+(a - b));
                      break;
            case(3) : System.out.println("The multiplication of two numbers is = "+(a * b));
                      break;
            case(4) : System.out.println("The division of two numbers is = "+(a / b));
                      break;
            case(5) : System.out.println("The modulation of two numbers is = "+(a % b));
                      break;
            default :System.out.println("Error! Please enter valid number ");
            sc.close();
        }
    }
}
            

             
            
            
    
    

