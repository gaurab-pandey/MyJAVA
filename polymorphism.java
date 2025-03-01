// Base class
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}


class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}


class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}


public class polymorphism {
    public static void main(String[] args) {
        
        Animal myDog = new Dog();
        
        Animal myCat = new Cat();

        // Demonstrating polymorphism (method overriding)
        myDog.makeSound(); // Output: Bark
        myCat.makeSound(); // Output: Meow
    }
}
