import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Arrays;

public class Set1 {
    public static void main(String[] args)
    {
        HashSet<String> hash_Set=new HashSet<>();
        hash_Set.add("hello mari!");
        hash_Set.add("hello raj!");
        hash_Set.add("hello Anand");
        hash_Set.add("hello Bharani");
        hash_Set.add("hello Mari!");
        hash_Set.add(null);
        boolean a1=hash_Set.remove("hello mari!");
        boolean a2=hash_Set.contains("hello raj!");
        System.out.println(hash_Set+"jij"+a1+a2);
        System.out.println(hash_Set.size());
        for (String x:hash_Set)
        {
            System.out.print(x+",, ");
        }
        System.out.println();
        System.out.println("after Iteration : ");

        Iterator<String> i=hash_Set.iterator();
        while (i.hasNext())

            System.out.println(i.next());

        HashSet<String> s2=new HashSet<>();
        s2=(HashSet<String>)hash_Set.clone();
       System.out.println("After Cloning: "+ s2);
        // equals method
        System.out.println(hash_Set.equals(s2));
        Set<Integer> a = new HashSet<Integer>();

        // Adding all elements to List
        a.addAll(Arrays.asList(new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));

        // Again declaring object of Set class
        // with reference to HashSet
        Set<Integer> b = new HashSet<Integer>();

        b.addAll(Arrays.asList(new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));


        // To find union
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.print("Union of the two Set ");
        System.out.println(union);

        // To find intersection
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.print("Intersection of the two Set ");
        System.out.println(intersection);

        // To find the symmetric difference
        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.print("Difference of the two Set ");
        System.out.println(difference);

//        HashSet<Integer> hs = new HashSet<>();
//        HashSet<Integer> hs1 = new HashSet<>(int initialCapacity);
//        HashSet<Integer> hs2 = new HashSet<>(int initialCapacity,float loadFactor);
//        HashSet<Integer> hs3 = new HashSet<>(Collection C);

    }
}
