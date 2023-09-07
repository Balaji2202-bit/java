import sun.security.krb5.PrincipalName;

public class College
{
    static String principalName="Hello Principle";
    int fee=10000;
    int fine=1;
    public static void main(String[] args)
    {

        // if method is static
        College o=new College();
        Dept i1= o.new Dept();
        i1.collegeFunction();
        // if method is non-static
        o.metting();
        //if class is static class
       // College.Dept p=new Dept();
        boolean uniform=false;


    }
    public void metting()
    {
        Dept d=new Dept();
        d.collegeFunction();
    }
    class Dept
    {
      //  InnerClass i=new InnerClass();
        int fine=2;
        boolean uniform=true;
        public  void collegeFunction()
        {
            int fine=1000;
            System.out.println("Welcome Inner Class: ");
            System.out.println(uniform);
            System.out.println(fine);
            System.out.println(this.fine);
            System.out.println(College.this.fine);
           // System.out.println(College.this.);
//            System.out.println(principalName);
            System.out.println(fee);
        }
    }
}

