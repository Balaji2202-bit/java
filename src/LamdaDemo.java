import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LamdaDemo
{
    public static void main(String[] args)
    {
//        Functional_Interface gg=new Game();
//        gg.test();
//        Functional_Interface id=()-> System.out.println("Game test...");
//        id.test();

        //it's not possible to call two abstract method in lambda function
        Functional_Interface id1=(int a,int b)-> {return a+b;};
         int result =id1.test1(12,78);
        System.out.println(result);
        id1.test2();
        Functional_Interface.test3();

        TreeSet s1=new TreeSet(); //RunTime Exception

        Set s=new HashSet();
        s.add(23);
        s.add(21);
        s.add("dede");
        s.add('e');
        System.out.println(s);
    }
}
