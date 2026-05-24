package conditionalstatements;
import java.util.*;

public class AtmCashWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 20000;
        System.out.println("Wellcome ATM Simulation");
        System.out.println("Enter your amount in multipal of 100");
        int amount = sc.nextInt();
        if(amount % 100 != 0){
            System.out.println("Error! Please enter amount in multipal of 100");
        }else if(balance > amount){
            System.out.println("Your amount is withdrawaling... ");
        }else{
            System.out.println("Your account has not enough money!.Your balance is  = "+balance);
            sc.close();
        }
    }
}


        
        
    

