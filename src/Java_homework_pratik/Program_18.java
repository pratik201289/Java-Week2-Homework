package Java_homework_pratik;

import java.util.Scanner;

/*
18. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
 Test Data: Input first number: 125
 Input second number: 24
  Expected Output : 125 + 24 = 149
  125 - 24 = 101
  125 x 24 = 3000
   125 / 24 = 5 125 mod 24 = 5
 */
public class Program_18 {

    static int first, second, add, sub, mul;
    static float div;
    int reminder;

    public static void main(String[] args) {

        Program_18 obj = new Program_18();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number : ");
        obj.first = scanner.nextInt();
        System.out.print("Input Second Numbers : ");
        obj.second = scanner.nextInt();
        obj.addition();
        obj.subtraction();
        obj.mutiply();
        obj.divsion();
        obj.reminder();
        scanner.close();
    }

    public void addition() {

        add = first + second;
        System.out.println(first + " + " + second + "= "+ add);

    }

    public void subtraction() {
        sub = first - second;
        System.out.println(first + " - " + second + "= "+ sub);
    }

    public void mutiply() {

        mul = first * second;
        System.out.println(first + " * " + second + "= "+ mul);

    }

    public void divsion() {

        div = (float) first / second;
        System.out.println(first + " / " + second + "= "+ div);
    }

    public void reminder() {
        reminder = first % second;
        System.out.println(first + " mod " + second + "= "+ reminder);
    }
}


