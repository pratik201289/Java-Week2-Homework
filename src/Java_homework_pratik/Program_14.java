package Java_homework_pratik;

/*
14. Write a Java program to print the area and perimeter of a rectangle.
 Test Data: Width = 5.5
 Height = 8.5
 Expected Output: Area is 5.6 * 8.5 = 47.60 Perimeter is 2 * (5.6 + 8.5) = 28.20*/
public class Program_14 {

    double width=5.5;
    double height=8.5;
    double area;
    double perimeter;
    public void perimeterrec()
    {
                area= width*height;
                perimeter=2 * (width + height);

        System.out.println("Area is 5.6 * 8.5 = " + area +  " Perimeter is  2 * (5.6 + 8.5) = "+ perimeter );

    }

    public static void main(String[] args) {

        Program_14 obj =new Program_14();
        obj.perimeterrec();

    }


}
