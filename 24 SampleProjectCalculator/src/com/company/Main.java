package com.company;

import action_classes.AddClass;
import action_classes.DivideClass;
import action_classes.MultiplyClass;
import action_classes.SubtractClass;

import java.util.Scanner;

public class Main {
    static int a, b;

    public static void main(String[] args) {
// - + * /  a,b->c
/*
1.add
2.subtract
3.multiply
4.divide
5.quit
 */
        Scanner scanner = new Scanner(System.in);
        int choice = 0, result;

        Calculator calculator = new Calculator();
        boolean isWorking = true;
        while (isWorking) {
            printMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1: //add
                    getAAndB();
                    result = calculator.calculate(new AddClass(), a, b);
                    System.out.println("Result is: " + result);
                    break;
                case 2: //-
                    getAAndB();
                    result = calculator.calculate(new SubtractClass(), a, b);
                    System.out.println("Result is: " + result);
                    break;
                case 3:
                    getAAndB();
                    result = calculator.calculate(new MultiplyClass(), a, b);
                    System.out.println("Result is: " + result);
                    break;
                case 4:
                    getAAndB();
                    result = calculator.calculate(new DivideClass(), a, b);
                    System.out.println("Result is: " + result);
                    break;
                case 5:
                    isWorking=false;
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("**********************************************************************");
        System.out.println("1.add\n2.subtract\n3.multiply\n4.divide\n5.quit\n");
        System.out.println("select an item");
        System.out.println("**********************************************************************");
    }

    public static void getAAndB() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        a = scanner.nextInt();
        System.out.println("Enter second number");
        b = scanner.nextInt();
    }
}
