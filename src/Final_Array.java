public class Final_Array {
    public static void main(String[] args) {
        final int[] arr = {1, 2, 3, 4, 5};

        arr[3] = 10;                          //CTS

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 10;
            System.out.println(arr[i]);       // CTS
        }

        int arr2[] = { 10, 20, 30, 40, 50 };

          // final we are bound not to refer to another object but within the object data can be changed
          // we can change the state of the object but not reference.
//        arr2 = arr;
//        arr = arr2;                         //CTE

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
    }
}
