class Car{
    public Car()
    {
        // constructor calls automatically when i create object.
        System.out.println("Class Car");
    }
    public void vehicleType()
    {
        System.out.println("Vehicle Type: Car");
    }
}
class Maruti extends Car{
    public Maruti()
    {
        System.out.println("Class Maruti");
    }
    public void brand()
    {
        System.out.println("Brand: Maruti");
    }
    public void speed()
    {
        System.out.println("Max: 90Kmph");
    }
}
public class Multilevel_Inherit extends Maruti{

    public Multilevel_Inherit()
    {
        System.out.println("Maruti Model: 800");
    }
    public void speed()
    {
        System.out.println("Max: 80Kmph");
    }
    public static void main(String args[])
    {
        Multilevel_Inherit obj=new Multilevel_Inherit();
        obj.vehicleType();
        obj.brand();
        obj.speed();
    }
}