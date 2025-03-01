abstract class Vehicle{// if abstract method is defined then always make abstarct class
    int no_of_tyres;
    abstract void start(); 
}

class Car extends Vehicle{
    

    void start(){
        System.out.println("start the car");
    }

}

class Bike extends Vehicle{
     // Setting the number of tires in constructor
     Bike() {
        this.no_of_tyres = 2;
    }

    void start(){
        System.out.println("start the bike"+" nof_tyres:"+ no_of_tyres);
    }

}


public class Abstraction1 {
    public static void main(String[] args) {

    //no obj of abstraction is available so we have to  create  a new reference
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        
        car.start();
        bike.start();

            
        }
    }

    

