package ConditionalStatements;
import java.util.*;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a,b,c of a equation");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        double determinant = (Math.pow(b ,2) - 4 * a * c);
        double root1 ,root2;
        if(determinant > 0){
            root1 = (-b + Math.sqrt(determinant) /(2 * a));
            root2 = (-b - Math.sqrt(determinant) / (2 * a));
            System.out.println("your roots are  = "+root1+ "  ," +root2);
        }else if(determinant < 0){
            root1 = -b / (2 *a);
            root2 = Math.sqrt(-determinant) / (2 * a);
            System.out.println("your root1 is = "+root1+"+"+root2+"i");
            System.out.println("your root2 is = "+root1+"-"+root2+"i");

        }else{
            root1 = root2 =  -b/(2*a);
            System.out.println("This equestion have only real roots is = "+root1 +root2);
            sc.close();
       }
    }
}
              
             
        


    
    

