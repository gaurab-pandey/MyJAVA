public class StringConcept {
    public static void main(String[] args) {
        String newString = "ram"; // String literal
        String anotherString = "ram"; // Another literal with the same value
        String objectString = new String("ram"); // String object explicitly created

        // Comparing references
        System.out.println(newString == anotherString); // true (same reference in String Pool)
        System.out.println(newString == objectString); // false (different objects)
        System.out.println(newString.equals(objectString)); // true (same content)
    }
}
