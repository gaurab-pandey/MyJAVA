class Vehicle {
    Vehicle() {
        System.out.println("Vehicle is created");
    }
}

class Car extends Vehicle {
    Car() {
        super();  // Calls the parent class constructor
        System.out.println("Car is created");
    }
}

public class inheritance2 {
    public static void main(String[] args) {
        Car myCar = new Car();
              // Output:
        // Vehicle is created
         // Car is created
    }
}
