package loops.numberschecker;
import java.util.*;

public class TechNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int temp = number;
        int power = 0,count = 0,sum = 0,sum1 = 0;
        while(temp > 0){
            temp = temp / 10;
            count++;
        }
        int count1 = 1;
        temp = number;
        if(count % 2 == 0){
            while(count1 <= count / 2){
                int remainder = temp % 10;
                sum = sum + remainder * (int)(Math.pow(10,power));
                temp = temp / 10;
                count1++;
                power++;
            }
            power = 0;
            count1 = 1;
            while(count1 <= count / 2){
                int remainder = temp % 10;
                sum1 = sum1 + remainder * (int)(Math.pow(10,power));
                temp = temp / 10;
                power++;
                count1++;
            }
        int total = sum + sum1;
        int product = total * total;
        if(product == number){
            System.out.println("Enter number is tech number = "+number);
        }else{
            System.out.println("Enter number is not a temp number = "+number);
        }
        
        }
        else{
            System.out.println("Enter number is not a temp number = "+temp);
    }
    sc.close();
}
}
        
            
        
    
    

