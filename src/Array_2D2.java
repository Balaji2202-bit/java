public class Array_2D2
{
    public static void main(String[] args)
    {
        int rows = 80, columns = 5;
        int[][] marks = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                marks[i][j] = i + j;
            }
        }

        System.out.println("First three rows are: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf(marks[i][j] + " ");
            }
            System.out.println();
        }
    }
}
