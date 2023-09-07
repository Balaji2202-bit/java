public class Casting
{
    public static void main(String[] args)
    {
        A a=new B();                              //upcasting
        System.out.println(a.num1);
        //System.out.println(a.num2);            //CTE
        B b=(B)a;                                //Downcasting
        System.out.println(b.num1);
        System.out.println(b.num2);
    }
}
class A
{
    int num1=10;
}
class B extends A
{
    int num2=20;
}