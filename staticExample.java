class Student {
    private String name;     
    private int age;
    private int rollNumber;

    // Static variable to track the total number of students created
    private static int studentCount = 0;

   
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.rollNumber = ++studentCount;  // Increment and assign roll number
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    // Static method to get the total number of students created
    public static int getTotalStudents() {
        return studentCount;
    }

    
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
    }
}

public class staticExample {
    public static void main(String[] args) {

      
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);
        Student student3 = new Student("Charlie", 21);

       
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();

        // total number of students created (using static method)
        System.out.println("Total number of students: " + Student.getTotalStudents());
    }
}
