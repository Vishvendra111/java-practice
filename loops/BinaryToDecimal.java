package loops;
import java.util.*;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary number");
        String binary = sc.next();
        int decimal = Integer.parseInt(binary,2);
        System.out.println("result is = "+decimal);
        sc.close();
    }
    
}
