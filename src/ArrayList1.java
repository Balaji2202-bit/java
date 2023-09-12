import java.util.*;
class ArrayList1
{

    public static void main(String[] args)
    {
        List<Integer> l1 = new ArrayList<Integer>();

        // add element with index value
        l1.add(0, 1);
        l1.add(1, 2);
        //clear method use to delete all values
        // l1.clear();

        System.out.println(l1);
        boolean x=l1.isEmpty();
        System.out.println(x);
        List<Integer> l2 = new ArrayList<>();
        // add element without index value
        l2.add(1);
        l2.add(2);
        l2.add(3);
       // l2.add("hello");
      //  System.out.println("l2------"+l2);
        // using addAll method to include one List
        l1.addAll(1, l2);

        System.out.println(l1);
        // using remove method ,to remove one element in the list
        l1.remove(1);

        System.out.println("After list value removing "+l1);

        // using get method to retrive one value
        System.out.println(l1.get(3));

        // using set method to update particular indexed value
        l1.set(0, 5);
        System.out.println(l1); // [5, 2, 3, 2]
        System.out.println("indexOf "+l1.indexOf(3)); // output--- 2
        System.out.println("lastINdexOf "+l1.lastIndexOf(2));//  output--- 3
        System.out.println("indexOf "+l1.indexOf(2)); //  output--- 1
        List<String> l3=new ArrayList<>();
        l3.add("1");
        l3.add("0");
        l3.add("3");
        l3.add("2");
        l3.add("0");
        System.out.println(l3);
//        l3.remove(0);
        l3.remove("2");
        System.out.println(l3);
        // contains method give as a result of element present or not
        System.out.println(l3.contains("3"));
        ArrayList<String> a=new ArrayList<>();
        a.add("raj");
        a.add("raj2");
        a.add("raj3");
        a.add("raj4");
        a.add("raj1");
        ArrayList<String> a1=new ArrayList<>();
        a1.add("raj");
        a1.add("raj2");
        a1.add("raj3");
        System.out.println(a.containsAll(a1)); //true
        System.out.println(a1.containsAll(a)); //false
    }
}