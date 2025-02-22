import java.util.Scanner;

public class Isprime {
   
    public static int isPrime(int n) {
        if (n <= 1) return 0;                  // Not prime
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return 0;          // Not prime
        }
        return 1;                  // Prime
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        
        if (isPrime(num) == 1) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        
        sc.close();
    }
}
