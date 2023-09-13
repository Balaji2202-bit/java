import java.util.LinkedList;

public class LinkedToArray
{
    public static void main(String[] args)
    {
        LinkedList<Object> list= new LinkedList<>();
        list.add(123);
        list.add(12.9);
        list.add("jdik");
        list.add(1134);
        list.push("drasd");
        Object start=list.pop();
        System.out.println(start);
        System.out.println("LinkedList: "+ list);
        Object[] a = list.toArray();
        System.out.print("After converted LinkedList to Array: ");
        for(Object element : a)
            System.out.print(element+" ");

        LinkedList<Object> list1= new LinkedList<>();
        System.out.println(list1.pollFirst());
        System.out.println(list1.pollLast());
        // pop return and retrive first element in the list , if list is empty it throws NoSuchElementException
       // System.out.println(list1.pop());

        // offer add the element in the list's last
       boolean x= list.offer("jilaba");
        System.out.println(list);

        //offerFirst add the elemnet as list's first
        boolean x1=list.offerFirst("first");
        System.out.println(list);

        //offerLast add the element as list's last
        boolean x2=list.offerLast("Last");
        System.out.println(list);

        // element returns the first element of the list
        System.out.println(list.element());
        System.out.println(list.toString());


    }
}
