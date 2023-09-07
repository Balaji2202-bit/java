public class Table_Recursion
{
    public static void main(String[] args)
    {
        //System.out.println("Hello World");
        hello(2,10);
    }
    public static void hello(int i, int j)
    {
        if (j!=0)
        {
            int j1=j-1;
            // j=j-1;
            hello(i,j1);
            System.out.println(i+"*"+j+"="+i*j);
        }
    }
}
