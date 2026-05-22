package bitwise;
import java.util.*;

public class MultileByTwo{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number = sc.nextInt();
        int afterMultiple = number << 1;
        System.out.println("After multiply of 2 number is = "+afterMultiple);
        sc.close();

    }

}

