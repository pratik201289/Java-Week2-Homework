package Java_homework_pratik;

import java.util.Scanner;

/*Write a program to convert the upper case to lower case.*/
public class Program_9 {

    public void lowercaselogic()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details with Upper Case:");
        String str = scanner.nextLine();

        String lowstr=str.toLowerCase();
        System.out.println("The Result: " + lowstr);
        scanner.close();

    }

    public static void main(String[] args) {

        Program_9 prg=new Program_9();
        prg.lowercaselogic();

    }
}
