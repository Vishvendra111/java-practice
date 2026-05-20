import java.util.*;
public class AssignmentOpertors{
    public static void main(String[] arg){
        //1
        System.out.println("Q1. Small calculator-style by using assignment operators");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        a += 5;
        a -= 6;
        a *= 7;
        a /= 8;
        a %= 9;
        System.out.println("The value of a is = "+a);
        sc.close();
        

    }

}