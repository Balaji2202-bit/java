class Aaa{
    public void print_A() { System.out.println("Class Aaa"); }
}

class Bbb extends Aaa {
    public void print_B() { System.out.println("Class Bbb"); }
}

class Ccc extends Aaa {
    public void print_C() { System.out.println("Class Ccc"); }
}

class Ddd extends Aaa {
    public void print_D() { System.out.println("Class Ddd"); }
}

// Driver Class
 public class Hierarchical {
    public static void main(String[] args)
    { Bbb obj_B = new Bbb();
        obj_B.print_A();
        obj_B.print_B();

        Ccc obj_C = new Ccc();
        obj_C.print_A();
        obj_C.print_C();

        Ddd obj_D = new Ddd();
        obj_D.print_A();
        obj_D.print_D();
    }
}
