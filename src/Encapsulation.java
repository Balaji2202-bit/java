public class Encapsulation
{
    public static void main(String[] args)
    {
        Encap e=new Encap();
        System.out.println(e.getName());
        e.setName("Pragyan");
        System.out.println(e.getName());
    }
}
class Encap{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name="Vikram";
}
