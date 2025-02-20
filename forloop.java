import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = myScanner.nextInt();

        System.out.println("Multiplication Table of " + number +" upto 10 times:");
        for (int i = 0; i <= 10; i++) {
            
            System.out.println(number + "*" + i +"=" +i * number);

        }

        myScanner.close();

    }
}
