package Java_homework_pratik;/*
8. Write a program to calculate the area of a triangle.
*/

import java.util.Scanner;

public class Program_8 {

    public void areatringle() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the width of the Triangle:");
        double width = scanner.nextDouble();

        System.out.println("Enter the height of the Triangle:");
        double height = scanner.nextDouble();

        double area = (width * height) / 2;
        System.out.println("Area of Triangle is: " + area);
        scanner.close();
    }

    public static void main(String[] args) {

        Program_8 obj = new Program_8();

        obj.areatringle();

    }
}
