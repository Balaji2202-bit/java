abstract class Animal {
    private String name;

    public Animal(String name)
    {
        this.name = name;
    }

    public abstract void makeSound();

    public String getName()
    {
        return name;
    }
}

// Abstracted class
class Dog extends Animal {
    public Dog(String name)
    {
        super(name);
    }
    public void makeSound()
    {
        System.out.println(getName() + " barks");
    }
}

// Abstracted class
class Cat extends Animal {
    public Cat(String name)
    {
        super(name);
    }

    public void makeSound()
    {
        System.out.println(getName() + " meows");
    }
}

// Driver Class
public class AbstractionExample {
    // Main Function
    public static void main(String[] args)
    {
        Animal myDog = new Dog("Dog...");
        Animal myCat = new Cat("Cat...");

        myDog.makeSound();
        myCat.makeSound();
    }
}