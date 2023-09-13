import java.util.LinkedHashSet;

public class linkedhashset
{
    public static void main(String[] args)
    {
        LinkedHashSet<String> linkedset = new LinkedHashSet<String>();

        linkedset.add("A");
        linkedset.add("B");
        linkedset.add("C");
        linkedset.add("D");

        linkedset.add("A");
        linkedset.add("E");

        System.out.println("Size of LinkedHashSet = "+ linkedset.size());

        System.out.println("Original LinkedHashSet:"+ linkedset);

        // Removing existing entry from above Set
        // using remove() method
        System.out.println("Removing D from LinkedHashSet: "+linkedset.remove("D"));

        // Removing existing entry from above Set
        // that does not exist in Set
        System.out.println("Trying to Remove Z which is not "+"present: "+linkedset.remove("Z"));

        // Checking for element whether it is present inside
        // Set or not using contains() method
        System.out.println("Checking if A is present=" + linkedset.contains("A"));

        // Noew lastly printing the updated LinkedHashMap
        System.out.println("Updated LinkedHashSet: " + linkedset);

    }
}
