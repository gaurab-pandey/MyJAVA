import java.util.Scanner;

abstract class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    abstract double calculateBonus();

    void displayEmployee() {
        System.out.println("\nEmployee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println("Bonus: $" + calculateBonus());
    }

}

class FullTimeEmployee extends Employee {
    FullTimeEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    double calculateBonus() {
        return salary * 0.10;
    }
}

class PartTimeEmployee extends Employee {
    PartTimeEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    double calculateBonus() {
        return salary * 0.05;
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //fulltime
        System.out.print("Enter Full-Time Employee Name: ");
        String fullTimeName = scanner.nextLine();
        System.out.print("Enter Full-Time Employee ID: ");
        int fullTimeId = scanner.nextInt();
        System.out.print("Enter Full-Time Employee Salary: ");
        double fullTimeSalary = scanner.nextDouble();
        Employee fullTimeEmployee = new FullTimeEmployee(fullTimeName, fullTimeId, fullTimeSalary);

        // Part-Time Employee
        scanner.nextLine(); // naya line
        System.out.print("\nEnter Part-Time Employee Name: ");
        String partTimeName = scanner.nextLine();
        System.out.print("Enter Part-Time Employee ID: ");
        int partTimeId = scanner.nextInt();
        System.out.print("Enter Part-Time Employee Salary: ");
        double partTimeSalary = scanner.nextDouble();
        Employee partTimeEmployee = new PartTimeEmployee(partTimeName, partTimeId, partTimeSalary);

        // Display employee details
        System.out.println("\n--- Employee Details ---");
        fullTimeEmployee.displayEmployee();
        partTimeEmployee.displayEmployee();

        scanner.close();

    }

}
