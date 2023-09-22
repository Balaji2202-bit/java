public class first {
    public static void main(String[] args) {
        System.out.println("main method executed");
        Second.second();
        Second.main(new String[]{"ad"});
    }
    static
    {
        System.out.println("static method executed");
    }
}
