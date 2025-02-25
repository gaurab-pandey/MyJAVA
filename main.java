// WAP Student class with a default constructor
class Student {
    String name;
    int rollNo;
    double marks;

    // Default constructor
    Student() {
        name = "Abel";
        rollNo = 3;
        marks = 97.088;
    }


    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
        System.out.println("-----------------------");
    }
}

public class main {
    public static void main(String[] args) {
      
        Student s1 = new Student();
        
        s1.display();
    }
}
