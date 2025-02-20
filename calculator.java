//making calaculator using switch statement in java


import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        double num1 = myScanner.nextDouble();

        System.out.println("Enter operator( + , /,*,-,%)");
        char operator = myScanner.next().charAt(0);

        System.out.println("Enter 2nd number");
        double num2 = myScanner.nextDouble();

        double result;

        switch (operator) {

            case '+':
                result = num1 + num2;
                System.out.println("result:" + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("result:" + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("result:" + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("result:" + result);
                } else {
                    System.out.println("Error: Division by zero");
                    
                }
                break;

            case '%':
                result = num1 % num2;
                System.out.println("result:" + result);
                break;

            default:
                System.out.println("Error: Invalid operator");
                break;

        }

        myScanner.close();

    }

}
