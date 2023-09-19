import java.util.*;

public class Treeset {
    public static void main(String[] args)
    {
        TreeSet<String> s=new TreeSet<>();
        s.addAll(Arrays.asList("X","A","B","B","F","C","D","E","C",""));
        System.out.println(s);
        Iterator<String> i=s.iterator();
        while (i.hasNext())
        {
            System.out.println(i.hashCode());
            System.out.println(i.next());
        }
        System.out.println(s.getClass());
        Set<String> s1=new TreeSet<>();
        s1.addAll(Arrays.asList("X","A","B","B","F","C","D","E","C",""));
      //  System.out.println(s.comparator());// it return null
        System.out.println(s.equals(s1));
        System.out.println(s.first());
        System.out.println(s.last());
        System.out.println(s.headSet("C"));
        System.out.println(s);
        System.out.println(s.tailSet("E"));
        System.out.println(s.higher("E"));
        System.out.println(s.lower("E"));
        // it maintains the descending order
        Set x=s.descendingSet();
        System.out.println(s.descendingSet());
        // TreeSet
        TreeSet t=new TreeSet(Arrays.asList(s));
        TreeSet<String > t1=new TreeSet<>(new Comparator<String >() {

            // Comparator class
            @Override
            public int compare(String  o1, String o2) {
                Integer len1=o1.length();
                Integer len2=o2.length();
                return len1.compareTo(len2);
            }
        }
        );

    }
}
