/*
  Q: Create a parent class Animal with a method makeSound() that prints "Animal makes a sound".
Then, create a child class Dog that inherits Animal and overrides the makeSound() method to print "Dog barks".
Finally, create an object of Dog and call makeSound().
 */
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override   //overriding
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class inheritance1 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound();  // Output: Dog barks
    }
}
