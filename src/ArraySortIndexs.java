import java.util.Comparator;
import java.util.Arrays;

class ArraySortIndexs {
    int rollno;
    String name, address;

    // Constructor
    public ArraySortIndexs(int rollno, String name,
                           String address)
    {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    // Used to print student details in main()
    public String toString()
    {
        return this.rollno + " "
                + this.name + " "
                + this.address;
    }
}

class Sortbyroll implements Comparator<ArraySortIndexs> {

    // Used for sorting in ascending order of
    // roll number
    public int compare(ArraySortIndexs a, ArraySortIndexs b)
    {
        return a.rollno - b.rollno;
    }
}

// Driver class
class Mainn {
    public static void main(String[] args)
    {
        ArraySortIndexs[] arr = { new ArraySortIndexs(111, "bbbb", "london"),
                new ArraySortIndexs(131, "aaaa", "nyc"),
                new ArraySortIndexs(121, "cccc", "jaipur") };

        System.out.println("Unsorted");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

        Arrays.sort(arr, new Sortbyroll());
        //Arrays.sort(arr);

        System.out.println("\nSorted by rollno");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}