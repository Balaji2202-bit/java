public class Inherit
{
    int a=100;
    String name="Mari";
    public void method()
    {
        System.out.println("Hi Maari: "+a+name);
    }
}
class Raj extends Inherit
{
    int a=1000;
    String name="Raj";
    public void method()
    {
        System.out.println("Hi Raj: "+a+name);
    }
}
class Jaya extends Raj
{
    int a=1500;
    String name="Jaya  Anand";
    public void method()
    {
        System.out.println("Jaya "+ super.a+name);
        System.out.println("Jaya "+ a+name);
    }
}
class Mari_Raj_Jaya
{
    public static void main(String[] args)
    {
        Jaya j=new Jaya();
        j.method();
    }
}
