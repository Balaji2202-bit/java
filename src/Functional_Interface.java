import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface Functional_Interface
{
//    public abstract void test();
    public abstract int test1(int a,int b);
    default void test2()
    {
        System.out.println("default method");
    }
    static void test3()
    {
        System.out.println("static method");
    }
    //interface can't allow normal methods
//    public  void  methods()
//    {
//
//    }
}
class Game implements Functional_Interface
{
    public static void main(String[] args)
    {
                Game gg=new Game(); // Late Binding
                Functional_Interface gg1=new Game();// Dynamic Binding
//                gg.test();
                gg.test2();//Default method
                Functional_Interface.test3(); // static method
        List<Integer> integers= new ArrayList<>(Arrays.asList(1,2,3,45,6,5,78,9,8));
        integers.stream().reduce(0, Game::add);

//        System.out.println("Abstarct method : ");
    }
    public static int add(Integer a, Integer b){
        System.out.printf("%d:%d%n",a,b);
        return a+b;
    }
//
//    @Override
    public int test1(int a,int b) {

        return a;
    }
}
