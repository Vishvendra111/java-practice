import java.util.*;
public class LogicBuilding {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        //1
        System.out.println("Q1. Enter the marks of 5 subjects");
        Double sub1  = sc.nextDouble();
        Double sub2  = sc.nextDouble();
        Double sub3  = sc.nextDouble();
        Double sub4  = sc.nextDouble();
        Double sub5  = sc.nextDouble();
        
        Double percentage = (sub1 + sub2 + sub3 + sub4 + sub5) / 500 *100;
        System.out.println(" The percentage of 5 subjects is  = "+percentage);
        //2
        System.out.println("Q2. Enter simple interest values");
        Double p = sc.nextDouble();
        Double R = sc.nextDouble();
        Double T = sc.nextDouble();

        Double S_I =(p * T * R) / 100;
        System.out.println("Simple interest of the principle is  = "+S_I);
        //3
        System.out.println("Q3. Enter compound interest values");
        Double P = sc.nextDouble();
        Double r = sc.nextDouble() / 100;
        Double n = sc.nextDouble();
        Double t = sc.nextDouble();
        Double A = P * Math.pow(1 + (r / n), n * t);
        Double C_I = A - P;
        System.out.println("The amount of compount interest is = "+A);
        System.out.println("only compount interest is  = "+C_I);
        //4
        System.out.println("Q4. Enter electricity bill units");
        int unit = sc.nextInt();
        int bill  = unit * 20;
        System.out.println("The electricity bill is  = "+bill);
        //5
        System.out.println("Q5. Enetr your salary ");
        Double Salary = sc.nextDouble();
        Double income;
        if(Salary <= 500000){
            income = Salary - ((Salary * 0) + 0);
            System.out.println("your income is  = "+income);

        }else if((Salary > 500000) && (Salary <= 1000000)){
            income = Salary - ((Salary *.01) + 5000);
            System.out.println("your salary after after 5000 (bonus) and 10%(tax) deduction is = "+income);
            
        }else{
            income = Salary - ((Salary * .03) + 10000);
            System.out.println("Your income after 10000 (bonus) and 30% (tax) detation is = "+income);
            //6
            System.out.println("Q6.Enter rupees  convert into 500 notes, 200 notes, 100 notes ,50 notes ");
            Double bank = sc.nextDouble();
            Double rupees = bank;
            Double notes500 = (rupees / 500);
            System.out.println("500 notes is  = "+notes500);
            Double Rupees = bank;
            Double notes200 = (Rupees / 200);
            System.out.println("200 notes is = "+notes200);
            Double rupees100 = bank;
            Double notes100 = (rupees100 / 100);
            System.out.println("notes of 100 is = "+notes100);
            Double rupees50 = bank;
            Double notes50 = (rupees50 / 50);
            System.out.println("Notes of 50 is = "+notes50);
            //7
            System.out.println("Q7. Enter character to find ASCII value ");
            char ch = sc.next().charAt(0);
            int value =  ch;
            System.out.println("ASCII value of character is = "+value);
            //8
            System.out.println(" Enter lowercase string convert to uppercase without built-in function");
            String lowercase = sc.nextLine();
            String uppercase = lowercase. toUpperCase();
            System.out.println("name is converted in uppercase  = "+uppercase);
            sc.close();


        }


    }
    
}
