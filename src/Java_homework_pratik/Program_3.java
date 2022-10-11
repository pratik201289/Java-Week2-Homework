package Java_homework_pratik;/*
3. Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Program_3 {

    int a = 10;
    static int b = 20;

    public static void main(String[] args) {

        Program_3 Prg = new Program_3();
        Prg.instancemethod1();
        staticmethod1();
    }

    public void instancemethod1() {
        System.out.println(a);
        System.out.println(Program_3.b);
    }

    public static void staticmethod1() {

        Program_3 obj = new Program_3();

        System.out.println(obj.a);
        System.out.println(Program_3.b);

    }
}
