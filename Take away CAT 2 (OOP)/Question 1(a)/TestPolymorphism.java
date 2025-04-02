class Animal {
    public void makeSound() {
        System.out.println("Some animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }
}

class Horse extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Neigh! Neigh!");
    }
}

public class TestPolymorphism {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        Animal myHorse = new Horse();

        myDog.makeSound();  // Outputs: Woof! Woof!
        myCat.makeSound();  // Outputs: Meow! Meow!
        myHorse.makeSound(); // Outputs: Neigh! Neigh!
    }
}
