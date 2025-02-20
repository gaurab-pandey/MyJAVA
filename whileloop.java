import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = myScanner.nextInt();

        int i = 0;
        double sum = 0;

        System.out.println("So, odd numbers are :");

        
        while (i <= num) {
            if (i % 2 == 0) {
                i++;  
                continue;
            }
            System.out.println(+ i);  
            sum = sum + i;          
            i++;                    
        }

        System.out.println("Sum is: " + sum);  
        myScanner.close();
    }
}
