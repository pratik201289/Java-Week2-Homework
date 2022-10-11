package Java_homework_pratik;

/*

19. Write a Java program to convert a given string into lowercase.
Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
Output: the quick brown fox jumps over the lazy dog.
*/
public class Program_19 {

    String str="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
    String res;
    public void strlower(){

        res=str.toLowerCase();
        System.out.println("Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.\n");
        System.out.println("Output:"+ res);
    }

    public static void main(String[] args) {

        Program_19 obj=new Program_19();
        obj.strlower();
    }
}
