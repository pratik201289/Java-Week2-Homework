package Java_homework_pratik;

import java.util.Scanner;

/*
17. Write a Java program to convert a decimal number to binary number.
Input Data: Input a Decimal Number : 5 Expected Output Binary number is: 101
*/
public class Program_17 {
    public void convert_dec_to_bin() {
        int decimal, quot, i = 1, j;
        int binary[] = new int[50];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Decimal Number : ");
        decimal = scanner.nextInt();
        quot = decimal;
        scanner.close();
        while (quot != 0) {
            binary[i++] = quot % 2;
            quot = quot / 2;
        }
        System.out.print("Binary number is: ");
        for (j = i - 1; j > 0; j--) {
            System.out.print(binary[j]);
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {

        Program_17 obj = new Program_17();
        obj.convert_dec_to_bin();

    }

}
