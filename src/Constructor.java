import java.util.Scanner;

public class Constructor
{
    static int roll_no=10;
    int ba=5;
    String name="Bheem";
    boolean attendance=false;
    public static void main(String[] args)
    {
        Constructor c=new Constructor(roll_no);
//        Scanner sc=new Scanner(System.in);


    }
    public  void get()
    {
        Constructor c=new Constructor(ba);
    }
    public Constructor()
    {

    }
    public Constructor(int a)
    {
        System.out.println(a);
    }
    public Constructor(int a , String b)
    {
        System.out.println(a+b);
    }
    public Constructor(int a, String b, boolean c)
    {
        System.out.println(a+b+c);
    }
}
