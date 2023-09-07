public class AnotherClass
{
    public static void main(String[] args)
    {
        Outer.Inner i=new Outer().new Inner();
        Outer o=new Outer();
        System.out.println(o.get());
       // System.out.println(i.a);
    }
}
