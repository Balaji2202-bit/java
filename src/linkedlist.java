import java.io.*;
import java.util.*;

class linkedlist {
    public static void main(String[] args)
    {
//        int n = 5;
//
//        List<Integer> ll = new LinkedList<Integer>();
//
//        for (int i = 1; i <= n; i++)
//            ll.add(i*10);
//
//        System.out.println(ll);
//
//        // Remove element at index 3
//        ll.remove(3);
//
//        System.out.println(ll);
//
//        for (int i = 0; i < ll.size(); i++)
//            System.out.print(ll.get(i) + " ");
        List<Integer> arrayList=new ArrayList<>();
        List<Integer> linkedList =new LinkedList<>();
        doTiming("ArrayList",arrayList);
        doTiming("LinkedList",linkedList);

    }
    public static void doTiming(String s,List<Integer> list)
    {
        for(int i=0;i<1E5;i++)
        {
            list.add(i);
        }
        long start=System.currentTimeMillis();

//        for(int i=0;i<1E5;i++)
//        {
//            list.add(i);        // less time in Arraylist
//        }

        for(int i=0;i<1E5;i++)
        {
            list.add(0,i);   // too much of time complexity, less time in linked list
        }
        long end=System.currentTimeMillis();
//        System.out.println(end);
        System.out.println("Time taken :"+(end-start)+" is for"+ s);
    }
}