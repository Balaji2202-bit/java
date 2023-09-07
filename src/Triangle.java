import java.rmi.MarshalException;

public class Triangle {
    int a = 4;
    int b = 3;
    int c = 5;

    public int Permeter() {
        int s = a + b + c;
        return s;
    }

    public int Area() {
        int s = (a + b + c) / 2;
        double z = s * (s - a) * (s - b) * (s - c);
        double x = Math.pow(z, 0.5);
        return s;
    }

    public static void main(String[] args) {
        Triangle t = new Triangle();
        System.out.printf(t.Permeter() + "%n" + t.Area());
    }

}