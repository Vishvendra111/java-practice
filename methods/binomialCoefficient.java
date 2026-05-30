package methods;
import java.util.*;

public class binomialCoefficient{
    public static int factorial(int n){
        int factorial = 1;
        for(int i = 1; i <= n; i++){
            factorial = factorial * i;
        }
        return factorial;
    }
    public static int binomialCoeff(int n, int r){
        int fact_n = factorial(n); //a
        int fact_r = factorial(r); //b
        int fact_nmr = factorial(n - r); //c
        int binomialCoefficient = fact_n / (fact_r * fact_nmr);
        return binomialCoefficient; 
    }
    
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n,r values");
        int n = sc.nextInt();
        int r = sc.nextInt();
        int binomialCoefficient = binomialCoeff(n,r);
        System.out.println("the binomialCoefficient is = "+binomialCoefficient);
        sc.close();
    }
}


    
    

    

