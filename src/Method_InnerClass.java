public class Method_InnerClass
{
    static int i=0;
    int i1=90;
    public static  void main(String[] args)
    {
           Method_InnerClass c=new Method_InnerClass();
        c.welcome();

    }
    // if method is static then we can able to access the static vaiables only on that outer class
    // if method is non-static then we can able to access the static and non-static variables
    public   void welcome()
    {
        int var1=300;// if i create a variable in the method innerclass it will a final value.
        System.out.println("Please come in:");
        class Dept1
        {
            public  void test()
            {
                System.out.println("Welcome to my dept");
                System.out.println(i);
                System.out.println(Method_InnerClass.this.i1);

            }
        }
        Dept1 d=new Dept1();
        d.test();
    }
}
