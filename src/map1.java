import java.util.HashMap;
import java.util.Map;

public class map1
{
    public static void main(String[] args) {
        Map<Integer,String> m=new HashMap();
        //put method is used to get add key and values
        m.put(null,"jfd");
//        m.put(null,"dnsj");
        m.put(1,"100dc");
        m.put(2,"200");
        m.put(3,"300ab");
        m.put(4,"400");
        m.put(5,"500");
        System.out.println(m);
       // m.clear();
        System.out.println(m);
        System.out.println("Contains Key :"+m.containsKey(3));
        System.out.println("Contains value :"+m.containsValue("100dc"));
        System.out.println("Contains Key :"+m.containsKey(9));
        System.out.println("Contains value :"+m.containsValue(50000));
        System.out.println(m.entrySet());
        // map clone
//        Map m1= (Map) m.entrySet();
//        System.out.println(m1);
//        System.out.println(m1.equals(m));

        // get method
        System.out.println("get value using key :"+m.get(5));
        //hashcode
        System.out.println("get hashcode value :"+m.hashCode());
        //isEmpty
        System.out.println("map is empty or not :"+m.isEmpty());
        //keySet is used to get keys
        System.out.println("keyset is used to get keys only :"+m.keySet());

        Map  mp = new HashMap();
        mp.put(10, "Ten");
        mp.put(30, "Thirty");
        mp.put(50, "Fifty");
        m.putAll(mp);
        System.out.println(m);
        m.remove(5);
        System.out.println(m);
        m.remove("Ten");
        System.out.println(m);
        System.out.println("map size :"+m.size());
        System.out.println("get values only :"+m.values());
        // add new values if already does not exist
        m.putIfAbsent(3, "77633");
        System.out.println("after add new Values :"+m);

        for (Map.Entry<Integer,String> e : m.entrySet())

            // Printing key-value pairs
            System.out.print(e.getKey() + " " + e.getValue()+",  ");

//        compute method used to update value
        m.compute(1, (key, val)
                -> val.concat(" Singh"));
        System.out.println(m);

        m.computeIfAbsent(8, k -> "2000");
        System.out.println(m);
        m.computeIfAbsent(3, k -> "2000 + 33000");
        System.out.println(m);
        m.computeIfPresent(1, (k,v) -> k+v+"209+ 33000");
        System.out.println(m);
    }
}
