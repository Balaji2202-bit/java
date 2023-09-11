package Arrays;

public class mismatch
{
    public static int mismatch(int[] array1, int[] array2) {
        //  minimum length between the two arrays
        int minLength = Math.min(array1.length, array2.length);
        System.out.println("minlength "+minLength);

        for (int i = 0; i < minLength; i++) {
            if (array1[i] != array2[i]) {
                return i; // Return the index of the first mismatch
            }
        }

        if (array1.length != array2.length) {
            return minLength; // Return the index equal to minLength
        }

        // If both arrays are of the same length and have no mismatch, return -1
        return -1;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 7};

        int index = mismatch(array1, array2);

        if (index == -1) {
            System.out.println("The arrays are identical.");
        } else {
            System.out.println("The first mismatch occurs at index " + index);
        }
    }
}
