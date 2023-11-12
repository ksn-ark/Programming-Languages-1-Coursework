public class AnimalTest {
    public static void main(String args[]) {
        Cow clarabelle = new Cow();
        clarabelle.eat();   // prints: mmm, yummy
        clarabelle.moo();  // prints: Moo-oo
        Dog pluto = new Dog();
        pluto.eat();    // prints: mmm, yummy
        pluto.bark();  // prints: woof!woof!    
    }
}

class Animal {
    public Animal() {}

    public void eat() {
        System.out.println("mmm, yummy");
    }
}

class Cow extends Animal {
    public Cow() {}

    public void moo() {
        System.out.println("Moo-oo");
    }
}

class Dog extends Animal {
    public Dog() {}

    public void bark() {
        System.out.println("woof!woof!");
    }
}