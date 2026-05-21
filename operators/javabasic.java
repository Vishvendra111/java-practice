package operators;
import java.util.*;
public class javabasic {
    public static void main(String[] arg){
        Scanner sc = new Scanner (System .in);
        int a  = sc.nextInt();
        int b = sc.nextInt();
        int div = a/b;
        int rem = a - (div * b);
        System.out.println("Remender of the number a is  = "+rem);
        //2
        System.out.println("2nd question");
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int LD = num % 10;
        System.out.println("Last digit of a number is  = "+LD);
        //3
        System.out.println("Enter a number");
        int Num = sc.nextInt();
        int Div = Num / 10;
        Div = Div / 10;
        int FD = Div % 10;
        System.out.println("Frist digit of a number is = "+FD);
        //4
        System.out.println("4th question");
        System.out.println("Enter a 3 digit number");
        int number = sc.nextInt();
        int firstD = number % 10;
        number = number / 10;
        int SD = number % 10;
        number = number / 10;
        int TD = number % 10;
        System.out.println("Reverse number of 3 digits is = "+firstD+SD+TD);
        //5
        System.out.println("Enter days");
        int Days = sc.nextInt();
        int Years = Days / 365;
        Days = Days - Years * 365;
        int months = Days / 30;
        Days = Days % 30;
        System.out.println("Years is  = "+Years);
        System.out.println("Months is  = "+months);
        System.out.println("Days is  = "+Days);
        //6
        System.out.println("6th question");
        System.out.println("Enter number of seconds");
        int sec = sc.nextInt();
        int hr = sec / (60 * 60);
        sec = sec - (hr * 60 * 60);
        int min = sec / 60;
        int seconds = sec % 60;
        System.out.println("the numbers of hours is = "+hr);
        System.out.println("The numbers of minutes is = "+min);
        System.out.println("The numbers of seconds is  = "+seconds);
        sc.close();
        





    }

}