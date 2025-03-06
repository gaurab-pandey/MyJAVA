
//Example of quadratic time complexity (O(n^2)).


public class quadraticExample {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {

                System.out.print(i * j + " ");
            }

            System.out.println();
        }

    }
}

/*
 * The time complexity is O(n^2) because we have two nested loops, each running
 * n times. In this case, n = 3, so the total number of iterations is 9 (3 * 3).
 * The total execution time grows quadratically as the input size increases.
 */
