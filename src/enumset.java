import java.util.*;

enum EnumSetSample { CODE, LEARN, CONTRIBUTE, QUIZ, HI, HOCKEY, Geeks, World, Welcome, Alphabet, Geeks1, Geekse, Aeekse, daf }
;

public class enumset {

//    public static void main(String[] args)
//    {
//        // Creating a set
//        Set<EnumSetSample> set1,set2,set3,set4;
//
//        // Adding the elements
//        set1 = EnumSet.of(EnumSetSample.QUIZ, EnumSetSample.CONTRIBUTE, EnumSetSample.LEARN, EnumSetSample.CODE, EnumSetSample.HI);
//
//        System.out.println("Set 1: " + set1);
//
//
//        set2 = EnumSet.complementOf((EnumSet<EnumSetSample>) set1);
//        set3 = EnumSet.allOf(EnumSetSample.class);
//        set4 = EnumSet.range(EnumSetSample.CODE, EnumSetSample.CONTRIBUTE);
//        System.out.println(set2);
//        System.out.println(set3);
//        System.out.println(set4);
//
//        EnumSet<EnumSetSample> games = EnumSet.allOf(EnumSetSample.class);
//        System.out.println(games);
//
//        EnumSet<EnumSetSample> games2 = EnumSet.noneOf(EnumSetSample.class);
////        games2.add(Gfg.HOCKEY);
//
//        System.out.println(games2);
//        HashSet<Integer> objectsSet=new HashSet<>(Arrays.asList(1,2,3,4));
////        EnumSet a=EnumSet.allOf(objectsSet);
//        System.out.println(set3.parallelStream());
//        System.out.println(set3.stream());
//        String arra[]= (String[]) set3.toArray();
//        System.out.println(arra.toString());
//
//        Integer arr[]={12,2,3,4,5,6,7,89};
//
//        HashSet<Integer> s=new HashSet<>(Arrays.asList(arr));
//
//        System.out.println(s);
//        for(Integer a:arr)
//        {
//            s.add(a);
//        }
//        System.out.println();
//
//        EnumSet<EnumSetSample> e_set = EnumSet.copyOf(set1);
//        System.out.println(e_set);
//
//    }
//}



    public static void main(String[] args)
    {

        // Creating an empty collection
        Collection<EnumSetSample> collect = new ArrayList<EnumSetSample>();

        // Adding elements to the Collection
        collect.add(EnumSetSample.Welcome);
        collect.add(EnumSetSample.World);
        collect.add(EnumSetSample.Geeks);
        collect.add(EnumSetSample.Alphabet);
        collect.add(EnumSetSample.Aeekse);

        // Displaying the collection
        System.out.println("The collection is: " + collect);

        EnumSet<EnumSetSample> e_set = EnumSet.copyOf(collect);

        // Displaying the final set
        System.out.println("The enum set is:" + e_set);
    }
}