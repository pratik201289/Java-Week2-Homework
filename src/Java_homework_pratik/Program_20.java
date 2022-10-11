package Java_homework_pratik;

import java.util.Scanner;

/*
20. Write a Java Program to print as below.
"+------------------------+"
"| |"
"| CORNER STORE |"
"| |"
"| 2015-03-29 04:38PM |"
"| |"
"| Gallons: 10.870 |"
"| Price/gallon: $ 2.089 |"
"| |"
"| Fuel total: $ 22.71 |"
"| |"
"+------------------------+"
*/
public class Program_20 {

    double gallons,price;
    public static void calc()
    {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter Gallons: ");
        double gallons=scanner.nextDouble();
        System.out.println("Enter Price of gallon: ");
        double price=scanner.nextDouble();
        System.out.println("+------------------------+\n" +
                "| CORNER STORE | \n" +
                "| 2015-03-29 04:38PM | \n" +
                "| Gallons:" + gallons +"| \n" +
                "| Price/gallon: $" + price+"| \n" +
                "| Fuel total: $ " + gallons * price + "| \n" +
                "+------------------------+\n ");
     }

    public static void main(String[] args) {

        calc();
    }
}
