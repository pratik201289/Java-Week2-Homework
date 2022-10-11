package Java_homework_pratik;

import java.util.Scanner;

/*15. Write a Java program to swap two variables.*/
public class Program_15 {


    public static void swapnumbers() {


        Scanner in=new Scanner(System.in);
        System.out.println("Enter First Value of Swap");
        int a= in.nextInt();
        System.out.println("Enter Second Value of Swap");
        int b= in.nextInt();
        System.out.println("Before Swap First Value:" + a);
        System.out.println("Before Swap Second Value:" + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap First Value:" + a);
        System.out.println("After Swap Second Value:" + b);


    }

    public static void main(String[] args) {

        swapnumbers();
    }

}
