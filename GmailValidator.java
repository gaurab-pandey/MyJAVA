import java.util.regex.Pattern;

public class GmailValidator {
    // Regular Expression for a Valid Gmail Address
    private static final String GMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@gmail\\.com$";

    // Function to check if a string is a valid Gmail address
    public static boolean isValidGmail(String email) {
        return Pattern.matches(GMAIL_REGEX, email);
    }

    public static void main(String[] args) {
        // Test Cases
        String[] emails = {
            "test@gmail.com",  // Valid
            "hello.world@gmail.com",  // Valid
            "user13@gmail.com",  // Valid
            "user@gmail.net",  // Invalid (not @gmail.com)
            "xo.com",  // Invalid (missing @gmail.com)
            "invalid@gmailcom",  // Invalid (missing dot before com)
            "space in@gmail.com" // Invalid (space not allowed)
        };

        for (String email : emails) {
            System.out.println(email + " is " + (isValidGmail(email) ? "valid" : "invalid"));
        }
    }
}
