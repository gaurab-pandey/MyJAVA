import java.util.Scanner;

public class Userinput{
    public static void main(String[] args){
        Scanner myScanner= new Scanner(System.in);
    
        System.out.println("Hello dearr....");

        System.out.println("what's your name?");
        String name =myScanner.nextLine();

        System.out.println("Hlo "+name+" You look lonely........I can fix that!!!");

        myScanner.close();
    }
}