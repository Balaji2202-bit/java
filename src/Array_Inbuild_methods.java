import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_Inbuild_methods
{
    public static void main(String[] args) {
        Integer integerArr[] = {10, 20, 15, 22, 35};
        // asList array list conversion

        List<Integer> a= Arrays.asList(integerArr);
        System.out.println("Integer Array as List: " + Arrays.asList(integerArr));
        System.out.println(a);
        //Binary Search Algorithm(find values)
        int intKey = 22;
        System.out.println(intKey+" found at index = "+ Arrays.binarySearch(integerArr, intKey));
        //Binary search Algorith (finding values with particular index only)
        Arrays.sort(integerArr);
        System.out.println(intKey + " found at index = " + Arrays
                        .binarySearch(integerArr, 1, 3, intKey));

        int intArr[]={10, 20, 15, 22,11, 35};
        int intArr1[] = { 10, 15, 22 };
        Arrays.sort(intArr,1,2);
        System.out.println("Arraysort with index limit :"+Arrays.toString(intArr));
        // Arrays.parallelSort and Arrays.sort perform as same
        Arrays.parallelSort(intArr);
        Arrays.sort(intArr);
        System.out.println(intArr);
        System.out.println("ParallelSort :"+ Arrays.toString(intArr));
        //System.out.println(Arrays.mismatch());

        // To compare both arrays
        System.out.println("Integer Arrays on comparison: "+Arrays.equals(intArr, intArr1)); //  false
        // Arrays.deepEquals(intArray,intArr1);


        System.out.println("Integer Array: "+Arrays.toString(intArr));
        System.out.println("Integer Array: "+Arrays.toString(Arrays.copyOf(intArr, 10)));
                // equal VS deepEquals
//        int as[][]={{1,2,3},{4,5,6}};
//        int as1[][]={{1,2,3},{4,5,6}};
//        System.out.println(Arrays.equals(as,as1)); // false

//        int as[][]={{1,2,3},{4,5,6}};
//        int as1[][]=as.clone();           // inner array stores same array
//        System.out.println(Arrays.equals(as,as1)); // true

//        int as[][]={{1,2,3},{4,5,6}};
//        int as1[][]={{1,2,3},{4,5,6}};
//        System.out.println(Arrays.deepEquals(as,as1)); // true

//        int as[][]={{1,2,3},{4,5,6}};
//        int as1[][]=as.clone();
//        System.out.println(Arrays.deepEquals(as,as1)); // true

//        int as[]={1,2,3};
//        int as1[]={1,2,3};
//        System.out.println(Arrays.equals(as,as1)); // true

//        int as[]={1,2,3};
//        int as1[]=as.clone();
//        System.out.println(Arrays.equals(as,as1)); // true

//        int as[]={1,2,3};
//        int as1[]={1,2,3};
//        System.out.println(Arrays.deepEquals(as,as1)); // CTE

//          int as[]={1,2,3};
//          int as1[]=as.clone();
//          System.out.println(Arrays.deepEquals(as,as1)); // CTE

        System.out.println("Integer Array deepHashcode : " + Arrays.deepHashCode(integerArr));
        System.out.println("Integer Array Hashcode : " + Arrays.hashCode(integerArr));
        int as3[]={1,2,3,4,5,6,7};
        int fill=90;
        Arrays.fill(as3,fill);
        System.out.println(Arrays.toString(as3));
    }
}

