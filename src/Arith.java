public class Arith
{
    public static void main(String[] args) {

        try
        {
            int a=15/0;
        }

        catch (NullPointerException e)
        {
            System.out.println("NullPointer Executed");
        }
        catch (Exception e)
        {
            System.out.println("Exception "+e);
        }
        finally
        {
            System.out.println("finally executed");
        }
    }
}
