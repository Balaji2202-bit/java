public class Human
{
    int height=170;
    int weight=56;
    static int boneNo=206;
}
class Mari{
    public static void main(String[] args) {
        Human mari=new Human();
        mari.height=175;
        Human balaji=new Human();
        mari.boneNo=200;
        System.out.println(mari.boneNo+ " "+ mari.height);
        System.out.println(balaji.boneNo+ " "+ balaji.height);
    }
}
