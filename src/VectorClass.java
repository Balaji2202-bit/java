import java.util.List;
import java.util.Vector;

class VectorClass {
    public static void main(String[] args)
    {
        int n = 5;

//        List<Integer> v = new Vector<>(n);
//
//        for (int i = 1; i <= n; i++)
//            v.add(i);
//
//        System.out.println(v);
//
//        v.remove(3);
//
//        System.out.println(v);
//
//        for (int i = 0; i < v.size(); i++)
//            System.out.print(v.get(i) + " ");

        Vector v1 = new Vector();

        // Adding custom elements
        // using add() method
        v1.add(1);
        v1.add(2);
        v1.add("geeks");
        v1.add("forGeeks");
        v1.add(3);
        // insertElement in vector class
        v1.insertElementAt("hello",3);
        // removeElementAt in vector class
        v1.removeElementAt(2);
        System.out.println(v1);

    }
}