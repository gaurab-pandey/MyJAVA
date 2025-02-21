import java.util.Scanner;
public class palindrome {
    
    public static void main(String[] args) {

        Scanner myScanner = new Scanner (System.in);

        System.out.println("Enter a number: ");
        int number = myScanner.nextInt();
        int reversedNumber = 0;
        int originalNumber = number;
        
        while (number!=0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number = number / 10;
        }
        
        if (originalNumber == reversedNumber)
        System.out.println(originalNumber + " is a palindrome.");

        else
        System.out.println(originalNumber + " is not a palindrome.");
        myScanner.close();



        

    }
}
