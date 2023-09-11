import java.io.*;
 public class Jacked_Array
 {
    public static void main(String[] args)
    {
        int jagged[][] = new int[2][];

        // first row has 2 columns
        jagged[0] = new int[2];

        // second row has 4 columns
        jagged[1] = new int[4];

        int count = 0;
        for (int i = 0; i < jagged.length; i++)
        {
            for (int j = 0; j < jagged[i].length; j++)
            {
                jagged[i][j] = count++;
            }
        }

        System.out.println("values of 2D jagged array");

        for (int i = 0; i < jagged.length; i++)
        {
            for (int j = 0; j < jagged[i].length; j++)
            {
                System.out.printf(jagged[i][j] + " ");
            }
            System.out.println();
        }
    }
}
