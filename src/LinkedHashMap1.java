import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> m = new LinkedHashMap();
        // Map m=new HashMap();
        m.put(null, "mfdknd");
        StringBuffer a=new StringBuffer("jck");
        a.append("   kde");
        System.out.println("Stringbuffer"+a);

        m.put(1, "100dc");
        m.put(2, "200");
        m.put(10, "kholi");
        m.put(3, "300ab");
        m.put(4, "400");
        m.put(5, "500");
        System.out.println(m);
        m.remove(2);
        m.remove(4, "400");
        System.out.println(m);
        System.out.println(m.size());
        System.out.println(m.keySet());
        String l = m.get(5);
        String k = m.getOrDefault(9, "500");
//        m.putIfAbsent(9,"500");
//        m.merge()
        System.out.println(m.get(9));
        for (Integer i = 0; i < 10; i++) {
            System.out.println(m.getOrDefault(i, "Value not found"));
        }
//        System.out.println(m.getOrDefault(9,"500"));
        LinkedHashMap<Integer, String> m1 = new LinkedHashMap();

        m1.put(1, "100dc ndsfjfdj");
        m1.put(90, "200");
        m1.put(110, "kholi");
        m1.put(31, "300ab");
        m1.put(41, "400");
        m1.put(15, "500");
        System.out.println(m);
        System.out.println("M1"+m1);

        //merge kay and values in  LinkedHashMap
        m.forEach((key, value) -> m1.merge(key, value, (v1, v2) -> v1.equalsIgnoreCase(v2) ? v1 : v1 + ", " + v2));
        System.out.println(m1);
    }
}
