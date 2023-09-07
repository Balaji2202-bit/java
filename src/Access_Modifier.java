public class Access_Modifier
{
    protected int a=0;
    private String s="90";
    public int c=9;
    public static void main(String[] args)
    {
        Access_Modifier obj2=new Access_Modifier();
        obj2.hello();
    }
    public void hello()
    {
    System.out.println("hello"+a+s);
    System.out.println(this.a);
    }
}
class Access
{
    public void hello()
    {
        Access_Modifier obj=new Access_Modifier();
        System.out.println("Good Morning"+ obj.a+obj.c);
    }
}
