package com.knoldus.kup.maven.Main;

import com.knoldus.kup.maven.Operation.Calculator;

import java.util.Scanner;

public class Application {

    public static void main(final String... args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Multi Modules Maven calculator");
        String choice;
        do {
            System.out.println("Select Operation which you want to apply");
            System.out.println("A. ADDITION");
            System.out.println("B. SUBTRACTION");
            System.out.println("C. MULTIPLICATION");
            System.out.println("D. DIVISION");
            System.out.println(("E. Exit."));
            System.out.println("===========================");
            System.out.println("Enter your choice");
            choice = sc.next();
            Calculator calculate = new Calculator();
            switch(choice)
            {
                case "A":
                    System.out.println("Enter First Number : ");
                    int a = sc.nextInt();
                    System.out.println("Value of first number : " + a);
                    System.out.println("Enter Second Number : ");
                    int b = sc.nextInt();
                    System.out.println("Value of second number : " + b);
                    calculate.add(a, b);
                    break;
                case "B":
                    System.out.println("Enter First Number : ");
                    int c = sc.nextInt();
                    System.out.println("Value of first number : " + c);
                    System.out.println("Enter Second Number : ");
                    int d = sc.nextInt();
                    System.out.println("Value of second number : " + d);
                    calculate.subtract(c,d);
                    break;
                case "C":
                    System.out.println("Enter First Number : ");
                    int e = sc.nextInt();
                    System.out.println("Value of first number : " + e);
                    System.out.println("Enter Second Number : ");
                    int f = sc.nextInt();
                    System.out.println("Value of second number : " + f);
                    calculate.multiply(e, f);
                    break;
                case "D":
                    System.out.println("Enter First Number : ");
                    int g = sc.nextInt();
                    System.out.println("Value of first number : " + g);
                    System.out.println("Enter Second Number : ");
                    int h = sc.nextInt();
                    System.out.println("Value of second number : " + h);
                    calculate.divide(g, h);
                    break;
                case "E":
                    break;
                default:
                    System.out.println("WRONG CHOICE");
            }
        } while (! choice.equals("E"));
    }
}

