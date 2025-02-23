public class stringExample {
    public static void main(String[] args) {
        // Creating Strings
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "  Java Programming  ";

        // Concatenation
        String result = str1 + " " + str2;
        System.out.println("Concatenation: " + result);

        // String Length
        System.out.println("Length of str1: " + str1.length());

        // Convert to Uppercase & Lowercase
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str2.toLowerCase());

        // Trim (Removes leading and trailing spaces)
        System.out.println("Trimmed: '" + str3.trim() + "'");

        // Substring
        System.out.println("Substring (0-4): " + str1.substring(0, 4));

        // Replace characters
        System.out.println("Replace 'o' with 'x': " + str1.replace('o', 'x'));

        // Check if a string contains a word
        System.out.println("Contains 'Java': " + str3.contains("Java"));

        // Splitting a string
        String sentence = "Java is fun";
        String[] words = sentence.split(" ");
        System.out.println("Words in sentence:");
        for (String word : words) {
            System.out.println(word);
        }

        // Checking Equality
        System.out.println("str1 equals 'Hello': " + str1.equals("Hello"));
        System.out.println("Ignoring Case: " + str1.equalsIgnoreCase("hello"));

        // Character at specific index
        System.out.println("Character at index 1: " + str1.charAt(1));
    }
}
