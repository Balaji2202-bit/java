import java.util.ArrayList;
import java.util.List;

public class listOfListUpdate {
    public static void main(String[] args) {
        // Create a list of lists
        List<List<Integer>> listOfLists = new ArrayList<>();

        // Create some inner lists and add them to the outer list
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        listOfLists.add(list1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        listOfLists.add(list2);

        // Print the original list of lists
        System.out.println("Original List of Lists:");
        System.out.println(listOfLists);

        // Set a value in the list of lists
        int newValue = 42;
        int rowIndex = 1;    // Index of the inner list
        int columnIndex = 0; // Index within the inner list

        System.out.println(listOfLists.size());
        // Check if the rowIndex is valid
        if (rowIndex >= 0 && rowIndex < listOfLists.size())
        {
            List<Integer> innerList = listOfLists.get(rowIndex);

            // Check if the columnIndex is valid within the inner list
            if (columnIndex >= 0 && columnIndex < innerList.size())
            {
                innerList.set(columnIndex, newValue);

                // Print the updated list of lists
                System.out.println("\nUpdated List of Lists:");
                System.out.println(listOfLists);
            }
            else
            {
                System.out.println("Invalid columnIndex.");
            }
        }
        else
        {
            System.out.println("Invalid rowIndex.");
        }
    }
}