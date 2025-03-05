
import java.util.Scanner;

abstract class Aircraft {
    String flightNumber;
    int capacity;

    Aircraft(String flightNumber, int capacity) {
        this.flightNumber = flightNumber;
        this.capacity = capacity;
    }

    abstract void fly();
}

class PassengerPlane extends Aircraft {
    int passengerCount;

    PassengerPlane(String flightNumber, int capacity, int passengerCount) {
        super(flightNumber, capacity);
        this.passengerCount = passengerCount;
    }

    @Override
    void fly() {
        System.out.println("\n[Passenger Plane]");
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Capacity: " + capacity);
        System.out.println("Passengers Onboard: " + passengerCount);
        System.out.println("Status: Taking off for a passenger destination.");
    }
}

class CargoPlane extends Aircraft {
    double cargoWeight;

    CargoPlane(String flightNumber, int capacity, double cargoWeight) {
        super(flightNumber, capacity);
        this.cargoWeight = cargoWeight;
    }

    @Override
    void fly() {
        System.out.println("\n[Cargo Plane]");
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Capacity: " + capacity);
        System.out.println("Cargo Weight: " + cargoWeight + " tons");
        System.out.println("Status: Taking off for cargo transportation.");
    }
}

public class AirportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aircraft> aircraftList = new ArrayList<>();

        // Taking user input for Passenger Plane
        System.out.print("Enter Passenger Plane Flight Number: ");
        String passFlightNum = scanner.nextLine();
        System.out.print("Enter Passenger Plane Capacity: ");
        int passCapacity = scanner.nextInt();
        System.out.print("Enter Number of Passengers: ");
        int passengerCount = scanner.nextInt();
        scanner.nextLine();
        aircraftList.add(new PassengerPlane(passFlightNum, passCapacity, passengerCount));

        // Taking user input for Cargo Plane
        System.out.print("\nEnter Cargo Plane Flight Number: ");
        String cargoFlightNum = scanner.nextLine();
        System.out.print("Enter Cargo Plane Capacity: ");
        int cargoCapacity = scanner.nextInt();
        System.out.print("Enter Cargo Weight in Tons: ");
        double cargoWeight = scanner.nextDouble();
        aircraftList.add(new CargoPlane(cargoFlightNum, cargoCapacity, cargoWeight));

        // Display aircraft details using polymorphism
        System.out.println("\n--- Aircraft Details ---");
        for (Aircraft aircraft : aircraftList) {
            aircraft.fly();
        }

        scanner.close();
    }
}
