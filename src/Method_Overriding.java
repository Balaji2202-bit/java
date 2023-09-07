public class Method_Overriding
{
    public static void main(String[] args)
    {
        Home_2020 h=new Home_2023();
//        Home_2023 h1=new Home_2023();
        h=new Home_2020();
        h.colour();
//        h1.colour();
    }
}
class Home_2020
{
public void colour()
{
    System.out.println("Green Colour: ");
}
}
class Home_2023 extends Home_2020
{
    @Override
    public void colour()
    {
       // super.colour();
        System.out.println("Blue Colour: ");
    }
}