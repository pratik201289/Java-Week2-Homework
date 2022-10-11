package Java_homework_pratik;

/*
4. Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme. */
public class Program_4 {

    int a = 10, b = 20;
    static String fname = "Pratik", lname = "Vyas";

    public void instancemethod() {

        System.out.println(a);
        System.out.println(b);
        System.out.println(Program_4.fname);
        System.out.println(Program_4.lname);

    }

    public static void staticmethod() {

        Program_4 obj = new Program_4();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(Program_4.fname);
        System.out.println(Program_4.lname);
    }

    public static void main(String[] args) {

        Program_4 prg = new Program_4();
        prg.instancemethod();
        staticmethod();

    }


}
