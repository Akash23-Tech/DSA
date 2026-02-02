// Find the Factorial of a large number

import java.math.BigInteger;
import java.util.Scanner;

class LargeFactorial{

    static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = Sc.nextInt();

        System.out.println("Factorial of " + n + " is:");
        System.out.println(factorial(n));

        Sc.close();
    }
}
