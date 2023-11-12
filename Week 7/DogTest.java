class Dog {
    int age;
    String name, race, sound;

    Dog(int age, String name, String race, String sound) {
        this.age = age;
        this.name = name;
        this.race = race;
        this.sound = sound;
    }

    public void printInfo() {
        System.out.println(
            "Name: " + name + 
            "\nAge: " + age +
            "\nRace: " + race);
    }

    public String makeSound() {
        return sound;
    }
    // constructor
    // method printInfo()
    // method makeSound()
}

    public class DogTest {
    public static void main(String[] args) {
        Dog rover = new Dog (2, "Rover", "Dalmatian", "Woof!!!");
        Dog rex = new Dog (4, "Rex", "Australian terrier", "woofwoof");

        System.out.println("Dog info:");
        rover.printInfo();
        System.out.println("Dog says: " + rover.makeSound());
        System.out.println();
        rex.printInfo();
        System.out.println("Dog says: " + rex.makeSound());
    }
}