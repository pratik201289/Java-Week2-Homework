package Java_homework_pratik;

import java.util.Scanner;

/*
16. Write a Java program to add two binary numbers.
Input Data: Input first binary number: 10
Input second binary number: 11
Expected Output: Sum of two binary numbers: 101
*/
public class Program_16 {

    public static void calcbinary() {
        long b1, b2;
        int i = 0, carry = 0;
        int[] sum = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first binary number: ");
        b1 = scanner.nextLong();
        System.out.print("Input second binary number: ");
         b2 = scanner.nextLong();
        scanner.close();
        while (b1 != 0 || b2 != 0) {
            sum[i++] = (int) ((b1 % 10 + b2 % 10 + carry) % 2);
            carry = (int) ((b1 % 10 + b2 % 10 + carry) / 2);
            b1 = b1 / 10;
            b2 = b2 / 10;
        }
        if (carry != 0) {
            sum[i++] = carry;
        }
        --i;
        System.out.print("Sum of two binary numbers: : ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        calcbinary();
    }

}
