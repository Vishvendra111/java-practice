package ConditionalStatements;
import java.util.*;

public class CurrencyConverter {
    public static void main(String[] args) {
        System.out.println("Enter rupees to convert into USD($), EUR,GBP");
        Scanner sc = new Scanner(System.in);
        double rupees = sc.nextDouble();
        double currency = rupees;
        double usd = currency / 85.5;
        double eur = currency / 92.0;
        double gbp = currency / 108.0;
        System.out.printf("Your rupees in USD is  = %.2f\n  ",usd );
        System.out.printf("Your rupees in EUR is =  %.2f\n  ",eur );
        System.out.printf("Your rupees in GBP is =  %.2f\n  ",gbp );
        sc.close();
    }
}
        
        
        

    
    

