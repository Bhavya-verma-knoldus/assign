package com.knoldus;
import java.util.*;

public class Application {
    public static void main(String[] args) {
        int choice,num1=0,num2=0;
        char check_continue;

        Calculator obj = new Calculator();
        while(true)
        {
            System.out.println("\n1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.print("Enter your choice: ");

            Scanner scan = new Scanner(System.in);
            choice=scan.nextInt();

            if(choice==1 || choice==2 || choice==3 || choice==4)
            {
                System.out.println("Enter 2 numbers");
                System.out.print("num1: ");
                num1=scan.nextInt();

                System.out.print("num2: ");
                num2=scan.nextInt();
            }

            switch(choice)
            {
                case 1:
                    System.out.println("Result: "+obj.add(num1,num2));
                    break;
                case 2:
                    System.out.println("Result: "+obj.subtract(num1,num2));
                    break;
                case 3:
                    System.out.println("Result: "+obj.multiply(num1,num2));
                    break;
                case 4:
                    try
                    {
                        System.out.println("Result: "+obj.divide(num1,num2));
                    }
                    catch(ArithmeticException e)
                    {
                        System.out.println("Divide by zero operation not possible");
                    }
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            System.out.print("Do you want to continue(y/n): ");
            check_continue=scan.next().charAt(0);

            if(check_continue=='n')
                break;
        }
    }
}
