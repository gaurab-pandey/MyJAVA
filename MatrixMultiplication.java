import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int A[][] = new int[3][3];
        int B[][] = new int[3][3];
        int result[][] = new int[3][3];

        System.out.println("enter first 3*3 matrix A:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = myScanner.nextInt();

            }

        }

        System.out.println("enter the 3*3 matrix B: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                B[i][j] = myScanner.nextInt();

            }

        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    result[i][j] += A[i][k] * B[k][j];

                }

            }

        }
        System.out.println("Resultant matrix is: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");

            }
            System.out.println();

        }
        myScanner.close();
    }
}