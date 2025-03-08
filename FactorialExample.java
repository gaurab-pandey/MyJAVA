//simplest example of Factorial Time Complexity (O(n!))





public class FactorialExample {
    static int factorial(int n) {
        if (n == 1) {
            return 1;  // Base case
        }
        return n * factorial(n - 1);  // Recursive call (factorial formula)
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));  // Output: 120 (5! = 5*4*3*2*1)
    }
}

/*O(n!) grows extremely fast, making it very inefficient for large n.
Used in permutations & brute-force algorithms.*/