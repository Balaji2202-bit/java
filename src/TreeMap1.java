import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMap1
{
    public static void main(String[] args) {
        TreeMap<String,Integer> m=new TreeMap<>();
        m.put("a", 100);
        m.put("j", 200);
        m.put("v", 300);
        m.put("d", 400);
        m.put("z", 100);
        m.put("i", 200);
        m.put("r", 300);
        m.put("o", 400);
        // nullPointerException
//        m.put(null,809);
        System.out.println(m);
        System.out.println(m.size());
//        System.out.println(m.clear());

        System.out.println("First Entry "+m.firstEntry());
        System.out.println("firstKey "+m.firstKey());
        System.out.println("HeadMAp "+m.headMap("i"));
        System.out.println("Sub MAp "+m.subMap("i","v"));
        System.out.println("Values in the map "+m.values());
        Integer x =m.remove("p");
        System.out.println(x);


        String []s={"tHis","these","tea","tower","twin towers","towards","Aravinth","zuci","bharani"};
        TreeSet t=new TreeSet(Arrays.asList(s));
        TreeSet<String > t1=new TreeSet<>(new Comparator<String >() {

            // Comparator class
            @Override
            public int compare(String  o1, String o2) {
                Integer len1=o1.length();
                Integer len2=o2.length();
                return len2.compareTo(len1);
            }
        }
        );
        t1.addAll(t);
//        for(String s1:s)
//        {
//            t.add(s1);
//        }
        System.out.println(t);
        System.out.println(t1);

    }
}
