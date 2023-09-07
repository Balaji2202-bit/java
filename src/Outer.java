public class Outer
{
    public int get()
    {
        Inner i=new Inner();
        return i.a;
    }
    public class  Inner
    {
        private int a=10;
    }
}
