import java.util.*;
public class conditionalstatement {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter your number :");
            int number = sc.nextInt();
            if(number % 10 == 0){
                break;
            }
            System.out.println(number);
        }while(true);
        sc.close();

            }
        }

        
    
    
