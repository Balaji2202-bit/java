abstract class Aa {
    // it has no body
    abstract void m1();
    // concrete methods
    void m2()
    {
        System.out.println("This is a concrete method.");
    }
}
class Bb extends Aa   {
    // class B must override m1() method
    // otherwise, compile-time exception will be thrown
    void m1()
    {
        System.out.println("B's implementation of m1.");
    }
}
public class AbstractDemo {
    public static void main(String args[])
    {
        Bb b = new Bb();
        b.m1();
        b.m2();
    }
}