package Java_homework_pratik;

import java.util.Scanner;

/*
6. Write a program to enter any radius value of the circle and find out the area.
(Formula of Area A=PI*r*r).
*/
public class Program_6 {

    static double area = Math.PI, storearea;

    public static void main(String[] args) {

        System.out.println("Enter Radius Value: ");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        scanner.close();
        Program_6.storearea = Program_6.area * radius * radius;
        System.out.println("The circle area: " + Program_6.storearea);

    }
}
