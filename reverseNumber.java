import java.util.Scanner;
public class reverseNumber {
    
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
        System.out.println("The reversed number is "+ reversedNumber);
        
        

        myScanner.close();
        

    }
    
}
