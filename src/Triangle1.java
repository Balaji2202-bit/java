public class Triangle1
{
    int a,b,c;
    public static void main(String[] args)
    {
        Triangle1 t=new Triangle1(10,12,15);
        System.out.printf(t.toString());
    }
    Triangle1(int a,int b,int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    @Override
    public String toString() {
        return "Triangle1{" + a + b + c + '}';
    }
}
