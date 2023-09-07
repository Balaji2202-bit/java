public class Method_Overriding1
{
    public static void main(String[] args)
    {
        Rectange r=new Rectange();
        Square s=new Square();
        Circle c=new Circle();
        Triangle2 t=new Triangle2();
        r.Area1();
        r.Area();
        c.Area();
        s.Area();
        t.Area();
    }
}
class Rectange implements Square2
{
    public void Area()
    {
        int a=10,b=20;
        System.out.println(a*b);
    }

    @Override
    public void Area1()
    {
        System.out.println("Welcome to Interface Implementation");
    }

    @Override
    public void perimeter() {

    }
}
class Square extends Rectange implements Square3
{
    public void Area()
    {
        int a=15;
        System.out.println(a*a);
    }
}
class Circle extends Square
{
    public void Area()
    {
        int a=5;
        System.out.println(3.14*a*a);
    }
}
class Triangle2 extends Circle
{
    public void Area()
    {
        int a=5,b=10;
        System.out.println((a*b)/2);
    }
}
interface Square2
{
    public void Area1();
    public void perimeter();
}
interface Square3 extends Square2
{
    @Override
    void Area1();
}
