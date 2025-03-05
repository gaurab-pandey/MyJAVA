// making the interface
interface StudentActions {
    void study();
    void giveExam();
}

// Implementing the interface in CollegeStudent class or inherited
class CollegeStudent implements StudentActions {
    private String name;

    public CollegeStudent(String name) {
        this.name = name;
    }

    public void study() {
        System.out.println(name + " is studying.");
    }

    public void giveExam() {
        System.out.println(name + " is giving the final exam.");
    }
}


public class interface1 {
    public static void main(String[] args) {
        CollegeStudent student1 = new CollegeStudent("Alice");

        student1.study();
        student1.giveExam();
    }
}
