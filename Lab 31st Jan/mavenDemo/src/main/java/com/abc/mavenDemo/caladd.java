package com.abc.mavenDemo;

import java.util.Scanner;

public class caladd {


    public static void main(String[] args) {

        float a,b,res;
        char choice,ch;
        
       

        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("\n\n\n --------------- \n\n\n");
  	
            System.out.println("1. Add two numbers \n");

            System.out.println("2. Multiply 2 numbers two numbers \n");

            System.out.println("3. Subtract two numbers \n");


            System.out.println("9. Exit \n\n");
            System.out.println("Enter your choice :");

            choice = scanner.next().charAt(0);

            switch (choice)
            {
                case '1':   System.out.println("Enter two numbers");
                            a = scanner.nextFloat();
                            b = scanner.nextFloat();
                            res = a + b;
                            System.out.println("Result is " + res);
                            break;


                case '2':   System.out.println("Enter two numbers");
                            a = scanner.nextFloat();
                            b = scanner.nextFloat();
                            res = a * b;
                            System.out.println("Result is " + res);
                            break;


                 case '3':   System.out.println("Enter two numbers");
                            a = scanner.nextFloat();
                            b = scanner.nextFloat();
                            res = a - b;
                            System.out.println("Result is " + res);
                            break;

                case '9' : System.exit(0);
                           break;


                default:   System.out.println("Invalid Choice");
                           break;
            }

            System.out.println("\n\n\n --------------- \n\n\n");



        }while (choice != 9);

    }
}
