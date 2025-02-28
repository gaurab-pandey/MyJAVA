// Multilevel Inheritance (Calling Methods from Multiple Levels)



class Person {
    void show() {
        System.out.println("I am a person");
    }
}

class Employee extends Person {
    void work() {
        System.out.println("I am an employee");
    }
}

class Manager extends Employee {
    void lead() {
        System.out.println("I am a manager");
    }
}

public class inheritance3 {
    public static void main(String[] args) {
        Manager mgr = new Manager();
        mgr.show();  // Output: I am a person
        mgr.work();  // Output: I am an employe
        mgr.lead();  // Output: I am a manager
    }
}
