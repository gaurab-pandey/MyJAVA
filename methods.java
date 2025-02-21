public class methods {
    public static void main(String[] args) {

        System.out.println("Sum will be printed first bcz we are calling it first even if subtractNumbers function is made ahead of addNumbers.");

        System.out.println("Sum: " + addNumbers(2, 3));

        subtractNumbers(3, 5);

    }

    public static void subtractNumbers(int num1, int num2) {
        int subtractNumber = num1 - num2;

        System.out.println("subtract :" + subtractNumber);
    }

    public static int addNumbers(int num1, int num2) {
        return num1 + num2;

    }
}
