public class Person {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.call();
        Mobile SmartPhone = new Mobile()//Anonymous Inner Class
        {
            public void call()
            {
                System.out.println("Video call, Global Call: ");
            }
        };
        SmartPhone.call();
    }
}
