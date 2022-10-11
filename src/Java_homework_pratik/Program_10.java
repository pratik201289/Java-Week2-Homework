package Java_homework_pratik;

import java.util.Scanner;

/*
10. Write a Java program that takes a number as input and prints its multiplication table up to 10.
 Test Data: Input a number: 8 Expected Output : 8 x 1 = 8 8 x 2 = 16 8 x 3 = 24 ... 8 x 10 = 80
  */
public class Program_10 {

    public static void mutipicationeight() {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int no = in.nextInt();
        System.out.println(" Expected Output: ");
        in.close();
        for (int i = 0; i < 10; i++) {

            System.out.println(no + " x " + (i + 1) + " = " + (no * (i + 1)));
        }
    }

    public static void main(String[] args) {
        mutipicationeight();
    }

}
