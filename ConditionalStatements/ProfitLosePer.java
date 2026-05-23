package ConditionalStatements;

import java.util.*;

public class ProfitLosePer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter cost price ");
        double costPrice = sc.nextDouble();

        System.out.println("Enter selling price ");
        double sellingPrice = sc.nextDouble();

         if(sellingPrice > costPrice){
            double profit = ((sellingPrice - costPrice) * 100) / costPrice;
            System.out.println("Profit percentage is = "+profit);
            
        }else{
            double loss = ((costPrice - sellingPrice) * 100) / costPrice;
            System.out.println("Loss percentage is = "+loss);
            sc.close();
        }
    }
}

        

    
    

