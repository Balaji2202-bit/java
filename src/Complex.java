public class Complex
{
    int real;
    int imaginary;
    Complex(int a, int b)
    {
        this.real =a;
        this.imaginary =b;
    }
    @Override
    public String toString() { return  real +" + "+ imaginary +"i"; }
    public static Complex add(Complex a,Complex b)
    {
        int addReal=a.real+b.real;
        int addImag=a.imaginary+ b.imaginary;
        return new Complex(addReal,addImag);
    }
    public static Complex def(Complex a, Complex b)
    {
        int difReal=a.real-b.real;
        int difImag=a.imaginary-b.imaginary;
        return new Complex(difReal,difImag);
    }
    public static Complex Mul(Complex a, Complex b)
    {
       // int mulReal=a.real * b.real;
       // int mulImag=a.imaginary * b.imaginary;
       // (a + ib) (c + id) = (ac - bd) + i(ad + bc).
          int x=((a.real*b.real) - (a.imaginary*b.imaginary));
          int y=(a.real*b.imaginary)+(a.imaginary*b.real);
        return new Complex(x,y);
    }
//    public int add(int a, int b)
//    {
//        int sum=a+b;
//        return sum;
//    }
}