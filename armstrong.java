import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int originalNum = n;
        int s = 0, r;

        while (n != 0) {
            r = n % 10;
            s = s + (int) Math.pow(r, 3);
            n = n / 10;
        }

        if (s == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
