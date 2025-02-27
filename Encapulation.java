class Person {
    // Private data
    private String name;
    private int age;

    // Getter method for name (to access the value)
    public String getName() {
        return name;
    }

    // Setter method for name (to set the value)
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        if (age > 0) { // for validation
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }
}

public class Encapulation {
    public static void main(String[] args) {
       
        Person person = new Person();

        // Use setter methods to set values
        person.setName("The weeknd");
        person.setAge(34);

        // Use getter methods to get values
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
