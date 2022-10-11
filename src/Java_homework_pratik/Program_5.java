package Java_homework_pratik;/*
5. Write a program for a calculator with addition, subtraction, multiplication and
 division methods all with parameters and use string concatenation methods.
 (Note: Two static and Two instance methods.)
 */

import java.util.Scanner;

public class Program_5 {
    static int first, second, add, sub, mul;
    static float div;

    public static void main(String[] args) {

        Program_5 obj = new Program_5();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter One Numbers : ");
        obj.first = scanner.nextInt();
        System.out.print("Enter Second Numbers : ");
        obj.second = scanner.nextInt();
        obj.addition();
        obj.subtraction();
        mutiply();
        divsion();
        scanner.close();
    }

    public void addition() {

        add = first + second;
        System.out.println("Addition = " + add);

    }

    public void subtraction() {
        sub = first - second;
        System.out.println("Subtraction = " + sub);
    }

    public static void mutiply() {

        mul = first * second;
        System.out.println("Multiplication = " + mul);

    }

    public static void divsion() {

        div = (float) first / second;
        System.out.println("Division = " + (float) div);
    }

}









