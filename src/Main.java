import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        /* Average a=new Average();
        Average a1=new Average(5);
        Average a2=new Average(5,10);
        Average a3=new Average(5,10,15);
        System.out.println(a.getAverage());
        System.out.println(a1.getAverage());
        System.out.println(a2.getAverage());
        System.out.println(a3.getAverage()); */

       /* Obj2 o=new Obj2(10,15);
        Obj2 o1=new Obj2(15,20);
        System.out.println(o.getArea());
        System.out.println(o1.getArea()); */

       /* Scanner sc=new Scanner(System.in);
        int height=sc.nextInt();
        int breath=sc.nextInt();
        Obj2 rect=new Obj2(height,breath);
        System.out.println(rect.getArea()); */

        Complex c=new Complex(10,20);
        Complex c1=new Complex(15,25);
  //     Complex c2=Complex.add(c,c1);
  //      System.out.println(C.add(C,C1));
        System.out.println(Complex.add(c,c1));
        System.out.println(Complex.def(c,c1));
        System.out.println(Complex.Mul(c,c1));
    }
}
