/*Create a Java interface called Animal with a method makeSound(). Then, implement this interface in two classes: Dog and Cat. */

interface Animal {
    public void makeSound();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Abstraction3 {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound();
        myCat.makeSound();

    }

}
