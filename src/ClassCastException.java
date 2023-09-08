class Animall {
    public void eat(String str) {
        System.out.println("Eating for grass");
    }
}

class Goat extends Animall {
    public void eat(String str) {
        System.out.println("blank");
    }
}

class Another extends Goat{
    public void eat(String str) {
        System.out.println("another");
    }
}

public class ClassCastException {
    public static void main(String[] args) {
        Animall a = new Animall();
        Another t5 = (Another) new Goat();
    }
}