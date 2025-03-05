import java.util.Scanner;

public class operator{
    public static void main(String[] args) {

        Scanner myScanner = new Scanner (System.in);
        
        System.out.println("Enter two integers: ");
        int num1=myScanner.nextInt();
        int num2 = myScanner.nextInt();

        int greater= num1 > num2 ?num1  :num2 ;
        System.out.println(greater+ "is greater");
        myScanner.close();


        
    }
}
