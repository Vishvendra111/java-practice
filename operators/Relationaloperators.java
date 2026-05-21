package operators;
import java.util.*;
public class Relationaloperators {
    public static void main(String[] arg){
        //1
        System.out.println("1.no. is positive and negative");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number > 0){
            System.out.println(" This number is positive = "+number);
        }else{
            System.out.println("This number is negative  = "+number);
        }
        //2
        System.out.println("Q.2  = if number even or not");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("This number is even number = "+num);
        }else{
            System.out.println("This number is odd number  = "+num);
        }
        //3
        System.out.println("Q3.Largest number among 2 numbers" );
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1 > num2){
            System.out.println("num1 is largest number  = "+num1);
        }else{
            System.out.println("num2 is lrgest number  = "+num2);
        }
        //4
        System.out.println("Q4. Largest among 3 numbers");
        int Num1 = sc.nextInt();
        int Num2 = sc.nextInt();
        int Num3 = sc.nextInt();
        if((Num1 > Num2) && (Num1 > Num3)){
            System.out.println(" Num1 is largest number = "+Num1);
        }
        else if(Num2 > Num3){
            System.out.println("Num2 is largest number "+Num2);

        }else{
            System.out.println("Num3 is largest number  = "+Num3);
        }
        //5
        System.out.println("Q5. given year is leap year or not");
        int year = sc.nextInt();
        if(year % 4 == 0){
            System.out.println("This year is a leap year  = "+year);
        }else{
            System.out.println("This year is not a leap year  = "+year);
        }
        //6
        System.out.println("Q6 Enter character to check uppercase or not and lowercase or not");
        String name = sc.nextLine();
        String G_name = name;
        String uppercase = name.toUpperCase();
        if(G_name == uppercase){
            System.out.println("Given string is in a uppercase = "+G_name);
        }else{
            System.out.println("Given string is not in a uppercase  = "+G_name);
        }
        String Name = sc.nextLine();
        String O_Name = Name;
        String lowercase = Name.toLowerCase();
        if(lowercase == O_Name){
            System.out.println("Given name is in lowercase = "+O_Name);
        }else{
            System.out.println("Given name is not in lowercase = "+O_Name);

        }
        sc.close();

    }
    
    
}
