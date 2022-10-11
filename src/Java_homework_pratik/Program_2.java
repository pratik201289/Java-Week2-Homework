package Java_homework_pratik;/*
2. Write a Java programme using the following steps.
2.1 Declare two static variables
2.2 Declare one static method
2.3 Call both static variables into the static method inside the print statement.
2.4 Declare the Main method.
2.5 Call the static method into the Main method and Run the programme.
*/

public class Program_2 {

static int a=10;
static String name="Prime";

    public static void staticmethod1()
    {
        System.out.println(Program_2.a);
        System.out.println(Program_2.name);

    }

     public static void main(String[] args) {

        staticmethod1();

        }

}
