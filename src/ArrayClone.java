import java.util.Arrays;

public class ArrayClone {

    public static void main(String args[]) {
        int intArray[] = {1, 2, 3};
        // Array clone(shallow copy)
        int cloneArray[] = intArray.clone();

        System.out.println(intArray == cloneArray);
        System.out.println(intArray[0]==cloneArray[0]);
        System.out.println(intArray[1]==cloneArray[1]);

        for (int i = 0; i < cloneArray.length; i++) {
            System.out.print(cloneArray[i] + " ");
        }
       // Arrays.deepEquals(intArray,cloneArray);



    }
}
