package Java_homework_pratik;

/*
11. Write a Java program to display the following pattern.
Sample Pattern :
 J a v v a
 J a a v v a a
 J J aaaaa V V aaaaa
 J J a a V a a
 */
public class Program_11 {

    public void oneline(){

        System.out.println(" J a v v a");
    }
    public void twoline()
    {
        System.out.println(" J a a v v a a");
    }
    public void thirdline()
    {
        System.out.println(" J J aaaaa V V aaaaa");
    }
    public void fourline()
    {
        System.out.println(" J J a a V a a");
    }


    public static void main(String[] args) {

        Program_11 prg=new Program_11();
        prg.oneline();
        prg.twoline();
        prg.thirdline();
        prg.fourline();

    }


}
