import java.util.*;

public class ListofList
{
    public static void main(String[] args) {
        List<List<String>> listOfLists = new LinkedList<>();
        List<String> list1 = new LinkedList<>();
        list1.add("Apple");
        list1.add("Banana");
        List<String> list2 = new LinkedList<>();
        list2.add("Cherry");
        list2.add("Date");
        listOfLists.add(list1);
        listOfLists.add(list2);
        List<String> list3 = new LinkedList<>();
        list3.add("pear");
        list3.add("PineApple");
        listOfLists.add(list3);
        System.out.println(listOfLists);
        //get of get
        System.out.println(listOfLists.get(0).get(0));


        List<List<Integer>> outerList=new ArrayList<>();
        int count=0;
        for(int i=0;i<5;i++)
        {
            List<Integer> innerList=new ArrayList<>();
            for (int j=0;j<5;j++)
            {
                innerList.add(count*5);
                count++;
            }
            outerList.add(innerList);
        }
        System.out.println(outerList);

//        List<List<Integer>> a=new List<List<Integer>>()
//        {
//            @Override
//            public int size() {
//                return 0;
//            }
//
//            @Override
//            public boolean isEmpty() {
//                return false;
//            }
//
//            @Override
//            public boolean contains(Object o) {
//                return false;
//            }
//
//            @Override
//            public Iterator<List<Integer>> iterator() {
//                return null;
//            }
//
//            @Override
//            public Object[] toArray() {
//                return new Object[0];
//            }
//
//            @Override
//            public <T> T[] toArray(T[] a) {
//                return null;
//            }
//
//            @Override
//            public boolean add(List<Integer> integers) {
//                return false;
//            }
//
//            @Override
//            public boolean remove(Object o) {
//                return false;
//            }
//
//            @Override
//            public boolean containsAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public boolean addAll(Collection<? extends List<Integer>> c) {
//                return false;
//            }
//
//            @Override
//            public boolean addAll(int index, Collection<? extends List<Integer>> c) {
//                return false;
//            }
//
//            @Override
//            public boolean removeAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public boolean retainAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public void clear() {
//
//            }
//
//            @Override
//            public List<Integer> get(int index) {
//                return null;
//            }
//
//            @Override
//            public List<Integer> set(int index, List<Integer> element) {
//                return null;
//            }
//
//            @Override
//            public void add(int index, List<Integer> element) {
//
//            }
//
//            @Override
//            public List<Integer> remove(int index) {
//                return null;
//            }
//
//            @Override
//            public int indexOf(Object o) {
//                return 0;
//            }
//
//            @Override
//            public int lastIndexOf(Object o) {
//                return 0;
//            }
//
//            @Override
//            public ListIterator<List<Integer>> listIterator() {
//                return null;
//            }
//
//            @Override
//            public ListIterator<List<Integer>> listIterator(int index) {
//                return null;
//            }
//
//            @Override
//            public List<List<Integer>> subList(int fromIndex, int toIndex) {
//                return null;
//            }
//        }
    }
}
