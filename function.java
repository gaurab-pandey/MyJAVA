public class function {
    public static void main(String[] args) {
        int num1 = 25, num2 = 34;
        int gcd = findGCD(num1, num2);
        
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }

    
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a; 
        }
        return findGCD(b, a % b);
    }
}
