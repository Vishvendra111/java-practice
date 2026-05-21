package operators;
import java.util.*;
public class RelationOperator {
    public static void main(String[] arg) {
        //1
        System.out.println("1st question");
        Scanner sc = new Scanner (System.in);
        float number = sc.nextFloat();
        if(number > 0){
            System.out.println("This number is a positive number "+number);
        }else
            System.out.println("This number isa nagative number = "+number);
            //2
            System.out.println("check number is even or odd ");
            System.out.println("enter a number");
            int Number = sc.nextInt();
            if(Number % 2 == 0){
                System.out.println("This number is even number = "+Number);
            }else
                    System.out.println("this number is a odd number");
                    //3
                    System.out.println("3rd question");
                    System.out.println("Largest number among 2 numbers");
                    float num1 = sc.nextFloat();
                    float num2 = sc.nextFloat();
                    if(num1 > num2){
                        System.out.println("num1 is a largest number = "+num1);
                    }else
                        System.out.println("num2 is a largest number is  = "+num2);
                        //4
                        System.out.println("4th question ");
                        System.out.println("largest number among 3 numbers");
                        float Num1 = sc.nextFloat();
                        float Num2 = sc.nextFloat();
                        float Num3 = sc.nextFloat();
                        if((Num1 > Num2) && (Num1 > Num3)){
                            System.out.println("Num1 is a largest number among 3 numbers "+Num1);
                        }if(Num2 > Num3){
                            System.out.println("Num2 is largest number among 3 numbers"+Num2);
                        }else
                            System.out.println("Num3 is a largest number among 3 numbers"+Num3);
                            //5
                            System.out.println("5th question");
                            System.out.println("to find out that given year is leap year or not");
                            int year = sc.nextInt();
                            if(year % 4 == 0){
                                System.out.println("This year is a leap year "+year);
                            }else
                                System.out.println("This year is not a leap year "+year);
                                //6
                                System.out.println("6th question");
                                System.out.println("to check Uppercase, lowercase,digit");
                                String name = sc.nextLine();
                                String Name = name;
                                String Uppercase = name.toUpperCase();
                                if(Name == Uppercase){
                                    System.out.println("This name is in Uppercase"+name);
                                }else
                                    System.out.println("This name is not in Upper case  = "+name);
                                    System.out.println("To caeck  given name is in lowercase is or not");
                                    String name1 = sc.nextLine();
                                    String Name1 = name1;
                                    String lowercase = name1.toLowerCase();
                                    if(Name1 == lowercase){
                                        System.out.println("this name is in lowercase = "+name1);

                                    }else
                                        System.out.println("This name is not in lowercase = "+name1);
                                        System.out.println("count the charecters of given name");
                                        int value = name1.length();
                                        System.out.println("the digits/charecter in the name is  = "+value);
                                        sc.close();


                                

                        }





                    
            


    }




    

