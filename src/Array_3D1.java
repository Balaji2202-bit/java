import java.util.Arrays;

public class Array_3D1
{
    public static void main(String[] args)
    {
        // first line of input is the total number of TestCases.
        // second line shows the total number of first array values.
        // third line gives array values and so on.

        int[][][] a = { { { 1, 2 }, { 3, 4 },{ 11 , 12 } },
                { { 5, 6 }, { 7, 8 },{ 13, 14 } } };


        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                for (int k = 0; k < 2; k++)
                {
                    System.out.print(a[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(a));
    }
}
