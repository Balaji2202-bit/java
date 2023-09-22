import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;

public class MethodReferenceDemo
{
    public static void main(String[] args)
    {
        // following code is used to sort in the list values
        System.out.println(addition(2,9));
        BiFunction<Integer,Integer,Double> ik=MethodReferenceDemo::addition;
        System.out.println(ik.apply(5,9));

        List<Integer> list= Arrays.asList(8,3,9,7,2,6);
//        list.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                o2.compareTo(o1);
//                return o1.compareTo(o2);
//
//            }
//        });

        //Lambda Expressions
//        list.sort((i1,i2)->i1.compareTo(i2)) ;

        //MethodReference
        list.sort(Integer::compareTo);

        //Lambda Expressions used to print
//        list.forEach(i-> System.out.println(i));

        //MethodReference is used to print
        list.forEach(System.out::println);


        List<String> list1=Arrays.asList("raj","bala","mari","jeswin","aanand","bharani","hemo");
        list1.sort(String::compareTo);
        list1.forEach(System.out::println);
    }
    public static double addition(int a,int b)
    {
        return a+b;
    }
}
