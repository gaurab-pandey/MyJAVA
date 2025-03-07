public class ExponentialExample {
    static void count(int n) {
        if (n == 0) {
            return;  // Base case
        }
        System.out.println(n);  // Print the number
        count(n - 1);  // First recursive call
        count(n - 1);  // Second recursive call (doubles calls)
    }

    public static void main(String[] args) {
        count(3);  // Start with 3
    }
}
