/*Create an abstract class Shape with an abstract method area(). Implement two concrete classes:

Circle: Has a radius property and calculates area as π * radius^2.
Rectangle: Has length and width properties and calculates area as length * width. */

abstract class Shape {
    abstract double area();

}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;

    }

    double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }

}

public class Abstraction4 {
    public static void main(String[] args) {
        Circle myCircle = new Circle(3); // Both approaches [Shape and circle]are valid, but using the abstract class is
                                         // better practice because it promotes polymorphism
        Shape myRectangle = new Rectangle(4, 5);

        System.out.println("Area of Circle: " + myCircle.area());

        System.out.println("Area of Circle: " + myRectangle.area());

    }

}
