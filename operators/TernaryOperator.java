package operators;
import java.util.*;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers to find out max number ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int max = (a > b ? a > c ? a : c : b > c ? b : c );
        System.out.println("The maximum value of a number is = "+max);
        sc.close();

    }

    
}
