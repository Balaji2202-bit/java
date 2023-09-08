import java.io.IOException;
import java.util.Scanner;
public class ChainedException
{
    public static void main(String[] args) {
        try
        {
//            code();
            divide();
        }
        catch (ArithmeticException e)
        {
//            System.out.println("Caught"+ e);
//            System.out.println("Caught to "+e.getCause());
            System.out.println("Arithmetic error"+e.getMessage());
            System.out.println("Reason for the Error"+e.getCause());
            e.printStackTrace();
        }
    }
    static  void code()
    {
        ArithmeticException error=new ArithmeticException("Div by Zero");
        error.initCause(new NullPointerException("dfjivdjiiej"));
        throw error;
    }
    static void divide(){
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        if(b==0){
            ArithmeticException error=new ArithmeticException("Div by Zero");
            error.initCause(new IOException("User give zero as a input"));
            throw error;
        }
        System.out.println(a/b);
    }
}
