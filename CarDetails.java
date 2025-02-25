/*Create a class named Car with the following properties:

brand (String)
model (String)
year (int)
The class should have:

A constructor to initialize the brand, model, and year.
A method displayInfo() to print car details.
In the main method, create three Car objects and display their details using displayInfo().*/

import java.util.Scanner;

class Car {

    String brand;
    String model;
    int year;

    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println(); //new line
    }
}

class CarDetails {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number of car:");
        int n = myScanner.nextInt();
        myScanner.nextLine();// NEW line

        Car[] cars = new Car[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Car " + (i + 1) + ":");

            System.out.print("Enter brand: ");
            String brand = myScanner.nextLine();

            System.out.print("Enter model: ");
            String model = myScanner.nextLine();

            System.out.print("Enter year: ");
            int year = myScanner.nextInt();
            myScanner.nextLine();

            cars[i] = new Car(brand, model, year);

        }
        System.out.println("\nCar Details:");
        for (int i = 0; i < n; i++) {
            cars[i].displayInfo(); // func called

        }
        myScanner.close();
    }

}