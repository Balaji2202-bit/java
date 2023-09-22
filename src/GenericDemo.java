import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;

public class GenericDemo
{
    public static final int a=0;
    public final static int b=9;
    public  int c;
    public static void main(String[] args) {

        int x;
        ArrayList<String> li=new ArrayList<>();
        li.add("hi");
        li.add("hello");
        GenericDemo g=new GenericDemo();
        g.display(li);

        System.out.println("Hi  i am "+ 10 * 20);

        System.out.println("c....."+c);

        for (String a:args)
        {
            System.out.println(a);
        }
    }
    // ? Wild Card Character
    public void display(ArrayList<? extends String > a)
    {
        System.out.println(a);
    }
    public void display1(ArrayList<? extends Integer> a)
    {
        int n;
        System.out.println(a);
//        System.out.println(n);
    }
}

