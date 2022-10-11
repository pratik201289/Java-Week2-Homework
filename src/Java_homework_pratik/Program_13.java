package Java_homework_pratik;

import java.util.Scanner;
/*
Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
 */
public class Program_13 {
    public static void avgthreenumbers() {

        double avg;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        avg=(num1+num2+num3)/3;
        System.out.println("Average of three numbers is: " + avg);

        scanner.close();
    }

    public static void main(String[] args) {

        avgthreenumbers();

    }
}
