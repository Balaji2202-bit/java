public class Interface
{
    public static void main(String[] args) {
        Square1 square1=new Square1();
        square1.set_length(5);
        square1.set_colour("White");
        square1.setShape_name("square");
        System.out.println(square1);
        Rectangle1 r=new Rectangle1();
        System.out.println(r);
    }
}
interface Base
{
    // variable inside a interface defaultly consider as final static int a=90
    //int a=90;

public void setShape_name( String shape_name);
public void set_colour(String colour);

}
interface Property
{
     public double area();
     public double perimeter();
}
interface Sqaure extends Base,Property
{
    public void set_length(int length);

}
interface Rectangle extends Sqaure
{
    public void breath(int breath);
}
class Square1 implements Sqaure
{
    private String shape_name;
    private String colour;
    private int length;
    @Override
    public void setShape_name(String shape_name)
    {
        this.shape_name=shape_name;
    }

    @Override
    public void set_colour(String colour)
    {
        this.colour=colour;
    }

    @Override
    public double area()
    {
        return 0;
    }

    @Override
    public double perimeter()
    {
        return 0;
    }
    @Override
    public void set_length(int length)
    {
        this.length=length;
    }

    @Override
    public String toString() {
        return "Square{" +
                "shape_name='" + shape_name + '\'' +
                ", colour='" + colour + '\'' +
                ", length=" + length +
                ", Area="+ area()+ '\'' +
                ", Perimeter="+perimeter()+
                '}';
    }
}
class Rectangle1 implements Rectangle,Property
{
    private String shape_name;
    private String colour;
    private int length;
    private int breadth;
    @Override
    public void setShape_name(String shape_name) {
        this.shape_name=shape_name;
    }

    @Override
    public void set_colour(String colour) {
        this.colour=colour;
    }

    @Override
    public double area() {
        return length*breadth;
    }

    @Override
    public double perimeter() {
        return 2*(length+breadth);
    }

    @Override
    public void set_length(int length) {
        this.length=length;
    }


    @Override
    public void breath(int breadth) {
        this.breadth=breadth;
    }

//    @Override
//    public String toString() {
//        return "Rectangle1{" +
//                "shape_name='" + shape_name + '\'' +
//                ", colour='" + colour + '\'' +
//                ", length=" + length +
//                ", breadth=" + breadth +
//                ", Area="+ area()+
//                ", Perimeter="+perimeter()+
//                '}';
//    }

}