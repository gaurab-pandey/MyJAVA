interface Vehicle {  
    void start(); // By default, variables in an interface are public, static, and final.
}

class Car implements Vehicle {  
    private int no_of_tyres = 4; 

    public void start() {
        System.out.println("Start the car. No. of tyres: " + no_of_tyres);
    }
}

class Bike implements Vehicle {  
    private int no_of_tyres = 2; 

    public void start() { //we should make it public as abstract method
        System.out.println("Start the bike. No. of tyres: " + no_of_tyres); 
    }
}

public class Abstraction2 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.start();
        bike.start();
    }  
}
